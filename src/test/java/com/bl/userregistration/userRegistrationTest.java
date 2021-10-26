package com.bl.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class userRegistrationTest {
    private Assertions Assert;

    @Test
    public void givenPassword_WhenSpecialCharacter_ShouldReturnTrue() {
        userRegistration userRegistration = new userRegistration();
        boolean userTest = userRegistration.passwordSpecialCharacter();
        Assert.assertTrue(userTest);
    }
}
