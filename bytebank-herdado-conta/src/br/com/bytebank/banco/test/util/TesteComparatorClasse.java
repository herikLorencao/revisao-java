package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TesteComparatorClasse {
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(22, 33);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for (Conta c: lista) {
            System.out.println(c);
        }

        System.out.println();

        lista.sort(new ComparadorContas());

        for (Conta c: lista) {
            System.out.println(c);
        }
    }
}

class ComparadorContas implements Comparator<Conta> {
    @Override
    public int compare(Conta c1, Conta c2) {
        if (c1.getNumero() == c2.getNumero()) return 0;
        return c1.getNumero() > c2.getNumero() ? 1 : -1;
    }
}