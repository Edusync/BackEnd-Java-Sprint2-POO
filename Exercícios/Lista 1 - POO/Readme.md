# Exercícios: POO

1 - (Fácil) Para a resolução deste exercício, criar a classe Pessoa conforme abaixo:
• Atributos: nome (String) e idade (Integer)
• Métodos: void fazAniversario()
Crie uma pessoa usando a classe acima, preencha o seu nome e idade inicial, faça
alguns aniversários dessa pessoa e imprima seu nome e idade atual.

2 - (Fácil) Para a resolução deste exercício, criar a classe Porta conforme abaixo:
• Atributos: aberta, cor, dimensaoX, dimensaoY, dimensaoZ
• Métodos: void abre(), void fecha(), void pinta(String cor), boolean estaAberta()
Crie uma porta, abra e feche a mesma, pinte-a de diversas cores, altere suas dimensões
e utilize o método estaAberta para verificar o status da porta. No final das operações,
imprimir no console os dados da porta (dimensões, cor, aberta ou fechada)

3 - (Fácil) Para a resolução deste exercício, criar a classe Casa junto com a classe Porta
usada anteriormente.
• Atributos: cor, porta1, porta2, porta3
• métodos: void pinta(String cor), int quantasPortasEstaoAbertas()
Crie uma casa e pinte-a. Crie três portas e coloque-as na casa. Abra e feche as portas da
forma que desejar. No término das operações, imprima no console os dados da casa e
quantas portas estão abertas.

4 - (Fácil) Elaborar um programa que efetue a leitura de 50 nomes de pessoas, armazeneos em uma lista (Collections) e apresente-os em ordem alfabética.

5 - (Fácil) Faça um programa para controle de empréstimo de livros, com as classes
Empréstimo, Livro e Pessoa.

6 - (Médio) Faça um programa que calcule a área de uma figura geométrica. Aceite quatro
tipos de figura geométrica: quadrado, retângulo, triângulo e círculo. Use herança e
polimorfismo.

7 - (Médio) Efetuar a identificação e construção das classes necessárias para efetuar a
leitura de três valores numéricos (representados pelas variáveis A, B e C) e processar o
cálculo da equação completa de segundo grau, utilizando a fórmula de Bhaskara
(considerar para a solução do problema todas as possíveis condições para delta: delta < 0 não há solução real, delta> 0 - há duas soluções reais e diferentes e delta= 0 - há
apenas uma solução real). Lembre-se de que é completa a equação de segundo grau que
possui todos os coeficientes A, B e C diferentes de zero. O programa deve apresentar
respostas para todas as condições estabelecidas para delta.
No final, criar uma classe com o método “main” que realize os testes das classes.

8 - (Médio) Faça um programa para representar a árvore genealógica de uma família. Para
tal, crie uma classe **Pessoa** que permita indicar, além de nome e idade, o pai e a mãe.
Tenha em mente que pai e mãe também são do tipo **Pessoa**. Criar também uma classe
com o método “main” que realize os testes das classes.

9 - (Médio) Leia um número decimal (até 3 dígitos) e escreva o seu equivalente em
numeração romana. Utilize métodos para obter cada dígito do número decimal e para a
Transformação de numeração decimal para romana 

Dica 1: 1 = I, 5 = V, 10 = X, 50 = L, 100 = C, 500 = D, 1.000 =M;

Dica 2: utilize uma coleção (List ou Map) para guardar a tradução
(para cada um dos dígitos)

10 - (Médio) Escreva um modelo Empregado que represente um empregado de uma
empresa qualquer. Considere que os atributos nome, departamento,
horasTrabalhadasNoMes e salarioPorHora devam ser representados, e que ao menos as
operações **mostraDados()** e **calculaSalarioMensal()** sejam implementadas.

11 - (Difícil) Identifique as classes e implemente um programa para a seguinte
especificação: “O supermercado vende diferentes tipos de produtos. Cada produto tem
um preço e uma quantidade em estoque. Um pedido de um cliente é composto de itens,
onde cada item especifica o produto que o cliente deseja e a respectiva quantidade. Esse
pedido pode ser pago em dinheiro, cheque ou cartão.”

12 - (Difícil) Criar a classe **Pessoa** com as seguintes características:
• atributos: idade e dia, mês e ano de nascimento, nome da pessoa
• métodos:
o calculaIdade(), que recebe a data atual em dias, mês e anos e calcula e
armazena no atributo idade a idade atual da pessoa
o informaIdade(), que retorna o valor da idade
o informaNome(), que retorna o nome da pessoa
o ajustaDataDeNascimento(), que recebe dia, mês e ano de nascimento como
parâmetros e preenche nos atributos correspondentes do objeto.

