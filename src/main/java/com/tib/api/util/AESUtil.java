package com.tib.api.util;

import javax.crypto.spec.IvParameterSpec;
import java.security.SecureRandom;

public class AESUtil {
    public static IvParameterSpec generateIv() {
        byte[] iv = new byte[16];
        new SecureRandom().nextBytes(iv);
        return new IvParameterSpec(iv);

    }
}
