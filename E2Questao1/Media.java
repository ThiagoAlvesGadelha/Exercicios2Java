package E2Questao1;

public class Media {
    public double media1 = (8 + 9 + 7) / 3;
    public double media2 = (4 + 5 + 6) / 3;
    public double result;
    String nome;

    public void SomaMedias (String nome){
        this.result = (media1 + media2) / 2;
        System.out.println("Aluno = " + nome);
        System.out.println("Media 1 = " + media1);
        System.out.println("Media 2 = " + media2);
        System.out.println("Media das medias = " + result);
    }

}
