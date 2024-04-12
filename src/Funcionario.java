package src;

public class Funcionario {

    private double salario;
    private String nome;
    private String departamento;
    private int rg;
    private boolean ativo;


    public void atualizarSalario(double aumento){
        salario += aumento;
    }
    public void exibirDados(){
        System.out.println("RG = " + rg);
        System.out.println("nome = " + nome);
        System.out.println("departamento = " + departamento);
    }


    public int getRg() {
        return rg;
    }

    public void setRg(int rg) {
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