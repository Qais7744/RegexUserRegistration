package com.bl.userRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean phoneNumber() {
        boolean matchesString = Pattern.matches("^[0-9]{2}[ ][789]{1}[0-9]{9}$", "91 7744918893");
        return matchesString;
    }
}
