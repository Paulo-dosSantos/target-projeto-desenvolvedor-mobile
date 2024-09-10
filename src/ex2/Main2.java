package ex2;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main2 {
	
	public static void main(String[] args) {
		//CÓDIGO PARA RESOLUÇÃO DA QUESTÃO 2
		Scanner sc= new Scanner(System.in);
        
		//2-a)
		List<Integer>sequencia1=Arrays.asList(1,3,5,7);
		
		int proximoElemento=sequencia1.get(sequencia1.size()-1)+2;
		
		System.out.println("O próximo número da sequência é: "+proximoElemento);
       
        System.out.println("____________________________");
      //2-b)
        List<Integer>sequencia2=Arrays.asList(2, 4, 8, 16, 32, 64);
        
        proximoElemento= sequencia2.get(sequencia2.size()-1)*2;
        System.out.println("O próximo número da sequência é: "+proximoElemento);
        
        System.out.println("____________________________");
      //2-c)
        List<Integer>sequencia3= Arrays.asList( 0, 1, 4, 9, 16, 25, 36);
        
        proximoElemento= (int) Math.sqrt(sequencia3.get(sequencia3.size()-1))+1;
        proximoElemento= (int) Math.pow(proximoElemento, 2);
        
        System.out.println("O próximo número da sequêcia é: "+proximoElemento);
        
        System.out.println("____________________________");
      //2-d)
        List<Integer>sequencia4= Arrays.asList(4, 16, 36, 64);
         proximoElemento= (int) Math.sqrt(sequencia4.get(sequencia4.size()-1))+2;
         proximoElemento=(int)Math.pow(proximoElemento, 2);
        
         System.out.println("O próximo número da sequêcia é: "+proximoElemento);
         
         System.out.println("____________________________");
       //2-e)
         List<Integer>sequencia5= Arrays.asList( 1, 1, 2, 3, 5, 8);
         
         proximoElemento= sequencia5.get(sequencia5.size()-1)+sequencia5.get(sequencia5.size()-2);
         
System.out.println("O próximo número da sequêcia é: "+proximoElemento);
         
         System.out.println("____________________________");
         
       //2-f)
         
         /* Infelizmente não fui capaz de criar um código que respondesse qual o próximo valor dessa sequência. Visualmente,
          * pude notar que todos os números, do início até o final, se inicia com a letra 'd' quando escrito por extenso em
          * português brasileiro. Logo, a resposta é 200*/
          
         
     
        sc.close();
        
        
        
	}
	

}
