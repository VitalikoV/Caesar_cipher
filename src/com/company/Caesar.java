package com.company;

public class Caesar {


    private String alphabet = "abcdefghijklmnopqrstuvwxyzabcdefghijklmnopqrstuvwxyz";
    private StringBuilder cipheredWord = new StringBuilder();
    private char letter, cipheredLetter;
    private int newPosition;

    public StringBuilder cipher(String word, int key){
        creatingNewWord(word, key);
        return cipheredWord;
    }





    private void creatingNewWord(String word, int key){
        word = word.toLowerCase();
        for (int i = 0; i<word.length(); i++) {
            findCharInWord(i, word);
            checking(key);
        }
    }




    private void checking(int key){
        if (letter == ' '){
            cipheredWord.append(" ");
        }else {
            addNewChar(key);
        }
    }




    private void addNewChar(int key){
        findNewPosition();
        findNewChar(newPosition, key);
        appendToNewWord(cipheredLetter);
    }




    private void findCharInWord(int i, String word){
        letter = word.charAt(i);
    }


    private void findNewPosition(){
        newPosition = alphabet.indexOf(letter);
    }


    private void findNewChar(int newPosition, int key){
        cipheredLetter = alphabet.charAt(newPosition + key);
    }


    private void appendToNewWord(char cipheredletter){
        cipheredWord.append(cipheredletter);
    }

}
