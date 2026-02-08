package com.example.listview3

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listview3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
private lateinit var postAdapter: PostAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val postList = listOf<YoutubePost>(
            YoutubePost(R.drawable.youtube_thumbnail1, "Learn Recycler View", "Aminula Islam Sir"),
            YoutubePost(R.drawable.youtube_thumbnail2, "Learning Recycler View", "Shafe Alam"),
            YoutubePost(R.drawable.youtube_thumbnail1, "Learn Recycler View", "Aminula Islam Sir"),
            YoutubePost(R.drawable.youtube_thumbnail2, "Learning Recycler View", "Shafe Alam"),
            YoutubePost(R.drawable.youtube_thumbnail1, "Learn Recycler View", "Aminula Islam Sir"),
            YoutubePost(R.drawable.youtube_thumbnail2, "Learning Recycler View", "Shafe Alam"),
            YoutubePost(R.drawable.youtube_thumbnail1, "Learn Recycler View", "Aminula Islam Sir"),
            YoutubePost(R.drawable.youtube_thumbnail2, "Learning Recycler View", "Shafe Alam"),
            YoutubePost(R.drawable.youtube_thumbnail1, "Learn Recycler View", "Aminula Islam Sir"),
            YoutubePost(R.drawable.youtube_thumbnail2, "Learning Recycler View", "Shafe Alam"),
            YoutubePost(R.drawable.youtube_thumbnail1, "Learn Recycler View", "Aminula Islam Sir"),
            YoutubePost(R.drawable.youtube_thumbnail2, "Learning Recycler View", "Shafe Alam"),
            YoutubePost(R.drawable.youtube_thumbnail1, "Learn Recycler View", "Aminula Islam Sir"),
            YoutubePost(R.drawable.youtube_thumbnail2, "Learning Recycler View", "Shafe Alam"),
            YoutubePost(R.drawable.youtube_thumbnail1, "Learn Recycler View", "Aminula Islam Sir"),
            YoutubePost(R.drawable.youtube_thumbnail2, "Learning Recycler View", "Shafe Alam"),
            )
            postAdapter = PostAdapter(postList)
            binding.recyclerView.apply {
                layoutManager = LinearLayoutManager(this@MainActivity)
                adapter = postAdapter
            }

    }
}