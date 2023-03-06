
public class Main {

	public static void main(String[] args) {
		
		Funcionario funcionario = new Funcionario();
		
		// UpCast
		Funcionario gerente = new Gerente();		
		Funcionario vendedor = new Vendedor();		
		Funcionario faxineiro = new Faxineiro();
		
		// DownCast
		Vendedor vendedor_ = (Vendedor) new Funcionario();

	}

}
