enum class DayPart(
    MORNING
)

data class Event(
    val title : String,
    val description : String? = null,
    val daypart : Daypart,
    val durationInMinutes : Int,
)

fun main() {
    val event1 = Event(title:"Party")
}

val event1 = Event(title = "Wake up", description = "Time to get up", daypart = Daypart.MORNING, durationInMinutes = 0)
val event2 = Event(title = "Eat breakfast", daypart = Daypart.MORNING, durationInMinutes = 15)