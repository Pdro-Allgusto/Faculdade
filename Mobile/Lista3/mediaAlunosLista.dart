import 'dart:io';

void main() {
  double soma = 0, media = 0;
  int acimaMedia = 0;

  List listaNota = [];

  print("Quantos alunos fizeram a prova?");
  int alunos = int.parse(stdin.readLineSync()!);

  for (int i = 0; i < alunos; i++) {
    print("Qual a nota do aluno ${i + 1}?");
    double nota = double.parse(stdin.readLineSync()!);
    listaNota.add(nota);
    soma += nota;
  }

  media = soma / alunos;

  for (var f = 0; f < alunos; f++) {
    if (listaNota[f] > media) {
      acimaMedia++;
    }
  }

  print(
      "A média da turma foi: $media\nA quantidade de alunos obtiveram nota acima desta média: $acimaMedia ");
}
