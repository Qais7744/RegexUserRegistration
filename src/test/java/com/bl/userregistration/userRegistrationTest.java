package com.bl.userregistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class userRegistrationTest {
    private Assertions Assert;

    @Test
    public void givenPassword_WhenOneNumeric_ShouldReturnTrue() {
        userRegistration userRegistration = new userRegistration();
        boolean userTest = userRegistration.passwordOneNumeric();
        Assert.assertTrue(userTest);
    }
}
