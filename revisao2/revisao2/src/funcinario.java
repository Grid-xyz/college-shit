public class funcinario {

    private String nome;
    private String cargo;
    private double salarioBruto;
    private int matricula;

    funcinario(String nome, String cargo, double salarioBruto, int matricula){
        this.nome = nome;
        this.cargo = cargo;
        this.salarioBruto = salarioBruto;
        this.matricula = matricula;
    }

    public String getNome() {
        return this.nome;
    }

    public String getCargo() {
        return this.cargo;
    }

    public int getMatricula() {
        return this.matricula;
    }

    public double getSalarioBruto() {
        return this.salarioBruto;
    }

    public double calcularSalarioLiquido(){
        return this.salarioBruto * 0.15;
    }



    public double calcularBonus(){
        if (cargo == "gerente"){
            return 0.2;
        } else {
            if(cargo == "desenvolvedor"){
                return 0.1;
            } else{
                return 0.05;
            }
        }
    }
    
}
