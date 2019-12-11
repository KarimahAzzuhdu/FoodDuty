package com.kaka.foodduty.util

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kaka.foodduty.R
import com.kaka.foodduty.model.Kalori

class ReAdapter(private val list:ArrayList<Kalori>):
    RecyclerView.Adapter<ReAdapter.RvViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RvViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.rv_hitung, parent, false)
        return RvViewHolder(view)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: RvViewHolder, position: Int) {
        holder.bind(list[position])
    }

    class RvViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val textView = itemView.findViewById<TextView>(R.id.text_kalori)
        fun bind(item: Kalori){
            textView.text = item.value
        }
    }
}