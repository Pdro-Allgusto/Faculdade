import 'ContaBancaria.dart';

void main() {
  ContaBancaria ContaPedro = new ContaBancaria(455, 'Pedro', 100, 100);
  ContaBancaria ContaAugusto = new ContaBancaria(456, 'Augusto', 100, 100);
  ContaPedro.sacar(50);
  ContaPedro.ImprimirConta();

  ContaAugusto.depositar(250);
  ContaAugusto.ImprimirConta();

  ContaAugusto.transferir(ContaPedro, ContaAugusto, 150);
  ContaPedro.ImprimirConta();
  ContaAugusto.ImprimirConta();
}
