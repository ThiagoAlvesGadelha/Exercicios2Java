package ListaDeExercicios2.E2Questao6;

public class Numero {
    int numero;

    public void raiz(int numero){
        this.numero = numero * numero;
        if (this.numero == 0){
            System.out.println("Negativo");
        }else if (numero * numero == this.numero){
            System.out.println("Positivo");
            System.out.println("A raiz quadrada é " + this.numero);

        }
    }
}
