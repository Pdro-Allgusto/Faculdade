.data
caracter: .byte 'P' 

.text
la $a0, caracter
li $v0, 4
syscall 
 
li $v0, 10
syscall

