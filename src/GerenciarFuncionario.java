
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;


public class GerenciarFuncionario {
    private Scanner scanner;
    private List<Funcionario> funcionarios;

    public GerenciarFuncionario() {
        scanner = new Scanner(System.in);
        funcionarios = new ArrayList<Funcionario>();
    }

    public int lerOpcao() {
        int opcao = scanner.nextInt();
        scanner.nextLine();
        return opcao;
    }

    public void fecharScanner() {
        scanner.close();
    }

    public void execCadastrar() {
        System.out.println("Cadastro de Funcionários");

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("RG: ");
        String rg = scanner.nextLine();

        System.out.print("Salário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Departamento: ");
        String departamento = scanner.nextLine();

        Funcionario novoFuncionario = new Funcionario(rg, nome, departamento, salario, true);

        funcionarios.add(novoFuncionario);

        System.out.println("-----------------------------------");
        System.out.println("Funcionário cadastrado com sucesso!");
        System.out.println("-----------------------------------");

    }

    public void execConsultarRG() {
        System.out.println("Consulta de funcionário através do RG");
        System.out.println("Digite o RG do funcionário: ");
        String rgConsulta = scanner.nextLine();

        boolean consulta = false;

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getRg().equals(rgConsulta)) {
                consulta = true;
                System.out.println("-----------------------------------");
                System.out.println("Dados do funcionário: ");
                System.out.println("Nome: " + funcionario.getNome());
                System.out.println("RG: " + funcionario.getRg());
                System.out.println("Salário: " + funcionario.getSalario());
                System.out.println("Departamento: " + funcionario.getDepartamento());
                System.out.println("-----------------------------------");

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
        System.out.println("-----------------------------------");
        for (Funcionario funcionario : funcionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("RG: " + funcionario.getRg());
            System.out.println("Salário: " + funcionario.getSalario());
            System.out.println("Departamento: " + funcionario.getDepartamento());
            System.out.println("-----------------------------------");

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
        System.out.println("Digite o RG do usuário que deseja alterar os dados: ");
        String rgToAlter = scanner.nextLine();
        boolean encontrado = false;
        scanner.nextLine();

        for (Funcionario funcionario : funcionarios){
           if (funcionario.getRg() == rgToAlter) {
               encontrado = true;
               System.out.println("Alteração de dados: ");


               System.out.println("1. Alterar nome do usuário");
               System.out.println("2. Alterar salário");
               System.out.println("3. Alterar departamento");
               System.out.println("4. Alterar RG ");
               System.out.println("5. Retornar ao menu");
               int selecao = scanner.nextInt();
               scanner.nextLine();

               switch (selecao) {
                   case 1:
                       System.out.print("Digite um novo nome: ");
                       String novo_nome = scanner.nextLine();
                       funcionario.setNome(novo_nome);
                       break;
                   case 2:
                       System.out.print("Digite uma nova remuneração: ");
                       Double novo_salario = scanner.nextDouble();
                       funcionario.setSalario(novo_salario);
                       break;
                   case 3:
                       System.out.print("Digite um novo departamento para o usuário: ");
                       String novo_departamento = scanner.nextLine();

                       funcionario.setDepartamento(novo_departamento);
                       break;
                   case 4:
                       System.out.println("Digite um novo RG: ");
                       String novo_rg = scanner.nextLine();
                       funcionario.setRg(novo_rg);
                   case 5:
                       return;
                   default :
                       System.out.println("Digite uma opção válida");
               }
               encontrado = true;
               System.out.println("Dados alterados com sucesso!");
               break;
           }
        }
        if (!encontrado) {
            System.out.println("Funcionário com rg" + rgToAlter + " não encontrado no sistema!");
        }
    }

    public void execDesativar() {
        System.out.println("Alterar status do funcionário");
        System.out.println("Digite o RG do usuário que deseja inativar/ativar :");
        String rgToInative = scanner.nextLine();
        scanner.nextLine();


        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getRg() == rgToInative) {
                System.out.println("Dados do funcionário :");
                System.out.println("Nome: " + funcionario.getNome());
                System.out.println("RG: " + funcionario.getRg());
                System.out.println("Salário: " + funcionario.getSalario());
                System.out.println("Departamento: " + funcionario.getDepartamento());
                System.out.println();
                System.out.println("1. Inativar");
                System.out.println("2. Ativar");
                System.out.println("3. Retornar ao menu");
                int opcao = scanner.nextInt();
                scanner.nextLine();

                switch(opcao) {
                    case 1:
                        funcionario.setAtivo(false);
                        System.out.println("O funcionário agora está definido como inativo");
                        break;
                    case 2:
                        funcionario.setAtivo(true);
                        System.out.println("O funcionário agora está definido como ativo");
                    case 3:
                        System.out.println("Retornando ao menu principal...");
                        return;
                }
            }
        }
    }

    public void execExcluirFuncionario() {
        System.out.println("Excluir funcionário");

        System.out.println("Digite o RG do funcionário: ");
        String rgToRemove = scanner.nextLine();
        boolean excluir = false;
        System.out.println();


        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getRg() == rgToRemove) {
                excluir = true;
                System.out.println("O funcionário será excluido");
                System.out.println("1. Confirmar");
                System.out.println("2. Cancelar");
                int escolha = scanner.nextInt();


                switch (escolha) {
                    case 1:
                        funcionarios.remove(funcionario);
                        System.out.println("Funcionário com RG " + rgToRemove + " excluido com sucesso!");
                        break;
                    case 2:
                        System.out.println("Exclusão cancelada!");
                        break;
                    default:
                        System.out.println("Opção inválida!");
                }
                break;
            }
            if (!excluir) {
                System.out.println("Funcionário com RG " + rgToRemove + " não encontrado.");
            }
        }
    }
}
