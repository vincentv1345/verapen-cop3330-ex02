package org.example;
import java.io.*;
public class StringLength {
    public String count(String name){
        int length = name.length();
        return String.format(name+ " has " + length + " characters.");
    }
}
