
fun main() {
//    STATISTIC CLASS
    val calculate = StatisticMachine()

    // Use max() or maxOrNull() method
    val maxNumber = calculate.dataCollection().max() // or dataCollection.maxOrNull()
    println("Maximum number: $maxNumber")

    val minNumber = calculate.dataCollection().min()
    println("Minimum number: $minNumber")

    val charLength = calculate.dataCollection().size
    println("Array Size: $charLength")

    val rentang = maxNumber - minNumber
    val range = rentang.toDouble()
    println("Hasil rentang adalah: $rentang")

//    Mencari Kelas
    print("Masukkan angka array size sebagai log : ")
    val log = readln().toDouble()

    val result = calculate.kelas(log)
    println("Hasil penjumlahan kelas interval: $result")

    print("Masukkan hasil pembulatan kelas interval: ")
    val pembulatanResult = readln().toDouble()

    val panjangKelas = calculate.panjangKelas(range, pembulatanResult)
    println("Hasil panjang kelas: $panjangKelas")




}