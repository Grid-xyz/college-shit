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



public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        funcinario f1 = new funcinario("igor", "programador", 1000, 1234);
        funcinario f2 = new funcinario("felipe", "gerente", 2000, 4312);

        System.out.println("Nome: " + f1.getNome());
        System.out.println("Cargo: " + f1.getCargo());
        System.out.println("Matricula: " + f1.getMatricula());
        System.out.println("Salario final: " + ((f1.getSalarioBruto() - f1.calcularSalarioLiquido()) + (f1.getSalarioBruto() * f1.calcularBonus())));

        System.out.println();

        System.out.println("Nome: " + f2.getNome());
        System.out.println("Cargo: " + f2.getCargo());
        System.out.println("Matricula: " + f2.getMatricula());
        System.out.println("Salario final: " + ((f2.getSalarioBruto() - f2.calcularSalarioLiquido()) + (f2.getSalarioBruto() * f2.calcularBonus())));

    }
}
