import 'dart:io';
void main() {
  print("Qual a temperatura em graus Fahrenheit?");
  double fahrenheith = double.parse(stdin.readLineSync()!);
  double celsius = ((fahrenheith-32)/9)*5;
  print("A temperatura em graus Celsius é $celsius");
}