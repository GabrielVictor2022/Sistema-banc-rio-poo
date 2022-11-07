package aula05;

public class ContaBancoTreino {

	private String numConta;
	protected String tipo;
	private String dono;
	private double saldo;
	private boolean status;

	public ContaBancoTreino() {
		this.setSaldo(0);
		this.setStatus(false);
	}

	public void estadoAtual() {
		System.out.println("--------------------------");
		System.out.println("Conta: " + getNumConta());
		System.out.println("Tipo: " + getTipo());
		System.out.println("Dono: " + getDono());
		System.out.println("Saldo: " + getSaldo());
		System.out.println("Status: " + getStatus());
	}

	public void abrirConta(String t) {
		setTipo(t);
		setStatus(true);

		if (t.equalsIgnoreCase("CC")) {

			setSaldo(getSaldo() + 50);

		} else if (t.equalsIgnoreCase("CP")) {
			setSaldo(getSaldo() + 150);
		}
	}

	public void fecharConta() {
		if (getStatus() == true) {
			if (getSaldo() == 0) {
				setStatus(false);
				System.out.println("Conta fechada com sucesso.");
			} else if (getSaldo() > 0) {
				System.out.println("Erro, a conta precisa ser esvaziada para cancelar.");
			} else {
				System.out.println("Erro, os débitos precisam ser pagos para cancelar.");
			}
		} else {
			System.out.println("A conta deve está aberta para cancelar.");
		}
	}
	void transferir(double v) {
		System.out.println("----------------------------");
		if (this.getStatus()) {
			if (this.getSaldo() >= 0 && v <= this.getSaldo()) {
				// retirar de uma conta e colocar em outra
				this.setSaldo(getSaldo() - v);
				System.out.println("Transferência de " + v + "R$ realizada na conta - " + getNumConta());


			} else {
				System.out.println("Saldo insuficiente para transferir.");
			}
		} else {
			System.out.println("Impossível transferir.");
		}
	}

	public void depositar(double v) {
		if (getStatus() == true) {
			setSaldo(getSaldo() + v);
			System.out.println("Deposito de " + v + "R$ realizado na conta de " + getDono());
		} else {
			System.out.println("A conta deve está aberta para depositar.");
		}
	}

	public void sacar(double v) {
		if (getStatus() == true) {
			if (getSaldo() >= v) {
				setSaldo(getSaldo() - v);
				System.out.println("Saque de " + v + "R$ realizado na conta de " + getDono());
			} else {
				System.out.println("Saldo insuficiente para saque!");
			}
		} else {
			System.out.println("A conta deve está aberta para sacar.");
		}
	}

	public void pagarMensal() {
		if (getStatus() == true) {
			double v = 0;
			if (getTipo().equalsIgnoreCase("CC")) {
				v = 12;
				setSaldo(getSaldo() - v);
				System.out.printf("Mensalidade de %.2fR$ paga com sucesso!", v);
			} else {
				v = 20;
				setSaldo(getSaldo() - v);
				System.out.printf("Mensalidade de %.2fR$ paga com sucesso!", v);
			}
		} else {
			System.out.println("A conta deve está aberta para ser paga a mensalidade.");
		}
	}

	String getNumConta() {
		return numConta;
	}

	void setNumConta(String numConta) {
		this.numConta = numConta;
	}

	String getTipo() {
		return tipo;
	}

	void setTipo(String tipo) {
		this.tipo = tipo;
	}

	String getDono() {
		return dono;
	}

	void setDono(String dono) {
		this.dono = dono;
	}

	double getSaldo() {
		return saldo;
	}

	void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	boolean getStatus() {
		return status;
	}

	void setStatus(boolean status) {
		this.status = status;
	}

}
