package com.bl.userRegistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class userRegistrationTest {
    private Assertions Assert;

    @Test
    public void givenPhoneNumberWhenShouldReturnTrue() {
        userRegistration userRegistration = new userRegistration();
        boolean userTest = userRegistration.phoneNumber();
        Assert.assertTrue(userTest);
    }
}
