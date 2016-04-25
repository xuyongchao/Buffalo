package com.buffalo.extend.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * Created by ChrisChen on 2015/10/31.
 */
public class Md5 {

    public static String ecodeByMD5(String originstr) {

        String result = null;

        char hexDigits[] = {
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        if (originstr != null) {
            try {
                MessageDigest md = MessageDigest.getInstance("MD5");
                byte[] source = originstr.getBytes("utf-8");
                md.update(source);
                byte[] tmp = md.digest();
                char[] str = new char[32];
                for (int i = 0, j = 0; i < 16; i++) {
                    byte b = tmp[i];
                    str[j++] = hexDigits[b >>> 4 & 0xf];
                    str[j++] = hexDigits[b & 0xf];
                }
                result = new String(str);
            } catch (NoSuchAlgorithmException e) {
                e.printStackTrace();
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }
        return result;
    }
}
