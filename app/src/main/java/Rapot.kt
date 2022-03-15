fun main() {
    raport("Lady","B","B","B+","C")

}
fun raport(name: String, uiux: String, web: String, android: String, comthink: String) {
    println("Nilai semester 1 dari siswi atas nama ${name}," +
            "adalah sebagai berikut \nui/ux ${uiux}\nWeb ${web}\n" +
            "Android ${android}\nComthink ${comthink}")
}