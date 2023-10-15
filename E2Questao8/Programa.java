package ListaDeExercicios2.E2Questao8;

import java.util.Scanner;
// Crie um algoritimo que receba 3 numeros e informe qual o maior entre eles.
public class Programa {
    public static void main(String[] args) {

        int n1,n2,n3;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        n1 = input.nextInt(); input.nextLine();
        System.out.println("Digite o primeiro numero");
        n2 = input.nextInt(); input.nextLine();
        System.out.println("Digite o primeiro numero");
        n3 = input.nextInt(); input.nextLine();
        System.out.println("Numeros recebidos!");

        if (n1 >n2 && n1 > n3 ){
            System.out.println(n1 + " É o maior");
        }else if (n2 > n1 && n2 > n3){
            System.out.println(n2 + " É o maior");
        } else if (n3 > n1 && n3 > n2) {
            System.out.println(n3 + " É o maior");
        }


    }
}
