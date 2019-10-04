package heranca;

public class Funcionario {
	int numero;
	String nome;
	
	Funcionario(int XNumro, String XNome) {
		
	}
	
	public int getNumero(int numro) {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	void trabalha() {
		
	}

	public int getBonificacao() {		
		return 10;
	}
	
}
