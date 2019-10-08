import javax.swing.JOptionPane;

public class TesteCalculadora {
	public static void main(String[] args) {
		
		loop: while(true) {
			String opcao = JOptionPane.showInputDialog("Qual operação deseja realizar? \n\n 1 - Somar \n 2 - Subtrair \n 3 - Dividir \n 4 - Multiplicar \n 5 - Sair");
			
			Calculadora calc = new Calculadora();
			
			switch (opcao) {
				case "1":
					Float op1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor 1 para a soma"));
					Float op2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor 2 para a soma"));
					 System.out.println("O resultado da soma foi: "+ calc.somar(op1, op2));
					break;
				case "2":
					Float op3 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor 1 para a subtração"));
					Float op4 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor 2 para a subtração"));
					System.out.println("O resultado da subtração foi: "+ calc.subtrair(op3, op4));
					break;
				case "3":
					Float op5 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor 1 para a divisão"));
					Float op6 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor 2 para a divisão"));
					System.out.println("O resultado da divisão foi: "+ calc.dividir(op5, op6));
					break;
				case "4":
					Float op7 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor 1 para a multiplicação"));
					Float op8 = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor 2 para a multiplicação"));
					System.out.println("O resultado da multiplicação foi: "+ calc.multiplicar(op7, op8));
					break;
				case "5":
					 System.out.println("Obrigado por utilizar nossa calculadora!!!");
					 break loop;
		
				default:
					System.out.println("Opção Invalida\nFavor Selecionar uma opção de 1 a 5!!!");
					break;
			}
		}
	}
}
