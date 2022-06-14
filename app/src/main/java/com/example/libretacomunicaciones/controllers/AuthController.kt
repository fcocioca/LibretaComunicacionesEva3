package com.example.libretacomunicaciones.controllers


import android.content.Context
import android.content.Intent
import android.widget.Toast
import com.example.libretacomunicaciones.LoginActivity
import com.example.libretacomunicaciones.activity_indx


class AuthController constructor(ctx: Context) {
    private val ctx = ctx

    fun login(email: String, password: String) {
        if (email == "ferfraxel@mandalorianos.cl" && password == "AFf+123456") {
            Toast.makeText(this.ctx, "Bienvenido", Toast.LENGTH_LONG).show()
            val intent = Intent(this.ctx, activity_indx::class.java)
            this.ctx.startActivity(intent)
        } else {
            Toast.makeText(this.ctx, "Usuario no existe. Intente nuevamente", Toast.LENGTH_LONG).show()
            val intent = Intent(this.ctx, LoginActivity::class.java)
            this.ctx.startActivity(intent)
        }
    }

    fun register(nombre: String, ap_alumno: String, email: String, password: String, curso: String, birth: String) {
        Toast.makeText(this.ctx, "Cuenta registrada", Toast.LENGTH_SHORT).show()
        val intent = Intent(this.ctx, LoginActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        this.ctx.startActivity(intent)





    }




}
