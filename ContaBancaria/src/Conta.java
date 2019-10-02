
public class Conta {
	private String tiular;
	private double saldo;
	private static int numeroConta;
	
	double getSaldo() {
		return saldo;
	}
	
	void deposita (int numero, double valor) {
		saldo += valor;
	}
	
	void saque(double valor) {		
		if(saldo > 0 && saldo >= valor) {
			saldo -= valor;
			System.out.println("Saque realizado com sucesso!");
		}else {
			System.out.println("Saldo insulficiente");
		}
		
	}
}
