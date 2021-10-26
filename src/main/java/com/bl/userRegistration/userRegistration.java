package com.bl.userRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userRegistration {

    public boolean firstName() {
        boolean matchesString = Pattern.matches("^[A-Z]{1}[a-zA-Z]{3,10}$", "AltamashBagwan");
        return matchesString;
    }
}
