import java.util.Scanner;

public class GerenciarFuncionario {
    private Scanner scanner;

    public GerenciarFuncionario() {
        scanner = new Scanner(System.in);
    }

    public void execCadastrar() {
        System.out.println("Cadastrar funcionário");
    }

    public void execConsultarRG() {
        System.out.println("Consultar funcionário por RG");
    }

    public void execConsultar() {
        System.out.println("Consultar todos os funcionários");
    }

    public void execAlterarDados() {
        System.out.println("Alterar dados do funcionário");
    }

    public void execInativar() {
        System.out.println("Inativar funcionário");
    }

    public void execExcluirFuncionario() {
        System.out.println("Excluir funcionário");
    }

    public static void main(String[] args) {
        GerenciarFuncionario gerenciarFuncionario = new GerenciarFuncionario();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Cadastrar");
            System.out.println("2. Consultar Por RG");
            System.out.println("3. Consultar Todos");
            System.out.println("4. Alterar Dados de Funcionário");
            System.out.println("5. Inativar");
            System.out.println("6. Excluir Funcionário");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = gerenciarFuncionario.scanner.nextInt();
            gerenciarFuncionario.scanner.nextLine(); // Consumir a quebra de linha

            switch (opcao) {
                case 1:
                    gerenciarFuncionario.execCadastrar();
                    break;
                case 2:
                    gerenciarFuncionario.execConsultarRG();
                    break;
                case 3:
                    gerenciarFuncionario.execConsultar();
                    break;
                case 4:
                    gerenciarFuncionario.execAlterarDados();
                    break;
                case 5:
                    gerenciarFuncionario.execInativar();
                    break;
                case 6:
                    gerenciarFuncionario.execExcluirFuncionario();
                    break;
                case 7:
                    System.out.println("Programa encerrado.");
                    gerenciarFuncionario.scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida. Por favor, insira uma opção válida.");
            }
        }
    }
}