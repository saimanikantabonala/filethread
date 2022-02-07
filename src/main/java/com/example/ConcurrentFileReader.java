package com.example;


public class ConcurrentFileReader {
    public static void main(String[] args) throws InterruptedException {
        DirectoryThread directoryThread = new DirectoryThread("/home/manikantab_500260/IdeaProjects/filethread");
        directoryThread.start();
    }

}
