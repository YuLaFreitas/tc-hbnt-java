import java.util.ArrayList;
import java.util.List;

public class ListaTodo {

    private ArrayList<Tarefa> tarefas = new ArrayList<Tarefa>();

    public ListaTodo(){
    }

    public ListaTodo(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }

    public void adicionarTarefa(Tarefa tarefa) {
       // System.out.println(tarefa);
        for(Tarefa tarefa1 : tarefas){
            if(tarefa1.getIdentificado() == tarefa.getIdentificado()){
                throw new IllegalArgumentException("Tarefa com identificador " +
                        tarefa.getIdentificado() +" ja existente na lista");
            }

            if(tarefa.getDescricao().isEmpty() || tarefa.equals(null)){
                throw new IllegalArgumentException("Descricao de tarefa invalida");
            }
        }

        tarefas.add(tarefa);

        }

    public void listarTarefas(){
        String isFeito;
        for (Tarefa tarefa : tarefas) {
            isFeito = tarefa.isEstahFeita() ? "x" : " ";

            System.out.println("["+isFeito+"]  id: " +tarefa.getDescricao()+
                    " - Descricao: Tarefa "+tarefa.getIdentificado());
        }
    }

    public boolean marcarTarefaFeita(int identificador) {
            for(Tarefa iTarefa : tarefas){
                if(iTarefa.getIdentificado() == identificador){
                    iTarefa.setEstahFeita(true);
                    return true;
                }
            }
            return false;
    }

    public boolean desfazerTarefa(int identificador) {
        for(Tarefa iTarefa : tarefas){
            if(iTarefa.getIdentificado() == identificador){
               iTarefa.setEstahFeita(false);
               return true;
            }
        }
        return false;

    }

    public void fazerTodas() {
        for(Tarefa tarefa : tarefas){
            tarefa.setEstahFeita(true);
        }
    }

    public void desfazerTodas() {
        for(Tarefa tarefa : tarefas){
            tarefa.setEstahFeita(false);
        }
    }
}
