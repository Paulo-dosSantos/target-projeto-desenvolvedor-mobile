package ex5.applications;

import ex5.entities.Veiculo;
import ex5.enums.TipoVeiculo;

public class Main5 {
	
	public static void main(String[] args) {
		//CÓDIGO PARA RESOLUÇÃO DA QUESTÃO 5
		Veiculo carro= new Veiculo(TipoVeiculo.CARRO, 90.0);
		
				Veiculo caminhao= new Veiculo(TipoVeiculo.CAMINHAO, 80.0);
		
				
		//Em Km
		 double  distanciaEntreAsCidades=125.0;
		
		//Velocidde relativa é a soma de ambas as velocidades, já que os mesmos estão vindo em sentidos opostos
		double velocidadeRelativa= carro.getVelocidade()+caminhao.getVelocidade();
				
		
			//calculo para tempo de encontro, é a distância entre os dois veículos divididos pela velocidade relativa
		//como a velocidade está em km/h e adistância em km, então o tempo de encontro será dado em horas
		double tempoDeEncontro= distanciaEntreAsCidades/velocidadeRelativa; 
		
		//agora irei calcular a distância percorrida pelo carro durante este tempo
		double distanciaPercorridaCarro= tempoDeEncontro*carro.getVelocidade();
		
		//os códigos abaixo levaram em conta meus conhecimentos adquiridos em cinemática, uma sub-área da física	
		// cada pedágio deu ao carro  5 MINUTOS de espera
		double tempoParadoNoPedagio=5;

		//o carro passou por 3 pedágios e demorou 5 minutos em cada, totalizando 15 minutos. O cálculo abaixo calculará isso
		tempoParadoNoPedagio*=3;
		
		

		//dividir por 60 minutos para converter de minutos para hora
		tempoParadoNoPedagio/=60;//como demorou um total de 15 minutos, pode-se dizer que demorou também 1/4 horas (ou 0.25 horas), que é o resultado desse cálculo


		
		double tempoTotalCarro =  tempoDeEncontro+tempoParadoNoPedagio;
		
		//recalcular a distância percorrida do carro
		distanciaPercorridaCarro=carro.getVelocidade()*tempoTotalCarro;
		
		//agora vamos calcular a distância percorrida do caminhao
		double distanciaPercorridaCaminhao=tempoDeEncontro*caminhao.getVelocidade();
		
		
		//calculando distância do carro a Ribeirão Preto
		double distanciaCarroARibeiraoPreto= distanciaEntreAsCidades-distanciaPercorridaCarro;
		//calculando distância do caminhão a Ribeirão Preto
		double distanciaCaminhaoARibeiraoPreto= distanciaEntreAsCidades-distanciaPercorridaCaminhao;
		
		
		System.out.println("____________________________________________________");
		
		if(distanciaCaminhaoARibeiraoPreto<distanciaCarroARibeiraoPreto) {
			System.out.printf("O caminhão está mais próximo a Ribeirão Preto, pois está a %.2f de km de distância, enquanto que o carro está a %.2f%n ",distanciaCaminhaoARibeiraoPreto,distanciaCarroARibeiraoPreto);
		}
		else if(distanciaCarroARibeiraoPreto<distanciaCaminhaoARibeiraoPreto) {
			System.out.printf("O carro está mais próximo a Ribeirão Preto, pois está a %.2f de km de distância, enquanto que o caminhão está a %.2f%n ",distanciaCarroARibeiraoPreto,distanciaCaminhaoARibeiraoPreto);
			
		}
		
	
	}

}
