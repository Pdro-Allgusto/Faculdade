.data
inteiro: .word 48

.text
lw $a0, inteiro
li $v0, 1
syscall 
 
