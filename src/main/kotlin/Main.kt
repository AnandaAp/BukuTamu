var bukuTamu = Buku()
fun main() {
    while (true){
        println("Selamat Datang")
        println("1. Catat Kehadiran")
        println("2. Tampilkan Semua Daftar Tamu")
        print("\nPilihan : ")
        val pilihan = readLine()
        when (pilihan?.toInt()){
            1 -> {
                print("Masukan Nama Anda : ")
                val nama = readLine().toString()
                bukuTamu.catatKehadiran(nama)
                println("Terima Kasih Sudah Berkunjung")
            }
            2 -> println(bukuTamu.tampilkan())
        }
    }
}