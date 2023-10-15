package ListaDeExercicios2.E2Questao10;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        int n1, n2;

        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro numero");
        n1 = input.nextInt(); input.nextLine();
        System.out.println("Informe o segundo numero");
        n2 = input.nextInt(); input.nextLine();

        if (n1 != n2){
            System.out.println("Os numeros são diferentes");
            if (n1 > n2){
                System.out.println("O numero 1 é maior que o numero 2");
            } else {
                System.out.println("O numero 2 é maior que o numero 1");
            }
        } else if (n1 == n2) {
            System.out.println("Os numeros são iguais");
        }
    }
}
