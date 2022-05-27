package net.hrec.postapp.views.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import net.hrec.postapp.R
import net.hrec.postapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}