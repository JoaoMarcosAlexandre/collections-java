package list;

import java.util.List;
import java.util.ArrayList;

public class ListaDeTarefas {
    //Atributo Lista de Tarefas

    private List<Tarefa> listaTarefa;
    
    public ListaDeTarefas(List<Tarefa> listaTarefas){
        this.listaTarefa = new ArrayList<>();
    }

    public ListaDeTarefas() {
        //TODO Auto-generated constructor stub
    }

    public void adicionarTarefa(String descricao){
        listaTarefa.add(new Tarefa(descricao));
    }
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasRemover = new ArrayList<>();
            if (!listaTarefa.isEmpty()){
                for(Tarefa t : listaTarefa){
                    if (t.getDescricao().equalsIgnoreCase(descricao)){
                        tarefasRemover.add(t);
                    }
                }
                listaTarefa.removeAll(tarefasRemover);
            }else{
                System.out.println("A lista está vazia!");
            }
    }

    public int obterNumeroTotalTarefas(){
        return listaTarefa.size();
    }

    public void obterDescricoesTarefa(){
        if(!listaTarefa.isEmpty()){
            System.out.println(listaTarefa);
        }else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        //Instanciando a classe ListaDeTarefas
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();

        //Adicionando lista de tarefas
        listaDeTarefas.adicionarTarefa("Comprar maccarrão");
        listaDeTarefas.adicionarTarefa("Estudar na DIO");
        listaDeTarefas.adicionarTarefa("Academia");

        //Exibir o total de tarefas
        System.out.println("Agora, você tem "+listaDeTarefas.obterNumeroTotalTarefas() + " tarefas na lista");

        //Exibindo as descrições das tarefas
        listaDeTarefas.obterDescricoesTarefa();

        //Removendo tarefas
        listaDeTarefas.removerTarefa("Voltar das férias");

        //Exibindo o total de tarefas após a remoção

        System.out.println("Agora, você tem " + listaDeTarefas.obterNumeroTotalTarefas() + " tarefas na lista");

        //Exibindo as tarefas atualizadas

        listaDeTarefas.obterDescricoesTarefa();

        //Removendo uma tarefa da lista quando ela esta vazia

        listaDeTarefas.removerTarefa("Estudar na DIO");
    }
}
