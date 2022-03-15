import java.util.*

fun main () {
    print("Masukkan Berat Badan Anda! \nBerat Badan(Kg): ")
    val reader = Scanner (System.`in`)
    val BeratBadan = reader.nextInt()
    print("Masukkan Tinggi Badan Anda! \nTinggi Badan(Cm): ")
    val TinggiBadan = reader.nextInt()
    val Tinggi_Badan_Meter = TinggiBadan.toDouble()/100
    val Tinggi_Final = Tinggi_Badan_Meter * Tinggi_Badan_Meter
    val bmi = BeratBadan.toDouble() /Tinggi_Final

    println()
    ("Berat Badan anda adalah $BeratBadan dan Tinggi Badan anda adalah $TinggiBadan" +
            "Sehingga didapat dari BMI $bmi dan berdasarkan BMI anda masuk kedalam" +
            "kategori")

    if (bmi < 18.5){
        println("Terlalu kurus")
    }
    else if (bmi >= 18.5 && bmi < 25) {
        println("Normal")
    }
    else
        println("Gemuk")
}
