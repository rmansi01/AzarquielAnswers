package net.azarquiel.firstretrofit2020.api

import com.example.azarquielanswers.api.PreguntaService
import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by pacopulido on 04/02/2019.
 */

object WebAccess {

    val barService : PreguntaService by lazy {

        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(CoroutineCallAdapterFactory())
            .baseUrl("http://localhost/apiforo/")
            .build()

        return@lazy retrofit.create(PreguntaService::class.java)
    }
}
