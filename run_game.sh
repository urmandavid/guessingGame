#!/bin/bash

echo $USER"s program"
mkdir $USER"_labb"
cp Guesser.java GuessingGame.java $USER"_labb"
cd $USER"_labb"
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

