/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meuiterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author aluno
 */
public class MeuIterator {

    public static void percorrerLista(Iterator<Aluno> i)
    {
        while (i.hasNext()) {
            Aluno a = i.next();
            System.out.println(a.getNome());
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Aluno> lista = new ArrayList<>();
        lista.add(new Aluno("JOAO", 'M', 20));
        lista.add(new Aluno("MARIA", 'F', 35));
        lista.add(new Aluno("ZECA", 'M', 30));
        lista.add(new Aluno("JOANA", 'F', 29));
        lista.add(new Aluno("HUGUINHO", 'M', 20));
        lista.add(new Aluno("ZEZINHO", 'M', 42));
        lista.add(new Aluno("LUIZINHO", 'M', 16));
        //IteratorByGenre i = new IteratorByGenre(lista, 'F');
        percorrerLista(lista.iterator());
        
        IteratorGenericPower i = new IteratorGenericPower(lista, "idade", "df", 20);
        System.out.println("");
        System.out.println("Filtro com IteratorGenericPower: ");
       
        percorrerLista(i);    
    }
}
