package setinterface.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private static CadastroProdutos cadastroProdutos;
    private Set<Produto> produtoSet;

    public CadastroProdutos (){
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long cod, String nome, double preco, int quantidade){
        produtoSet.add(new Produto(nome, cod, preco, quantidade));
    }
    public Set<Produto> exibirProdutoPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirPorPreco(){
        Set<Produto> produtoPorPreco = new TreeSet<>();
        produtoSet.addAll(produtoSet);
        return produtoPorPreco;

    }
 public static void main(String[] args) {
    CadastroProdutos.cadastroProdutos = new CadastroProdutos();

    cadastroProdutos.adicionarProduto(1234, "Prod 1", 2.0, 1);
    cadastroProdutos.adicionarProduto(1235, "Prod 2", 4,50);
    cadastroProdutos.adicionarProduto(1225, "Prod 3", 1.6, 0);
    cadastroProdutos.adicionarProduto(1336, "Prod 4", 0.5, 2);

    System.out.println(cadastroProdutos.produtoSet);
 } 
}
