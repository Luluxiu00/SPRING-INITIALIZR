package com.example.web;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by 326944 on 2017/7/5.
 */
public class Demo {
    public static void main(String[] args) throws IOException {
        //ByteArrayOutputStream:    可以捕获内存缓冲区的数据，转换成字节数组。
        ByteArrayOutputStream bout=new ByteArrayOutputStream();
        bout.write(1);
        bout.write(2);
        bout.write(3);
        byte[] buf =bout.toByteArray();//获取内存缓冲中的数据

        for(int i=0;i<buf.length;i++)
        {
            System.out.println(buf[i]);
        }
        bout.close();
        //注：通过调用reset（）方法可以重新定位。
        //ByteArrayInputStream: 可以将字节数组转化为输入流
        ByteArrayInputStream bin=new ByteArrayInputStream(buf);
        int b ;
        while( (b=bin.read())!=-1)
        {
            System.out.println(b);
        }
        bin.close();
    }
}
