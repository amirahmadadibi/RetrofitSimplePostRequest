package com.example.landscapedetecated

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.example.landscapedetecated.model.User
import com.example.landscapedetecated.network.RestApiServices

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        var v = View(this)
        v.setOnClickListener {

        }


        val rest = RestApiServices()
        val user = User(null, 1001, "TitleX", "bodyX")

        rest.addUser(user) {
            Log.d("tagx", "onCreate: ${it?.toString()}")
        }
    }
}