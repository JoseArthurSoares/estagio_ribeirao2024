package org.example;

public class Main {
    public static void main(String[] args) {

        System.out.println(reverseString("Amor"));

        //Número que faz parte da sequência de fibonacci
        System.out.println(fibonacci(34));

        //Número que não faz parte da sequência de fibonacci
        System.out.println(fibonacci(35));
    }


    //Questão 2
    public static boolean fibonacci(int number){
        int anterior = 0;
        int atual = 1;
        while(atual < number){
            int novoAnterior = atual;
            atual = anterior + atual;
            anterior = novoAnterior;
        }
        return atual == number;
    }

    //Questão 5
    public static String reverseString(String palavra) {
        String palavraReversa = "";
        for (int i = palavra.length() - 1; i >= 0; i--) {
            palavraReversa += palavra.charAt(i);
        }
        return palavraReversa;
    }
}