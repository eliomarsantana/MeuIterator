/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuiterator;

import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @author aluno
 */
public class IteratorByGenre implements Iterator {

    public IteratorByGenre(Collection<Aluno> c, char sexo) {
        this.c = c;
        this.sexo = sexo;
        this.iterator = c.iterator();
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
            if(currentObject.getSexo() == sexo) {
                nextObject = currentObject;
                break;
            }
        }
        return returnObject;
    }
    
    private Collection<Aluno> c;
    private char sexo;
    Iterator<Aluno> iterator;
    private Object nextObject = null;

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
