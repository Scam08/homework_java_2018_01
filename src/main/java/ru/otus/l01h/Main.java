package ru.otus.l01h;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import org.apache.commons.codec.digest.DigestUtils;
import org.joda.time.LocalTime;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        LocalTime currentTime = new LocalTime();
        System.out.println("The current local time is: " + currentTime);

        String content = Files.toString(new File("text.txt"),Charsets.UTF_8);
        System.out.println(content);
        System.out.println("Apache MD5:");
        System.out.println(md5Apache(content));
    }
    public static String md5Apache(String st){
        String md5Hex = DigestUtils.md5Hex(st);
        return md5Hex;
    }
}
