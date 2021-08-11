package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TesteLinkedList {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(11, 22);
        ContaCorrente cc2 = new ContaCorrente(11, 22);
        List<Conta> lista = new LinkedList<>();

        lista.add(cc);
        lista.add(cc2);

        System.out.println("Contas são iguais: " + cc.equals(cc2));

        System.out.println("Tamanho: " + lista.size());

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        System.out.println("------------------------");

        for (Object oRef : lista) {
            System.out.println(oRef);
        }
    }
}
