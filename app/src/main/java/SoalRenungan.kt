/* Ibu beli belanjaan di supermarket
400.000 -> diskon 4%
700.000 -> diskon 9%
1.600.000 -> diskon 19%
2.000.000 -> diskon 25%
3.000.000 -> diskon 40%
total uang yang harus dibayar
 */
import java.util.*

fun main () {
    val belanjaan = 5000000
    val total = Scanner(System. `in`)

    if (belanjaan < 400.000) {
        print("Belanja lebih banyak lagi untuk meraih diskon")
    } else if ((belanjaan >= 400.000) && (belanjaan <= 699.999)) {
        print("Selamat, anda mendapat diskon ssebesar 4%")
    } else if ((belanjaan >= 700.000) && (belanjaan <= 1.599999)) {
        print("Selamat, anda mendapat diskon ssebesar 9%")
    } else if ((belanjaan >= 1.600000) && (belanjaan <= 1.999999)) {
        print("Selamat, anda mendapat diskon ssebesar 19%")
    } else if ((belanjaan >= 2.000000) && (belanjaan <= 2.999999)) {
        print("Selamat, anda mendapat diskon ssebesar 25%")
    } else if  ((belanjaan >= 3.000000)) {
        print("Selamat, anda mendapat diskon ssebesar 40%")
    }
}

fun total () {
    val total =
    println("Total pembelian anda adalah")
}