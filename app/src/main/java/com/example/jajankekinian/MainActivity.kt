package com.example.jajankekinian

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val data = createJajan()
        rvlist.layoutManager = LinearLayoutManager( this)
        rvlist.setHasFixedSize(true)
        rvlist.adapter = Adapter(data, { onItem: DataJajanan ->
            onItemClicked(onItem) })
    }
    private fun onItemClicked(onItem: DataJajanan) {
        val showDetailActivityIntent = Intent(this, DetailActivity::class.java )
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEXT, onItem.img)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TITLE, onItem.nama)
        showDetailActivityIntent.putExtra(Intent.ACTION_PICK, onItem.web)
        showDetailActivityIntent.putExtra(Intent.EXTRA_TEMPLATE, onItem.desc)
        showDetailActivityIntent.putExtra(Intent.EXTRA_SUBJECT, onItem.alamat)
        startActivity(showDetailActivityIntent)

    }
    private fun createJajan(): List<DataJajanan> {
        val rvList = ArrayList<DataJajanan>()
        rvList.add(
            DataJajanan(
                R.drawable.tokkebi,
                "Tokkebi Snacks",
                "https://tokkebisnacks.business.site/",
                "Tokkebi Snacks menyediakan jajanan khas dari Korea Selatan yang terbuat dari sosis dan kentang dengan harga yang terjangkau.\n" +
                        "Di Korea, tokkebi banyak dijual di pinggir jalan kota dan biasanya yang menjualnya adalah pedagang kaki lima.\n" +
                        "Walaupun di jual di pinggir jalan, rasa jajanan ini sangat enak dan bikin nagih lho!",
                "- Jl. Tenggilis Mejoyo AI No.33-34\n" +
                        "- Jl. Pandegiling Kel No.248\n" +
                        "- Jl. Gubeng Airlangga II No.14\n" +
                        "- Tunjungan Plaza, Jl. Basuki Rahmat No.8-12\n" +
                        "- Jl. Kutisari Utara No.47"
            )
        )
        rvList.add(
            DataJajanan(
                R.drawable.jony,
                "Martabak Jepang Jony",
                "https://martabakjepangjony.com/",
                "Martabak Jepang Jony merupakan produk orisinil yang tidak meniru produk-produk dari brand lainnya. \n" +
                        "Martabak Jepang Jony memiliki ciri khas yang tidak dimiliki oleh produk makanan apapun yaitu terdapat kripik lays & doritos di atasnya.\n" +
                        "Produk kami menawarkan makanan yang unik dan inovatif sehingga banyak digandrungi oleh kaum milenial baik pria maupun wanita.",
                "- Jl. Rungkut Madya\n" +
                        "- Jl. Basuki Rahmat No. 42-43"
            )
        )
        rvList.add(
            DataJajanan(
                R.drawable.gacoan,
                "Mie Gacoan",
                "http://www.miegacoan.com/",
                "Mie Gacoan menjadi tempat bersantap mie terbaik terutama bagi pelajar dan mahasiswa, dimana mereka bisa nongkrong, kerja tugas, ngobrol santai, dan ngeksis bareng.\n" +
                        "Dengan tempat yang atraktif, dan juga dilengkapi berbagai fasilitas seperti: \n" +
                        "wifi, colokan listrik, musik – musik terupdate, dijamin akan bikin customer betah dan selalu ingin kembali lagi.",
                "Jl. Ambengan No.51, Ketabang"
            )
        )
        rvList.add(
            DataJajanan(
                R.drawable.xiboba,
                "XIBOBA",
                "https://web.facebook.com/xiboba.indonesia/",
                "Xiboba merupakan gerai minuman boba kekinian yang berada di bawah naungan Kulo Group x MBV Group.\n" +
                        "Xiboba menyediakan berbagai jenis minuman manis yang diberi topping boba dengan harga yang terjangkau.\n" +
                        "Kini Xiboba telah membuka banyak cabang di seluruh Indonesia, termasuk di Surabaya.",
                "- Jl. Dr. Ir. H. Soekarno No.104\n" +
                        "- Jl. Tenggilis Mejoyo AI No.27A\n" +
                        "- Jl. Raya Nginden No.44\n" +
                        "- Jl. Raya Menganti Karangan No.18\n" +
                        "- Jl. Mayjen Sungkono No.212-214"
            )
        )
        rvList.add(
            DataJajanan(
                R.drawable.lainhati,
                "Kopi Lain Hati",
                "https://web.facebook.com/Kopi-Lain-Hati-338121056834747/",
                "Kopi Lain Hati menawarkan beragam jenis kopi susu kekinian dengan harga yang terjangkau.\n" +
                        "Selain es kopi duda keren, Kopi Lain Hati juga punya 11 varian kopi; seperti es kopi main hati, es kopi gemas, hingga es kopi LDR.\n" +
                        "Sedangkan 8 varian non-kopi, yang terdiri dari; es sakit hati, es lekat, hingga es cuek.",
                "- Jl. Rungkut Madya No.240\n" +
                        "- Jl. Pumpungan II No.25A\n" +
                        "- Este Square Blok D - 19, Jl. Dr. Ir. H. Soekarno No.56 - 58\n" +
                        "- Jl. Dharmawangsa No.96A\n" +
                        "- Jl. Siwalankerto No.164a"
            )
        )
        rvList.add(
            DataJajanan(
                R.drawable.cochoc,
                "CO.CHOC",
                "https://web.facebook.com/Cochoc-188739458470215/",
                "Co Choc adalah brand asli Indonesia yang merupakan pelopor minuman chocolate ganache.\n" +
                        "Sedangkan Co Choc menyajikan minuman cokelat dengan teknik ganache yakni cokelat diolah menjadi pasta.\n " +
                        "Pasta cokelat ini dicampur susu dan dihidangkan dalam kondisi dingin atau panas.",
                "Jl. Tenggilis Mejoyo AI No.33"
            )
        )
        return rvList
    }
}