package com.thishkt.demointent4

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.thishkt.demointent4.data.Book
import kotlinx.android.synthetic.main.activity_a.*

class AActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)

        btn_next_page.setOnClickListener {
            val intent = Intent(this, BActivity::class.java)
            val book = Book("HKT 線上教室","123456789")
            intent.putExtra("book",book)
            startActivity(intent)
        }
    }
}
