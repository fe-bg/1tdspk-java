package br.com.fiap.associacao.app;

import br.com.fiap.associacao.model.Endereco;
import br.com.fiap.associacao.model.Pessoa;

import java.time.LocalDate;

public class TesteAssociacao {

    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("João Aguiar");
        p.setCpf("234.920.056-88");
        p.setCelular("(11) 95648-0877");
        p.setNascimento(LocalDate.of(1980, 7, 15));

        Endereco end = new Endereco("Rua da Graça", "234",
                "Bom Retiro", "03489-000", "São Paulo");

        p.setResidencia(end); //associando o endereco end com a pessoa p

        Pessoa filho = new Pessoa();
        filho.setNome("Augusto Aguiar");
        filho.setCpf("824.075.271-87");
        filho.setCelular("(11) 92647-0012");
        filho.setNascimento(LocalDate.of(2019, 8, 1));
        filho.setResidencia(end);


    }

}
