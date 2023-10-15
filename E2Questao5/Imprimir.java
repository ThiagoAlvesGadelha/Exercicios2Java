package ListaDeExercicios2.E2Questao5;

public class Imprimir {
    int numero;

    public void imprimir(int numero){
        this.numero = numero;
        if (numero%2 == 0){
            System.out.println("O numero " + this.numero + " é Par");
        } else {
            System.out.println("O numero " + this.numero + " é Impar");
        }
    }
}
