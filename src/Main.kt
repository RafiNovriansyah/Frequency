fun main() {

//    STATISTIC MACHINE CLASS
    val calculate = StatisticMachine()

    print("Masukkan kelas interval: ")
    val kelas = readln().toDouble()

    print("Masukkan minNumber: ")
    val minNumber = readln().toDouble()

    print("Masukkan panjang kelas interval: ")
    val PanjangKelas = readln().toDouble()
    println("Hasil panjang kelas interval: $PanjangKelas")
    println(" ")

    val kelasInterval = kelas.toInt()

    val arr = calculate.dataCollection()

    calculate.distribusiFrekuensi(kelasInterval, minNumber, PanjangKelas, arr)


}