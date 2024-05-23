package map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos(){
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer numero){
        agendaContatoMap.put(nome, numero);
    }

    public void removerContato(String nome){
        if(agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer retornarNome(String nome){
        Integer numeroPorNome = null;
        if(agendaContatoMap.isEmpty()){
            agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Joao", 123456789);
        agendaContatos.adicionarContato("Gabi", 987654321);
        agendaContatos.adicionarContato("Davi", 456789123);
        agendaContatos.adicionarContato("Manu", 321654987);
        agendaContatos.adicionarContato("Alexandre", 870621345);

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Joao");
        agendaContatos.exibirContatos();
    }
}
