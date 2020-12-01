package com.techreturners.exercise001;

import java.util.ArrayList;
import java.util.List;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Exercise001 {
    public String capitalizeWord(String word) {
        if (Character.isUpperCase(word.charAt(0))) return word;
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return firstName.charAt(0) + "." + lastName.charAt(0);
    }

    public double addVat(double originalPrice, double vatRate) {
        Double totalPrice = originalPrice + originalPrice * vatRate / 100;
        BigDecimal bd = new BigDecimal(Double.toString(totalPrice));
	    bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public String reverse(String sentence) {
        StringBuilder sentenceReverse = new StringBuilder();
        sentenceReverse.append(sentence);
        return sentenceReverse.reverse() + "";
    }

    public int countLinuxUsers(List<User> users) {
        List<User> linuxUsers = new ArrayList<User>();
        for (User user : users) {
            if (user.getType() == "Linux") {
                linuxUsers.add(user);
            } 
        }
        return linuxUsers.size();
    }
}
