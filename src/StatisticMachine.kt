class StatisticMachine {

    fun dataCollection():IntArray{
        return intArrayOf(
            60, 61, 30, 62, 43, 55, 67, 68, 69, 39,
            41, 63, 67, 50, 76, 57, 65, 49, 54, 88,
            40, 71, 70, 51, 56, 54, 78, 54, 72, 69)
    }

    fun kelas(logs: Double): Double {
        return 1 + (3.3 * logs)
    }

    fun panjangKelas(rentang:Double, kelasInterval:Double):Double {
        return rentang / kelasInterval
    }

    fun distribusiFrekuensi(kelasInterval: Int, minNumber: Double,
                            panjangKelasInterval: Double, dataCollection: IntArray) {

        // Create an array to hold the frequency count for each interval
        val frequencies = IntArray(kelasInterval)

        // Calculate the frequency for each interval
        for (num in dataCollection) {
            // Determine which interval the number falls into
            val index = ((num - minNumber) / panjangKelasInterval).toInt()
            if (index in 0 until kelasInterval) {
                frequencies[index]++
            }
        }

        val frequenciesPlus = IntArray(kelasInterval)


        for (i in (kelasInterval - 1) downTo 0) {
            if (i == kelasInterval - 1) {
                // The last interval's greater than cumulative frequency is 0
                frequenciesPlus[i] = 0
            } else {
                // Cumulative frequency for current interval is the sum of the current frequency
                // and the greater than cumulative frequency of the next interval
                frequenciesPlus[i] = frequenciesPlus[i + 1] + frequencies[i + 1]
            }
        }


        val frequenciesMinus = IntArray(kelasInterval)

        for (i in 0 until kelasInterval) { // Change to iterate until kelasInterval
            if (i == 0) {
                frequenciesMinus[i] = frequencies[i]
            } else {
                frequenciesMinus[i] = frequenciesMinus[i - 1] + frequencies[i]
            }
        }

        // Print the results
        for (i in 0 until kelasInterval) {
            val start = minNumber + (i * panjangKelasInterval)
            val end = start + panjangKelasInterval - 1
            val tepiBawah = start - 0.5
            val tepiAtas = end + 0.5
            val tengah = (start + end) / 2
            val frequencyLebihDari = frequenciesPlus[i] + frequencies[i]
            val frequencyKurangDari = frequenciesMinus[i]
            print("Kelas ${i + 1} = $start - $end")
            println()
            print("Tepi kelas = $tepiBawah - $tepiAtas")
            println(" ")
            print("Titik tengah = $tengah")
            println(" ")
            println("Frekuensi = ${frequencies[i]}")
            println("Frekuensi kumulatif lebih dari $tepiBawah = ${frequencyLebihDari}")
            println("Frekuensi kumulatif kurang dari $tepiAtas = $frequencyKurangDari")
            println(" ")
        }
    }



}