import java.util.Scanner

fun main() {
    val userInput = arrayOf("stone", "paper", "scissor")
    val scanner = Scanner(System.`in`)

    // Loop to run the game 5 times
    for (round in 1..5) {
        println("Round $round:")
        println("Enter a choice (stone, paper, or scissor):")
        
        val user1 = scanner.next()
        println("User1 choice = $user1")

        val user2 = userInput.random()
        println("User2 choice = $user2")

        // Determine the winner for this round
        if (user1 == user2) {
            println("The match is a tie!")
        } else if ((user1 == "stone" && user2 == "scissor") ||
                   (user1 == "scissor" && user2 == "paper") ||
                   (user1 == "paper" && user2 == "stone")) {
            println("User1 wins!")
        } else if ((user2 == "stone" && user1 == "scissor") ||
                   (user2 == "scissor" && user1 == "paper") ||
                   (user2 == "paper" && user1 == "stone")) {
            println("User2 wins!")
        } else {
            println("Invalid choice by User1.")
        }
        
        println() // Blank line for better readability between rounds
    }

    scanner.close() // Close the scanner after all rounds are completed
    println("Game Over")
}
