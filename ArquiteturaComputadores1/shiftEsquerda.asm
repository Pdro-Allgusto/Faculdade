.text
addi $t0, $zero, 3
sll $t1, $t0, 1

move $a0, $t1
li $v0, 1
syscall