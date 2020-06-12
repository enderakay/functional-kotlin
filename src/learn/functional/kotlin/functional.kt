package learn.functional.kotlin

fun main()
{
	print("uyuz uyuz uyuz uyuz uyuz\n")
	val cafe = Cafe()
	val cc = CreditCard()
	println(cc.totalCredit)
	val pair = cafe.buyCoffees(cc,3)
	val coffee = pair.first[0] //cafe.buyCoffeeWithSideEffect(cc)
	println(coffee.price)
	println(cc.totalCredit)
	val charge = pair.second
	charge.makeTransfer()
	println(cc.totalCredit)

	println(formatResult( "Factorial",15, ::factorial))
	println(fib(15))
	println(formatResult("Abs", 5, ::abs))
	println(formatResult("Abs", -5, ::abs))
	println(formatResult("Abs", -25) { if (it < 0) -it else it})


	println(todo("I am at 2.1.2"))
}

fun formatResult(name: String, n: Int, f: (Int) -> Int): String
{
	val message = "The %s of %d is %d"
	return message.format(name, n, f(n));
}