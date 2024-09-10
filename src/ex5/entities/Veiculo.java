package ex5.entities;

import ex5.enums.TipoVeiculo;


public class Veiculo {
	
	private TipoVeiculo tipoVeiculo;
	
	//velocidade em km/h
	private Double velocidade;

	
	public Veiculo() {
		
	}


	public Veiculo(TipoVeiculo tipoVeiculo, Double velocidade) {
		super();
		this.tipoVeiculo = tipoVeiculo;
		this.velocidade = velocidade;
	}


	public TipoVeiculo getTipoVeiculo() {
		return tipoVeiculo;
	}


	public void setTipoVeiculo(TipoVeiculo tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}


	public Double getVelocidade() {
		return velocidade;
	}


	public void setVelocidade(Double velocidade) {
		this.velocidade = velocidade;
	}
	
}
