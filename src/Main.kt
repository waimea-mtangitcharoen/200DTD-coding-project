/**
 * ------------------------------------------------------------------------
 * Old Gold In Kotlin!
 * Level 2 programming project
 *
 * by Chittranuch Tangitcharoen (Mimi)
 *
 * Old gold is a two-player game where each player takes turns to remove coins that are placed randomly on a one-line
 * grid. Among those coins, there is one gold coin, and the player who gets to remove the gold coin from the grid wins
 * the game. There are some certain rules that are applied in this game:
 * 1) Each player can only move one coin at a time.
 * 2) They can only move the coin forward(left) but as many squares as they want.
 * 3) If there is already a coin on that square, no other coins will be able to land on or go over that square.
 * 4) When a coin is on the most left-handed square, the player can choose whether to remove the coin from the grid or not.
 * The game ends as soon as the gold coin is being removed from the grid, and the player who removes it is the winner.
 * By using Kotlin programming language, a display of an interface is shown where players will be able to play
 * the old gold game and interact through the interface.
 * ------------------------------------------------------------------------
 */


/**
 * Program entry point
 */
fun main() {
    println("Old Gold Game")

    val playerNames = mutableListOf<String>()
    val squares = mutableListOf<String>()

    getPlayerNames(playerNames)

    val option = getGameSize()
    when (option) {
        'A' ->  smallGrid(squares)
        'B' ->  mediumGrid()
        'C' ->  largeGrid()
        'D' ->  hugeGrid()
    }

    addCoins(square)

    var currentPlayer = 0

    while(true) {
        println("${playerNames[currentPlayer]}, it is your go...")
        showSquares(squares)
        // Get user moves
        // Move coin
        // Check if won
//        if (???) {
//            break
//        }
        // Switch to other user

        // Switch player
        currentPlayer = if (currentPlayer == 0) 1 else 0
    }

}

fun showSquares(squares: MutableList<String>) {
    for (square in squares) {
        println(square)
    }
}
fun getPlayerNames(nameList: MutableList<String>) {
    println("Welcome to the fascinating Old Gold Game!")
    println("Start off by enter yours and your mate's name")
    print("Player 1: ")
    val name1 = readln()
    nameList.add(name1)
    print("Player 2: ")
    val name2 = readln()
    nameList.add(name2)
    println()
//    println("The match of $name1 VS $name2 begins!")
}

fun smallGrid(squares: MutableList<String>) {
    repeat(5) {
        squares.add(" ")
    }
}

fun mediumGrid(){
    val mediumSize = 10
    print("+----------".repeat(mediumSize))
    println("+")
    print("| %-8d ".format(mediumSize).repeat(mediumSize))
    println("|")
    print("+----------".repeat(mediumSize))
    println("+")
}
fun largeGrid(){
    val largeSize = 15
    print("+----------".repeat(largeSize))
    println("+")
    print("| %-8d ".format(largeSize).repeat(largeSize))
    println("|")
    print("+----------".repeat(largeSize))
    println("+")
}
fun hugeGrid() {
    val hugeSize = 20
    print("+----------".repeat(hugeSize))
    println("+")
    print("| %-8d ".format(hugeSize).repeat(hugeSize))
    println("|")
    print("+----------".repeat(hugeSize))
    println("+")
}



fun getGameSize(): Char{
    while(true) {
        // Show options
        println("Select the grid size")
        println(" [A] 5 squares")
        println(" [B] 10 squares")
        println(" [C] 15 squares")
        println(" [D] 20 squares")
        print("Option: ")

        // Get user choice
        val option = readln()

        if (option.isNotBlank()){
            // Return just the first char
            return option.uppercase().first()
        }
    }
}






