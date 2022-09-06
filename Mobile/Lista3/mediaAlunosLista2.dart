import 'dart:io';

void main() {
  double soma = 0, media = 0;
  int acimaMedia = 0;
  
  List listaNota = [];
  
  print("Quantos alunos fizeram a prova?");
  int alunos = int.parse(stdin.readLineSync()!);
  
  for (int i = 0; i < alunos; i++) {
    print("Qual é o nome do aluno?");
    String nome = stdin.readLineSync()!;
    print("Qual a nota do $nome?");
    double nota = double.parse(stdin.readLineSync()!);
    print("Qual é e-mail do $nome?");
    String email = stdin.readLineSync()!;
    Map aluno = {'Nome' : nome, 'Email': email, 'Nota': nota};
    listaNota.add(nota);
    soma += nota;
  }
    
  media = soma/alunos;
  
  print("A média da turma foi: $media");
  print("Alunos que ficaram acima da media:");
  
  for(var f = 0; f < alunos; f++){
    if(listaNota[f]["Nota"]>media){
      acimaMedia++;
      print("O Aluno: ${listaNota[f]['Nome']} \nEmail: ${listaNota[f]['Email']} \nTirou ${listaNota[f]['Nota']} pontos!");
    }
  }
  
  print("A quantidade de alunos obtiveram nota acima desta média: $acimaMedia");
}