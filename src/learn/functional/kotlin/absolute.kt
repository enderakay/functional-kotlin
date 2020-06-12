package learn.functional.kotlin

fun abs(n: Int): Int =
	if (n < 0)  -n
	else n

fun formatAbs(n: Int): String
{
	val message = "Abs of %d is %d"
	return message.format(n, abs(n))
}