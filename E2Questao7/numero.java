package ListaDeExercicios2.E2Questao7;

public class numero {
    // Ler um numero e imrpimir: igual a 20, menor que 20 ou maior que 20.
    int numero;

    public void duvida(int numero){
        this.numero = numero;
        if (numero == 20){
            System.out.println("O numero digitado é igual a 20");
        } else if (numero < 20) {
            System.out.println("O numero digitado é menor que 20");
        } else if (numero > 20) {
            System.out.println("O numero digitado é maior que 20");
        }
    }
}
