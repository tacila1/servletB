/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tacila
 */
public class ProdutoDao {

    private static ArrayList<Produto> produtos;

    public ProdutoDao() {
        this.produtos = new ArrayList<Produto>();
        this.produtos.add(new Produto("Caderno"));
        this.produtos.add(new Produto("Caneta"));
        this.produtos.add(new Produto("Roupa"));
        this.produtos.add(new Produto("Livro"));

    }

    public ArrayList<Produto> getProdutoIguais(String nome) {
        if (nome == null) {
            return getProdutos();
        }
        ArrayList<Produto> produtosIguais = new ArrayList<Produto>();
        for (Produto produto : this.produtos) {
            if (produto.getNome().toLowerCase().contains(nome.toLowerCase())) {
                produtosIguais.add(produto);
            }
        }
        return produtosIguais;
    }

    public void addProduto(Produto p) {
        if (p.getNome() != null) {
            this.produtos.add(p);
        }
    }

    public ArrayList<Produto> getProdutos() {
        return this.produtos;
    }


}
