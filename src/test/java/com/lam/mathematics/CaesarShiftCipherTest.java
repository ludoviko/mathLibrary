package com.lam.mathematics;

import com.lam.mathematics.encryption.CaesarShiftCipher;
import com.lam.utilString.Reverse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


@RunWith(Parameterized.class)
public class CaesarShiftCipherTest {
    private String string;
    private int shift;
    private String expected;

    public CaesarShiftCipherTest(String string, int shift,  String expected) {
        this.string = string;
        this.shift = shift;
        this.expected = expected;
    }

    @Test(timeout=3000)
    public void test() {
        CaesarShiftCipher caesarShiftCipher = new CaesarShiftCipher(string, shift);
        caesarShiftCipher.encrypt();
        assertThat(  caesarShiftCipher.getEncrypted(), is(expected));
    }

    @Parameterized.Parameters(name = " {index}: CaesarShiftCipher.encrypt( {0}, {1} ) = {2} ")
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][] {
                {"VENI VIDI VICI", new Integer("3"),  "yhql ylgl ylfl"},
                {"EVEN YOU BRUTUS", new Integer("3"),  "hyhq brx euxwxv"},
        });
    };
}

