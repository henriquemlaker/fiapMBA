
public class Conta {
	 private String tiular;
	 protected double saldo;	
	
	double getSaldo() {
		return saldo;
	}
	
	public String getTipo () {
		return "Conta";
	}
	
	void deposita (double valor) {
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
