package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private var ListAdapter: MutableList<DT_CARLOS> = mutableListOf()
    private lateinit var recycler: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Agregar elementos a ListAdapter
        ListAdapter.add(DT_CARLOS("pedro laid", "9388003456", "dal@gmail.com"))
        ListAdapter.add(DT_CARLOS("denis lopez", "938590988", "corlo@gmil.com"))

        ListAdapter.add(DT_CARLOS("clara carrllo", "9381554567", "noraca@gmail.com"))
        ListAdapter.add(DT_CARLOS("victor zabala", "936813456", "francisz@gmail.com"))
        ListAdapter.add(DT_CARLOS("ken heredia", "935580988", "cahe@gmil.com"))
        ListAdapter.add(DT_CARLOS("zara hernandez", "9781234567", "peher@gmail.com"))
        ListAdapter.add(DT_CARLOS("david laid", "9382003456", "dal@gmail.com"))
        ListAdapter.add(DT_CARLOS("cordero lopez", "938290988", "corlo@gmil.com"))
        ListAdapter.add(DT_CARLOS("nora carrllo", "9381554567", "noraca@gmail.com"))
        ListAdapter.add(DT_CARLOS("francisco zabala", "9381813456", "francisz@gmail.com"))
        ListAdapter.add(DT_CARLOS("carlos heredia", "938580988", "cahe@gmil.com"))
        ListAdapter.add(DT_CARLOS("perla hernandez", "9381234567", "peher@gmail.com"))
        ListAdapter.add(DT_CARLOS("david laid", "9382003456", "dal@gmail.com"))
        ListAdapter.add(DT_CARLOS("cordero lopez", "938290988", "corlo@gmil.com"))
        ListAdapter.add(DT_CARLOS("david laid", "9382003456", "dal@gmail.com"))
        ListAdapter.add(DT_CARLOS("cordero lopez", "938290988", "corlo@gmil.com"))
        ListAdapter.add(DT_CARLOS("nora carrllo", "9381554567", "noraca@gmail.com"))
        ListAdapter.add(DT_CARLOS("francisco zabala", "9381813456", "francisz@gmail.com"))
        ListAdapter.add(DT_CARLOS("carlos heredia", "938580988", "cahe@gmil.com"))
        ListAdapter.add(DT_CARLOS("perla hernandez", "9381234567", "peher@gmail.com"))

        ListAdapter.add(DT_CARLOS("nora carrllo", "9381554567", "noraca@gmail.com"))
        ListAdapter.add(DT_CARLOS("francisco zabala", "9381813456", "francisz@gmail.com"))
        ListAdapter.add(DT_CARLOS("carlos heredia", "938580988", "cahe@gmil.com"))
        ListAdapter.add(DT_CARLOS("perla hernandez", "9381234567", "peher@gmail.com"))

        // Inicializar RecyclerView y configurar el adaptador
        val tabla = findViewById<RecyclerView>(R.id.tablacli)
        recycler = tabla
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = C_CARLOS(this, ListAdapter)
    }


}