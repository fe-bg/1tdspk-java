package br.com.fiap.assai.app;

import br.com.fiap.assai.model.ContaSupermercado;

import java.util.Scanner;

public class Aplicacao {

    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        ContaSupermercado compraMes = new ContaSupermercado("000.002.568-98");

        //1° produto
        System.out.print("Produto: ");
        String produto = tec.nextLine();
        System.out.print("Quantidade: ");
        int qtd = tec.nextInt();
        System.out.print("Valor unitário: ");
        double valor = tec.nextDouble();

        compraMes.adicionaCompra(qtd, valor, produto);

        System.out.print("Produto: ");
        produto = tec.next() + tec.nextLine();
        System.out.print("Quantidade: ");
        qtd = tec.nextInt();
        System.out.print("Valor unitário: ");
        valor = tec.nextDouble();

        compraMes.adicionaCompra(qtd, valor, produto);

        //System.out.println(compraMes);
        System.out.println(compraMes.getItens());
        System.out.println("Total: " + compraMes.getTotal());
    }
}

