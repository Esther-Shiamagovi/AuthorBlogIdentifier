package com.akirachix.blogreadera

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.blogreadera.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.rvBlog.layoutManager=LinearLayoutManager( this)

    }
  fun displayBlog(){
      val bloger1 = BlogReader("Harry Poter","Mistery of Flies")
      val bloger2 = BlogReader("Harry Poter","Mistery of Flies")
      val bloger3 = BlogReader("Harry Poter","Mistery of Flies")
      val bloger4 = BlogReader("Harry Poter","Mistery of Flies")
      val bloger5 = BlogReader("Harry Poter","Mistery of Flies")
      val blogger= listOf(bloger1,bloger2,bloger3,bloger4,bloger5)
      val blogAdapter = BlogAdapter(blogger)
      binding.rvBlog.adapter=blogAdapter

  }


}