package heranca;

public class ControleBonificacao {
	int totalBonificacao = 0;
	
	void registra(Funcionario f) {
		totalBonificacao += f.getBonificacao();
	}

	public int getTotalBonificacao() {
		return totalBonificacao;
	}

	public void setTotalBonificacao(int totalBonificacao) {
		this.totalBonificacao = totalBonificacao;
	}
	
	

}
