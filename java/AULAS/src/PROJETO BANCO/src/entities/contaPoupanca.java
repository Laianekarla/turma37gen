package entities;

public class contaPoupanca extends conta {
	private int diaAniversarioPoupanca;

	public contaPoupanca(int numero, String cpf, int diaAniversarioPoupanca) {
		super(numero, cpf);
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;

	}

	public int getDiaAniversarioPoupanca() {
		return diaAniversarioPoupanca;
	}

	public void setDiaAniversarioPoupanca(int diaAniversarioPoupanca) {
		this.diaAniversarioPoupanca = diaAniversarioPoupanca;
	}

	public void correção(int diaAtual) {
		if (diaAniversarioPoupanca == diaAtual) {
			saldo = (saldo* 0.05) + saldo;
		} else {
			System.out.println("saldo: " +saldo);
		}

	}
}
