import java.util.*

fun main() {
    val reader =Scanner(System. `in`)
    print("Masukan bilangan pertama: ")
    val bil1 = reader.nextInt()

    print("Masukan bilangan kedua: ")
    val bil2 = reader.nextInt()

    carculator2Bil(bil1, bil2)
}

fun carculator2Bil(bil1: Int, bil2: Int) {
    val penjumlahan = bil1 + bil2
    val pengurangan = bil1 - bil2
    val perkalian = bil1 * bil2
    val pembagian = bil1 / bil2
}