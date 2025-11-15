package com.example.fullyfunctionalapp

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Cards : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_cards)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val call=findViewById<Button>(R.id.btncall)

        call.setOnClickListener {
            val intent= Intent(Intent.ACTION_DIAL)
            intent.data=Uri.parse("tel:9725572752")
            startActivity(intent)
        }

        val cardAndroid=findViewById<CardView>(R.id.AndroidAppDev)
        val cardwebdev=findViewById<CardView>(R.id.WebDev)
        val cardios=findViewById<CardView>(R.id.ios)
        val cardML=findViewById<CardView>(R.id.ML)
        val cardBlock=findViewById<CardView>(R.id.BlockChain)
        val card3=findViewById<CardView>(R.id.web3)

        cardAndroid.setOnClickListener {
            intent=Intent(applicationContext, AndroidAppDev::class.java)
            startActivity(intent)
        }
        cardwebdev.setOnClickListener {
            intent=Intent(applicationContext, WebDev::class.java)
            startActivity(intent)
        }
        cardios.setOnClickListener {
            intent=Intent(applicationContext, iOS_App_Dev::class.java)
            startActivity(intent)
        }
        cardML.setOnClickListener {
            intent=Intent(applicationContext, Machine_Learning::class.java)
            startActivity(intent)
        }
        cardBlock.setOnClickListener {
            intent=Intent(applicationContext, Blockchain::class.java)
            startActivity(intent)
        }
        card3.setOnClickListener {
            intent=Intent(applicationContext, Web3::class.java)
            startActivity(intent)
        }
    }
}