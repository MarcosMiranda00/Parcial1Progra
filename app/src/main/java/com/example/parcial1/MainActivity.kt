package com.example.parcial1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        primerejercicio()
        segundoejercicio()
        tercerejercicio()
    }
}

private fun primerejercicio() {
    var color = "Rojo"

    if (color == "Negro"){
        println("El color es: $color")
    }
    else if (color == "Azul"){
        println("El color es: $color")
    }
    else if(color == "Amarillo"){
        println("El color es: $color")
    }
    else{
        println("No se identifico el color")
    }

}

private fun segundoejercicio(){
    val tipodecomida = "Pupusas"
    when(tipodecomida){
        "Pupusas" ->{
            println("La comida es de El Salvador")
        }
        "Tacos" ->{
            println("La comida es de Mexico")
        }
        "Pizza" ->{
            println("La comida es de Italy")
        }
        "Sushi" ->{
            println("La comida es de Japon")
        }
        else ->{
            println("No se conoce la comida")
        }
    }
}

private fun tercerejercicio(){


}
