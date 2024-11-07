# Test Plan and Evidence / Results of Testing

## Game Description

The project involves the programming of a two-player game.

BRIEF DESCRIPTION OF GAME HERE
BRIEF DESCRIPTION OF GAME HERE
BRIEF DESCRIPTION OF GAME HERE

### Game Features and Rules

The game has the following features and/or rules:

- There are 2 types of coins in this game: silver and gold.
- There is only 1 gold coin.
- Coins are placed in randomly on the grid.
- Player takes turn doing actions.
- Players are only allowed to move the coin to the left-handed side.
- Players are not allowed to move the coin forward if there is already a coin on the square in front.
- Players are not allowed to skip over coins.
- The coin can be removed when it is on the most left-handed side of the grid.
- The player who removes the gold coin from the grid first is the winner.

---

## Test Plan

The following game features / functionality and player actions will need to be tested:

- Setup
  - Ask players to enter their names.
  - Ask players to choose the grid size.
  - Shows a brief instruction.
  - Set and shows the grid, with gold and silver coins placed randomly on the grid.
- Playing the game
  - Each player takes turn playing the game
  - Player moves the coin, which includes detection for invalid moves and edge cases.
  - Player can remove the coin when the coin is on the most left-handed side square (square no.0)
- Check fo winning case
  - The player who removes the gold coin from the grid first.

These features listed will be a test plan for testing my version of old gold game, to see whether it meets and passes all the test all the test or not. This is 
to ensure that the game works properly and allow the players to play the game smoothly, as well as detecting if any invalid scenarios occur.


The following tests will be run against the completed game. The tests should result in the expected outcomes shown.


### Player's name

The game will ask the players to enter their names in order to determine each player and the winner of the game.

#### Test Data / Actions to Use

Player 1: name (press enter after completing the first player's name)
Player 2: name (press enter to proceed to the next step)
The game should also be able to detect any invalid input, which includes number, symbols or empty spaces.

#### Expected Outcome

No invalid input detected, the names are accepted and should be used all throughout the game to determine the turn of each player and the winner of the game.



### Selecting grid size

The feature allows the player to input the grid size they want.

#### Test Data / Actions to Use

Player enter grid sizes using only integer. The minimum input is 5 and the maximum being 30.

#### Expected Outcome

The game accepts the input grid size and rejects any number that is higher than 30 or lower than 5. The game should not recognise the input value if 
anything other than integer has been input as well.


### Brief instruction

Instructions and rules listed players before the game starts.

#### Test Data / Actions to Use

Text about rules of the old gold game and press enter when wanting to start the game.

#### Expected Outcome

The text is shown and the game starts as soon as the player presses enter.


### Grid setup

The grid shown with both gold and silver coins being put on randomly.

#### Test Data / Actions to Use

Try running the game to see changes of the appearance of the grid and the placement of the coins. 
Also, try different of coins on the grid to see how many coins would suit each size of grid.

#### Expected Outcome

The grid size shown is as input by the player at the start of the game with coins on it. There should only be 1 gold coin and coins must not be put on the same square.


### Players turn

Each player gets one turn to make any valid action to the coin ,and then the game switches to the other player.

#### Test Data / Actions to Use

The player will take turn playing the game for a couple of times

#### Expected Outcome

After the first player has committed an action to the coin, the game switches to the other player.


### Moving the coin

Players are allowed to move the coin within the grid, only to the left-handed side and unable to skip any coin in front.

#### Test Data / Actions to Use

Test the both valid moves and invalid moves that can happen.

Valid moves:
- Move the coins to the left-handed side on an empty square and within the grid bound (also try moving 1 square or multiple of squares if the squares on the more left-handed side are empty)

Invalid moves:
- Move the coin to the right.
- Move the coin into a square where there is already a coin on it.
- Move the coin out of grid/Input the grid number that is out of bound.
- Move the coin to a square that jumps over the other coin(s) in front.
- Input anything else other than the number within the grid bound (e.g. text,symbol,kanji)

#### Expected Outcome

The coin is being moved to the new square selected by the player and the game switches to the other player.
If invalid moves occur, the player will get an error message and will be asked to play/make selection again.


### Removing the coin (silver coin case)

Players can move the coin off the grid when the coin is on the most left-handed side square.

#### Test Data / Actions to Use

One player moves the coin to the most left-handed side of the grid and the other player then select that coin.

#### Expected Outcome

The coin is removed from the grid (i.e. it has been replaced by an empty space)


### Winning case (removing gold coin case)

The player who removes the gold coin from the grid is the winner.

#### Test Data / Actions to Use

One player moves the gold coin to the most left-handed side of the grid and the other player then select that coin.

#### Expected Outcome

The game ends and a message appears at the end to indicate the winner. 

---


## Evidence / Results of Testing

### Player names

ACTUAL RESULTS OF TESTING SHOWN HERE


NOTES REGARDING THE RESULTS HERE


### TEST NAME HERE

ACTUAL RESULTS OF TESTING SHOWN HERE

![](images/placeholder.jpg)

NOTES REGARDING THE RESULTS HERE


### TEST NAME HERE

ACTUAL RESULTS OF TESTING SHOWN HERE

![](images/placeholder.jpg)

NOTES REGARDING THE RESULTS HERE


### TEST NAME HERE

ACTUAL RESULTS OF TESTING SHOWN HERE

![](images/placeholder.jpg)

NOTES REGARDING THE RESULTS HERE

