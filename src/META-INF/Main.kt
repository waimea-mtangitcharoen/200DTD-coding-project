package `META-INF`

import blue
import bold
import col
import green
import grey
import magenta
import red
import underline
import yellow

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
val sCoin = "●".grey()
val gCoin = "●".col(250, 227, 135)
var currentPlayer = 0

fun main() {
    println()
    println("✪".col(250, 227, 135) + " Old Gold Game " + "✪".col(250, 227, 135))
    println("Welcome to the fascinating Old Gold Game!")
    println()

    val playerNames = mutableListOf<String>()
    val squares = mutableListOf<String>()

    getPlayerNames(playerNames)
    getGameSize(squares, playerNames)
    addCoins(squares, sCoin, gCoin)
    playGame(squares, playerNames)
}

fun showSquares(squares: MutableList<String>) {
    print("┏━━━━━")
    print("┳━━━━━".repeat(squares.size-1))
    println("┓")
    for (i in squares.indices) {
        print("┃ ${String.format("%3d", i)} ")
    }
    println("┃")
    print("┣━━━━━".repeat(squares.size))
    println("┫")
    for (square in squares) {
        print("┃  $square  ")
    }
    println("┃")
    print("┗")
    print("━━━━━┻".repeat(squares.size-1))
    println("━━━━━┛")

}

fun getPlayerNames(nameList: MutableList<String>) {
    println("Start off by entering yours and your mate's name".bold())

    //get player 1 name
    var name1: String? = null
    while (true) {
        print("★".col(189, 243, 255) + " Player 1: ")
        name1 = readln()
        //make sure that the user input the name in i.e. it is not empty and not too long
        if (name1.isNotEmpty() && name1.length < 20) {
            nameList.add(name1)
            break
        //otherwise print an error message and ask the user the input their name again
        } else {
            println("Please enter your name again.".red())
        }
    }

    //get Player 2 name
    var name2: String
    while (true) {
        print("★".col(255,189,205) + " Player 2: ")
        name2 = readln()
    //same as for player 1
        if (name2.isNotEmpty() && name2.length < 20) {
            if (name2.equals(name1, ignoreCase = true)) {  // Check for name collision
                println("This name has already been taken. Please enter another name.".red())
            } else {
                nameList.add(name2)
                break
            nameList.add(name2)
            break
            }
        } else {
            println("Please enter your name again.".red())
        }
    }

    println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------")
    println()
}

fun getGameSize(squares: MutableList<String>, playerNames: MutableList<String>) {
    println("Enter how big you want your grid size to be. The number of coins will be 2 less than the grid size you have chosen.".bold())
    println("eg. There are 3 coins in 5 squares grid.".col(140, 189, 142))

    while (true) {
        print("★ Input grid size: ")
        val input = readln()

        //check not null
        val gridSize = input.toIntOrNull()
        if (gridSize != null && gridSize in 5 .. 30) {
            repeat(gridSize) {
                squares.add(" ")
            }
            break
        }
        //error messages
        //when there is no input
        else if (gridSize == null) {
            println("Please enter a number!".red())
        }
        //min size for gird = 5 squares
        else if (gridSize < 5) {
            println("Too small! (min size = 5)".red())
        }
        //max size for grid = 30 squares
        else if (gridSize > 30) {
            println("Too large! (max size = 30)".red())
        }
    }
        println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------")
        println()
        println("Before starting the game, you should be mindful that:".bold())
        println("• You CAN ONLY move the coin to the LEFT hand-side of the grid.")
        println("• You CANNOT move the coin to the square where there is already a coin on it.")
        println("• You CANNOT move the coin any further left if there is one in the square in front.")
        println("• The person who REMOVES the gold coin from the grid is the winner")
        println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------")
        println()
        println("Remember, the aim of the game is to be the first person to " + "REMOVE".underline() + " the gold coin.")
        println()
        print("Press" + " ENTER ".col(140, 189, 142) + "to start the game...")
        readln()
        println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------")
        println()

}

