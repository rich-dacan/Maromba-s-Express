import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ForkJoinPool;

public class GerenciarFuncionario {
    private Scanner scanner;
    private List<Funcionario> funcionarios;

    public GerenciarFuncionario() {
        scanner = new Scanner(System.in);
        funcionarios = new ArrayList<>();
    }

    public void execCadastrar() {
            System.out.println("Cadastro de Funcionários");

            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            System.out.print("RG: ");
            int rg = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Salário: ");
            double salario = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Departamento: ");
            String departamento = scanner.nextLine();

            Funcionario novoFuncionario = new Funcionario();
            novoFuncionario.setNome(nome);
            novoFuncionario.setRg(rg);
            novoFuncionario.setSalario(salario);
            novoFuncionario.setDepartamento(departamento);
            novoFuncionario.setAtivo(true);

            funcionarios.add(novoFuncionario);

            System.out.println("Funcionário cadastrado com sucesso!");
    }


    public void execConsultarRG() {

        System.out.println("Consulta de funcionário através do RG");
        System.out.println("Digite o RG do funcionário: ");
        int rgConsulta = scanner.nextInt();
        scanner.nextLine();

        boolean consulta = false;

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getRg() == rgConsulta) {
                consulta = true;
                System.out.println("Dados do funcionário :");
                System.out.println("Nome: " + funcionario.getNome());
                System.out.println("RG: " + funcionario.getRg());
                System.out.println("Salário: " + funcionario.getSalario());
                System.out.println("Departamento: " + funcionario.getDepartamento());
                if (funcionario.isAtivo()) {
                    System.out.println("Status: Ativo");
                } else {
                    System.out.println("Status: Inativo");
                }
                System.out.println();
                break;
            }
        }

        if (!consulta) {
            System.out.println("Funcionário não encontrado, tente outro número de RG");
        }
    }

    public void execConsultar() {
        System.out.println("Todos os funcionários cadastrados :");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("RG: " + funcionario.getRg());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println("Departamento: " + funcionario.getDepartamento());
            if (funcionario.isAtivo()) {
                System.out.println("Status: Ativo");
            } else {
                System.out.println("Status: Inativo");
            }
            System.out.println();
        }
    }

    public void execAlterarDados() {
        System.out.println("Alterar dados do funcionário");
    }

    public void execInativar() {
        System.out.println("Inativar funcionário");
        System.out.println("Digite o RG do usuário que deseja inativar :");
        int rgToInative = scanner.nextInt();
        scanner.nextLine();


        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getRg() == rgToInative) {
                System.out.println("Dados do funcionário :");
                System.out.println("Nome: " + funcionario.getNome());
                System.out.println("RG: " + funcionario.getRg());
                System.out.println("Salário: " + funcionario.getSalario());
                System.out.println("Departamento: " + funcionario.getDepartamento());
                System.out.println();
                System.out.println("1. Confirmar");
                System.out.println("2. Cancelar");
                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch(opcao) {
                    case 1:
                        funcionario.setAtivo(false);
                        System.out.println("O funcionário agora está definido como inativo");
                        break;
                    case 2:
                        System.out.println("Retornando ao menu principal...");
                        return;
                }
            }
        }
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
            System.out.println("3. Consultar todos os funcionários");
            System.out.println("4. Alterar Dados de Funcionário");
            System.out.println("5. Inativar");
            System.out.println("6. Excluir Funcionário");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = gerenciarFuncionario.scanner.nextInt();
            gerenciarFuncionario.scanner.nextLine();

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