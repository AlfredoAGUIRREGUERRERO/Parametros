package com.tallercmovil.parametros.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.tallercmovil.parametros.R
import com.tallercmovil.parametros.model.Alumno1
import com.tallercmovil.parametros.model.Alumno2
import com.tallercmovil.parametros.model.Alumno3

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val bundle = intent.extras

        val usuario = bundle?.getString("usuario", "")
        val sesion = bundle?.getInt("sesion", 0)

        val alumno1 = bundle?.getSerializable("alumno1") as Alumno1
        val alumno2 = bundle?.getParcelable<Alumno2>("alumno2")
        val alumno3 = bundle?.getSerializable("alumno3") as Alumno3

        Toast.makeText(this, "Nombre: $usuario, Sesión: $sesion", Toast.LENGTH_LONG).show()

        if (alumno1 != null) {
            Toast.makeText(
                this,
                "Nombre del alumno serializable: ${alumno1.nombre}, Núm cuenta: ${alumno1.numCuenta}",
                Toast.LENGTH_LONG
            )
                .show()
        }

        Toast.makeText(
            this,
            "Nombre del alumno parcelable: ${alumno2?.nombre}, Núm cuenta: ${alumno2?.numCuenta}",
            Toast.LENGTH_LONG
        )
            .show()

        if (alumno3 != null) {
            Toast.makeText(
                this,
                "Nombre del alumno serializable: ${alumno3.nombre}, Núm cuenta: ${alumno3.numCuenta}",
                Toast.LENGTH_LONG
            )
                .show()
        }


    }
}