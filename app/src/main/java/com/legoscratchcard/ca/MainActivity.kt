package com.legoscratchcard.ca

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.anupkumarpanwar.scratchview.ScratchView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        scratchView.setRevealListener(object : ScratchView.IRevealListener {
            override fun onRevealed(scratchView: ScratchView?) {
                Toast.makeText(this@MainActivity, "Revelated", Toast.LENGTH_LONG).show()
            }

            override fun onRevealPercentChangedListener(scratchView: ScratchView?, percent: Float) {
                Log.d("Revelated", percent.toString())
            }
        })
    }
}
