package main;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        List<String> numbers = new ArrayList<>();

        int num1, listaDeNumeros;
        float media = 0;

        System.out.println ("Insira um numero: ");
        num1 = leitor.nextInt();

        for(int i = 0;i < num1; i++) {
            numbers.add(String.valueOf(leitor.nextInt())); // pega cada entrada do usuário e joga na lista
        }

        System.out.println("Lista inicial:");
        for (int t = 0;t < num1;t++){
            System.out.println(numbers.get(t));  // pega cada um da lista e transforma cada um em inteiro
            media += Integer.valueOf(numbers.get(t));
        }
        media = media / num1;
        System.out.println("Média: " + media);

        Collections.sort(numbers);

        System.out.println("Menor número: " + numbers.get(0));
        System.out.println("Maior número: " + numbers.get(num1 - 1));

    }

}
