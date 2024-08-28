package com.example.notification.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.notification.databinding.ActivityMainBinding
import com.example.notification.model.ManuelNotification

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.button.setOnClickListener(){
            ManuelNotification(this,"1","2","3")
                .SendTestNotification("Uygulama İçi Bildirimi!","Test başarılı, bildirimler alınıyor.")
        }
    }
}