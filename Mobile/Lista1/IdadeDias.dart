import 'dart:io';

void main() {
  print('Quantos anos você tem?');
  int anos = int.parse(stdin.readLineSync()!);
  print('Quantos meses você tem?');
  int meses = int.parse(stdin.readLineSync()!);
  print('Quantos dias você tem?');
  int dias = int.parse(stdin.readLineSync()!);
  int total = dias + meses * 30 + anos * 365;
  print('Você viveu $total dias');
}
