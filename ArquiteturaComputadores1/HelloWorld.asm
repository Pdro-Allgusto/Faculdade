.text 

li $v0, 4 
la $a0, printHelloWord

syscall 

.data

printHelloWord: .asciiz "Hello Word"
