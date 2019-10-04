public class TesteConta {	
	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente();
		cc1.deposita(100);
		cc1.saque(10);
		
		ContaPoupanca cp1 = new ContaPoupanca();
		cp1.deposita(100);
		cp1.saque(10);
		
		ContaPoupanca cp2 = new ContaPoupanca();
		cp1.deposita(100);
		cp1.saque(200);
		
		System.out.println(cc1.getSaldo());
		System.out.println(cp1.getSaldo());
		System.out.println(cp2.getSaldo());
		
		
		
	}
	
	
}
