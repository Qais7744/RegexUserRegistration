package com.bl.userRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean password() {
        boolean matchesString = Pattern.matches("^[a-z]{8}$", "altamash");
        return matchesString;
    }
}
