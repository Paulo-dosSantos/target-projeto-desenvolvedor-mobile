 # Objetivo do projeto:  
 Responder às questões de lógica para o processo seletivo da vagas de Desenvolvedor Mobile e Desenvolvedor Back-end, que exigem o mesmo desafio.


## SOLUÇÃO QUESTÃO 1: 
o algoritmo para solucionar o exercício um encontra-se em [https://github.com/Paulo-dosSantos/target-projeto-desenvolvedor-mobile/blob/main/src/ex1/Main1.java]. Por possuir os valores já estabelecidos, o mesmo irá entregar a resposta no console ao clicar na classe com o botão direto do mouse, em seguida Run As, e depois Java Application.
A variável k inicialmente vale 1, indice igual a 12 e a soma inicialmente 0. O laço de repetiçao while irá rodar até que k se torne igual a 12. Para isso, para cada vez que rodar, a variável k será somada com o número 1 e o seu valor se renovará, ao passo que a soma será acrescentada com o valor de k.
Após o processo ser inteiramente concluído, isto é, quanto k=indice, o valor final da variável soma será mostrado no console.




   ## SOLUÇÃO QUESTÃO 2: 
o algoritmo para solucionar o exercício um encontra-se em [Main2.java][https://github.com/Paulo-dosSantos/target-projeto-desenvolvedor-mobile/blob/main/src/ex2/Main2.java]. Por possuir os valores já estabelecidos, o mesmo irá entregar a resposta no console ao clicar na classe com o botão direto do mouse, em seguida Run As, e depois Java Application. Todos os números estabelecidos para cada sequência foram os mesmos dados pela questão. O console dirá qual o próximo número de cada sequência utilizando a lógica deduzida sobre cada uma delas.
A sequência da letra 'a' segue uma progressão aritmética, iniciando com o número 1 e somando de dois em dois. Logo, após o último número  (7) virá o número 9;
A sequência da letra 'b' segue uma progressão geométrica, iniciando com o número 2 e múltiplicando pelo número 2, gerando um novo resultado e assim adiante. Como o último número é 64, o próximo será 64*2 ( que resulta em 128);

A sequência da letra 'c' é mais complexa. Inicia-se com um número (0) no qual realizará a raiz quadrada, gerando um novo número (0). O próximo número será o número anterior, somado com 1 (que resultará em 1) e  elevado ao quadrado  (1 elevado ao mesmo número, que resultará em 1), e repetirá o mesmo processo para os próximos números. Repare que o segundo número é 4, pois a raiz quadrada do número anterior (1) resulta em 1, e será acrescentando em 1 (resultando em dois) e elevará ao quadrado, resultando em 4. Isso se repetirá para todos os números. Se o último número da sequência é 36, então, utilizando a lógica, o próximo número será 49. 

A sequência da letra 'd' possui uma lógica bastante semelhante. Iniciando-se com um número(4), fará a raiz quadrada e chegará a um novo número(2), e o seguinte número da sequência será este(2) somado com o número 2 e elevado ao quadrado, e assim adiante. Observe que o último número da sequência é 64. O programa criado fará a raiz quadrada desse número, somará com 2 e elevará ao quadrado, chegando ao próximo número (100);

A sequência da letra 'e' lembra um pouco a sequência de Fibonacci, embora diferente. Um elemento será a soma dos dois elementos anteriores. Observe que o último número estabelecido na sequência é o 8, isso porque os dois anteriores são 3 e 5. Logo, para calcular o próximo número da sequência, o algoritmo coletará os dois últimos valores estabelecidos e os somará, chegamdo ao novo resultado(13).

Observações: Todos os resultados estarão no console no momento que o programa for executado.

Enquanto a sequência da letra 'f', eu, o criador dos algoritmos, não fui capaz de estabelecer um código em Java para deduzí-lo.
Entretanto, fui capaz de raciocinar que todos os números iniciados com a letra 'd', quando escritos por extenso em português-br, estão presentes em ordem crescente até o último elemento(19). Logo, sem sombra de dúvidas, o próximo número da sequência seria o 200, que escrito por extenso é "duzentos".





## SOLUÇÃO QUESTÃO 3:
o algoritmo para solucionar o exercício três encontra-se em [Main3.java][https://github.com/Paulo-dosSantos/target-projeto-desenvolvedor-mobile/blob/main/src/ex3/applications/Main3.java] . Clique na classe com o botão direto do mouse, em seguida Run As, e depois Java Application. Após isso, o programa absorverá as informações em json do arquivo faturamentos.json e determinará qual o menor e o maior faturamento, bem como qual a quantidade de faturamentos ultrapassou a média total de faturamento  da distribuidora ao longo do ano de 2024. A primeira iteração (com laço de repetição FOR) é utilizada junto com uma condicional if dentro para deduzir qual a data que a distribuidora obteve o menor faturamento.  A segunda iteração (com laço de repetição FOR) é utilizada junto com uma condicional if dentro para deduzir qual a data que a distribuidora obteve o maior faturamento. A terceira, por sua vez, é utilizada junto com uma condicional para calcular qual a média aritmética do faturamento da distribuidora ao longo do ano, desconsiderando os dias que o faturamento foi 0. Por fim, a última iteração é utilizada, também com uma condicional, para calcular quantos faturamentos ultrapassaram a média aritmética. Ao rodar o programa, os resultados aparecerão no console.



   ## SOLUÇÃO QUESTÃO 4: 
O Script de criação da tabela encontra-se em [Main4.java][https://github.com/Paulo-dosSantos/target-projeto-desenvolvedor-mobile/blob/main/src/ex4/Main4.sql]. Escrito na linguagem SQL, os registros cadastrados na tabela cliente terão uma associação muitos para um com um registro da tabela estado. Ademais, cada registro da tabela cliente poderá ter uma associação um para muitos com registros da tabela telefone (podendo ser de um a vários). Somado a isso, vários registros da tabela telefone podem estar simultaneamente conectados com um único registro da tabela tipo_de_telefone. Alguns inserts foram criados para ficar de melhor compreensão. O script pode ser rodado no Workbench para criar e popular as tabelas para verificação dos resultados.

  ## SOLUÇÃO QUESTÃO 5: 
A questão afirma que um carro sai de Ribeirão Preto em direção a Barretos, enquanto que um caminhão sai de Barretos em direção a Ribeirão Preto (a distância entre os dois é de 125km), e, em um determinado momento, ambos se cruzarão. O exercício indaga qual veículo estará mais próximo de Ribeirão Preto no momento de encontro. O algoritmo para solucionar o problema encontra-se em [Main5.java][https://github.com/Paulo-dosSantos/target-projeto-desenvolvedor-mobile/blob/main/src/ex5/applications/Main5.java]. O código inicia-se criando dois objetos instanciados pela classe Veiculo utilizando os tipos estabelecidos na enumeração presente em (src/ex5.enums/TipoVeiculo.java), sendo os valores CARRO e CAMINHÃO. Ademais, também é instanciado a velocdade de cada um deles, sendo o objeto carro 90.0km/h e o caminhao 80.0km/h. A distância entre os carros (125.0km) é estabelecida na variável distanciaEntreAsCidades. Para calcular a velocidade relativa, é somado a velocidade do carro e do caminhão (por estarem em sentidos opostos, de acordo com a física cinemática) e em seguida o valor é armazenado na variável velocidadeRelativa de tipo double. Para calcular o tempo de encontro, a partir da física cinemática que estuda o movimento dos objetos, é dividido o valor da variável distanciaEntreAsCidades pelo valor da variável velocidadeRelativa, e o resultado é armazenado na variável tempoDeEncontro.A fim de calcular a distância percorrida pelo carro, o código multiplicará o valor da variável tempoDeEncontro pelo valor da velocidade do carro armazenado em carro.getVelocidade(), chegando no resultado que será armazenado na variável distanciaPercorridaCarro de tipo double. Após isso, é levado em conta que o carro não possuiu um movimento constante, mas parou por 3 vezes em pedágios, ficando parado 5 minutos em cada um deles. Logo, o valor 5 (em minutos)é armazenado na variável tempoParadoNoPedagio de tipo double. Como o carro parou por 5 minutos por 3 vezes, o algoritmo multiplicará o valor da variável por 3 e armazenará na mesma variável, chegando ao valor 15(minutos). Como as variáveis de velocidade estão em km/h, é necessário converter os minutos para horas. O algoritmo, por sua vez, coletará o valor da variável e dividirá por 60 para converter para horas, e armazenará na mesma variável, chegando ao resultado 0.25(horas). Calculando o tempo total do carro até o encontro, o valor da variável tempoDeEncontro será somado com o valor da variável tempoParadoNoPedagio, e, sendo assim, o resultado será armazenado em tempoTotalCarro de tipo double. A distância percorrida pelo carro será recalculada e armazenada na mesma variável do valor anterior. Após isso, a distância percorrida pelo caminhão até o encontro também será calculada com uma lógica semelhante, multiplicando o tempo de encontro pela velocidade do objeto, e o resultado será armazenado na variável distanciaPercorridaCaminhao de tipo double. Por fim, será calculado a distância do carro em relação à cidade de Ribeirão Preto e o resultado será armazenado na variável distanciaCarroARibeiraoPreto de tipo double. O mesmo será feito com o caminhão e será armazenado em distanciaCaminhaoARibeiraoPreto de tipo double. Finalmente, o algoritmo calculará, sob uma condicional if-else, qual objeto está mais próximo de Ribeirão preto e o resultado será escrito no console, declarando o carro como o mais próximo e comparando as velocidades entre ele e o caminhão.






