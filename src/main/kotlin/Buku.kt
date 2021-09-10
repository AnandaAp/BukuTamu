import java.text.SimpleDateFormat
import java.util.*

class Buku {
    private val buku = arrayListOf<Tamu>()
    private var tamu = String()

    fun catatKehadiran(_tamu : String) {
        tamu = _tamu
        val simpleDateFormat = SimpleDateFormat("HH:mm")
        val time : String = simpleDateFormat.format(Date())
        this.buku.add(Tamu(tamu,time))
    }

    fun tampilkan() : String{
        var kehadiran = "\tDaftar Tamu\n"
        var index = 1
        buku.forEach {
            kehadiran += "$index.${it.nama}\n" +
                    "  Hadir pada pukul : ${it.kedatangan}\n"
            index++
        }
        return kehadiran
    }
}