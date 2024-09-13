# Projeto de Resolução de Questões Lógicas

Este projeto visa responder a questões de lógica para o processo seletivo das vagas de Desenvolvedor Mobile e Desenvolvedor Back-end, que apresentam o mesmo desafio.

## Soluções das Questões

### Questão 1

O algoritmo para solucionar o exercício 1 pode ser encontrado [aqui](https://github.com/Paulo-dosSantos/target-projeto-desenvolvedor-mobile/blob/main/src/ex1/Main1.java).

**Como executar:**
1. Clique com o botão direito na classe `Main1`.
2. Selecione `Run As` e depois `Java Application`.

**Descrição da solução:**
O algoritmo utiliza um laço `while` para calcular a soma dos números de 1 até 12. A variável `k` inicia com o valor 1 e é incrementada a cada iteração do laço até que `k` atinja o valor 12. Durante o processo, o valor de `soma` é atualizado somando `k` a cada passo. O resultado final é exibido no console.

### Questão 2

O algoritmo para solucionar o exercício 2 pode ser encontrado [aqui](https://github.com/Paulo-dosSantos/target-projeto-desenvolvedor-mobile/blob/main/src/ex2/Main2.java).

**Como executar:**
1. Clique com o botão direito na classe `Main2`.
2. Selecione `Run As` e depois `Java Application`.

**Descrição da solução:**
O programa deduz o próximo número de várias sequências numéricas, aplicando diferentes lógicas matemáticas:

- **Sequência a:** Progressão aritmética, soma de 2 em 2.
- **Sequência b:** Progressão geométrica, multiplicação por 2.
- **Sequência c:** Sequência baseada em operações de raiz quadrada e potência.
- **Sequência d:** Similar à anterior, mas com diferentes incrementos.
- **Sequência e:** Sequência similar à de Fibonacci, onde o próximo número é a soma dos dois anteriores.
- **Sequência f:** Os números escritos por extenso em ordem crescente em português. O próximo número é "duzentos" (200).

### Questão 3

O algoritmo para solucionar o exercício 3 pode ser encontrado [aqui](https://github.com/Paulo-dosSantos/target-projeto-desenvolvedor-mobile/blob/main/src/ex3/applications/Main3.java).

**Como executar:**
1. Clique com o botão direito na classe `Main3`.
2. Selecione `Run As` e depois `Java Application`.

**Descrição da solução:**
O programa lê um arquivo JSON contendo informações de faturamento e calcula:
- O menor e o maior faturamento do ano.
- A quantidade de dias em que o faturamento ultrapassou a média.

### Questão 4

O script SQL para criar as tabelas e inserir dados pode ser encontrado [aqui](https://github.com/Paulo-dosSantos/target-projeto-desenvolvedor-mobile/blob/main/src/ex4/Main4.sql).

**Descrição da solução:**
O script cria uma tabela `cliente` com uma relação muitos-para-um com a tabela `estado`. Cada cliente pode ter múltiplos telefones, com os registros de telefone conectados a um tipo de telefone específico. O script pode ser executado no MySQL Workbench para criar e popular as tabelas para verificação dos resultados.

 ## SOLUÇÃO DA QUESTÃO 5

A questão descreve o cenário em que um carro parte de Ribeirão Preto em direção a Barretos, enquanto um caminhão faz o trajeto oposto (a distância entre as duas cidades é de 125 km). O objetivo é determinar qual veículo estará mais próximo de Ribeirão Preto no momento em que ambos se encontrarem.

O algoritmo para resolver o problema pode ser encontrado em [Main5.java](https://github.com/Paulo-dosSantos/target-projeto-desenvolvedor-mobile/blob/main/src/ex5/applications/Main5.java). O código segue as seguintes etapas:

1. **Criação dos Objetos**:
   - Dois objetos são criados a partir da classe `Veiculo`, utilizando os tipos definidos na enumeração em `src/ex5.enums/TipoVeiculo.java`, com os valores `CARRO` e `Caminhão`.
   - O carro tem uma velocidade de 90 km/h e o caminhão, 80 km/h.

2. **Configuração da Distância e Velocidade Relativa**:
   - A distância entre as cidades é definida como 125 km e armazenada na variável `distanciaEntreAsCidades`.
   - A velocidade relativa é calculada somando as velocidades do carro e do caminhão, pois eles estão se movendo em direções opostas. Este valor é armazenado na variável `velocidadeRelativa` (tipo `double`).

3. **Cálculo do Tempo de Encontro**:
   - O tempo até o encontro é calculado dividindo `distanciaEntreAsCidades` por `velocidadeRelativa`. O resultado é armazenado na variável `tempoDeEncontro`.

4. **Cálculo da Distância Percorrida pelo Carro**:
   - A distância percorrida pelo carro é calculada multiplicando `tempoDeEncontro` pela velocidade do carro (`carro.getVelocidade()`). O resultado é armazenado em `distanciaPercorridaCarro` (tipo `double`).

5. **Consideração das Paradas**:
   - O carro parou em pedágios 3 vezes, com uma parada de 5 minutos em cada um. O tempo total parado é armazenado em `tempoParadoNoPedagio` (tipo `double`). O valor é convertido de minutos para horas dividindo por 60, resultando em 0.25 horas.

6. **Cálculo do Tempo Total do Carro**:
   - O tempo total até o encontro é calculado somando `tempoDeEncontro` e `tempoParadoNoPedagio`, e o resultado é armazenado em `tempoTotalCarro` (tipo `double`).

7. **Recalculo da Distância Percorrida pelo Carro**:
   - A distância percorrida pelo carro é recalculada com base no `tempoTotalCarro`.

8. **Cálculo da Distância Percorrida pelo Caminhão**:
   - A distância percorrida pelo caminhão até o encontro é calculada multiplicando `tempoDeEncontro` pela velocidade do caminhão. O resultado é armazenado em `distanciaPercorridaCaminhao` (tipo `double`).

9. **Cálculo das Distâncias dos Veículos em Relação a Ribeirão Preto**:
   - A distância do carro até Ribeirão Preto é calculada e armazenada em `distanciaCarroARibeiraoPreto` (tipo `double`).
   - O mesmo cálculo é feito para o caminhão, e o resultado é armazenado em `distanciaCaminhaoARibeiraoPreto` (tipo `double`).

10. **Determinação do Veículo Mais Próximo**:
    - Utilizando uma condicional `if-else`, o algoritmo determina qual veículo está mais próximo de Ribeirão Preto e imprime o resultado no console, indicando o carro como o mais próximo e comparando suas velocidades com as do caminhão.






