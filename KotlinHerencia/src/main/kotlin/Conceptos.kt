/*

    Herencia en kotlin:

    La herencia en Kotlin permite crear una jerarquía de clases,
    donde las clases derivadas heredan los miembros y comportamientos de la clase base.
    Esto significa que las clases derivadas pueden acceder y utilizar los métodos y propiedades de la clase base,
    y también pueden agregar nuevos métodos y propiedades o redefinir los existentes.

    Para utilizar la herencia en Kotlin , puedes declarar una clase derivada utilizando la palabra clave "class"
    seguida del nombre de la clase derivada, dos puntos y el nombre de la clase base. Por ejemplo:
 */

object date {

}

fun main() {
    open class ClaseBase{
        // Propiedades y metodos de la clase base
    }

    class ClaseDerivada : ClaseBase(){
        // Propiedades y metodos adicionales de la clase derivada
    }



/*
    Que es DataClass:
    Una data class en Kotlin es una clase especializada para representar y modelar datos de manera eficiente.
    Proporciona una serie de funciones y características generadas automáticamente que ahorran tiempo y código al trabajar con datos.

    Funciones de una DataClass:

    1. Funcion toString(), es la que representa en formato de cadena de texto los valores de las propiedades de la clase.
    2. Funcion equals(), Compara dos objetos de la DataClass para determinar si iguales en terminos de valores de propiedad.
    3. Funcion hashcode(), devuelve un numero entero unico generado a partir de los valres de las propiedades de la data class.
    4. Funcion copu(), Crea una copia de un objeto de la data class con la opcion de modificar ciertas propiedades.

 */

    date class Persona(val nombre: String, val edad: Int) {
        fun copy(edad: Int) {
        }
    }

    val Persona1 = Persona("Juan",30)
    val Persona2 = Persona("Daniel",25)

    println(Persona1) // Imprime: Persona(nombre=Juan, edad=30)
    println(Persona2) // Imprime: Persona(nombre=Daniel, edad=25)

    println(Persona1 == Persona2) // Imprime: false

    val Persona3 = Persona1.copy(edad = 26)
    println(Persona3) // Imprime: Persona(nombre=Juan, edad=26)

}