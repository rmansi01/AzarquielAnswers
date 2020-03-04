package com.example.azarquielanswers.api

import com.example.azarquielanswers.model.Respuesta
import com.example.azarquielanswers.model.Usuario
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.*

interface PreguntaService {
    // idpregunta en la url
    @GET("preguntas/{idpregunta}")
    fun getDataPregunta(@Path("idpregunta") idpregunta: Int):
            Deferred<Response<Respuesta>>
    // nick y pass como variables en la url?nick=paco&pass=paco
    @GET("usuario")
    fun getDataUsuarioPorNickPass(
        @Query("nick") nick: String,
        @Query("pass") pass: String): Deferred<Response<Respuesta>>

    // post con objeto en json
    @POST("usuario")
    fun saveUsuario(@Body usuario: Usuario): Deferred<Response<Respuesta>>

    // post con variables sueltas
    @FormUrlEncoded
    @POST("bar/{idbar}/puntos")
    fun savePuntos(@Path("idbar") idbar: Int,
                   @Field("idusuario") idusuario: Int,
                   @Field("puntos") puntos: Int): Deferred<Response<Respuesta>>
}
