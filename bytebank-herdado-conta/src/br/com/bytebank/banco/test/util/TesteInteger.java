package br.com.bytebank.banco.test.util;

public class TesteInteger {
    public static void main(String[] args) {
        int value = 0;

        Integer integerRef = Integer.valueOf(value); // autoboxing
        System.out.println(integerRef);

        value = integerRef.intValue(); // unboxing

        integerRef = Integer.valueOf("10");
        System.out.println(integerRef);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
