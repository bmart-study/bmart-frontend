package com.example.bmart.view

import android.content.ContentValues.TAG
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.TopAppBar
import androidx.databinding.DataBindingUtil.setContentView
import com.example.bmart.R
import com.example.bmart.base.BaseActivity
import com.example.bmart.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "onCreate")

        topAppBar.setOnMenuItemClickListener { menuItem ->
            when (menuItem.itemId) {
                R.id.shopping_cart -> {
                    true

                    val intent = Intent(this, ShoppingCartActivity::class.java)
                    intent.apply {
                        //this.putExtra("msg", text_main.text.toString())
                    }
                    startActivity(intent)

                }

            }
        }
    }
}