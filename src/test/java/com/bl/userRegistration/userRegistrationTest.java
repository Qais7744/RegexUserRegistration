package com.bl.userRegistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class userRegistrationTest {
    private Assertions Assert;

    @Test
    public void givenEmailWhenShouldReturnTrue() {
        userRegistration userRegistration = new userRegistration();
        boolean userTest = userRegistration.email();
        Assert.assertTrue(userTest);
    }
}
