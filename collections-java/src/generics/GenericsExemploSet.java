package generics;
import java.util.HashSet;
import java.util.Set;

public class GenericsExemploSet {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        //exemplo sem Generics
        @SuppressWarnings("rawtypes")
        Set conjuntoSemGenerics = new HashSet();
        conjuntoSemGenerics.add("Elemento 1");
        conjuntoSemGenerics.add(10);

        //exemplo com Generics
        Set<String>conjuntoGenerics = new HashSet<>();
        conjuntoGenerics.add("Elemento 1");
        conjuntoGenerics.add("Elemento 2");

        //iterando sobre o conjunto sem Generics (necessário cast)
        for(Object elemento : conjuntoSemGenerics){
            String str = (String) elemento;
            System.out.println(str);
        }

        //iterando sobre o conjunto COM Generics
        for (String elemento : conjuntoGenerics){
            System.out.println(elemento);
        }
    }
}
