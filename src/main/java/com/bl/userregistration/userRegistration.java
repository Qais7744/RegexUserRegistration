package com.bl.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    public boolean passwordOneNumeric() {
        boolean matchesString = Pattern.matches("^[A-Z{1}0-9{1}a-z]{8}$", "Al9amash");
        return matchesString;
    }
}
