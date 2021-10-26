package com.bl.userRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean passwordUpperCase() {
        boolean matchesString = Pattern.matches("^[A-Z{1}a-z]{8}$", "aLtamash");
        return matchesString;
    }
}
