package meuiterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Eliomar Santana
 */
public class MeuIterator {

    public static void percorrerLista(Iterator<Aluno> i)
    {
        while (i.hasNext()) {
            Aluno a = i.next();
            System.out.println(a.getNome());
        }
    }

    public static void main(String[] args) {
        ArrayList<Aluno> lista = new ArrayList<>();
        lista.add(new Aluno("JOAO", 'M', 20, 2011));
        lista.add(new Aluno("MARIA", 'F', 35, 2014));
        lista.add(new Aluno("ZECA", 'M', 30, 2013));
        lista.add(new Aluno("JOANA", 'F', 29, 2013));
        lista.add(new Aluno("HUGUINHO", 'M', 20, 2012));
        lista.add(new Aluno("ZEZINHO", 'M', 42, 2010));
        lista.add(new Aluno("LUIZINHO", 'M', 16, 2016));
        
        System.out.println("Lista sem filtro: ");
        percorrerLista(lista.iterator());
        
        IteratorGenericPower i = new IteratorGenericPower(lista, "anoIngresso", ">=", 2014);
        System.out.println("");
        System.out.println("Filtro com IteratorGenericPower: ");
        percorrerLista(i);    
    }
}
