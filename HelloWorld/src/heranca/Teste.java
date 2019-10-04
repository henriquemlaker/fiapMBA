package heranca;

import java.util.Arrays;

public class Teste {
	
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario(123, "Henrique");
		f1.setNome("Henrique");
		f1.setNumero(123);
		
		
		Funcionario[] arrayFunc = new Funcionario[3];
		arrayFunc[0] = f1;
		arrayFunc[1] = new Funcionario(5555, "Henrique 2");
		arrayFunc[2] = new Motorista(666, "Henrique 666");
		
		System.out.println(Arrays.toString(arrayFunc));
		
		
	}

}
