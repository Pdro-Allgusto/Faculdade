import 'dart:io';
void main() {
  double pesoIdeal = 0;
  String F='F',M='M';
  print("Qual é seu nome?");
  String nome = stdin.readLineSync()!;
  print("Qual o seu sexo (M ou F)");
  String sexo = stdin.readLineSync()!;
  print("Qual é a sua altura?");
  double altura = double.parse(stdin.readLineSync()!);
  if(sexo == F){
    pesoIdeal = (72.7 * altura) - 58;
    print("O seu peso ideal é $pesoIdeal");
  }else if(sexo == M){
    pesoIdeal = (62.1 * altura) - 44.7;
    print("O seu peso ideal é $pesoIdeal");
  }else
    print("Sexo informado não encontrado");
}