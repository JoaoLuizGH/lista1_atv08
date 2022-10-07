public class App {
    public static void main(String[] args) throws Exception {
       //Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

        Scanner teclado = new Scanner(System.in);

        double vlrhora, hrstrab, salario;
  
        System.out.println("Informe o valor da hora de serviço: ");
        vlrhora = teclado.nextDouble();

        System.out.println("Informe quantas horas trabalhou no mês: ");
        hrstrab = teclado.nextDouble();
  
        salario =  hrstrab * vlrhora;
  
        teclado.close();
  
        System.out.println(" Você irá receber R$ : " + salario ); 
    }
}
