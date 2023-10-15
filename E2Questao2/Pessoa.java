package ListaDeExercicios2.E2Questao2;

public class Pessoa {

    public String nome;
    public int idade;
    public int anoDeNascimento;
    public int anoAtual = 2023;

    public void calcularIdade ( String nome, int anoDeNascimento){
        this.idade = anoAtual - anoDeNascimento;
        System.out.println(nome +" tem " + idade + " anos." );
        if (idade >= 18){
            System.out.println(nome + ", sua entrada foi permitida.");
        } else if (idade <= 18) {
            System.out.println(nome + ", sua entrada não é permitida.");
        }

    }





}
