fun main() {
    val w = 42
    val x = 5.12
    val y = true
    val z = "Hello, Kotlin!"
    println(w)
    println(x)
    println(y)
    println(z)
    var a = 10
    a += 5
    println(a)
    println("Is w an even number? ${w % 2 == 0}")
    println("Is w and a both even? ${w % 2 == 0 && a % 2 == 0}")
    println("Is w or a even? ${w % 2 == 0 || a % 2 == 0}")

    println("Enter a number:")
    val input = readln()
    val number = input.toIntOrNull() // Safely convert input to an integer. Returns null if conversion fails.
    if (number != null) {
        val isEven = number % 2 == 0
        println("You entered: $number")
        println("Is the number even? $isEven")
    }

    print("Enter another number: ")
    val secondInput = readln().toIntOrNull() ?: 0 // Safely convert input to an integer, default to 0 if conversion fails
    println("You entered: $secondInput")
    val output = if (secondInput > 0) {
        "The number is positive."
    } else if (secondInput < 0) {
        "The number is negative."
    } else {
        "The number is zero."
    }
    println(output)

    val output_v2 = when {
        secondInput > 0 -> "The number is positive."
        secondInput < 0 -> "The number is negative."
        else -> "The number is zero."
    }
    println(output_v2)

    when (secondInput) {
        in 0..10 -> println("The number is between 0 and 10.")
        in 11..20 -> println("The number is between 11 and 20.")
        else -> println("The number is greater than 20 or negative.")
    }

    print("Enter a third number: ")
    val thirdInput = readln()
    val thirdNumber = thirdInput.toIntOrNull()?.rem(2)?.equals(0) ?: false // Check if even, default to false if conversion fails
    println("Is the third number even? $thirdNumber")
}