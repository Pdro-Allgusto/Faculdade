import 'dart:io';

void main() {
  print("Qual a altura do retângulo?");
  double alt = double.parse(stdin.readLineSync()!);
  print("Qual a base do retângulo?");
  double base = double.parse(stdin.readLineSync()!);
  double total = alt * base;
  print("A área do retângulo é $total");
}
