package com.example.huaweiproject.assistant

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.huaweiproject.R

import com.example.huaweiproject.data.Assistant

class AssistantAdapter: RecyclerView.Adapter<AssistantAdapter.ViewHolder>() {

    var data = listOf<Assistant>()

    set(value){
        field = value
        notifyDataSetChanged()
    }

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val assistantMessage: TextView = itemView.findViewById(R.id.human_message)
        val humanMessage : TextView = itemView.findViewById(R.id.assistant_message)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val  layoutInflater = LayoutInflater.from(parent.context)
        val view = layoutInflater.inflate(R.layout.assistant_item_layout, parent, false) as ConstraintLayout
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data[position]
        holder.assistantMessage.text = item.assistantMessage
        holder.humanMessage.text = item.humanMessage
    }

    override fun getItemCount(): Int  = data.size
}