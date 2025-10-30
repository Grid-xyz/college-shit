public class bonus{

    public double calcularBonus(String cargo, double salarioBruto){
        
        if (cargo == "gerente"){
            return 0.2;
        } else{
            if (cargo == "desenvolvedor"){
                return 0.1;
            } else{
                return 0.05;
            }
        }




    }

}