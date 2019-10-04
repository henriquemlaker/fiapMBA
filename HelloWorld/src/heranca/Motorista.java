package heranca;

public class Motorista extends Funcionario {
	void dirige() {
		System.out.println("Dirige Motorista");
	}
	
	Motorista(int XNumro, String XNome) {
		super(XNumro, XNome);
	}
	
	@Override
	void trabalha() {
		System.out.println("Trbalha Motorista");
	}
	
	int getBonificacao() {
		return 0;
	}

}
