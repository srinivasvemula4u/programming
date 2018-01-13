/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRank.Practice.BinarySearchTrees;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author srivemul
 */
class Hangman {

    String mysteryWord;
    StringBuilder currentGuess;
    ArrayList<Character> previousGuesses = new ArrayList<>();
    int maxTries = 6;
    int currentTry = 0;
    ArrayList<String> dictionary = new ArrayList<>();
    private static FileReader fileReader;
    private static BufferedReader bufferedFileReader;

    public Hangman() throws FileNotFoundException, IOException {
        intializeStreams();
        mysteryWord = pickWord();
        currentGuess = intializeCurrentGuess();
    }

    private void intializeStreams() throws FileNotFoundException, IOException {
        try {
            File inFile = new File("dictionary.txt");
            fileReader = new FileReader(inFile);
            bufferedFileReader = new BufferedReader(fileReader);
            String currentLine = bufferedFileReader.readLine();
            while (currentLine != null) {
                dictionary.add(currentLine);
                currentLine = bufferedFileReader.readLine();
            }
            bufferedFileReader.close();
            fileReader.close();
        } catch (IOException e) {
            System.out.println("Could not init streams");
        }
    }

    private String pickWord() {
        Random random = new Random();
        return dictionary.get(Math.abs(random.nextInt()) % dictionary.size());
    }

    private StringBuilder intializeCurrentGuess() {
        StringBuilder current = new StringBuilder();
        for (int i = 0; i < mysteryWord.length() * 2; i++) {
            if (i % 2 == 0) {
                current.append("_");
            } else {
                current.append(" ");
            }
        }
        return current;
    }
    // _ _ A _ _ B

    public String getFormalCurrentGuess() {
        return "Current Guess: " + currentGuess.toString();
    }

    boolean isGuessedAlready(char guess) {
        return previousGuesses.contains(guess);

    }

    boolean playGuess(char guess) {
        boolean isItAGoodGuess = false;
        previousGuesses.add(guess);
        for (int i = 0; i < mysteryWord.length(); i++) {
            if (mysteryWord.charAt(i) == guess) {
                currentGuess.setCharAt(i * 2, guess);
                isItAGoodGuess = true;
            }
        }

        if (!isItAGoodGuess) {
            currentTry++;
        }

        return isItAGoodGuess;
    }

    boolean gameOver() {
        if (didWeWin()) {
            System.out.println();
            System.out.println("Congrats! You won! You guessed the right word!");
            return true;
        } else if (didWeLose()) {
            System.out.println();
            System.out.println("Sorry, you lost. You spent all of your 6 tries. "
                    + "The word was " + mysteryWord + ".");
            return true;
        }
        return false;
    }

    public boolean didWeLose() {
        return currentTry >= maxTries;
    }

    public boolean didWeWin() {
        String guess = getCondensedCurrentGuess();
        return guess.equals(mysteryWord);
    }

    public String getCondensedCurrentGuess() {
        String guess = currentGuess.toString();
        return guess.replace(" ", "");
    }

    // " - - - - -\n"+
    // "|        |\n"+
    // "|        O\n" +
    // "|      / | \\ \n"+
    // "|        |\n" +
    // "|       / \\ \n" +
    // "|\n" +
    // "|\n";
    public String drawPicture() {
        switch (currentTry) {
            case 0:
                return noPersonDraw();
            case 1:
                return addHeadDraw();
            case 2:
                return addBodyDraw();
            case 3:
                return addOneArmDraw();
            case 4:
                return addSecondArmDraw();
            case 5:
                return addFirstLegDraw();
            default:
                return fullPersonDraw();
        }

    }

    private String noPersonDraw() {
        return " - - - - -\n"
                + "|        |\n"
                + "|        \n"
                + "|       \n"
                + "|        \n"
                + "|       \n"
                + "|\n"
                + "|\n";
    }

    private String addHeadDraw() {
        return " - - - - -\n"
                + "|        |\n"
                + "|        O\n"
                + "|       \n"
                + "|        \n"
                + "|       \n"
                + "|\n"
                + "|\n";
    }

    private String addBodyDraw() {
        return " - - - - -\n"
                + "|        |\n"
                + "|        O\n"
                + "|        | \n"
                + "|        |\n"
                + "|        \n"
                + "|\n"
                + "|\n";
    }

    private String addOneArmDraw() {
        return " - - - - -\n"
                + "|        |\n"
                + "|        O\n"
                + "|      / |  \n"
                + "|        |\n"
                + "|        \n"
                + "|\n"
                + "|\n";
    }

    private String addSecondArmDraw() {
        return " - - - - -\n"
                + "|        |\n"
                + "|        O\n"
                + "|      / | \\ \n"
                + "|        |\n"
                + "|        \n"
                + "|\n"
                + "|\n";
    }

    private String addFirstLegDraw() {
        return " - - - - -\n"
                + "|        |\n"
                + "|        O\n"
                + "|      / | \\ \n"
                + "|        |\n"
                + "|       / \n"
                + "|\n"
                + "|\n";
    }

    private String fullPersonDraw() {
        return " - - - - -\n"
                + "|        |\n"
                + "|        O\n"
                + "|      / | \\ \n"
                + "|        |\n"
                + "|       / \\ \n"
                + "|\n"
                + "|\n";
    }

   

}
