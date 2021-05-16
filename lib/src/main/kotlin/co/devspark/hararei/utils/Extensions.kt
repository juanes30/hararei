package co.devspark.hararei.utils

import java.text.SimpleDateFormat
import java.util.*

fun String.toDate(format: String = "yyyy-MM-dd"): Date {
    val formatter = SimpleDateFormat(format, Locale.getDefault())
    formatter.timeZone = TimeZone.getTimeZone("UTC")
    return formatter.parse(this)
}

fun Date.getUTCDay(): Int {
    val calendar = Calendar.getInstance()
    calendar.time = this
    return calendar.get(Calendar.DAY_OF_WEEK)
}

fun Date.getDayOfMonth(): Int {
    val calendar = Calendar.getInstance()
    calendar.time = this
    return calendar.get(Calendar.DAY_OF_MONTH)
}

fun Date.year(): Int {
    val calendar = Calendar.getInstance()
    calendar.time = this
    return calendar.get(Calendar.YEAR)
}

fun Date.month(): Int {
    val calendar = Calendar.getInstance()
    calendar.time = this
    return calendar.get(Calendar.MONTH)
}

fun Date.addDay(days: Int = 1): Date {
    val calendar = Calendar.getInstance()
    calendar.time = this
    calendar.add(Calendar.DATE, days)
    return calendar.time
}

fun Int.addZero(): String {
    val number = this.toString()
    return if (this in 1..9 && !number.startsWith("0")) {
        "0$number"
    } else {
        number
    }
}
