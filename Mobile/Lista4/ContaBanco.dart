void main() {}

class ContaBancaria {
  int? NumeroConta;
  String? NomeCliente;
  double? Saldo;
  double? Limite;

  ContaBancaria(this.NumeroConta, this.NomeCliente, this.Saldo, this.Limite);

  get Numero_Conta => NumeroConta;
  set Numero_Conta(num_conta) => NumeroConta;
  get Nome_Cliente => NomeCliente;
  set Nome_Cliente(nome) => NomeCliente;
  get Saldo_ => Saldo;
  set Saldo_(valor) => Saldo;
  get Limite_ => Limite;
  set Limite_(valor) => Limite;

  sacar(ValorSaque) {
    if (ValorSaque > Saldo_) {
      Saldo_ += Limite_;
      if (ValorSaque > Saldo_) {
        print("Saldo Insuficiente!");
      } else {
        Saldo_ -= ValorSaque;
        print("Você tem $Saldo_ na conta $NumeroConta");
      }
    } else {
      Saldo_ -= ValorSaque;
      print("Você tem $Saldo_ na conta $NumeroConta");
    }
  }

  depositar(ValorDeposito) {
    Saldo_ += ValorDeposito;
    print("Foi depositado $ValorDeposito na conta $NumeroConta");
  }

  transferir() {}

  ImprimirConta() {}
}
