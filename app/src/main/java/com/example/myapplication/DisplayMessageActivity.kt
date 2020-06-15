package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.bumptech.glide.Glide
import com.example.myapplication.contact.Contact
import kotlinx.android.synthetic.main.specific_contact.*

class DisplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.specific_contact)

//        val name = intent.getStringExtra(EXTRA_NAME)
        val contact: Contact = intent.getSerializableExtra(EXTRA_CONTACT) as Contact
        val textView = findViewById<TextView>(R.id.textView4).apply {
            text = contact.name
        }
        findViewById<TextView>(R.id.textView5).apply {
            text = contact.number
        }
        Glide.with(this).load(contact.pic).into(imageView2)
    }
}