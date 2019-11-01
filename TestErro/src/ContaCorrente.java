import java.time.LocalDate;

public class ContaCorrente extends Conta {
	
	private String nome;
	private String endereco;
	private String cpf;
	private double saldo;
	private LocalDate dataNacimento;
	
	public ContaCorrente(String nome, String endereco, String cpf,
			LocalDate dataNascimento) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.dataNacimento = dataNascimento;
	}
	
	public String getTipo () {
		return "Conta Corrente";
	}
	
	public LocalDate getDataNscimento () {
		return dataNacimento;
	}
	
	public boolean equals(Object obj) {
		ContaCorrente conta = (ContaCorrente) obj;
		return (conta.cpf.equals(this.cpf));
	}
	
	public void saque(double valor) throws SaldoInsuficiente{
		if(this.saldo < valor) {
			throw new SaldoInsuficiente("Saldo insuficiente para saque");
		}
		this.saldo = saldo - valor;
	}
	
	public void deposita(double valor){
		this.saldo = saldo + valor;
	}

	@Override
	double getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}
	 
}