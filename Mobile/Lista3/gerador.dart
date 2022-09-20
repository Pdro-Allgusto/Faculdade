import 'dart:io';
import 'dart:math';

void main() {
  List nomes = [
    "Bruno Assis",
    "Cosme Pimenta",
    "Elias Arouca",
    "Eudes Quiroga",
    "Filena Toledo",
    "Lopo Trist",
    "Luzia Rosa",
    "Nestor Marmou",
    "Reginaldo Meneses",
    "Sofia Delgado"
  ];

  String nome = "";
  int soma = 0;
  List notas = [];
  List numeros = [];

  print("Quantos alunos fizeram a prova?");
  int quantAluno = int.parse(stdin.readLineSync()!);

  for (int i = 0; i < quantAluno; i++) numeros.add(Random().nextInt(10));

  for (int i = 1; i < quantAluno; i++) {
    nome = nomes[numeros[i] % nomes.length];
    String email = nome.split(" ").join().toLowerCase() + "@gmail.com";
    int nota = numeros[i];

    soma += nota;

    Map aluno = {'Nome': nome, 'Email': email, 'Nota': nota};
    notas.add(aluno);
  }

  double media = soma / quantAluno;
  int acimaMedia = 0;

  print("\nA média da turma foi: $media");

  for (int i = 0; i < quantAluno; i++) {
    if (notas[i]['Nota'] > media) {
      acimaMedia++;
      print("===============================");
      print(
          "O Aluno: ${notas[i]['Nome']} \nEmail: ${notas[i]['Email']} \nTirou ${notas[i]['Nota']} pontos!");
    }
  }
  print("$acimaMedia alunos ficaram acima da média!");
}
