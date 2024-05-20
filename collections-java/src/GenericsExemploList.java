import java.util.ArrayList;
import java.util.List;

public class GenericsExemploList{
    @SuppressWarnings({ "unchecked", "rawtypes" })
    public static void main(String[] args) {

        //Exemplo sem GENERICS
        List listaSemGenerics = new ArrayList();
        listaSemGenerics.add("Objeto 1");
        listaSemGenerics.add(10);

        //Exemplo com GENERICS
        List<String> listaGenerics = new ArrayList<>();
        listaGenerics.add("Elemento 1");
        listaGenerics.add("Elemento 2");

        List<Integer> listaGenericsInt = new ArrayList<>();
        listaGenericsInt.add(10);
        listaGenericsInt.add(200);

        //iterando sobre a lista com Generics
        for (String elemento : listaGenerics){
            System.out.println(elemento);
        }

        //iterando sobre a lista sem Generics (necessário fazer cast)
        for (Object elemento : listaSemGenerics){
            String str = (String) elemento;
            System.out.println(str);
        }
    }
}