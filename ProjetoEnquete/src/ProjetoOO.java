import java.util.Scanner;

public class ProjetoOO {
    //implementacao do main contido em Projeto mas usando
    //o paradigma orientado a objetos

    public static void main(String[] args) {
        Pergunta um = new Pergunta(1, "Qual o seu nome?");
        Pergunta dois = new Pergunta(2, "Defina classe e objeto?");
        Pergunta tres = new Pergunta(3, "Qual a função do construtor?");
        Pergunta quatro = new Pergunta(4, "Qual a sua maior dificuldade?");

        Scanner tec = new Scanner(System.in);
        System.out.print(um.getQuestaoFormulada());
        String resp = tec.nextLine();
        Resposta r1 = new Resposta("Professor", resp, um.getNumero());
    }
}