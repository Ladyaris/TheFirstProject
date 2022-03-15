fun main() {
    persegi(5.0)
    persegiPanjang(5.0,10.0)
    segitiga(6.0, 4.0)
    trapesium(6.0, 4.0, 12.0)
    jajargenjang(4.0, 5.0)
    layangLayang(5.0, 10.0)
    lingkaran(7.0)
    belahKetupat(24.0, 40.0)
}

fun persegi(sisi: Double) {
    val Luas = sisi * sisi
    println("Luas Persegi adalah ${Luas}")
}
fun persegiPanjang(panjang: Double, lebar: Double) {
    val Luas = panjang * lebar
    println("Luas Persegi Panjang adalah ${Luas}")
}
fun segitiga(alas: Double, tinggi: Double){
    val Luas = alas * tinggi /2
    println("Luas Segitiga adalah ${Luas}")
}
fun trapesium(a: Double, b: Double, tinggi: Double) {
    val Luas = (a + b) * tinggi /2
    println("Luas Trapesium adalah ${Luas}")
}
fun jajargenjang(alas: Double, tinggi: Double) {
    val Luas = alas * tinggi
    println("Luas Jajargenjang adalah ${Luas}")
}
fun layangLayang(d1: Double, d2: Double) {
    val Luas = 1/2 * d1 * d2
    println("Luas Layang - layang adalah ${Luas}")
}
fun lingkaran(radius: Double) {
    val Luas = 3.14 * radius * radius
    println("Luas Lingkaran adalah ${Luas}")
}
fun belahKetupat(d1: Double, d2: Double) {
    val Luas = d1 * d2 * 1/2
    println("Luas Belah Ketupat adalah ${Luas}")
}