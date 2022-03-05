
fun cidade(): Unit {
    println("Digit the Number of Kids Born: ")
    val numberOfKidsBorn = readLine()!!.toInt()

    println("Digit the Number of Population: ")
    val numberOfPopulation = readLine()!!.toInt()

    println("Digit the Number of Deaths")
    val numberOfDeaths = readLine()!!.toInt()

    println("Choose which rate you want to find out:\n1 - Birth Rate\n2 - Deaths Rate")

    when (readLine()!!.toInt()) {
        1 -> println("The birth rate is: ${(numberOfKidsBorn * 1000) / numberOfPopulation} ")

        2 -> println("The death rate is: ${(numberOfDeaths * 1000) / numberOfPopulation} ")
        else -> println("Operation Invalid")
    }
}