package ListaDeExercicios2.E2Questao9;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        int numA;
        int numB;
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o primeiro numero");
        numA = input.nextInt();input.nextLine();
        System.out.println("Informe o segundo numero");
        numB = input.nextInt();input.nextLine();

        System.out.println("numB " + numB +", " + "numA "+ numA);

    }
}
