import kotlin.math.roundToInt

fun main() {
    print("Введи количество лайков:__")
    val likes = readLine()?.toInt()
//    val tail = verification(likes)
    val people = if (likes!! % 10 == 1 && likes != 11 && likes % 100 == 11) "человеку" else "людям"

    println("Ваше фото понравилось $likes $people")
}

//private fun verification(likes: Int?): Double {
//    val recalculation = (likes?.div(100.00))?.minus((likes / 100))
//    return (recalculation?.times(100))!!.roundToInt() / 100.0
//}
