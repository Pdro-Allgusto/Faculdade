import 'dart:io';
void main() {
 double total = 0, media = 0;
  for( var i = 1 ; i < 4; i++ ) { 
	  print("Qual a nota da $i avaliação do aluno?");
    double nota = double.parse(stdin.readLineSync()!);
    total += nota;
  }
  media = total/3;
  if(media<6){
      print("O conceito do aluno é D e sua média é $media");
    }else if(media<7.5){
      print("O conceito do aluno é C e sua média é $media");
    }else if(media<9){
      print("O conceito do aluno é B e sua média é $media");
    }else {
      print("O conceito do aluno é A e sua média é $media");
    }
}