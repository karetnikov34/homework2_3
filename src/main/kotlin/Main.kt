fun main() {
    val price = 100000

    val discount = 100
    val discount5Percent = 0.05
    val discount1Percent = 0.01

    val regularUser = true

    var priceResult = 0

    if (price in 0..1000) {
        priceResult = price
    } else if (price in 1001..10000) {
        priceResult = price - discount
    } else if (price > 10001) {
        priceResult = price - (price * discount5Percent).toInt()
    }

    if (regularUser) {
        priceResult -= (priceResult * discount1Percent).toInt()
    }

    println("Итоговая сумма покупки: $priceResult руб.")
}