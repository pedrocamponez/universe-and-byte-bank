
public class TestaMetodo {
	
	public static void main(String[] args) {
		Conta contaDoPedro = new Conta();
		contaDoPedro.saldo = 100;
		contaDoPedro.deposita(50); //deposita é um método
		
		System.out.println(contaDoPedro.saldo);
		
		boolean conseguiuRetirar = contaDoPedro.saca(20);
		System.out.println(contaDoPedro.saldo);
		System.out.println(conseguiuRetirar);
		
		Conta contaDaCarol = new Conta();
		contaDaCarol.deposita(397595);
		
		contaDaCarol.transfere(595, contaDoPedro);
		System.out.println(contaDoPedro.saldo);
		
		contaDoPedro.titular = "Pedro Camponez";
		System.out.println(contaDoPedro.titular);
		
		System.out.println(contaDaCarol.saldo);
	}
}
