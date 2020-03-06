package com.example.azarquielanswers.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.azarquielanswers.model.Pregunta
import kotlinx.android.synthetic.main.rowpregunta.view.*


class CustomAdapter(val context: Context,
                             val layout: Int
) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    private var dataList: List<Pregunta> = emptyList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val viewlayout = layoutInflater.inflate(layout, parent, false)
        return ViewHolder(viewlayout, context)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = dataList[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    internal fun setPreguntas(preguntas: List<Pregunta>) {
        this.dataList = preguntas
        notifyDataSetChanged()
    }


    class ViewHolder(viewlayout: View, val context: Context) : RecyclerView.ViewHolder(viewlayout) {
        fun bind(dataItem: Pregunta) {
            // itemview es el item de diseño
            // al que hay que poner los datos del objeto dataItem
            itemView.tvpregunta.text = dataItem.pregunta
            itemView.tvuser1.text = dataItem.nick
            itemView.tvfechapregunta.text = (dataItem.fecha).toString()
            itemView.tag = dataItem
        }

    }


}