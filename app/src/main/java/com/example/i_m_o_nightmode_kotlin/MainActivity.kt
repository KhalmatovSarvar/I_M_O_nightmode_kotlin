package com.example.i_m_o_nightmode_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.i_m_o_nightmode_kotlin.adapter.UserAdapter
import com.example.i_m_o_nightmode_kotlin.model.User

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    private fun initViews() {

        recyclerView = findViewById(R.id.recycler_view)
        recyclerView.layoutManager = GridLayoutManager(this,1)

        refreshAdapter(getUsers())
    }

    private fun refreshAdapter(users: ArrayList<User>) {
        val adapter = UserAdapter(this,users)
        recyclerView.adapter = adapter

    }

    private fun getUsers(): ArrayList<User> {

        val users : ArrayList<User> = ArrayList()

        users.add(User("Sarvar Khalmatov",R.drawable.sarvar,3))
        users.add(User("Tohir Rahmatullayev",R.drawable.tohir,2))
        users.add(User("Tohir Rahmatullayev",R.drawable.tohir,0))
        users.add(User("Sarvar Khalmatov",R.drawable.sarvar,0))
        users.add(User("Sherzod Jo'rabekov",R.drawable.sherzod,8))
        users.add(User("Tohir Rahmatullayev",R.drawable.tohir,9))
        users.add(User("Tohir Rahmatullayev",R.drawable.tohir,2))
        users.add(User("Sarvar Khalmatov",R.drawable.sarvar,1))
        users.add(User("Sherzod Jo'rabekov",R.drawable.sherzod,21))
        users.add(User("Sarvar Khalmatov",R.drawable.sarvar,2))
        users.add(User("Sherzod Jo'rabekov",R.drawable.sherzod,5))
        users.add(User("Tohir Rahmatullayev",R.drawable.tohir,2))
        users.add(User("Sarvar Khalmatov",R.drawable.sarvar,23))
        users.add(User("Sherzod Jo'rabekov",R.drawable.sherzod,2))
        users.add(User("Sherzod Jo'rabekov",R.drawable.sherzod,4))
        return users


    }
}