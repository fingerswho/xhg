package com.xhg;

import java.io.*;

public class FileCopy {

    public static void main(String[] args) throws IOException {
        // makeDir();
        long start = System.currentTimeMillis();

        copyFile();
        long stop = System.currentTimeMillis();
        System.out.println(stop-start+"s");

    }

    public static void makeDir() {
        File file = new File("d://download");
        if (!file.exists()) {
            System.out.println("文件不存在");
            file.mkdir();

        }

    }

    public static void copyFile() throws IOException {
        File file = new File("e://upload//1.wmv");
        FileInputStream fis = new FileInputStream(file);
        File fileCopy = new File("d://download//copy1.wmv");
        FileOutputStream fos = new FileOutputStream(fileCopy);
        int len = 0;
        byte[] bytes = new byte[1024*8];
        while((len=fis.read(bytes)) != -1){
            System.out.println(len);
            fos.write(bytes,0,len);
        }

        fis.close();
        fos.close();


    }

}
