
public class TesteReferencias {
	
	public static void main(String[] args) {
		Conta primeiraConta = new Conta();
		primeiraConta.saldo = 300;
		
		System.out.println("O saldo da primeira conta �: R$" + primeiraConta.saldo);
		
		Conta segundaConta = primeiraConta; //O que � passado � a refer�ncia, ou seja, agora a segundaConta � uma refer�ncia igual � primeiraConta
		
		System.out.println(segundaConta.saldo);
		
		segundaConta.saldo += 100;
		System.out.println(primeiraConta.saldo);
		
		if(primeiraConta == segundaConta) {
			System.out.println("S�o a mesma conta!");
		} else {
			System.out.println("S�o contas diferentes!");
		}
	}
}
