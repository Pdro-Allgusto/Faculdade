import 'dart:io';

void main() {
  print('Quantos eleitores tem no município?');
  int eleitores = int.parse(stdin.readLineSync()!);
  print('Quantos votos brancos teve?');
  int brancos = int.parse(stdin.readLineSync()!);
  print('Quantos votos nulos teve?');
  int nulos = int.parse(stdin.readLineSync()!);
  print('Quantos votos válidos teve?');
  int validos = int.parse(stdin.readLineSync()!);
  double totalB = 100 / eleitores * brancos;
  double totalN = 100 / eleitores * nulos;
  double totalV = 100 / eleitores * validos;
  print("O percentual de votos brancos é $totalB ");
  print("O percentual de votos nulos é $totalN ");
  print("O percentual de votos válidos é $totalV ");
}