fun addCoins(squares: MutableList<String>, sCoin: String, gCoin: String) {
    //create a list of available positions (excluding index 0)
    val availableSquares = (1 until squares.size).toMutableList()
    availableSquares.shuffle() //shuffle

    //conditions for number of silver coins in different grid size
    val silverCoinsCount =
        if (squares.size in 5..7){
            squares.size -3
        }else if (squares.size in 8..10){
            squares.size -5
        }else if (squares.size in 11..15){
            squares.size -8
        }else if (squares.size in 16..20){
            squares.size -11
        }else if (squares.size in 21..25){
            squares.size -14
        }else {
            squares.size -17
        }

    //loop until reach number of silver coins
    for (i in 0 until silverCoinsCount) {
        if (availableSquares.isNotEmpty()) {
            val position = availableSquares.removeAt(0) //get a unique position/square
            squares[position] = sCoin //put the silver coin on
        }
    }

    //place one gold coin at a unique position/square
    if (availableSquares.isNotEmpty()) {
        val position = availableSquares.removeAt(0)
        squares[position] = gCoin
    }
    showSquares(squares)
}


fun playGame(squares: MutableList<String>, playerNames: MutableList<String>): String {
    var selectedCoin: Int
    var move: Int
        //
        if (currentPlayer == 0){
            println("${playerNames[currentPlayer]}, it is your go...".col(189, 243, 255))
        }else{
            println("${playerNames[currentPlayer]}, it is your go...".col(255,189,205))
        }
        println()
        while (true) {
            print("Choose the coin you want to move: ")
            //covert user's input to an integer. If fails return null assigned as -1
            selectedCoin = readln().toIntOrNull() ?: -1

            if (selectedCoin in squares.indices && (squares[selectedCoin] == sCoin || squares[selectedCoin] == gCoin)) {
                break
            } else {
                println("Invalid selection. Choose a position with a coin.".red())
                showSquares(squares)
                return (playGame(squares, playerNames))
            }
        }

        //if the far most left square is selected
        //if gold coin is on that square
        if (selectedCoin == 0 && squares[0] == gCoin) {
            println()
            if (currentPlayer == 0){
                println("CONGRATULATIONS , " + "${playerNames[currentPlayer]}".col(189,243,255) + "! You just won the legendary match of Old gold coin!! \uD83C\uDFC6 \uD83C\uDF96\uFE0F")
            }else{
                println("CONGRATULATIONS , " + "${playerNames[currentPlayer]}".col(255,189,205) + "! You just won the legendary match of Old gold coin!! \uD83C\uDFC6 \uD83C\uDF96\uFE0F")
            }
            println()
            println("Press " + "ENTER".col(140, 189, 142) + " to start over...")
            println("-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------")
            readln()
            main()
        }
        //if silver coin is on that square
        else if (selectedCoin == 0 && squares[0] == sCoin){
            squares[0] = " "
            println()
            showSquares(squares)

            currentPlayer = if (currentPlayer == 0){
                1
            } else {
                0
            }
            return (playGame(squares, playerNames))
            }

        while (true){
            print("Choose where you want to move to: ")
            move = readln().toIntOrNull() ?: -1
            //use isValidMove() to check for valid moves
            if (move in squares.indices && isValidMove(squares, selectedCoin, move)) {
                //make the move by swapping positions
                squares[move] = squares[selectedCoin]
                //square of the selected coin changed to empty space
                squares[selectedCoin] = " "
                break
            } else {
                println("Please try again".red())
                showSquares(squares)
                return (playGame(squares, playerNames))
            }
        }
    //swap player
    currentPlayer = if (currentPlayer == 0){
        1
    } else {
        0
    }
    println()
    showSquares(squares)
    return playGame(squares, playerNames)
}

fun isValidMove(squares: MutableList<String>, currentPosition: Int, newPosition: Int): Boolean {
    //check if the squares the player wants to move to is within bounds
    if (newPosition < 0 || newPosition >= squares.size) {
        println("Invalid move: out of bounds.".red())
        return false
    }

    //check if the player is trying to move to the right
    if (newPosition > currentPosition) {
        println("Invalid move: you cannot move to the right.".red())
        return false
    }

    //check whether the square the player wants to move to is empty or not
    if (squares[newPosition] != " ") {
        println("Invalid move: you can only move to empty squares.".red())
        return false
    }

    //check if there is any coin in front when moving to the left
    if (newPosition < currentPosition - 1 && squares[newPosition + 1] != " ") {
        println("Invalid move: you cannot skip over a coin.".red())
        return false
    }

    //if passed all the conditions above = allow move
    return true
}













