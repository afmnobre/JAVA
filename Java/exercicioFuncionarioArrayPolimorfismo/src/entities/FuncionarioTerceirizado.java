package entities;

/**
 * 
 */
public class FuncionarioTerceirizado extends Funcionario {
	
	private Double despesaAdicional;
	
	public FuncionarioTerceirizado() {
		super();
	}

	public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, Double despesaAdicional) {
		super(nome, horas, valorPorHora);
		this.despesaAdicional = despesaAdicional;
	}

	public Double getdespesaAdicional() {
		return despesaAdicional;
	}

	public void setdespesaAdicional(Double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}
	
	@Override
	public double pagamento() {
		return super.pagamento() + despesaAdicional * 1.1; //PAGAMENTO DA CLASSE PAI
	}
}
