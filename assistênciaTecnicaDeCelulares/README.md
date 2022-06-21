## Escreva o código de cinco classes em java para um sistema de uma assistência técnica de celulares:


#####   ⦁	A primeira classe é a classe Endereco. Esta classe deverá seguir o padrão JavaBeans e  será utilizada para construir objetos do tipo endereço. A classe deverá possuir os seguintes atributos (escolha o tipo adequado para cada atributo):

######   ⦁	rua;
######   ⦁	numero;
######   ⦁	bairro;
######   ⦁	cidade;
######   ⦁	cep;


#####   ⦁	A segunda classe é a classe Funcionario. Esta classe deverá seguir o padrão JavaBeans e  será utilizada para construir objetos do tipo funcionário. A classe deverá possuir os seguintes atributos (escolha o tipo adequado para cada atributo):

######   ⦁	nome;
######   ⦁	data de nascimento; (usar o tipo: LocalDate)
######   ⦁	salario;
######   ⦁	endereco;  (composição com a classe Endereco)


   ##### ⦁	A terceira classe é a classe Cliente. Esta classe deverá seguir o padrão JavaBeans e  será utilizada para construir objetos do tipo cliente. A classe deverá possuir os seguintes atributos (escolha o tipo adequado para cada atributo):

######   ⦁	nome;
######   ⦁	rg;
######   ⦁	telefone;
######   ⦁	endereço;  (composição com a classe Endereco)


#####   ⦁	A quarta classe é a classe Servico. Esta classe deverá seguir o padrão JavaBeans e será utilizada para construir objetos do tipo serviço. A classe deverá possuir os seguintes atributos (escolha o tipo adequado para cada atributo):

######   ⦁	Atributos: 
######   ⦁	técnico responsável; (composição com a classe Funcionario)
######   ⦁ cliente; (composição com a classe Cliente)
######   ⦁ descrição do serviço;
######   ⦁ valor;
######   ⦁ data da entrada do serviço; (usar o tipo: LocalDate)
######   ⦁ previsão de conclusão; (usar o tipo: LocalDate)


#####    ⦁   A quinta classe é a classe ExecutaSistema, esta classe deve possuir um método main. Dentro do método main desta classe, implemente um código para instanciar um objeto do tipo Serviço e preencher seus atributos com dados recebidos do usuário via teclado. O campo data de entrada no serviço deve ser preenchido automaticamente com a data atual. O atributo previsão de conclusão do serviço deve ser preenchido automaticamente, com a data atual + 5 dias.
