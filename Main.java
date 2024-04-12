public class Main {
  public static void main(String[] args) {
    GerenciarFuncionario gerenciarFuncionario = new GerenciarFuncionario();

    while (true) {
        System.out.println("\nMenu:");
        System.out.println("1. Cadastrar");
        System.out.println("2. Consultar Por RG");
        System.out.println("3. Consultar todos os funcionários");
        System.out.println("4. Alterar Dados de Funcionário");
        System.out.println("5. Desativar/Ativar");
        System.out.println("6. Excluir Funcionário");
        System.out.println("7. Sair");
        System.out.print("Escolha uma opção: ");

        int opcao = gerenciarFuncionario.lerOpcao();

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
                gerenciarFuncionario.execDesativar();
                break;
            case 6:
                gerenciarFuncionario.execExcluirFuncionario();
                break;
            case 7:
                System.out.println("Programa encerrado.");
                gerenciarFuncionario.fecharScanner();
                return;
            default:
                System.out.println("Opção inválida. Por favor, insira uma opção válida.");
        }
    }
}
}
