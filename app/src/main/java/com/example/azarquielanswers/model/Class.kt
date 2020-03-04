package com.example.azarquielanswers.model

import java.sql.Date

data class Pregunta(
    var id : Int,
    var telefono : Long,
    var nick : String,
    var avatar : String,
    var fecha : Date,
    var post : String
)

data class Comentario (
    var id : Int,
    var nick : String,
    var telefono: Long,
    var avatar: String,
    var fecha: Date,
    var pregunta: Pregunta,
    var respuesta : String
)

data class Usuario(
    var nick : String,
    var telefono: Long,
    var avatar: String
)