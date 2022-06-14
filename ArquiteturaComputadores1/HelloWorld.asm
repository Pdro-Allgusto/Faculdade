.text 

la $a0, printHelloWord
li $v0, 4 
syscall 

.data

printHelloWord: .asciiz "Hello Word"
