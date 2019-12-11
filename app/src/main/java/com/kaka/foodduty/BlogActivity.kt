package com.kaka.foodduty

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.kaka.foodduty.model.Blog
import com.kaka.foodduty.util.RvAdapter
import kotlinx.android.synthetic.main.activity_blog.*

class BlogActivity : AppCompatActivity() {

    val list = ArrayList<Blog>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_blog)

        risekel.setHasFixedSize(true)
        list.addAll(retrieve())
        risekel.layoutManager = LinearLayoutManager(this)

        val adapter = RvAdapter(list)
        risekel.adapter = adapter


    }

    private fun retrieve() : ArrayList<Blog>{
        val localArray = resources.getStringArray(R.array.my_blog)
        val listTemp = ArrayList<Blog>()
        for (position in localArray.indices) {
            val items = Blog(localArray[position])
            listTemp.add(items)
        }
        return listTemp
    }
}
