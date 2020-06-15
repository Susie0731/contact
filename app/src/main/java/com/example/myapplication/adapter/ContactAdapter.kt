package com.example.myapplication.adapter

import android.annotation.SuppressLint
import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
//import com.bumptech.glide.annotation.GlideModulez
import com.example.myapplication.R
import com.example.myapplication.contact.Contact


class ContactAdapte(var context: Context, var arr: ArrayList<Contact>) : BaseAdapter() {


    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val view = View.inflate(context,R.layout.contact_item, null)
        var textView:TextView = view.findViewById(R.id.textView2)
        var textView2:TextView = view.findViewById(R.id.textView3)
        var imageView:ImageView = view.findViewById(R.id.imageView)

        textView.text = arr.get(p0).name
//        textView.setKey
        textView2.text = arr.get(p0).number
        Glide.with(context).load(R.drawable.pic).into(imageView)
        return view

    }

    override fun getItem(p0: Int): Any {
        return arr.get(p0)
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return arr.size
    }
}