package com.goit.gojavaonline;

import java.io.FileNotFoundException;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        String text = FileManager.readFromFile("fileForReading.txt");
        System.out.println(text);
        FileManager.writeToFile("fileForWritting.txt", EncryptionUtility.encryptString(text).toString());
    }
}
