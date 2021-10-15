package entities;

public class contaEstudantil extends conta {

	private double limiteEstudantil;

	public contaEstudantil(int numero, String cpf, double limiteEstudantil) {
		super(numero, cpf);
		this.limiteEstudantil = limiteEstudantil;

	}

	public double getLimiteEstudantil() {
		return limiteEstudantil;
	}

	public void setLimiteEstudantil(double limiteEstudantil) {
		this.limiteEstudantil = limiteEstudantil;
	}

	public void usarEstudantil(double valor) {

		limiteEstudantil -= valor;
		saldo += valor;
	}

}
