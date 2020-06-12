package learn.functional.kotlin

class Cafe {
    fun buyCoffeeWithSideEffect(cc: CreditCard): Coffee {
        val cup = Coffee()
        cc.charge(cup.price)
        return cup;
    }

    private fun buyCoffee(cc: CreditCard): Pair<Coffee, Charge>
    {
        val cup = Coffee()
        return Pair(cup, Charge(cc, cup.price))
    }

    fun buyCoffees(cc: CreditCard, n:Int): Pair<List<Coffee>, Charge>
    {
        val purchases: List<Pair<Coffee, Charge>> = List(n) {buyCoffee(cc)}
        val (coffees, charges) = purchases.unzip()
        return Pair(coffees, charges.reduce{ c1, c2 -> c1.combine(c2)})
    }
}