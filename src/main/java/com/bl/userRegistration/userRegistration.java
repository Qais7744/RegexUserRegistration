package com.bl.userRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class userRegistration {

    public boolean passwordUpperCase() {
        boolean matchesString = Pattern.matches("^[A-Z{1}0-9{1}a-z]{8}$", "Al9amash");
        return matchesString;
    }
}
