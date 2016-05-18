package com.lam.mathematics;

import com.lam.mathematics.encryption.ShiftCipher;
import org.hamcrest.CoreMatchers;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ShiftCipherTest {
    ShiftCipher cipher;

    @Before
    public void setUp() {
        cipher = new ShiftCipher();
    }

    @After
    public void tearDown() {
        cipher  = null;
    }

    @Test
    public void testAssertData() {
        cipher.setMessage("khan");
        Assert.assertThat("Should be the same.", cipher.encrypt(19), CoreMatchers.is("datg"));
        cipher.setMessage("datg");
        Assert.assertThat("Should be the same.", cipher.decrypt(19), CoreMatchers.is("khan"));
    }
}
