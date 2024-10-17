package com.example.noteapp.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.noteapp.databinding.ItemLayoutBinding
import com.example.noteapp.model.room.Notes

class MainAdapter(
    private val context: Context,
    private val noteClickDeleteInterface: NoteClickDeleteInterface,
    val noteClickInterface: NoteClickInterface
): RecyclerView.Adapter<MainAdapter.MainViewHolder>() {
    private val allNotes = ArrayList<Notes>()

    inner class MainViewHolder(private val binding: ItemLayoutBinding) : RecyclerView.ViewHolder(binding.root){
        val titleText = binding.idTVNote
        val updateText = binding.idTVNote
        val deleteImage = binding.idIVDelete
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
     val view = ItemLayoutBinding.inflate(LayoutInflater.from(context),parent,false)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.titleText.text = allNotes[position].title
        holder.updateText.text = allNotes[position].content
        holder.deleteImage.setOnClickListener {
            noteClickDeleteInterface.onDeleteIconClick(allNotes[position])
        }
    }

    fun updateList(newList: List<Notes>) {
        allNotes.clear()
        allNotes.addAll(newList)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int {
       return  allNotes.size
    }
}
