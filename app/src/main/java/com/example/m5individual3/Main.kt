package com.example.m5individual3

fun main(){
    val usuario1 = Usuarios("Juan Perez",44,null,null)
    val usuario2 = Usuarios("Pedro",56,"Arquitecto",usuario1)
    val usuario3 = Usuarios("Diego",23,"Operario",usuario2)

    //Creacion de Usuarios
    usuario1.mostrarDatos()
    usuario2.mostrarDatos()
    usuario3.mostrarDatos()

}

//CONSTRUCTOR PRIMARIO
class Usuarios (
    private var nombre:String,
    private var edad :Int,
    private var trabajo: String?,
    private var referencia: Usuarios?
){
    fun mostrarDatos(){
        println("...............................................")
        println("Nombre: ${this.nombre}.")
        println("Edad: ${this.edad}.")
        if (this.trabajo != null) {
        println("Trabajo: ${this.trabajo}.")
        } else {
            println("No existe información referente al trabajo.")
        }
        if (this.referencia != null) {
            println("Fue referenciado por: ${this.referencia?.nombre} de ${this.referencia?.edad} años.")
        } else {
            println("No tiene referencia.")
        }
    }

}