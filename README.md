Prática | Exercícios sobre arquivos
Considere um arquivo com todos os produtos de uma loja, no seguinte formato:

Produto * Descrição * Preço * Tipo * Informação extra
Café * Café descafeinado * 2.00 * Alimento * 10/12/2015
Bolacha * Integral * 5.53 * Alimento * 2/4/2010
Camiseta * Manga curta * 17.90 * Vestuário * 10
Fogão * 4 bocas * 890.00 * Eletrodomestico * 125.00
Assim sendo, crie um programa que lê as informações deste arquivo e armazena em um array de produto.

Considere as seguintes informações: 

- você deve criar uma classe abstrata chamada Produto. Os tipos de produto são Alimento, Vestuário e Eletrodomésticos. Cada tipo de produto possui 3 informações iguais (nome, descrição, preço), e cada um deles possui uma informação extra: alimentos possuem uma data de validade; produtos de vestuário possuem uma quantidade em estoque; eletrodomésticos possuem um valor adicional de IPI.

- crie uma classe Estoque, que tem um array de Produto como atributo. Esta classe deve possuir um método chamado preencheEstoque, que recebe o nome do arquivo de produtos como parâmetro. Neste método, o arquivo de produtos deve ser lido o método deve armazenar todas as informações do arquivo no array do tipo Produto, onde cada posição terá ou um Alimento, ou um Vestuario ou um Eletrodomestico. 

- Na classe Principal (no método main), solicite via teclado o nome do arquivo que contém as informações dos produtos e preencha o estoque. Crie um arquivo chamado info.txt com as seguintes informações:

a) o alimento mais caro

b) o eletrodoméstico mais barato

c) o nome e a quantidade em estoque de todos os produtos de vestuário 
