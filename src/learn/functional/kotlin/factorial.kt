package learn.functional.kotlin

fun factorial(i: Int): Int {
    tailrec fun go(n: Int, acc: Int): Int =
            if(n <= 0) acc
            else go(n- 1, n * acc)
    return go(i, 1)
}

fun formatFactorial(x: Int): String
{
    val msg = "Factorial of %d is %d";
    return msg.format(x, factorial(x))
}

fun todo(whereIam: String): Int = TODO(whereIam)
fun fib(i: Int): Int {
    tailrec fun loop(n: Int, inc: Int, next: Int, current: Int): Int =
            if(n == inc) current
            else loop(n, inc + 1, next = next + current, current = next)
    return loop(i, 0, 1, 0)
}