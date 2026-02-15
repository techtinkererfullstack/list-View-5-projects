package com.example.recyclerview2

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var profileAdapter: ProfileAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
       setContentView(binding.root)


        val profileList = listOf<Profile>(
            Profile("Shafe Alam", "Android Application Developer", R.drawable.person),
            Profile("Aminul Islam Munna", "Trainer", R.drawable.person),
            Profile("Shafe Alam", "Android Application Developer", R.drawable.person),
            Profile("Aminul Islam Munna", "Trainer", R.drawable.person),
            Profile("Shafe Alam", "Android Application Developer", R.drawable.person),
            Profile("Aminul Islam Munna", "Trainer", R.drawable.person),
            Profile("Shafe Alam", "Android Application Developer", R.drawable.person),
            Profile("Aminul Islam Munna", "Trainer", R.drawable.person),
            Profile("Shafe Alam", "Android Application Developer", R.drawable.person),
            Profile("Aminul Islam Munna", "Trainer", R.drawable.person),
            Profile("Shafe Alam", "Android Application Developer", R.drawable.person),
            Profile("Aminul Islam Munna", "Trainer", R.drawable.person),
            Profile("Shafe Alam", "Android Application Developer", R.drawable.person),
            Profile("Aminul Islam Munna", "Trainer", R.drawable.person),
            Profile("Shafe Alam", "Android Application Developer", R.drawable.person),
            Profile("Aminul Islam Munna", "Trainer", R.drawable.person),
        )
        profileAdapter = ProfileAdapter(profileList)
        binding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = profileAdapter
        }


    }
}