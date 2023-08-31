fun main() {
    /*
    Nombre: Wilmer Danilo Moncada Parra
    ID: 702523
    Materia: Electiva CP II
    Docente: WILLIAM ALEXANDER MATALLANA PORRAS
    Ingenieria de sistemas
     */
    open class Persona(val nombre: String?, val edad: Int?)

    data class Estudiante(val grado: String?, val promedio: Double?):
            Persona(null,null)

    data class Curso(val nombre: String?, val profesor: String?, val estudiante: List<Estudiante>)

    fun imprimirPersona(persona: Persona){
    println("Nombre: ${persona.nombre ?: "Desconocido"}")
    println("Edad: ${persona.edad ?: "Desconocida"}")
    }

    fun imprimirEstudiante(estudiante: Estudiante){
        println("Nombre: ${estudiante.nombre ?: "Desconocido"}")
        println("Edad: ${estudiante.edad ?: "Desconocido"}")
        println("Grado: ${estudiante.grado ?: "Desconocido"}")
        println("Promedio: ${estudiante.promedio ?: "Desconocido"}")
    }

    fun imprimirCurso(curso: Curso){
        println("Nombre del curso: ${curso.nombre ?: "Desconocido"}")
        println("Profesor: ${curso.profesor ?: "Desconocido"}")
        println("Estudiantes: ")
        curso.estudiante?.forEach{
            imprimirEstudiante(it)
        }
    }

    fun main(){
        val estudiante1 = Estudiante("12° grado", 8.5)
        val estudiante2 = Estudiante("10° grado", 9.2)

        val curso = Curso("Matematicas","Profesor Andres", listOf(estudiante1, estudiante2))
        imprimirCurso(curso)
    }
}