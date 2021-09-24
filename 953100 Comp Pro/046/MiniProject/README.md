# Blackjack
A game of Blackjack using `javax.swing` and `java.awt`. the source code might not be exactly clean since it's my first time using any of these.

## How to play
The dealer will draw 2 cards for each of the players (which is only you and the dealer in this case).
The dealer will have one of their card hidden.

### The goal
The goal is to have higher cards value than the dealer, which will result in a win.
But here's the catch, if you go over 21 then your hand is busted (in which you will automatically lose).

There are 2 things you can do: (Different from the real game techniques which involves betting)
Stand: This will forfeit you from drawing in this round and go straight to dealer's play.
Draw: This will draw you another card which may or may not help you.

#### Natural Blackjack
If your first 2 cards are Ace and card with value of 10 (10, Jack, Queen, King) then you will achieve what is called a *Natural Blackjack*.
This will result in an automatic win if the dealer doesn't also have a *Natural Blackjack*.

#### Blackjack
If your cards add up to 21 then you will achieve what is called a *Blackjack* and the round will go straight into dealer's play.
This will often times result in a win unless the dealer gets a Blackjack then it's a draw or lose if the dealer has a *Natural Blackjack*.

### Dealer's play
After your play is done it's time for the dealer to shine.
The first thing that he will do is to reveal his hidden card.
The dealer will try their best to win or draw against you.

### Conclusion
After both parties' plays have been concluded. 
The side with more value on their hand will win if it's not a bust.
If it's equal then it's a draw in exception of *Blackjack* and *Natural Blackjack* then the result is mentioned above.



Also check out [Kan's mini project](https://github.com/hoshizaki-iori/compro_java_mini_project)
