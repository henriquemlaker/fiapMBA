import java.time.LocalDate;

import javax.swing.JOptionPane;

public class TesteErro {
	
	
	public static void main(String[] args)  {
		System.out.println("inicio do main");
		
		metodo1();			
			
		
		System.out.println("fim do main");

	}
	
	static void metodo1()  {
		System.out.println("inicio do metodo1");
		metodo2();
		System.out.println("fim do metodo1");
	}
	
	static void metodo2() {
		System.out.println("inicio do metodo2");
		ContaCorrente cc = new ContaCorrente("Henrique","Rua 1 ","XXX.XXX.XXX-XX",LocalDate.of(2019, 10, 31));		
		metodo3(cc);
		/*for (int i = 0; i <= 15; i++) {
			cc.deposita(i + 1000);
			System.out.println(cc.getSaldo());
			if (i == 5) {
				cc= null;
			}
		}	*/	
		
		System.out.println("fim do metodo2");
	}
	
	static void metodo3(ContaCorrente cc)  {
		Double value = Double.valueOf(JOptionPane.showInputDialog("Digite um Valor para depositar"));
		cc.deposita(value);
		
		ContaCorrente cc2 = new ContaCorrente("Henrique 2","Rua 2 ","XXX.XXX.XXX-XX", LocalDate.of(2010, 11, 24));
		
		System.out.println("Valor final:" + cc.getSaldo());
		
		Double saque = Double.valueOf(JOptionPane.showInputDialog("Digite um Valor"));
		boolean cpf = cc.equals(cc2);
		
		try {
			cc.saque(saque);
		} catch (SaldoInsuficiente e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		cc2.equals(cc);
		
		
		System.out.println("Valor final 2: " + cc.getSaldo());
		System.out.println("Cpf é igual: " + cpf);
		System.out.println("Data Nscimento: " + cc.getDataNscimento());
		
	}

}
