package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.adapter.ContactAdapte
import com.example.myapplication.contact.Contact
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

const val EXTRA_CONTACT = "com.example.myapplication.CONTACT"
class MainActivity : AppCompatActivity() {
    private var listData = ArrayList<Contact>()
    fun createNumber():String{
        var res = "15"
        for(i in 1..9){
            val num = (0..9).random()
            res+=num
        }
        return res
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        for(i in 1..100){
            val name:String = "user"+i
            val number = createNumber()
            val user = Contact(name,number,R.drawable.pic)
            listData.add(user)
        }
        listView.adapter = ContactAdapte(this, listData)

        listView.setOnItemClickListener { parent, view, position, id ->
            val contact = listData.get(position) // The item that was clicked
            val intent = Intent(this, DisplayMessageActivity::class.java).apply {
                putExtra(EXTRA_CONTACT,contact)
            }
            startActivity(intent)
        }
    }

//    fun sendMessage(view: View){
//        val textView2 = findViewById<TextView>(R.id.textView2);
//        val name = textView2.text.toString();
//        val number = findViewById<TextView>(R.id.textView3).text.toString()
////        val pic = findViewById<ImageView>(R.id.imageView).
//        val intent = Intent(this,DisplayMessageActivity::class.java).apply{
//            putExtra(EXTRA_NAME,name);
//            putExtra(EXTRA_NUMBER,number)
//        }
//        startActivity(intent);
//    }
}