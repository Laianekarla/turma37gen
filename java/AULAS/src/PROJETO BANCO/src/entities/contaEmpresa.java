package entities;

public class contaEmpresa extends conta {

    private double emprestimoEmpresa;
    
    public contaEmpresa(int numero, String cpf,double emprestimoEmpresa) {
        super(numero, cpf);
        this.emprestimoEmpresa= emprestimoEmpresa;
    }
    
    public double getEmprestimoEmpresa() {
		return emprestimoEmpresa;
	}


	public void setEmprestimoEmpresa(double emprestimoEmpresa) {
		this.emprestimoEmpresa = emprestimoEmpresa;
	}
   
	public void pedirEmprestimo(double valor) {
		if(valor<emprestimoEmpresa) {
		emprestimoEmpresa-= valor;
		saldo+= valor;
		}else {
			System.out.println("Valor pedido maior que o teto do empréstimo!!");
		}
    }


	
    


}