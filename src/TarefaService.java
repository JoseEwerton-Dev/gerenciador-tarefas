import java.util.ArrayList;

public class TarefaService {

    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    private int proximoId = 1;

    public void adicionarTarefa (String descricao) {

        Tarefa tarefa = new Tarefa(proximoId,descricao);
        tarefas.add(tarefa);
        proximoId++;
        System.out.println("Tarefa adicionada!");
    }

    public void listarTarefas() {
        if (tarefas.isEmpty()) {
            System.out.println("Nenhuma tarefa adicionada.");
            return;
        }

        for (Tarefa t : tarefas) {
            String status = t.isConcluia() ? "Concluida" : "Pendente";

            System.out.println(t.getId() + " - " + t.getDescricao() + " [" + status + "] ");
        }
    }

    public void concluirTarefa(int id) {
        for (Tarefa t : tarefas) {
            if (t.getId() == id) {
                t.concluir();
                System.out.println("Tarefa concluída!");
                return;
            }
        }
        System.out.println("Tarefa não encontrada.");
    }

    public void removerTarefa(int id) {
        for (Tarefa t : tarefas) {
            if (t.getId() == id) {
                tarefas.remove(t);
                System.out.println("Tarefa removida!");
                return;
            }
        }
        System.out.println("Tarefa não encontrada.");
    }

}
