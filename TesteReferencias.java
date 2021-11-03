
public class TesteReferencias {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("O saldo da primeira conta é: R$" + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta; //O que é passado é a referência, ou seja, agora a segundaConta é uma referência igual à primeiraConta
		
		System.out.println(segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("São a mesma conta!");
		} else {
			System.out.println("São contas diferentes!");
		}
	}
}
