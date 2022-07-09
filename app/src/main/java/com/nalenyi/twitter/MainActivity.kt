package com.nalenyi.twitter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.nalenyi.twitter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        displaytimeline()
    }

    fun displaytimeline(){
        var tweet=Twitter("Wmwas","#mwas"," ","I think am more concern about the logic part of the project"," "," "," "," ")
        var tweet1=Twitter("AshOchwada","#Ochwada"," ","I know am savage but I have a good heart"," "," "," "," ")
        var tweet2=Twitter("Jnaregae","#naregae"," ","You are a perfectionist my only direction"," "," "," "," ")
        var tweet3=Twitter("Annakol","#akoli"," ","I decided to return silence with silence and absence with absence"," "," "," "," ")
        var tweet4=Twitter("Vnjeri","#njerii"," ","All must turn out well,affection with affection,friendship with friendship"," "," "," "," ")
        var tweet5=Twitter("nalisaa","#nalo"," ","Preety doll that you won't get to play with"," "," "," "," ")
        var twitterList= listOf(tweet,tweet1,tweet2,tweet3,tweet4,tweet5)

        var twitterAdapter= TwitterRvAdapter(twitterList)
        binding.rvtimeline.layoutManager = LinearLayoutManager(this)
        binding.rvtimeline.adapter = twitterAdapter

         }

     }





