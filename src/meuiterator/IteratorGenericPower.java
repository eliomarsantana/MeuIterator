/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuiterator;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Eliomar Santana
 */
public class IteratorGenericPower implements Iterator{

        public IteratorGenericPower(Collection<Aluno> collection, String propriedade, String operador, Object valor) {
        this.collection = collection;
        this.propriedade = propriedade;
        this.operador = operador;
        this.valor = valor;
        this.iterator = collection.iterator();
        next();
    }
    @Override
    public boolean hasNext() {
        return nextObject != null;
    }

    @Override
    public Object next() {
        Object returnObject = nextObject;
        nextObject = null;
        
        while(iterator.hasNext()) {
            Aluno currentObject = iterator.next();
            Class classe = currentObject.getClass();
            //vendo se classe tem atributo do tipo passado
            String p = propriedade.substring(0,1).toUpperCase().concat(propriedade.substring(1));
            String metodo = "get"+p;           
            for (Method m : classe.getDeclaredMethods()){
                if(m.getName().equals(metodo)){ 
                    try {
                            returnMethod = m.invoke(currentObject, new Object[0]);                                                      
                        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException ex) {
                                Logger.getLogger(IteratorGenericPower.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    switch (operador) {
                        case "=":
                                if(valor.equals(returnMethod)){
                                    nextObject = currentObject; 
                                    return returnObject;                         
                                }
                           
                            break;
                        case ">":
                            if(returnMethod.toString().compareTo(valor.toString()) > 0){
                                nextObject = currentObject; 
                                return returnObject;
                            }
                            break;
                        case "<":
                            if(returnMethod.toString().compareTo(valor.toString()) < 0){                               
                                nextObject = currentObject; 
                                return returnObject;
                            }
                            break;
                        case "<>":
                           if(!valor.equals(returnMethod)){
                                    nextObject = currentObject; 
                                    return returnObject;                         
                                }
                            break;
                        default:
                            System.out.println("Opção para o IteratorGenericPower não é válida!");
                    } 
                }
            }             
        }
        return returnObject;
    }
    
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private Collection<Aluno> collection;
    private String propriedade;
    private String operador;
    private Object valor;
    Iterator<Aluno> iterator;
    private Object nextObject = null;
    private Object returnMethod;  
}
