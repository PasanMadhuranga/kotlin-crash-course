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


    //  --------------EXCEPTION HANDLING----------------
    print("Enter a fourth number: ")
    val fourthInput = readln()
    try {
        val fourthNumber = fourthInput.toInt()
        println("You entered: $fourthNumber")
        println("Is the fourth number even? ${fourthNumber % 2 == 0}")
    } catch (e: NumberFormatException) {
        println("Invalid input. Please enter a valid integer.")
    } finally {
        println("Execution completed.")
    }

    // ----------------THROWING EXCEPTIONS----------------
    fun checkPositive(number: Int) {
        if (number < 0) {
            throw IllegalArgumentException("Number must be positive")
        } else {
            println("The number is positive: $number")
        }
    }

    print("Enter a fifth number: ")
    val fifthInput = readln()
    val fifthNumber = fifthInput.toInt()
    checkPositive(fifthNumber)

    // ---------------- ARRAYS ----------------
    // array is immutable. That means you cannot change the size of the array after its creation.
    // However, you can change the elements of the array.
    val favouriteNums = arrayOf(21, 93, 15, 44, 59)
    val stringArray = arrayOf("Kotlin", "Java", "Python")
    val mixedArray = arrayOf(1, "Two", 3.0, true)

    println("Integer Array: ${favouriteNums.joinToString()}")
    println("String Array: ${stringArray.joinToString()}")
    println("Mixed Array: ${mixedArray.joinToString()}")

    print("Enter an index to access your favourite number (0-4): ")
    val indexInput = readln().toIntOrNull()
    if (indexInput != null && indexInput in favouriteNums.indices) {
        println("Your favourite number at index $indexInput is ${favouriteNums[indexInput]}")
    } else {
        println("Invalid index. Please enter a number between 0 and ${favouriteNums.size - 1}.")
    }

    // ---------------- LOOPS ----------------
    println("Iterating over favourite numbers:")
    for (num in favouriteNums) {
        println(num)
    }
    print("Enter the number of elements you want to sum: ")
    val amountOfNums = readln().toIntOrNull()
    var sum = 0
    if (amountOfNums != null && amountOfNums > 0) {
        for (i in 1..amountOfNums) {
            print("Enter number $i: ")
            val userNum = readln().toIntOrNull() ?: continue
            sum += userNum
        }
        println("The total sum is: $sum")
    } else {
        println("Please enter a valid positive integer for the amount of numbers.")
    }

    // ---------------- MUTABLE LISTS ----------------
    val mutableList = mutableListOf(1, 2, 3)
    println("Initial Mutable List: $mutableList")
    mutableList.add(4)
    println("After adding 4: $mutableList")
    mutableList.removeAt(0)
    println("After removing element at index 0: $mutableList")
    mutableList[0] = 10
    println("After updating index 0 to 10: $mutableList")

    for (i in 0 until mutableList.size) {
        println("Element at index $i is ${mutableList[i]}")
    }

}