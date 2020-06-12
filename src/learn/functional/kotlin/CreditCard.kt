package learn.functional.kotlin

class CreditCard(var totalCredit: Double = 5.0) {
    fun charge(price: Double) {
        totalCredit -= price
    }

}
