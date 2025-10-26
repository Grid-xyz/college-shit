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

        public double getSalarioDuplo(){
            return this.salarioBruto;
        }


        


}
