import 'dart:io';
void main() {
  int tempoTrabalhado = 0, idade = 0;
  print("Qual é a matrícula do funcionário?");
  String matricula = stdin.readLineSync()!;
  print("Qual o ano de seu nascimento?");
  int nascimento = int.parse(stdin.readLineSync()!);
  print("Qual o ano de seu ingresso na primeira empresa em que ele trabalhou?");
  int trabalhado = int.parse(stdin.readLineSync()!);
  print("Qual o ano de hoje?");
  int ano = int.parse(stdin.readLineSync()!);
  tempoTrabalhado = ano - trabalhado;
  idade = ano - nascimento;
  if(tempoTrabalhado >= 30){
    print("Requerer aposentadoria");
  }else if(idade >= 65){
    print("Requerer aposentadoria");
  }else if(idade >= 60 && tempoTrabalhado >= 25){
    print("Requerer aposentadoria");
  }else{
    print("Não requerer aposentadoria");
  }
}