Criar dois objetos da classe **Pessoa**, um representando Albert Einstein (nascido em
14/3/1879) e o outro representando Isaac Newton (nascido em 4/1/1643).

Fazer uma classe principal que instancie os objetos, inicialize e mostre quais seriam as idades de
Einstein e Newton caso estivessem vivos.

13 - (Difícil) Fazer um programa com as seguintes características:
Uma classe chamada **Universidade** que terá como atributo um nome e terá um método
para informar o seu nome.
Relacionar a classe **Pessoa** para com a classe **Universidade**. Cada pessoa poderá ser
associada a uma **Universidade**.
A classe **Pessoa**, por sua vez, terá um método que dirá seu nome e em que universidade
trabalha.
Criar dois objetos da classe Pessoa, um representando Albert Einstein (nascido em
14/3/1879) e o outro representando Isaac Newton (nascido em 4/1/1643)
Criar dois objetos de Universidade, associando um para Einstein e outro para Newton.

14 - (Difícil) Fazer uma classe Aluno que possua as seguintes características:
• dois atributos do tipo inteiro: primeira nota parcial (de 0 a 100) e segunda nota
parcial (de 0 a 100).
• um atributo String representando o nome do aluno.
• possua métodos para ler e escrever os atributos (ou uma construtora).
Fazer uma classe Controle que:
• pergunte ao usuário o nome e as duas notas parciais de um aluno. Caso o nome
entrado seja “fim” isso significa que o usuário não quer inserir mais nenhum aluno,
do contrário deve ser instanciado um objeto da classe Aluno e armazenados os
dados digitados. 

Dicas: usar um objeto da classe ArrayList de Java para armazenar
as referências para os objetos instanciados). Usar o método equals da classe
String para verificar se o valor do nome entrado é igual a “fim”.
• Calcular, ao final da inserção de todos os alunos, a média da turma, quantos
alunos foram aprovados, quantos foram para a final e quantos foram reprovados e
mostrar os códigos de todos os alunos cujas notas ficaram abaixo da média da
turma.

15 - (Difícil) Fazer um sistema de calculadora simples, composto das seguintes classes:
• CalcControle: controle da calculadora (“processador”), com os seguintes métodos:
o public void executar() – faz a calculadora funcionar através dos seguintes
passos:
▪ Recebe primeiro operando do usuário através de CalcInterface e
armazena no objeto de CalcDados
▪ Recebe segundo operando do usuário através de CalcInterface e
armazena no objeto de CalcDados
▪ Recebe operação do usuário através de CalcInterface e armazena no
objeto de CalcDados. Se a operação for igual a ‘s’, finaliza o
programa (System.exit(0) ).
▪ Executa a operação (método opera) e mostra o resultado através de
CalcInterface.
▪ Armazena resultado como primeiro operando para a próxima
operação e volta para o segundo passo
o private double opera(double opn1, double opn2, char op) - executa a
operação desejada e retorna o resultado.
• CalcDados: implementa a parte da calculadora que armazena os dados (operandos
e operação) para o seu funcionamento (“memória”). Possui as seguintes
características:
o Atributos: dois números do tipo double para armazenar os operandos e um
dado do tipo char para armazenar a operação.
o Métodos:
▪ public void setOperando(int i, double valor) – armazena o i-ésimo
operando com o valor expresso em valor
▪ public double getOperando(int i) – retorna o valor do i-ésimo
operando
▪ public void setOperacao(char op) – armazena o caracter op como
sendo a operação atual
▪ public char getOperacao() – retorna o valor da operação atual
• CalcInterface: implementa a parte da calculadora que coleta e exibe informações
ao usuário (display e teclado da calculadora).
o Métodos:
▪ public double recebeOperando(int i) – recebe o operando i da
operação (i vale 1 ou 2) e retorna.
▪ public char recebeOperacao() – recebe um char representando uma
operação válida (+, -, * ou /) e retorna
▪ public void mostraResultado(double res) – mostra o resultado
recebido como parâmetro.
Criar a classe Principal, cujo único objetivo é instanciar os objetos de controle, dados e
interface e criar os vínculos (associações) entre eles. Todas as classes citadas devem
possuir, além dos atributos citados, outros atributos que representem as referências para
os outros objetos (criando as associações entre eles).