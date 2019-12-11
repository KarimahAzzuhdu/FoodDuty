package com.kaka.foodduty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_login.*

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        halo.text = intent.getStringExtra("isi")

        btn_blog.setOnClickListener {
            startActivity(Intent(this, BlogActivity::class.java))
        }
        btn_hitung.setOnClickListener {
            startActivity(Intent(this, HitungActivity::class.java))
        }
        btn_konsultasi.setOnClickListener {
            startActivity(Intent(this, KonsulActivity::class.java))
        }
    }
}
