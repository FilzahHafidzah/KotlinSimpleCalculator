package com.filzah.kotlinkalkulatorsimple

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tnplus.setOnClickListener {
            if (valid()) calculate("+")
            else tampilAlert()

        }

        tnminus.setOnClickListener {
            if (valid()) calculate("-")
            else tampilAlert()

        }

        tnmultiply.setOnClickListener {
            if (valid()) calculate("*")
            else tampilAlert()

        }

        tndivide.setOnClickListener {
            if (valid()) calculate("/")
            else tampilAlert()

        }

        tnclear.setOnClickListener {
            textHasil.text = "hasil"
            editsatu.text = null
            editdua.text = null
        }
    }

    private fun calculate(s: String) {
        val input1 = editsatu.text.toString().toDouble()
        val input2 = editdua.text.toString().toDouble()

        when(s){
            "+" -> textHasil.text = (input1 + input2).toString()
            "-" -> textHasil.text = (input1 - input2).toString()
            "*" -> textHasil.text = (input1 * input2).toString()
            "/" -> textHasil.text = (input1 / input2).toString()
        }
    }


    private fun tampilAlert() {
        Toast.makeText(this@MainActivity, "Input Kosong", Toast.LENGTH_LONG).show()
    }
    private fun valid():Boolean {
        if(editsatu.text.toString() != "" || editdua.text.toString() != ""){
            return true
        }else{
            return false
        }
    }
}
