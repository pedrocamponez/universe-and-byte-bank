
public class TestaGetESet {

	public static void main(String[] args) {
		Conta conta = new Conta(1337, 24226);
		
		System.out.println(conta.getNumero());
		
		Cliente pedro = new Cliente();
		//conta.titular = pedro;
		pedro.setNome("Pedro Camponez");
		conta.setTitular(pedro);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("Programador");
		System.out.println(conta.getTitular().getProfissao());
		
	}
}
