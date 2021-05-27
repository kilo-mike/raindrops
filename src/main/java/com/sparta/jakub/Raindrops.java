package com.sparta.jakub;

public class Raindrops {
    public String plingPlangPlong(int number) {

        StringBuilder outputBuilder = new StringBuilder();

        if (number % 3 == 0) {
            outputBuilder.append("Pling");
        }
        if (number % 5 == 0) {
            outputBuilder.append("Plang");
        }
        if (number % 7 == 0) {
            outputBuilder.append("Plong");
        }
        if (number == 0 || outputBuilder.length() == 0){
            return Integer.toString(number);
        }

        return outputBuilder.toString();
    }
}
