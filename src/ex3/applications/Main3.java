package ex3.applications;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import ex3.entities.Faturamento;

public class Main3 {
	
	public static void main(String[] args) {
		
		
		
		
		//CÓDIGO PARA RESOLUÇÃO DA QUESTÃO 3
		
		
		
		
		Locale.setDefault(Locale.US);
		Scanner sc= new Scanner(System.in);
		
		 String filePath = "faturamentos.json";
		  ObjectMapper objectMapper = new ObjectMapper();
		   // Registra o módulo JavaTimeModule para suportar a API de data/hora do Java 8+
          objectMapper.registerModule(new JavaTimeModule());
		 try {
			  // Ler o arquivo JSON e converter para uma lista de objetos Faturamento
	            List<Faturamento> faturamentos = objectMapper.readValue(new File(filePath), new TypeReference<List<Faturamento>>(){});
	            
	            // Converter a lista para um vetor (array)
	            Faturamento[] vetorFaturamentos = faturamentos.toArray(new Faturamento[10]);

	            double menorValor=vetorFaturamentos[0].getValorFaturamento();
	            LocalDate dataMenorValor=vetorFaturamentos[0].getData();  
		    	  /*utilizando iteração para calcular o menor faturamento do mês*/
	      for(int i=0;i<vetorFaturamentos.length;i++) {
	    	
	    	  if(vetorFaturamentos[i].getValorFaturamento()<menorValor ) {
	    		  menorValor=vetorFaturamentos[i].getValorFaturamento();
	    		  
	    		   dataMenorValor= vetorFaturamentos[i].getData();
	    	  }
	      }
	      double maiorValor=vetorFaturamentos[0].getValorFaturamento();
    	   
    	  /*utilizando iteração para calcular o maior faturamento do mês*/
	      LocalDate dataMaiorValor=vetorFaturamentos[0].getData();
		    	    	  
  for(int i=0;i<vetorFaturamentos.length;i++) {
	
	  if(vetorFaturamentos[i].getValorFaturamento()>maiorValor ) {
		  maiorValor=vetorFaturamentos[i].getValorFaturamento();
		   dataMaiorValor= vetorFaturamentos[i].getData();
	  }
  }
  double valorSoma=0;
  int cont=0;
  for(Faturamento f: vetorFaturamentos) {
	  if(f.getValorFaturamento()!=0) {
		  valorSoma+=f.getValorFaturamento();
		  cont+=1;
	  }
  }
  /*média aritmética do total de faturamento dentro do mês*/
  double media= valorSoma/cont;
  
  int acimaDaMedia=0;
  /*contagem do número de faturamentos acima da média*/
  for(Faturamento f: vetorFaturamentos) {
	  if(f.getValorFaturamento()>media) {
		  acimaDaMedia+=1;
	  }
  }
  
	      
	      
	      
	      System.out.printf("o menor valor de faturamento da "
	      		+ "distribuidora foi %.2f e ocorreu no dia %d/%d%n ",
	    		  menorValor,dataMenorValor.getDayOfMonth(),dataMenorValor.getMonthValue());
	      System.out.printf("o maior valor de faturamento da "
		      		+ "distribuidora foi %.2f e ocorreu no dia %d/%d%n ",
		      		maiorValor,dataMaiorValor.getDayOfMonth(),dataMaiorValor.getMonthValue());
		    
	      
	      System.out.println("O número de dias que o valor foi superior a média mensal é "+acimaDaMedia);
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
		
		
		
		
		
		
		sc.close();
	
	
	
	}

}
