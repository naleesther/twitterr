package com.nalenyi.twitter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView

class TwitterRvAdapter (var twitterList:List <Twitter>):
    RecyclerView.Adapter<TwitterViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwitterViewHolder {
        var itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.timeline_list_item,parent,false)
        return TwitterViewHolder(itemView)

    }

    override fun onBindViewHolder(holder: TwitterViewHolder, position: Int) {
        var currentTwitter = twitterList.get(position)
        holder.tvdisplay.text = currentTwitter.display
        holder.tvHandle.text = currentTwitter.Handle
        holder.tvTweet.text = currentTwitter.Tweet

    }

    override fun getItemCount(): Int {
        return twitterList.size
    }
}
class TwitterViewHolder(itemView: View):
      RecyclerView.ViewHolder(itemView){
    var tvdisplay=itemView.findViewById<TextView>(R.id.tvdisplay)
    var tvHandle=itemView.findViewById<TextView>(R.id.tvHandle)
    var tvTweet=itemView.findViewById<TextView>(R.id.tvTweet)
    var imgpicture=itemView.findViewById<ImageView>(R.id.imgpicture)
    var ivComment=itemView.findViewById<ImageView>(R.id.ivComment)
    var ivShare=itemView.findViewById<ImageView>(R.id.ivShare)
    var ivLike=itemView.findViewById<ImageView>(R.id.ivLike)
    var ivRetweet=itemView.findViewById<ImageView>(R.id.ivRetweet)




      }

