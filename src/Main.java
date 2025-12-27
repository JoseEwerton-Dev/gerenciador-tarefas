import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        TarefaService service = new TarefaService();

        int opcao = 0;

        while (opcao != 5) {
            System.out.println("""
                    ===== Gerenciador de tarefas =====
                    
                    1 - Adicionar tarefas
                    2 - Listar tarefas
                    3 - Concluir tarefa
                    4 - Remover tarefa
                    5- Sair
                    """);

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1 -> {

                    System.out.println("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();

                    service.adicionarTarefa(descricao);
                }

                case 2 -> service.listarTarefas();


                case 3 -> {
                    System.out.println("Digite o número da tarefa para concluir: ");
                    int id = scanner.nextInt();
                    service.concluirTarefa(id);
                }

                case 4 -> {
                    System.out.println("Digite o número da tarefa para remover: ");
                    int id = scanner.nextInt();
                    service.removerTarefa(id);
                }

                case 5 -> System.out.println("Saindo do sistema...");

                default -> System.out.println("opção inválida.");
            }
        }
        scanner.close();
    }
}