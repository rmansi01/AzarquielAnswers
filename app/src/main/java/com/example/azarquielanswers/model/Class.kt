package com.example.azarquielanswers.model

import java.sql.Date
import java.io.Serializable

data class Pregunta(
    var id : Int,
    var telefono : Long,
    var nick : String,
    var avatar : String,
    var fecha : Date,
    var post : String
) : Serializable

data class Comentario (
    var id : Int,
    var nick : String,
    var telefono: Long,
    var avatar: String,
    var fecha: Date,
    var pregunta: Pregunta,
    var respuesta : String
) : Serializable

data class Usuario(
    var nick : String,
    var telefono: Long,
    var avatar: String
) : Serializable

data class Respuesta(
    var id : Int,
    var nick: String,
    var fecha: Date,
    var pregunta: Pregunta,
    var comentario: Comentario
)