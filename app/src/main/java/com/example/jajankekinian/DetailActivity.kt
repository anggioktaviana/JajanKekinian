package com.example.jajankekinian

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.detail_jajan.*

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_jajan)

        var intentThatStartedThisActivity = getIntent()
        if (intentThatStartedThisActivity.hasExtra(Intent.EXTRA_TEXT)){

            var gambar = intentThatStartedThisActivity.getIntExtra(Intent.EXTRA_TEXT, 0)
            var nama = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TITLE)
            var instagram = intentThatStartedThisActivity.getStringExtra(Intent.ACTION_PICK)
            var desc = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_TEMPLATE)
            var alamat = intentThatStartedThisActivity.getStringExtra(Intent.EXTRA_SUBJECT)



            imageView.setImageResource(gambar)
            txttoko.text = nama
            txtweb.text = instagram
            txtdesc.text = desc
            txtalamat.text = alamat


            txtweb.setOnClickListener{
                openWeb(instagram)
            }
        }
    }

    private fun openWeb(url: String?){
        val showWebActivity = Intent( this, web::class.java)
        showWebActivity.putExtra(Intent.ACTION_VIEW, url)
        startActivity(showWebActivity)
    }
}