package com.bl.userRegistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    private Assertions Assert;

    @Test
    public void givenPassword_WhenUpperCase_ShouldReturnTrue() {
        UserRegistration userRegistration = new UserRegistration();
        boolean userTest = userRegistration.passwordUpperCase();
        Assert.assertTrue(userTest);
    }
}
