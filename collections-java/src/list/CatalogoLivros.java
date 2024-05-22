package list;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> livroList;

public CatalogoLivros(){
    this.livroList = new ArrayList<>();
}
   
public void selecionarLivro(String titulo, String autor, int anoPublicacao){
    livroList.add(new Livro(titulo, autor, anoPublicacao));
}

public List<Livro> pesquisarAutor (String autor){
    List<Livro> livroPorAutor = new ArrayList<>();
    if(livroList.isEmpty()){
        for(Livro l : livroList){
            if(l.getAutor().equalsIgnoreCase(autor))
            livroPorAutor.add(l);
        }
    }
    return livroPorAutor;
}

public List<Livro> pesquisarAno (int anoInicio, int anoFim){
    List<Livro> livroPorAno = new ArrayList<>();
    if(livroList.isEmpty()){
        for(Livro  l: livroList){
            if(l.getAnoPublicacao() >= anoInicio && l.getAnoPublicacao()<= anoFim){
                livroPorAno.add(l);
            }
        }
    }
    return livroPorAno;
}

public Livro pesquisarTitulo(String titulo) {
    Livro livroPorTitulo = null;
    if(livroList.isEmpty()){
        for(Livro l : livroList){
            if (l.getTitulo().equalsIgnoreCase(titulo)){
                livroPorTitulo = l;
                break;
            }
        }
    }
    return livroPorTitulo;
}

public static void main(String[] args) {
    CatalogoLivros catalogolivros = new CatalogoLivros();
    catalogolivros.selecionarLivro("Livro 1", "autor 1", 2000);
    catalogolivros.selecionarLivro("Livro 2", "autor 2", 2002);
    catalogolivros.selecionarLivro("Livro 3", "autor 3", 2004);
    catalogolivros.selecionarLivro("Livro 4", "autor 4", 2005);

    System.out.println(catalogolivros.pesquisarAutor("autor 2"));
    System.out.println(catalogolivros.pesquisarAno(2000, 2002));
    System.out.println(catalogolivros.pesquisarTitulo("Livro 4"));
}


}
