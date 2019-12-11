package com.kaka.foodduty

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.LinearLayoutManager
import com.kaka.foodduty.model.Kalori
import com.kaka.foodduty.util.ReAdapter
import kotlinx.android.synthetic.main.activity_hitung.*

class HitungActivity : AppCompatActivity() {

    var isOpen = false
    val listkal = ArrayList<Kalori>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung)

        val fabOpen = AnimationUtils.loadAnimation(this, R.anim.fab_open)
        val fabClose = AnimationUtils.loadAnimation(this, R.anim.fab_close)
        val fabClockwise = AnimationUtils.loadAnimation(this, R.anim.rotate_clockwise)
        val fabAnticlock = AnimationUtils.loadAnimation(this, R.anim.rotate_anticlockwise)

        btn_add.setOnClickListener {
            if (isOpen) {
                btn_edit.startAnimation(fabClose)
                btn_scan.startAnimation(fabClose)
                btn_add.startAnimation(fabClockwise)

                isOpen = false
            }
            else {
                btn_edit.startAnimation(fabOpen)
                btn_scan.startAnimation(fabOpen)
                btn_add.startAnimation(fabAnticlock)

                btn_edit.isClickable
                btn_scan.isClickable

                isOpen = true
            }
            btn_edit.setOnClickListener {
                startActivity(Intent(this, EditActivity::class.java)) }
            btn_scan.setOnClickListener {
                startActivity(Intent(this, ScanActivity::class.java)) }
        }

        kalorisekel.setHasFixedSize(true)
        listkal.addAll(retrieve())
        kalorisekel.layoutManager = LinearLayoutManager(this)

        val adapter = ReAdapter(listkal)
        kalorisekel.adapter = adapter
    }

    private fun retrieve() : ArrayList<Kalori>{
        val localArray = resources.getStringArray(R.array.my_kalori)
        val listTemp = ArrayList<Kalori>()
        for (position in localArray.indices) {
            val items = Kalori(localArray[position])
            listTemp.add(items)
        }
        return listTemp
    }

}

