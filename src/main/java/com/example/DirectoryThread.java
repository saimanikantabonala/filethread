package com.example;

import java.io.File;

public class DirectoryThread extends Thread {
    private String filePath;
    public DirectoryThread(String f){
        this.filePath = f;
    }

    @Override
    public void run() {
        File dir = new File(filePath);
        File[] files = dir.listFiles();
        if(files!=null) {
            for (File file : files) {
                if (file.isFile()) {
                    System.out.println("File : " + file.getName());
                } else if (file.isDirectory()) {
                    System.out.println("Directory : " + file.getName());
                    DirectoryThread subDirectoryThread = new DirectoryThread(file.getAbsolutePath());
                    subDirectoryThread.start();
                }
            }
        }
    }

}
