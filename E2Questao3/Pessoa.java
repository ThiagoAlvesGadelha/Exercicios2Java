package ListaDeExercicios2.E2Questao3;

public class Pessoa {
    String nome;
    double prestacao;
    double porcentagemLimite = 0.20;
    double cartaDeCredito;

    public void solicitarEmprestimo(String nome, double salario, double valorDesejado ){
       this.nome = nome;
        this.prestacao =  valorDesejado;
        this.cartaDeCredito = salario * porcentagemLimite;

        if (prestacao >= cartaDeCredito) {
            System.out.println(this.nome + ", seu emprestimo não foi liberado.");
            System.out.println("Lamentamos, mas só conseguimos liberar até 20% do valor correspondente ao salario.");
        } else if (prestacao < cartaDeCredito) {
            System.out.println(this.nome + ", seu emprestimo foi liberado.");
        }
    }
}
