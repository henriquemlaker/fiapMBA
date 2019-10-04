package heranca;

public class Diretor extends Funcionario implements Autenticavel{
	Diretor(int XNumro, String XNome) {
		super(XNumro, XNome);		
	}

	private String senha = "123";

	@Override
	public boolean autentica(String senha) {
		// TODO Auto-generated method stub
		return false;
	}

}
