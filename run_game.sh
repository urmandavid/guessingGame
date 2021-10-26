#!/bin/bash

echo "David_Urmans program"
mkdir "David_Urman_labb"
cp Guesser.java GuessingGame.java "David_Urman_labb"
cd "David_Urman_labb"
echo -n "Running game from "
pwd

echo "compiling..."
javac *.java
echo "running..."
java GuessingGame
#running GuessingGame.java
echo "Done!"

echo "Removing class files..."
rm *.class
ls
