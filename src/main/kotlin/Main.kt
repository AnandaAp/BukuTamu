fun main() {
    val bukuTamu = Buku()
    while (true){
        println("Selamat Datang")
        println()
        println("Menu")
        println("1. Catat Kehadiran")
        println("2. Tampilkan Semua Daftar Tamu")
        println("3. Keluar")
        println()
        print("Pilihan : ")
        val pilihan = readLine()
        when (pilihan?.toInt()){
            1 -> {
                println()
                print("Masukan Nama Anda : ")
                val nama = readLine().toString()
                bukuTamu.catatKehadiran(nama)
                println("Terima Kasih Sudah Berkunjung")
                println()
            }
            2 -> println(bukuTamu.tampilkan())
            3 -> return
        }
    }
}