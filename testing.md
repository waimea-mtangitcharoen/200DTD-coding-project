# Test Plan and Evidence / Results of Testing

## Game Description

The project involves the programming of a two-player game.

Old gold is a two-player game where each player takes turns to remove coins that are placed randomly on a one-line grid. Among those coins, there is one gold coin, and the player who gets to remove the gold coin from the grid wins the game. There are some certain rules that are applied in this game:

Each player can only move one coin at a time.
They can only move the coin forward(left) but as many squares as they want.
If there is already a coin on that square, no other coins will be able to land on or go over that square.
When a coin is on the most left-handed square, the player can choose whether to remove the coin from the grid or not. The game ends as soon as the gold coin is being removed from the grid, and the player who removes it is the winner. By using Kotlin programming language, a display of an interface is shown where players will be able to play the old gold game and interact through the interface.

 Click the link below to see the playing of the old gold game:

[Old gold game](https://mywaimeaschool-my.sharepoint.com/:v:/g/personal/mtangitcharoen_waimea_school_nz/EZQlnAanTepJiHyjKw-E98IBA1ow0poedI_4tqSkh5ySIg?e=ktdXUa&nav=eyJwbGF5YmFja09wdGlvbnMiOnt9LCJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbE1vZGUiOiJtaXMiLCJyZWZlcnJhbFZpZXciOiJwb3N0cm9sbC1jb3B5bGluayIsInJlZmVycmFsUGxheWJhY2tTZXNzaW9uSWQiOiI4N2FjMDdlYi01YTgyLTRlNmYtYmY3My1kZDEyNjE5NWJlNjMifX0%3D)

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
  - Player can remove the coin when the coin is on the furthest left square (square no.0)
- Check fo winning case
  - The player who removes the gold coin from the grid first.

These features listed will be a test plan for testing my version of old gold game, to see whether it meets and passes all the test all the test or not. This is 
to ensure that the game works properly and allow the players to play the game smoothly, as well as detecting if any invalid scenarios occur.


The following tests will be run against the completed game. The tests should result in the expected outcomes shown.


### Player's name

The game will ask the players to enter their names in order to determine each player and the winner of the game.

#### Test Data / Actions to Use

Let each player types their name in, as well as try not entering anything in and enter a very long name.

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

One player moves the coin to the furthest left of the grid and the other player then select that coin.

#### Expected Outcome

The coin is removed from the grid (i.e. it has been replaced by an empty space)


### Winning case (removing gold coin case)

The player who removes the gold coin from the grid is the winner.

#### Test Data / Actions to Use

One player moves the gold coin to the furthest left of the grid and the other player then select that coin.

#### Expected Outcome

The game ends and a message appears at the end to indicate the winner. 

---


## Evidence / Results of Testing

### Player names
[Valid case](https://mywaimeaschool-my.sharepoint.com/:v:/g/personal/mtangitcharoen_waimea_school_nz/EfXbnTeVOd5ElrmP9m9hhhgBBsjTlCBwrqJWW6pW4V2koA?e=VNSQya&nav=eyJwbGF5YmFja09wdGlvbnMiOnt9LCJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbE1vZGUiOiJtaXMiLCJyZWZlcnJhbFZpZXciOiJwb3N0cm9sbC1jb3B5bGluayIsInJlZmVycmFsUGxheWJhY2tTZXNzaW9uSWQiOiI2NzQ2MTgyZC0wZmExLTQ2MjYtOTQ1Zi1iN2Y2MzAzNWMzNmUifX0%3D)

The valid case evidence shows when players have input valid names into the game, and those names are used all throughout the game.

[Invalid case](https://mywaimeaschool-my.sharepoint.com/:v:/g/personal/mtangitcharoen_waimea_school_nz/ER_apTsVCqpAhaboSVV6HPkBIBUOy176Wrsczxkai9PnEg?e=bxYdFc&nav=eyJwbGF5YmFja09wdGlvbnMiOnt9LCJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbE1vZGUiOiJtaXMiLCJyZWZlcnJhbFZpZXciOiJwb3N0cm9sbC1jb3B5bGluayIsInJlZmVycmFsUGxheWJhY2tTZXNzaW9uSWQiOiI1ZWY4YWY2OC02OTcxLTQzMjUtOTdkNC04YzBiYzdlYmRkNzQifX0%3D)

The invalid case evidence shows how an error message pops up when the player doesn't enter their name and when the name is too long (max is 20 characters).


### Selecting grid size

[Valid case](https://mywaimeaschool-my.sharepoint.com/:v:/g/personal/mtangitcharoen_waimea_school_nz/EcaqYch7ekNEj58tagdXK5EB9_DrjRYQGSt_nUNjzNXM0Q?e=JnE9Ob&nav=eyJwbGF5YmFja09wdGlvbnMiOnt9LCJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbE1vZGUiOiJtaXMiLCJyZWZlcnJhbFZpZXciOiJwb3N0cm9sbC1jb3B5bGluayIsInJlZmVycmFsUGxheWJhY2tTZXNzaW9uSWQiOiI0NDM3NTgxMS0xZmUyLTQ4OWQtYjIwMy1jYmQ2MzI5ZmM1ODUifX0%3D)

This shows when the player inputs a valid grid size and the grid size shown is what the user has input.

[Invalid case](https://mywaimeaschool-my.sharepoint.com/:v:/g/personal/mtangitcharoen_waimea_school_nz/EaFiVh1lIyBHk3INc1qvYqUBellKLwb70mIR_RNM-OPXfA?e=7QvZb9&nav=eyJwbGF5YmFja09wdGlvbnMiOnt9LCJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbE1vZGUiOiJtaXMiLCJyZWZlcnJhbFZpZXciOiJwb3N0cm9sbC1jb3B5bGluayIsInJlZmVycmFsUGxheWJhY2tTZXNzaW9uSWQiOiJjMTQ5NTFkNS0wZjgzLTRhZmUtYTdmYi0wNDljYjRkOWQ2OTMifX0%3D)

An error message pops up and asks the player to enter the grid size again when the player has entered the grid size that 
is out of range (5< grid size <30) or nothing to the game.


### Brief instruction

[Evidence of instruction of the game shown](https://mywaimeaschool-my.sharepoint.com/:v:/g/personal/mtangitcharoen_waimea_school_nz/EeT0Lr9EjztFpmV5wA8tUSEBrhfPh2B9yb-YYQhqW4zq0A?e=oXYLYg&nav=eyJwbGF5YmFja09wdGlvbnMiOnt9LCJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbE1vZGUiOiJtaXMiLCJyZWZlcnJhbFZpZXciOiJwb3N0cm9sbC1jb3B5bGluayIsInJlZmVycmFsUGxheWJhY2tTZXNzaW9uSWQiOiI4ZWU4NzU2NS1iNWRmLTRlNWYtOWE3NS1mMzA5N2U0ZDk5MWYifX0%3D)

After selecting the grid size and presses enter, a set of rules are listed to the player. Then the pressing enter again starts the game.


### Grid setup

[Evidence of grid setup](https://mywaimeaschool-my.sharepoint.com/:v:/g/personal/mtangitcharoen_waimea_school_nz/EVzaTrqxh-9FpjYgwa1oS3YBZ0q1R05uCv8eibWdXNOWJQ?e=Skrt0l&nav=eyJwbGF5YmFja09wdGlvbnMiOnt9LCJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbE1vZGUiOiJtaXMiLCJyZWZlcnJhbFZpZXciOiJwb3N0cm9sbC1jb3B5bGluayIsInJlZmVycmFsUGxheWJhY2tTZXNzaW9uSWQiOiIyZWExMmE2Mi04NjI0LTQ1ZDctYWRhNS04N2M1NGQwY2NlZGQifX0%3D)

The grid shown and the number of coins depend on the player's input. In the video, if the player input 5, the grid will have 5 squares. If the player input 10, the grid will have 10 squares. The number of coins are determined by some conditions within the code so that it suits the size of the grid.

### Players turn

[Evidence of switching players](https://mywaimeaschool-my.sharepoint.com/:v:/g/personal/mtangitcharoen_waimea_school_nz/EWXs9xFEyHFEnxk7xJHgrmQBtSq63-qfgaEwlLBBrKuVVQ?e=Z2h26o&nav=eyJwbGF5YmFja09wdGlvbnMiOnt9LCJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbE1vZGUiOiJtaXMiLCJyZWZlcnJhbFZpZXciOiJwb3N0cm9sbC1jb3B5bGluayIsInJlZmVycmFsUGxheWJhY2tTZXNzaW9uSWQiOiJkMmU4MDk3ZS03NGFhLTQ4ZWEtYmVkZS1hMDY4MmJkMWEwZWUifX0%3D)

Each player takes turn playing the game. The video also shows that the same player will be asked to make a move again if the move they have made is invalid before switching to another player.

### Moving the coin

[Valid case](https://mywaimeaschool-my.sharepoint.com/:v:/g/personal/mtangitcharoen_waimea_school_nz/EcDpvpXe0ThOkDxxshtqbIQBnA91fKrwJZMMBLSPrKSwoA?e=QKd00o&nav=eyJwbGF5YmFja09wdGlvbnMiOnt9LCJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbE1vZGUiOiJtaXMiLCJyZWZlcnJhbFZpZXciOiJwb3N0cm9sbC1jb3B5bGluayIsInJlZmVycmFsUGxheWJhY2tTZXNzaW9uSWQiOiI2MzY1MzQ1OS00YmE0LTRlODQtYWExMS0yNzU3ZGMzYTgzYzMifX0%3D)

The player is able to move to the left side to any square as long as it is empty, there is no other coin in front, and within the grid bound.

[Invalid case](https://mywaimeaschool-my.sharepoint.com/:v:/g/personal/mtangitcharoen_waimea_school_nz/EaAJKVZuvytLkYVx_pGu3McB3ft7dKfAyiNmRRim3RDYOg?e=D9fV1X&nav=eyJwbGF5YmFja09wdGlvbnMiOnt9LCJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbE1vZGUiOiJtaXMiLCJyZWZlcnJhbFZpZXciOiJwb3N0cm9sbC1jb3B5bGluayIsInJlZmVycmFsUGxheWJhY2tTZXNzaW9uSWQiOiI3M2RlNGFmZC0zMGEwLTRmZDYtODNmMS1kMDk4MDE1ZDQ4YTEifX0%3D)

In the video, the player have done invalid moves, which includes:
- Select a square without a coin
  - An error message appears, telling the player that there is no coin in this square and the same player gets to select again.
- Moving the coin to the right side.
  - An error message appears, telling the player that they are not allowed to move to the right and the same player gets to do the move again.
- Skipping over a coin
  - An error message appears, telling the player that they are not allowed to skip over a coin and the same player gets to do the move again.
- Select a square that is out of bound of the grid
  - An error message appears, telling and asking the same player to try again.

This shows how the game rejects any invalid move and asks the same player again until it gets a valid move and switch to another player.

### Removing the coin

[Evidence of player removing the silver coin](https://mywaimeaschool-my.sharepoint.com/:v:/g/personal/mtangitcharoen_waimea_school_nz/Eaj3-MsJKcBKpdzncudWlhUBcPyJPITrPyxuymG09MiorA?e=bhb59P&nav=eyJwbGF5YmFja09wdGlvbnMiOnt9LCJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbE1vZGUiOiJtaXMiLCJyZWZlcnJhbFZpZXciOiJwb3N0cm9sbC1jb3B5bGluayIsInJlZmVycmFsUGxheWJhY2tTZXNzaW9uSWQiOiIyZTIzZTFjYi1iNjYzLTRjZTMtYTNjMi04NGJiZGQ0MTMwNDEifX0%3D)

When the player selects the furthest left square of the grid and presses enter, the coin is removed from the grid.

### Winning case (removing the gold coin

[Checking for the winner](https://mywaimeaschool-my.sharepoint.com/:v:/g/personal/mtangitcharoen_waimea_school_nz/EeAFShPekBVEpRU_bPgWvj8B5kFVDsdW3OA8M9HcR-JxkQ?e=rLTk4p&nav=eyJwbGF5YmFja09wdGlvbnMiOnt9LCJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJTdHJlYW1XZWJBcHAiLCJyZWZlcnJhbE1vZGUiOiJtaXMiLCJyZWZlcnJhbFZpZXciOiJwb3N0cm9sbC1jb3B5bGluayIsInJlZmVycmFsUGxheWJhY2tTZXNzaW9uSWQiOiJhZjYzMjgxZi05NGIyLTQzMDMtYWM0OC0wMzJjODAwOGI0MjIifX0%3D)

In the video, "jess" was the person to remove the gold coin from the grid, so the game congratulated "jess" for being the winner. If the winner is "mimi", the game
will congratulate "mimi" instead. The game is able to identify the winner. The "Press enter to start again", will reset everything and starts from the beginning again.