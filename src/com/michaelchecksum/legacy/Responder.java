package com.michaelchecksum.legacy;

public class Responder implements FileEventListener{
    @Override
    public void fileDiscovered() {
        System.out.println("hoi");
    }
}