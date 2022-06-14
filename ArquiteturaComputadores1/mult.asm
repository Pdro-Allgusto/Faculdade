.text
addi $t0, $zero, 2
addi $t1, $zero, 3
mul $t2, $t0, $t1

move $a0, $t2
li $v0, 1
syscall
