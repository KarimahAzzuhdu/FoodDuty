package com.kaka.foodduty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        btn_signup.setOnClickListener {
            val i = Intent( this, HomeActivity::class.java)
            i.putExtra("isi", name.text.toString())
            startActivity(i)
        }
    }
}
