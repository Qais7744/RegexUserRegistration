package com.bl.userregistration;

import java.util.regex.Pattern;

public class userRegistration {

    public boolean passwordOneNumeric() {
        boolean matchesString = Pattern.matches("^[A-Z0-9a-z]{7}[~!@#$%^&*()_+{}:;]{1}$", "As9kmaf&");
        return matchesString;
    }
}
