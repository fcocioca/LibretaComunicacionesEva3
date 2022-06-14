package com.example.libretacomunicaciones.controllers

import android.content.Context
import com.example.libretacomunicaciones.Models.Recibida

class RecibidaController constructor(ctx: Context){
    private val ctx = ctx
    fun getAll ():List<Recibida>{
        val recibidas = ArrayList<Recibida>()
        // aquí rellenaos el arreglo para poder mostras ejemplo
        recibidas.add(Recibida(1,"prueba lenguaje","dd/mm/aa", "Lenguaje", "" +
                "Estimado: revise la fecha de su prueba.", "No leído"))

        recibidas.add(Recibida(2,"actividad atrasada","dd/mm/aa", "Matemática", "" +
                "Estimado: Tiene una actividad vencida.","Leído"))

        recibidas.add(Recibida(3,"Citación de apoderado","dd/mm/aa", "Consejo de curso","" +
                "Estimado Apoderado: Esta citado por que su pupilo cometió un error gravisimo.", "Firmado"))

        recibidas.add(Recibida(4,"Exposición evaluada","dd/mm/aa", "Historia" ,"" +
                "Estimado Alumno: Su exposición fue evaluada con un 3,5", "Leído"))


        recibidas.add(Recibida(5,"Exposición evaluada","dd/mm/aa", "Historia" ,"" +
                "Estimado Alumno: Su exposición fue evaluada con un 3,5", "Leído"))


        recibidas.add(Recibida(6,"Citación de apoderado","dd/mm/aa", "Consejo de curso","" +
                "Estimado Apoderado: Esta citado por que su pupilo cometió un error gravisimo.", "Firmado"))

        recibidas.add(Recibida(7,"prueba lenguaje","dd/mm/aa", "Lenguaje", "" +
                "Estimado: revise la fecha de su prueba.", "No leído"))

        recibidas.add(Recibida(8,"actividad atrasada","dd/mm/aa", "Matemática", "" +
                "Estimado: Tiene una actividad vencida.","Leído"))

        recibidas.add(Recibida(9,"Exposición evaluada","dd/mm/aa", "Historia" ,"" +
                "Estimado Alumno: Su exposición fue evaluada con un 3,5", "Leído"))


        recibidas.add(Recibida(10,"Citación de apoderado","dd/mm/aa", "Consejo de curso","" +
                "Estimado Apoderado: Esta citado por que su pupilo cometió un error gravisimo.", "Firmado"))

        recibidas.add(Recibida(11,"prueba lenguaje","dd/mm/aa", "Lenguaje", "" +
                "Estimado: revise la fecha de su prueba.", "No leído"))

        recibidas.add(Recibida(12,"actividad atrasada","dd/mm/aa", "Matemática", "" +
                "Estimado: Tiene una actividad vencida.","Leído"))

        return recibidas
    }
}