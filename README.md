# OLD GOLD

### Level 2 Programming Project by Mimi

This project is assessed against [AS91896](https://www.nzqa.govt.nz/nqfdocs/ncea-resource/achievements/2019/as91896.pdf)

## Project Description

The project involves the programming of a two-player game.

Old gold is a two-player game where each player takes turns to remove coins that are placed randomly on a one-line
grid. Among those coins, there is one gold coin, and the player who gets to remove the gold coin from the grid wins
the game. There are some certain rules that are applied in this game:
1) Each player can only move one coin at a time.
2) They can only move the coin forward(left) but as many squares as they want.
3) If there is already a coin on that square, no other coins will be able to land on or go over that square.
4) When a coin is on the most left-handed square, the player can choose whether to remove the coin from the grid or not.
The game ends as soon as the gold coin is being removed from the grid, and the player who removes it is the winner.
By using Kotlin programming language, a display of an interface is shown where players will be able to play
the old gold game and interact through the interface.


## Source Code

The project is written in [Kotlin](https://kotlinlang.org/)

The main source file is [Main.kt](src/META-INF/Main.kt)


## Documentation

Evidence of testing can be found in [testing.md](testing.md)


## Running the Program

You can either clone this whole repo, open it using [IntelliJ IDEA](https://www.jetbrains.com/idea/download/) and run from source; or you can run the compiled program:

1. Install the [Java runtime (JRE)](https://www.java.com/en/download/) installed to run the program.
2. Go to the [out/artifacts](out/artifacts) folder
3. Locate and download the compiled **JAR file** (e.g. FILENAME.jar)
4. Run the following command:
    ```bash
    java -jar FILENAME.jar
    ```
