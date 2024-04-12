
public class Funcionario {
  private String rg;
  private String nome;
  private String departamento;
  private double salario;
  private boolean ativo;

  public Funcionario() {
    // this.rg = rg;
    // this.nome = nome;
    // this.departamento = departamento;
    // this.salario = salario;
    // this.ativo = ativo;
  }

    public void atualizarSalario(double aumento){
        salario += aumento;
    }

    public void exibirDados(){
        System.out.println("RG = " + rg);
        System.out.println("nome = " + nome);
        System.out.println("departamento = " + departamento);
    }

    public String getRg() {
        return this.rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
