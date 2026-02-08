package com.example.listview3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listview3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var postAdapter: PostAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val postList = listOf<Post>(
            Post(
                "Aminul Islam Sir",
                "In Todays Topics we are learning Recycler View",
                R.drawable.youtube_thumbnail1
            ),
            Post(
                "Shafe Alam",
                "I have implemented recycler View Today",
                R.drawable.youtube_thumbnail2
            ),
            Post(
                "Aminul Islam Sir",
                "In Todays Topics we are learning Recycler View",
                R.drawable.youtube_thumbnail1
            ),
            Post(
                "Shafe Alam",
                "I have implemented recycler View Today",
                R.drawable.youtube_thumbnail2
            ),
            Post(
                "Aminul Islam Sir",
                "In Todays Topics we are learning Recycler View",
                R.drawable.youtube_thumbnail1
            ),
            Post(
                "Shafe Alam",
                "I have implemented recycler View Today",
                R.drawable.youtube_thumbnail2
            ),
            Post(
                "Aminul Islam Sir",
                "In Todays Topics we are learning Recycler View",
                R.drawable.youtube_thumbnail1
            ),
            Post(
                "Shafe Alam",
                "I have implemented recycler View Today",
                R.drawable.youtube_thumbnail2
            ),
            Post(
                "Aminul Islam Sir",
                "In Todays Topics we are learning Recycler View",
                R.drawable.youtube_thumbnail1
            ),
            Post(
                "Shafe Alam",
                "I have implemented recycler View Today",
                R.drawable.youtube_thumbnail2
            ),
            Post(
                "Aminul Islam Sir",
                "In Todays Topics we are learning Recycler View",
                R.drawable.youtube_thumbnail1
            ),
            Post(
                "Shafe Alam",
                "I have implemented recycler View Today",
                R.drawable.youtube_thumbnail2
            ),
            Post(
                "Aminul Islam Sir",
                "In Todays Topics we are learning Recycler View",
                R.drawable.youtube_thumbnail1
            ),
            Post(
                "Shafe Alam",
                "I have implemented recycler View Today",
                R.drawable.youtube_thumbnail2
            ),
            Post(
                "Aminul Islam Sir",
                "In Todays Topics we are learning Recycler View",
                R.drawable.youtube_thumbnail1
            ),
            Post(
                "Shafe Alam",
                "I have implemented recycler View Today",
                R.drawable.youtube_thumbnail2
            ),
            Post(
                "Aminul Islam Sir",
                "In Todays Topics we are learning Recycler View",
                R.drawable.youtube_thumbnail1
            ),
            Post(
                "Shafe Alam",
                "I have implemented recycler View Today",
                R.drawable.youtube_thumbnail2
            ),  Post(
                "Aminul Islam Sir",
                "In Todays Topics we are learning Recycler View",
                R.drawable.youtube_thumbnail1
            ),
            Post(
                "Shafe Alam",
                "I have implemented recycler View Today",
                R.drawable.youtube_thumbnail2
            ),
            Post(
                "Aminul Islam Sir",
                "In Todays Topics we are learning Recycler View",
                R.drawable.youtube_thumbnail1
            ),
            Post(
                "Shafe Alam",
                "I have implemented recycler View Today",
                R.drawable.youtube_thumbnail2
            ),


        )

        postAdapter = PostAdapter(postList)
        binding.recyclerViewList.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = postAdapter
        }

    }
}