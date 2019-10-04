public abstract class   Conta {
	
	private String tiular;
	protected double saldo;	
	
	abstract double getSaldo();
	
	public abstract String getTipo();
	
	
	abstract void deposita (double valor);
	
	
	abstract void saque(double valor) ;
}
