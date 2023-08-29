package com.example.appkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.speech.tts.TextToSpeech
import android.widget.TextView

class MainActivity : AppCompatActivity(), TextToSpeech.OnInitListener {
    var tts: TextToSpeech? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tts = TextToSpeech(this, this)

    }

    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            findViewById<TextView>(R.id.TextView).text="Hola bebe"
        } else{
            findViewById<TextView>(R.id.TextView).text="No se puede escuchar"
        }
    }
}