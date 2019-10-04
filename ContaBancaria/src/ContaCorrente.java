
public class ContaCorrente extends Conta{	
	
	public String getTipo () {
		return "Conta Corrente";
	}
	
	public void saque(double valor){
		saldo -= (valor+valor*0.1);
	}
	
	public void deposita(double valor){
		saldo += (valor-valor*0.1);
	}

	@Override
	double getSaldo() {
		// TODO Auto-generated method stub
		return 0;
	}
	 
}
