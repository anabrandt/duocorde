package com.example.duocorde.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.duocorde.R
import com.example.duocorde.model.Unit

class UnitAdapter(
    private val units: List<Unit>,
    private val onUnitClick: (Unit) -> Unit
) : RecyclerView.Adapter<UnitAdapter.UnitViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UnitViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_unit, parent, false)
        return UnitViewHolder(view)
    }

    override fun onBindViewHolder(holder: UnitViewHolder, position: Int) {
        val unit = units[position]
        holder.bind(unit)
        holder.itemView.setOnClickListener { onUnitClick(unit) }
    }

    override fun getItemCount() = units.size

    class UnitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        private val titleTextView: TextView = itemView.findViewById(R.id.unitTitleTextView)
        private val lockImageView: ImageView = itemView.findViewById(R.id.unitLockImageView)

        fun bind(unit: Unit) {
            titleTextView.text = unit.title
            lockImageView.visibility = if (unit.isLocked) View.VISIBLE else View.GONE
        }
    }
}
