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
            val i = Intent( this, BlogActivity::class.java)
            startActivity(i)
        }
    }
}
