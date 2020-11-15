package com.example.jajankekinian

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.list_jajan.view.*


class Adapter (val itemJajanan: List<DataJajanan>, val clickListener:(DataJajanan)->Unit) :
        RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.list_jajan, parent, false)
        return PartViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int){
        (holder as PartViewHolder).bind(itemJajanan[position], clickListener)
    }

    override fun getItemCount() = itemJajanan.size
    class PartViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(data: DataJajanan, clickListener: (DataJajanan)->Unit){
            itemView.logo.setImageResource(data.img)
            itemView.txtlist.text = data.nama
            itemView.setOnClickListener { clickListener(data)}
        }
    }
}