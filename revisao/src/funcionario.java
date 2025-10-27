public class funcionario {

    private String nome;
    private int matricula;
    private String cargo;
    private double salarioBruto;

    funcionario (String nome, int matricula, String cargo, double salarioBruto){
        this.nome = nome;
        this.matricula = matricula;
        this.cargo = cargo;
        this.salarioBruto = salarioBruto;
    }
    
        public String getNome(){
            return this.nome;
        }

        public int getMatricula(){
            return this.matricula;
        }

        public String getCargo(){
            return this.cargo;
        }

        public double getSalarioBruto(){
            return this.salarioBruto;
        }


    public double calcularSalarioLiquido(){
        return this.salarioBruto - (this.salarioBruto * 0.15);
    }


    public double calcularBonus(){
        if (cargo == "gerente"){
            return this.salarioBruto * 0.2;
        } else{
            if(cargo == "desenvolvedor"){ 
                return this.salarioBruto * 0.1;
            } else {
                return this.salarioBruto * 0.05;
                }
        } 
    }
}
