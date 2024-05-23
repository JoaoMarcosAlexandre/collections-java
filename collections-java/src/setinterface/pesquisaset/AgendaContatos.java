package setinterface.pesquisaset;
import java.util.HashSet;
import java.util.Set;


public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos(){
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }
    public void exibirContato(){
        System.out.println(contatoSet);
    }
    public Set<Contato> pesquisarNome(String nome){
        Set<Contato> contatosPorNome = new HashSet<>();
        for(Contato c : contatoSet){
            if(c.getNome().startsWith(nome)){
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }

    public Contato atualizarContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet){
            if(c.getNome().equalsIgnoreCase(nome)){
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.exibirContato();

        agendaContatos.adicionarContato("Joao", 1234);
        agendaContatos.adicionarContato("Gabi", 4321);
        agendaContatos.adicionarContato("Davi", 5678);
        agendaContatos.adicionarContato("Manu", 8706);

        agendaContatos.exibirContato();

        System.out.println(agendaContatos.pesquisarNome("Gabi"));

        System.out.println("Contato atualizado: " + agendaContatos.atualizarContato("Davi", 870621345));
    }
}
