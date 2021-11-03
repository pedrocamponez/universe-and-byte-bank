
public class TestaBanco {

	public static void main(String[] args) {
		Cliente pedro = new Cliente();
		pedro.nome = "Pedro Camponez";
		pedro.cpf = "222.222.222-22";
		pedro.profissao = "Programador";
		
		Conta contaDoPedro = new Conta();
		contaDoPedro.deposita(100);
		
		
		contaDoPedro.titular = pedro;
		System.out.println(contaDoPedro.titular.nome);
		
		
	}
}
