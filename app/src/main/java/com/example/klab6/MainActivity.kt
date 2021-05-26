package com.example.klab6

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class MainActivity : AppCompatActivity() {

    private var ramListRecyclerView: RecyclerView? = null
    private var ramAdapter: RaMAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ramListRecyclerView = findViewById(R.id.ram_list)
        ramAdapter = RaMAdapter()
        ramListRecyclerView?.adapter = ramAdapter

        loadRaM()
    }

    private fun loadRaM() {
        NetworkService
            .getApi()
            .getRaM()
            .enqueue(
                object : Callback<RaMData> {
                    override fun onFailure(call: Call<RaMData>, t: Throwable){
                    }
                    override fun onResponse(call: Call<RaMData>, response: Response<RaMData>){
                        val list = response.body()?.results ?: emptyList()
                        ramAdapter?.changeList(list)
                    }
                }
            )
    }
}