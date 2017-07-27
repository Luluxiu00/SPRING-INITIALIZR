package com.example.web;

import java.io.*;
import java.util.Arrays;

/**
 * Created by 326944 on 2017/7/5.
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream bout = new ByteArrayOutputStream();
        DataOutputStream dos = new DataOutputStream(bout);
        String name = "suntao";
        int age = 19;
        dos.writeUTF(name);
        dos.writeInt(age);
        byte[] buf = bout.toByteArray();//获取内存缓冲区中的数据
        System.out.println(Arrays.toString(buf));
        dos.close();
        bout.close();

        ByteArrayInputStream bin = new ByteArrayInputStream(buf);
        DataInputStream dis = new DataInputStream(bin);
        String name2 = dis.readUTF();//从字节数组中读取
        int age2 = dis.readInt();
        System.out.println(name2);
        System.out.println(age2);
        dis.close();
        bin.close();
    }
}
