/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Random;

/**
 *
 * @author Milani
 */
public class Words {

    private String[] randomWords = {"animals", "happiness", "indefinite", "steady", "birthday", "extreme", "rights", "properties",
        "ceremony", "independent", "beneath", "information", "students", "employee"};

    private String selectedWord;
    private Random random = new Random();
    private char[] letters;

    public Words() {
        selectedWord = randomWords[random.nextInt(randomWords.length)];
        letters = new char[selectedWord.length()];
    }

    public String toString() {

        StringBuilder text = new StringBuilder();

        for (char letter : letters) {
            
            text.append(letter == '\u0000' ? '-':letter);
           
            text.append(' ');
        }
        return text.toString();
    }
    
    public boolean isGuessedRight(){
        for(char letter:letters){
            if(letter=='\u0000'){
                return false;
            }
        }
        return true;
    }

    public boolean guess(char letter) {
        
        boolean guessedRight=false;
        
        for(int i=0;i<selectedWord.length();i++){
            if(letter==selectedWord.charAt(i)){
                letters[i]=letter;
                guessedRight=true;
            }
        }
        return guessedRight;
    }

}
