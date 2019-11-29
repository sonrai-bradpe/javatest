package com.thisisnoble.javatest.util;

import java.util.UUID;

public class IdGenerator {

    public static String generate() {
        System.out.println("This is a test");
        return UUID.randomUUID().toString();
    }
}
