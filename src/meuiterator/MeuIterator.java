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
        lista.add(new Aluno("JOAO", 'M'));
        lista.add(new Aluno("MARIA", 'F'));
        lista.add(new Aluno("ZECA", 'M'));
        lista.add(new Aluno("JOANA", 'F'));
        lista.add(new Aluno("HUGUINHO", 'M'));
        lista.add(new Aluno("ZEZINHO", 'M'));
        lista.add(new Aluno("LUIZINHO", 'M'));
        IteratorByGenre i = new IteratorByGenre(lista, 'F');
        percorrerLista(lista.iterator());
        System.out.println("");
        percorrerLista(i);
    }
}
