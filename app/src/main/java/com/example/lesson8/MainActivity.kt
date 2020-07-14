package com.example.lesson8

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val intMassiv = arrayOf(4,45,234,235,23)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val edText = findViewById<EditText>(R.id.edit)
        val edText1 = findViewById<EditText>(R.id.edit1)
        val edText2 = findViewById<EditText>(R.id.edit2)
        val edText3 = findViewById<EditText>(R.id.edit3)
        val edText4 = findViewById<EditText>(R.id.edit4)

        val vie=findViewById<TextView>(R.id.vie)
        val vie1=findViewById<TextView>(R.id.vie1)
        val vie2=findViewById<TextView>(R.id.vie2)
        val vie3=findViewById<TextView>(R.id.vie3)
        val vie4=findViewById<TextView>(R.id.vie4)

        val btnClick= findViewById<Button>(R.id.click)

        edText.setText(intMassiv[0].toString())
        edText1.setText(intMassiv[1].toString())
        edText2.setText(intMassiv[2].toString())
        edText3.setText(intMassiv[3].toString())
        edText4.setText(intMassiv[4].toString())
        val a=4
        val b=3.14
        val c= a*b
        vie.text= c. toString()

        val a1=45
        val b1=3.14
        val c1= a1*b1
        vie1.text= c1. toString()

        val a2=234
        val b2=3.14
        val c2= a2*b2
        vie2.text= c2. toString()

        val a3=235
        val b3=3.14
        val c3= a3*b3
        vie3.text= c3. toString()

        val a4=23
        val b4=3.14
        val c4= a4*b4
        vie4.text= c4. toString()

        val preference=getSharedPreferences("Preference", Context.MODE_PRIVATE)

        btnClick.setOnClickListener{
            val firstEd=edText.text.toString()
            preference.edit().putString("firstEd", firstEd).apply()

            val secondEd=edText1.text.toString()
            preference.edit().putString("secondEd",secondEd).apply()

            val thirdEd=edText2.text.toString()
            preference.edit().putString("thirdEd",thirdEd).apply()

            val fourthEd=edText3.text.toString()
            preference.edit().putString("fourthEd",fourthEd).apply()

            val fifthEd=edText4.text.toString()
            preference.edit().putString("fifthEd", fifthEd).apply()






        }





    }
}