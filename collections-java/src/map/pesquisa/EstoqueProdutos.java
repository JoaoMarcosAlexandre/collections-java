package map.pesquisa;

import java.util.HashMap;
import java.util.Map;;

public class EstoqueProdutos {
    private Map<Long, Produto> estoqueProdutosMap;
        public EstoqueProdutos(){
            this.estoqueProdutosMap = new HashMap<>();
        }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco){
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calculaValorTotalEstoque(){
        double valorTotalEstoque = 0;
        if(estoqueProdutosMap.isEmpty()){
            for(Produto p : estoqueProdutosMap.values()){
                valorTotalEstoque += p.getQuantidade()*p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if(estoqueProdutosMap.isEmpty()){
        for(Produto p: estoqueProdutosMap.values()){
            if(p.getPreco() > maiorPreco){
                produtoMaisCaro = p;
            }
        }
      }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoque = new EstoqueProdutos();
        estoque.exibirProdutos();

        estoque.adicionarProduto(1001, "Produto 1", 5, 9.65);
        estoque.adicionarProduto(1010, "Produto 2", 5, 5.63);
        estoque.adicionarProduto(1011, "Produto 3", 5, 6.68);
        estoque.adicionarProduto(1101, "Produto 4", 9, 2.98);
        estoque.adicionarProduto(1100, "Produto 5", 3, 25.74);

        estoque.exibirProdutos();

        
        System.out.println("O produto mais caro é " + estoque.obterProdutoMaisCaro());
        System.out.println("Valor total do estoque: R$" + estoque.calculaValorTotalEstoque());
    }
}
