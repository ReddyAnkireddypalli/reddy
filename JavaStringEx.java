package com.strings;

import java.util.ArrayList;
import java.util.List;


public class JavaStringEx {

    public List<String> printNewLine(String line, int limit) {

        String[] words = line.split(" ");
        List<String> listOfLines = new ArrayList<>();

        StringBuilder printLine = new StringBuilder(words[0]);

        for (int i = 1; i < words.length; i++) {

            if( (printLine.toString() + words[i]).length() < limit){
                printLine.append(" ").append(words[i]);
                continue;
            }

            listOfLines.add(printLine.toString());
            printLine = new StringBuilder();
            printLine.append(words[i]);
        }
        listOfLines.add(printLine.toString());
        return listOfLines;
    }
}
