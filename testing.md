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

Th feature that allows the player to input the grid size they want.

#### Test Data / Actions to Use

Player enter grid sizes using only integer. The minimum input is 5 and the maximum being 30.

#### Expected Outcome

The game accepts the input grid size and rejects any number that is higher than 30 or lower than 5. The game should not recognise the input value if 
anything other than integer has been inout as well.


### TEST NAME HERE

TEST DESCRIPTION HERE

#### Test Data / Actions to Use

TEST DATA TO USE DETAILED HERE

#### Expected Outcome

EXPECTED OUTCOME DETAILED HERE


### TEST NAME HERE

TEST DESCRIPTION HERE

#### Test Data / Actions to Use

TEST DATA TO USE DETAILED HERE

#### Expected Outcome

EXPECTED OUTCOME DETAILED HERE


---


## Evidence / Results of Testing

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


### TEST NAME HERE

ACTUAL RESULTS OF TESTING SHOWN HERE

![](images/placeholder.jpg)

NOTES REGARDING THE RESULTS HERE

