import 'dart:io';

void main() {
  print("Qual o custo de fábrica de um carro?");
  double custo = double.parse(stdin.readLineSync()!);
  double custoFinal = custo + custo * 0.28 + custo * 0.45;
  print("O custo final ao consumidor é $custoFinal");
}
