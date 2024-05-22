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

public List<Livro> pesquisaAno (int anoInicio, int anoFim){
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
}
