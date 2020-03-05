package net.azarquiel.recyclerviewpajaros.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.azarquielanswers.model.Comentario
import kotlinx.android.synthetic.main.rowrespuesta.view.*

/**
 * Created by pacopulido on 9/10/18.
 */
class CustomAdapter(val context: Context,
                    val layout: Int
                    ) : RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    private var dataList: List<Comentario> = emptyList()

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

    internal fun setPajaros(comentarios: List<Comentario>) {
        this.dataList = comentarios
        notifyDataSetChanged()
    }


    class ViewHolder(viewlayout: View, val context: Context) : RecyclerView.ViewHolder(viewlayout) {
        fun bind(dataItem: Comentario){
            // itemview es el item de diseño
            // al que hay que poner los datos del objeto dataItem
            itemView.tvrrespuesta.text=dataItem.respuesta
            itemView.tvuser.text=dataItem.nick
            itemView.tvfecharespuesta.text=(dataItem.fecha).toString()
            itemView.tag=dataItem
        }

    }
}