			.data
vetor:		.word 4,7,3,6,5,2,8,9,1,10
tam:			.word 40
pivot:		.word 20
			.text
main:		la	$t0, vetor
			lw	$t1, pivot
			lw	$t2, tam
			li	$t3, $zero
			
loop0:		beq	$t1, $t3, ???
			bgt	vetor($t3), vetor($t1), loop0_tweak
			addi	$t3, $t3, 4
			j	loop0
			
loop0_tweak:	lw	$t4, vetor($t3)
			addi $t3, $t3, 4
			j	loop1
			
loop1:		beq $t1, $t2, end_loop
			blt vetor($t2), vetor($t1), loop1_tweak
			
loop1_tweak:	lw	$t5, vetor($t2)
			lw	$t6, $t5
			lw	$t5, vetor($t3)
			
end_loop:	# FIM
			