import 'dart:io';
void main() {
  double total = 0, media = 0;
  for( var i = 1 ; i < 3; i++ ) { 
	  print("Qual a nota da $i avaliações?");
    double nota = double.parse(stdin.readLineSync()!);
    total += nota;
  }
  media = total/2;
  if(media>=6){
      print("Aluno foi aprovado");
    }else{
      print("Aluno não foi aprovado");
    }
  print("Média: $media");
}