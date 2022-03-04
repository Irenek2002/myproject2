package com.irene;

public class ScoringNG {
    public static void main(String[] args) {
        String[] name = {"jerry", "tonny", "wendy", "henry", "penny"};
        int[] english = {80, 85, 90, 95, 98};
        int[] math = {75, 70, 77, 80, 88};
        for (int i = 0; i < 5; i++) {
            System.out.println(name[i] + "\t" + english[i] + "\t" + math[i] + "\t" + ((english[i] + math[i]) / 2));
        }
    }
}
