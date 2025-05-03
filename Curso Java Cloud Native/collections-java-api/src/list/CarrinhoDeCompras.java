package list;

import java.util.*;

public class CarrinhoDeCompras {
    List<Item> listaItens;

    public CarrinhoDeCompras() {
        this.listaItens = new ArrayList<>();
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("maçã", 0.97, 10);
        carrinho.adicionarItem("banana", 0.55, 5);
        carrinho.exibirItens();
        System.out.println("Valor Total: R$" + carrinho.calcularValorTotal());
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        listaItens.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> listaItensRemover = new ArrayList<>();
        for (Item i : listaItens) {
            if (i.getNome() == nome)
                listaItensRemover.add(i);
        }
        listaItens.removeAll(listaItensRemover);
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Item i : listaItens) {
            valorTotal += i.getPreco();
        }
        return valorTotal;
    }

    public void exibirItens() {
        String itens = "";
        for (Item i : listaItens) {
            itens += i.toString() + "\n";
        }
        if (itens.isEmpty())
            System.out.println("Carrinho vazio");
        else
            System.out.println(itens);
    }
}
