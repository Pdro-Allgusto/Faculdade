class ContaBancaria {
  final int? NumeroConta;
  final String? NomeCliente;
  double? _Saldo;
  double? _Limite;

  ContaBancaria(this.NumeroConta, this.NomeCliente, this._Saldo, this._Limite);

  int get getNumero_Conta => NumeroConta!;

  String get getNome_Cliente => NomeCliente!;

  double get getSaldo => _Saldo!;
  set setSaldo(double valor) => _Saldo = valor;

  double get getLimite => _Limite!;
  set setLimite(double valor) => _Limite = valor;

  sacar(ValorSaque) {
    if (ValorSaque > getSaldo) {
      setSaldo = getSaldo + getLimite;
      if (ValorSaque > getSaldo) {
        setSaldo = getSaldo - getLimite;
        print("Saldo Insuficiente");
      } else {
        setSaldo = getSaldo - ValorSaque;
        setSaldo = getSaldo - getLimite;
        print("Você tem $getSaldo reais na conta $NumeroConta");
      }
    } else {
      setSaldo = getSaldo - ValorSaque;
      print("Você tem $getSaldo reais na conta $NumeroConta");
    }
    return getSaldo;
  }

  depositar(double ValorDeposito) {
    setSaldo = getSaldo + ValorDeposito;
    print("Foi depositado $ValorDeposito reais na conta $NumeroConta");
    return getSaldo;
  }

  transferir(
      ContaBancaria contaRecebe, ContaBancaria contaEnvia, double valor) {
      contaEnvia.sacar(valor);
      contaRecebe.depositar(valor);
  }

  ImprimirConta() {
    print(
        "Número da conta: $getNumero_Conta\nNome do cliente: $getNome_Cliente\nSaldo :$getSaldo\nLimite de crédito disponível:$getLimite");
  }
}
