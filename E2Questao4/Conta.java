package ListaDeExercicios2.E2Questao4;

public class Conta {
    double saldo;
    double reajuste =  0.01;

    public void realizarReajuste (double saldo) {
        this.saldo = saldo +(saldo * reajuste);
        System.out.println("Aqui seu dinheiro rende 1% ao dia!");
        System.out.println("Seu saldo anterior era : " + saldo);
        System.out.println("Saldo com reajuste de 1% = " + this.saldo);
    }


}
