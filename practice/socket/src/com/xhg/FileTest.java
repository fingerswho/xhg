package com.xhg;

import java.io.File;

public class FileTest {
    public static void main(String[] args) {
        File file = new File("d://xhg");
        if(file.exists()){
            String name = file.getName();
            System.out.println(name);
        }else{
            System.out.println("改文件不存在");
            file.mkdir();
        }


    }

}
