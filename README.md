# cave-sprint-3
Stubs and give-aways for Sprint 3 of the Cave Game (TIG059)

# Suggested work-flow
## Start by writing (finishing) the RoomRule class
We have provided you with a stub for the RoomRule class, with some pieces missing.

If you want to try and write the whole thing from scratch, just remove our RoomRule.java file.

_se.itu.game.cave.RoomRule_

The above means that RoomRule is an abstract class.

### Add instance variables
Add an instance variable for storing the Room reference of the RoomRule. You may use the following UML as an inspiration:
```
#room : Room
```

Add an instance variable for storing the creature description (e.g. "There's a snake here"). You may use the following UML as an inspiration:
```
#creatureDescription : String

### Write/finish the methods and constructor
#### Constuctor
For the constructor, you may use the following UML as an inspiration:
```
<<constructor>>
+RoomRule(room : Room, creatureDescription : String)
```

Optionally, you may choose to make the constructor protected. For an abstract class, it doesn't matter whether it is public or protected - can you see why?

In the body of the constructor, make sure that this RoomRule (being initialized by the constuctor) stores the arguments in its instance variables.
#### apply() method
Write (or finish) the abstract method apply(). An abstract method has the abstract keyword and uses a semicolon instead of the curly braces where the method body usually is.

_apply() : void_
#### changeCreatureDescription
UML:
```
changeCreatureDescription(newDescription : String) : void
```
This method is concrete and should change the creatureDescription instance variable.
#### creatureDescription
```
+creatureDescription() : String
```
This method should do two things:
1. call apply()
2. return the creatureDescription for this RoomRule (which might have been changed by the apply() method)

Note that this is a concrete method with an actual method body which contains the two statements listed above. It might be interesting for you to see that it is possible for a concrete method in an abstract class to call an abstract method. Can you explain why this is legal? Such methods (concrete methods calling abstract methods) are sometimes called virtual methods.
