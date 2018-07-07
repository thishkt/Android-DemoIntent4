package com.thishkt.demointent4

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.thishkt.demointent4.data.Book
import kotlinx.android.synthetic.main.activity_b.*

class BActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)

        val item = intent.getParcelableExtra<Book>("book")
        Log.d("BActivity", item.book_name)
        Log.d("BActivity", item.book_isbn)

        btn_back.setOnClickListener {
            finish()
        }
    }
}
