// Group Members: Kevin Leuthold, Adam Lopes, Adam Sanchez, Andres Garcia
// 10/8/2024
// CPSC-39-10111

import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class ScrabbleGame {
    

    public static void main(String args[]){
        ArrayList<String> words = new ArrayList<String>
        try{
            File wordList = new File("CollinsScrabbleWords_2019.txt");
            Scanner readFile = new Scanner(wordList);
            
            while(wordList.hasNextLine){
                words.add(readFile.nextLine());
            }
            
            words.remove(0);            
            words.remove(0);
            readFile.close
        }

    
    public static String randomCharacters(String word) {
        Random random = new Random();
        String charsRandom = "";

        for (int i = 00; i < 4; i++) {
            charsRandom = 
        }
    }
    
    
    public void startGame(){
        
        System.out.println("Your characters are: " + String.valueOf(charsRandom));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word made from these letters: ");
        String userWord = scanner.nextLine().toLowerCase();
            
        Word wordToCheck = new Word(userWord);
        if (binarySearch(words, wordToCheck) >= 0) {
            System.out.println("Valid word: " + userWord);
        } else {
            System.out.println("Invalid word: " + userWord);
        }
    }

    // Binary Search Algorithm
    private int binarySearch(ArrayList<Word> words, Word target) {
        int left = 0;
        int right = words.size() - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            int comparison = words.get(mid).compareTo(target);
            if (comparison == 0) {
                return mid; // Found the word
            } else if (comparison < 0) {
                left = mid + 1; // Search right
            } else {
                right = mid - 1; // Search left
            }
        }
        return -1; // Not found
    }

// calc point
private int calculatePoints(String word) {
    length = word.length(); 
    if (length == 4) {
        return 10;
    } else if (lenght)== 3
 {
        return 5; 
    } else if (length == 2){
        return 2; 
    } else {
        return 0; 
    }    

    
 }

    

                          
