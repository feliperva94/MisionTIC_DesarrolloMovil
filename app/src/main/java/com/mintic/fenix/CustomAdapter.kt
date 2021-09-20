package com.mintic.fenix

import androidx.recyclerview.widget.RecyclerView
import android.widget.ImageView
import android.widget.TextView
import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup

class CustomAdapter: RecyclerView.Adapter<CustomAdapter.ViewHolder>(){

    val titles = arrayOf("Pueblito Paisa",
        "Parque de los pies descalzos",
        "Parques del río",
        "Parque Arví")

    val details = arrayOf("El Pueblito Paisa de Medellín es uno de los sitios turísticos más visitados de la ciudad que combina tres elementos que todos amamos: la tradición antioqueña que se refleja en las artesanías, gastronomía y arquitectura del lugar; la vista majestuosa de Medellín y las montañas que recorren el Valle de Aburrá.",
        "Tal cual lo indica su nombre es un lugar típicamente lúdico, cuyo propósito es que los visitantes se descalcen y disfrutan relajadamente en medio de la urbe.",
        "Esta obra contempla en su diseño el mejoramiento de la infraestructura, el paisajismo y la vegetación, con el objetivo de convertirse en un corredor de movilidad metropolitana, y principal eje ambiental y de espacio público para favorecer el encuentro de los ciudadanos.",
        "Es un parque abierto desarrollado en predios de uso público, creado para el disfrute de toda la comunidad local, nacional e internacional.")

    val images = intArrayOf(R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground,
        R.drawable.ic_launcher_foreground)

    val scores = arrayOf("4.9",
        "5.0",
        "4.8",
        "5.0")

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder{
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int){
        viewHolder.itemTitle.text = titles[i]
        viewHolder.itemDetail.text = details[i]
        viewHolder.itemImage.setImageResource(images[i])
        viewHolder.itemScore.text = scores[i]
    }

    override fun getItemCount(): Int{
        return titles.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView
        var itemScore: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_detail)
            itemScore = itemView.findViewById(R.id.item_score)
        }
    }
}