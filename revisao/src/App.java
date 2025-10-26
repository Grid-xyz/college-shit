/*
EXERCÍCIO

Crie um sistema em java para calcular o salário líquido e o bônus
dos funcionários de uma empresa.

1. O sistema deve ter:
   * Classe Funcionario: nome, matricula, cargo, salarioBruto;
   * Um construtor que recebe o nome, matricula e cargo;
   * Getters e Setters para cada atributo;
   * Receber o salarioBruto pelo setter;
   * Um metodo para calcularSalarioLiquido(), que deve 
     retornar o salarioBruto com um desconto de 15% (impostos).

   * Uma classe estática com o metodo calcularBonus(), ao qual
     recebe o cargo (String) e o salarioBruto (double) e retorna
     o valor do bônus:
       "Gerente", se o cargo for "Gerente" -> 20% do salarioBruto
       "Desenvolvedor", se o cargo for "Desenvolvedor" -> 10% do salarioBruto
       "Outro", se for qualquer outro cargo -> 5% do salarioBruto

   * Na classe principal crie 2 objetos e mostre:
     * Nome, salarioLiquido e bonus de cada funcionario.
*/


//agr vo mandar pro github kkkk
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("fuck u man");

        funcionario f1 = new funcionario("Igor", 3240, "pedreiro", 1200.5);

        System.out.println(f1.getNome());        
    }
}
