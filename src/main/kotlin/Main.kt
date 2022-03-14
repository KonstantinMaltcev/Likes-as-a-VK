fun main() {
    print("Введи количество лайков:__")
    val likes = readLine()?.toInt()
    val people = if (likes!! % 10 == 1 && likes != 11) "человеку" else "людям"

    println("Ваше фото понравилось $likes $people ")
}
