package com.lam.mathematics.encryption;

/**
 * Class for encrypting and decrypting a message using a one char.
 *
 * Improvements needed: encrypt using a word of any length.
 */
public class ShiftCipher {
    // 26 letters for the Engish alphabet.
    public static final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    private String message;
    private String encrypted;

    public static int readKey(char key) {
        return (key - 'a');
    }

    public ShiftCipher() {
    }

    public ShiftCipher(String message) {
        this.message = message.toLowerCase();
    }

    public void setMessage(String message) {
        this.message = message.toLowerCase();
    }

    public String encrypt(char key) {
        int keyShift = readKey(key);

        return encrypt(keyShift);
    }

    public String encrypt(int keyShift) {
        StringBuilder builder = new StringBuilder();

        for (char aChar : this.message.toCharArray()) {
            builder.append(encrytp(aChar, keyShift));
        }

        return builder.toString();
    }

    public String decrypt(char key) {
        int keyShift = readKey(key);

        return decrypt(keyShift);
    }

    public String decrypt(int keyShift) {
        StringBuilder builder = new StringBuilder();

        for (char aChar : this.message.toCharArray()) {
            builder.append(decrytp(aChar, keyShift));
        }

        return builder.toString();
    }

    public static char encrypt(char aChar, char key) {
        int keyShift = readKey(key);

        return encrytp(aChar, keyShift);
    }

    public static char encrytp(char aChar, int keyShift) {
        return  encrytpDecrypt(aChar, keyShift, true);
    }

    public static char encrytpDecrypt(char aChar, int keyShift, boolean encrypt) {
        int letterPos = aChar - 'a';

        keyShift = (encrypt == true) ? keyShift : -keyShift;

        int shift = Math.floorMod((letterPos + keyShift) ,  ALPHABET.length());
        return  ALPHABET.toCharArray()[shift];
    }

    public static char decrypt(char aChar, char key) {
        int keyShift = readKey(key);
        return decrytp(aChar, keyShift);
    }

    public static char decrytp(char aChar, int keyShift) {
        return  encrytpDecrypt(aChar, keyShift, false);
    }

    public static void main(String[] args) {
        String message  = "khan";
        ShiftCipher cipher = new ShiftCipher(message);
        System.out.println(cipher.encrypt(19));

         message  = "datg";
        ShiftCipher cipher_2 = new ShiftCipher(message);
        System.out.println(cipher_2.decrypt(19));

    }

}
