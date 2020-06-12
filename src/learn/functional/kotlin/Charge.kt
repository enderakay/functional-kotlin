package learn.functional.kotlin

class Charge(val cc: CreditCard, val amount: Double) {
    fun makeTransfer() {
        cc.charge(amount)
    }

    fun combine(other: Charge): Charge{
        if (cc == other.cc)
            return Charge(cc, amount + other.amount)
        else throw Exception("Cannot combine charges to different cards")
    }

}
