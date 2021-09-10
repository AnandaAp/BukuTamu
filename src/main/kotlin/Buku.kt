class Buku {
    private val buku = arrayListOf<Tamu>()
    private var tamu : String = ""

    fun catatKehadiran(_tamu : String) {
        tamu = _tamu
        this.buku.add(Tamu(tamu))
    }

    fun tampilkan() : String{
        var kehadiran = "\tDaftar Tamu\n"
        var index = 1
        buku.forEach {
            kehadiran += "$index.${it.nama}\n"
            index++
        }
        return kehadiran
    }
}