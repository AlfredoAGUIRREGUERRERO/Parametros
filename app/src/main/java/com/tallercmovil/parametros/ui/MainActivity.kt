package com.tallercmovil.parametros.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tallercmovil.parametros.R
import com.tallercmovil.parametros.model.Alumno1
import com.tallercmovil.parametros.model.Alumno2
import com.tallercmovil.parametros.model.Alumno3

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(view: View) {

        //Instanciamos objetos de nuestras clases creadas

        val alumno1 = Alumno1("Amaury", "11111") //serializable
        val alumno2 = Alumno2("Héctor", "22222") //parcelable
        val alumno3 = Alumno3("Ramón", "33333")

        val intent = Intent(this, MainActivity2::class.java)

        val parametros = Bundle()

        parametros.putString("usuario", "Amaury")
        parametros.putInt("sesion", 60102153)
        parametros.putSerializable("alumno1", alumno1)
        parametros.putParcelable("alumno2", alumno2)
        parametros.putSerializable("alumno3", alumno3)

        intent.putExtras(parametros)

        startActivity(intent)
    }
}