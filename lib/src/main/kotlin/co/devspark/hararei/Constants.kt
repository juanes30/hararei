package co.devspark.hararei

import co.devspark.hararei.model.Holiday

object Constants {
    private const val MONDAY = 1
    private const val NONE = 7

    const val MILLISECONDS_DAY = 86400000

    val EASTER_WEEK_HOLIDAYS = listOf(
        Holiday("-3", NONE, "Jueves Santo"),
        Holiday("-2", NONE, "Viernes Santo"),
        Holiday("39", MONDAY, "Ascensión del Señor"),
        Holiday("60", MONDAY, "Corphus Christi"),
        Holiday("68", MONDAY, "Sagrado Corazón de Jesús")
    )

    val HOLIDAYS = listOf(
        Holiday("01-01", NONE, "Año Nuevo"),
        Holiday("05-01", NONE, "Día del Trabajo"),
        Holiday("07-20", NONE, "Día de la Independencia"),
        Holiday("08-07", NONE, "Batalla de Boyacá"),
        Holiday("12-08", NONE, "Día de la Inmaculada Concepción"),
        Holiday("12-25", NONE, "Día de Navidad"),
        Holiday("01-06", MONDAY, "Día de los Reyes Magos"),
        Holiday("03-19", MONDAY, "Día de San José"),
        Holiday("06-29", MONDAY, "San Pedro y San Pablo"),
        Holiday("08-15", MONDAY, "La Asunción de la Virgen"),
        Holiday("10-12", MONDAY, "Día de la Raza"),
        Holiday("11-01", MONDAY, "Todos los Santos"),
        Holiday("11-11", MONDAY, "Independencia de Cartagena")
    )
}
