import 'dart:ffi';
import 'dart:io';
void main() {
  double totalE = 0.0 , totalG = 0.0;
  print("Digite quantos litros você quer abastecer:");
  double litros = double.parse(stdin.readLineSync()!);
	print("Digite o valor do preço do litro de Etanol: ");
  double precoE = double.parse(stdin.readLineSync()!);
  print("Digite o valor do preço do litro de Gasolina: ");
  double precoG = double.parse(stdin.readLineSync()!);
  if(litros <= 20){
    totalE = (litros * precoE)-(litros * 0.03);
  }else{
    totalE = (litros * precoE)-(litros * 0.05);
  }
  if(litros <= 20){
    totalG = (litros * precoG)-(litros * 0.04);
   }else{
    totalG = (litros * precoG)-(litros * 0.06);
  }
  print("Preço etanol: $totalE");
  print("Preço gasolina: $totalG");
  if(totalE>totalG){
    print("A melhor opção será abastecer com gasolina.");
  }else{
    print("A melhor opção será abastecer com etanol.");
  }
}
