package com.bl.userRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userRegistration {

    public boolean lastName() {
        boolean matchesString = Pattern.matches("^[A-Z]{1}[a-zA-Z]{3,10}$", "Bagwan");
        return matchesString;
    }
}
