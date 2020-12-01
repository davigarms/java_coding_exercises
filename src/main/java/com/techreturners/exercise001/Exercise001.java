package com.techreturners.exercise001;

import java.util.ArrayList;
import java.util.List;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        if (Character.isUpperCase(word.charAt(0))) return word;
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        return firstName.charAt(0) + "." + lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        Double totalPrice = originalPrice + originalPrice * vatRate / 100;
        BigDecimal bd = new BigDecimal(Double.toString(totalPrice));
	    bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public String reverse(String sentence) {
        // Add your code here
        StringBuilder sentenceReverse = new StringBuilder();
        sentenceReverse.append(sentence);
        return sentenceReverse.reverse() + "";
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        List<User> linuxUsers = new ArrayList<User>();
        for (User user : users) {
            if (user.getType() == "Linux") {
                linuxUsers.add(user);
            } 
        }
        return linuxUsers.size();
    }
}
