import java.util.*

fun main () {
    val reader = Scanner(System.`in`)
    print("Masukkan luas meter persegi: ")
    val LuasSawah = reader.nextInt()

    if (LuasSawah < 100) {
        val harga = LuasSawah * 100000
        print("Harga yang harus dibayar adalah $harga")

    } else if (LuasSawah >= 100 && LuasSawah < 500) {
        val harga = LuasSawah * 100
        val diskon = harga * 2/100
        if (diskon >= 500000) {
            val FinalHarga = harga - 500000
            print("Harga yang harus dibayar adalah Rp $FinalHarga")
        }
    } else if (LuasSawah > 500 && LuasSawah < 1000) {
        val harga = LuasSawah * 100000
        val diskon = harga * 5/100
        if (diskon >= 500000) {
            val FinalHarga = harga - 500000
            print("Harga yang harus dibayar adalah Rp $FinalHarga")
        }
    } else if (LuasSawah >=1000 && LuasSawah <= 4000) {
        val harga = LuasSawah * 100000
        val diskon = harga * 12/100
        if (diskon >= 500000) {
            val FinalHarga = harga - 500000
            print("Harga yang harus dibayar adalah sejumlah Rp $FinalHarga")
        }
    } else {
        val harga = LuasSawah * 100000
        val diskon = harga * 25 / 100
        if (diskon >= 500000) {
            val FinalHarga = harga - 500000
            print("Harga yang harus dibayar adalah sejumlah Rp $FinalHarga")
        }
    }
}