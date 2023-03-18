import kotlin.math.roundToInt

fun main(args: Array<String>) {
    println("Минимальный перевод 35 руб. Комиссия 0.75%.\nВведите сумму денежного перевода:")

    val remittance = readln().toInt()
    val transferFee = (remittance * 0.75 / 100).roundToInt()

    if (remittance > 34) {
        println("Вы перевели $remittance руб.\nКомиссия составила: $transferFee руб.")
    } else {
        println("Сумма не достаточна для перевода!")
    }
}