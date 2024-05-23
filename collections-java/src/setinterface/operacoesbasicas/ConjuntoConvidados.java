package setinterface.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;
    public ConjuntoConvidados(Set<Convidado> convidado){
        this.convidadoSet = new HashSet<>();
    }


public ConjuntoConvidados() {
     }


public void adicionarConvidado(String nome, int codigoConvite){
    convidadoSet.add(new Convidado(nome, codigoConvite));
}

public void removerConvidadoPorConvite(int codigoConvite){
    Convidado convidadoParaRemover = null;
    for(Convidado c : convidadoSet){
        if(c.getCodigoConvite() == codigoConvite){
            convidadoParaRemover = c;
            break;
        }
    }
    convidadoSet.remove(convidadoParaRemover);
}

public int contarConvidados(){
    return convidadoSet.size();
}

public void exibirConvidados(){
    System.out.println(convidadoSet);
}

public static void main(String[] args) {
    ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();
    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " dentro do SET de convidados");

    conjuntoConvidados.adicionarConvidado("Convidado 1", 1111);
    conjuntoConvidados.adicionarConvidado("Convidado 2", 2222);
    conjuntoConvidados.adicionarConvidado("Convidado 3", 3333);
    conjuntoConvidados.adicionarConvidado("Convidado 4", 4444);

    conjuntoConvidados.removerConvidadoPorConvite(4444);
    System.out.println("Existem " + conjuntoConvidados.contarConvidados() + "dentro do SER de convidados");

    conjuntoConvidados.exibirConvidados();
}

}
