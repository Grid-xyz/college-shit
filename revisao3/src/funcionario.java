public class funcionario {

    private String nome;
    private String cargo;
    private int matricula;
    private double salarioBruto;

    public String getNome(){
        return this.nome;
    }

    public String getCargo(){
        return this.cargo;
    }

    public int getMatricula(){
        return this.matricula;
    }

    public double getSalarioBruto(){
        return this.salarioBruto;
    }

    
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCargo(String cargo){
        this.cargo = cargo;
    }

    public void setMatricula(int matricula){
        this.matricula = matricula;
    }

    public void setSalarioBruto(double salarioBruto){
        this.salarioBruto = salarioBruto;
    }


    public double calcularSalarioLiquido(){
        return getSalarioBruto() * 0.15;
    }
}
