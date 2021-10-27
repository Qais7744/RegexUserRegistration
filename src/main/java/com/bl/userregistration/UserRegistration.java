package com.bl.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {

    public boolean passwordSpecialCharacter() {
        boolean matchesString = Pattern.matches("^([~!@#$%^&*()+{}]?[A-Za-z0-9]){8,}$", "AKtamashBagwan&744");
        return matchesString;
    }
}
