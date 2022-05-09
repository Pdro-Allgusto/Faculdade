# 01 - Algorítmos e Estruturas de Dados III
### Manipulação de Arquivos

---
### Exercício 1
Implementar um stream de entrada de dados utilizando a classe [FileInputStream](
https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/FileInputStream.html) e seu método *read* para contar o número de bytes de um arquivo.

---
### Exercício 2
Implementar um programa utilizando a classe [FileReader](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/FileReader.html) e seu método *read* para contar o número de caracteres "whitechars" (caracteres equivalentes a um espaço ou ainda sem significado como tabulações, fim de linha, etc) de um arquivo. Utilize o método *isWhitespace* da classe *Character* para testar os caracteres "whitechars".

Obs. Compare os resultados impressos no exercícios 1 e 2. São iguais? Justifique sua resposta.


---
### Exercício 3
Implementar um programa utilizando a classe [BufferedReader](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/BufferedReader.html) para contar o número de linhas e o número de caracteres de um arquivo



---
### Exercício 4
Implementar um programa em java que exemplifique o uso de **_Data Byte Streams_** para realizar a escrita e a leitura de um vetor números reais (declarados como _**double**_) em um arquivo.

a) Criar a classe _**writeDoubleData.java**_ contendo o método principal _**main**_ com o seguinte:

- Instanciar um vetor de valores do tipo _**double**_

- Criar um método para escrever os valores em um arquivo com a seguinte assinatura:
```java
public void writeData(double[] data, String nome_arq) throws IOException {}
```

- Utilizar as classes [_FileOutputStream_](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/FileOutputStream.html) e [_DataOutputStream_](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/DataOutputStream.html)


b) Criar a classe _**readDoubleData.java**_ contendo o método principal _**main**_ com o seguinte:

- Criar um método para ler os valores do arquivo criado no item anterior com a seguinte assinatura:
```java
public double[] readData(String nome_arq) throws IOException {}
```

- Utilizar as classes [_FileInputStream_](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/FileInputStream.html) e [_DataInputStream_](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/DataInputStream.html)

- Apresentar no console os arquivos lidos no arquivo

---
### Exercício 5

Implementar um programa em Java para serializar objetos utilizando as classes [_ObjectInputStream_](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/ObjectInputStream.html) e [_ObjectOutputStream_](https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/ObjectOutputStream.html)

a) Criar a classe **_Pessoa.java_** que deve implementar a interface _**Serializable**_

b) A classe _**Pessoa**_ deve conter os atributos _**id**_ (inteiro) e _**nome**_ (texto)

c) Criar a classe _**writePessoa.java**_ contendo o método principal _**main**_ para escrever os dados no arquivo _**person.dat**_

d) Devem existir duas opções de criação de objetos do tipo _**Pessoa**_: via console e criados diretamente no código

e) Criar a classe _**readPessoa.java**_ contendo o método principal _**main**_ para ler os dados serializados no arquivo _**person.dat**_

---
### Exercício 6

Evoluir o exercício anterior da seguinte forma:

a) Criar a classe _**Telefone.java**_ que deve implementar a interface _**Serializable**_

b) A classe _**Telefone**_ deve conter somente o atributo _**numero**_ (texto)

c) Criar a classe _**PessoaComTelefone.java**_ que deve estender a classe _**Pessoa**_

d) A classe _**PessoaComTelefone**_ deve conter os atributos _**numTel**_ (inteiro) e um **array de objetos** do tipo _**Telefone**_ já que uma pessoa pode ter mais de um número de telefone

e) Criar a classe _**writePessoaTel.java**_ contendo o método principal _**main**_ para escrever os dados no arquivo _**persontel.dat**_

f) Devem existir duas opções de criação de objetos do tipo _**PessoaComTelefone**_: via console e criados diretamente no código

g) Criar a classe _**readPessoa.java**_ contendo o método principal _**main**_ para ler os dados serializados no arquivo _**persontel.dat**_


---
### Exercício Extra
Criar duas classes (*Client.java* e *Server.java*) utilizando streams para efetuar a troca de mensagens de texto via sockets, entre um cliente e um servidor. Para isso o cliente deverá digitar as mensagens diretamente no console que serão apresentadas no servidor. Utilizar como parâmetros o endereço de rede *127.0.0.1* e a porta *5000*.