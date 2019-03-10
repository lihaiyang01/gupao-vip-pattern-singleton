package com.gupao.vip.pattern.singleton.test;

import com.gupao.vip.pattern.singleton.lazy.SeriableSingleton;
import org.junit.Test;

import java.io.*;

public class SeriableSingletonTest {

    @Test
    public void testSeriableSingleton() {

        SeriableSingleton instance = SeriableSingleton.getInstance();
        System.out.println(instance);
        FileOutputStream fos = null;
        ObjectOutputStream oos = null;
        FileInputStream fis = null;
        ObjectInputStream ois = null;
        try {
            //序列化，将对象持久化到磁盘
            fos = new FileOutputStream("SeriableSingleton.instance");
            oos = new ObjectOutputStream(fos);
            oos.writeObject(instance);

            //反序列化 从磁盘中读出对象
            //在转换过程中会重新创建对象 new
            fis = new FileInputStream("SeriableSingleton.instance");
            ois = new ObjectInputStream(fis);
            SeriableSingleton instance1 = (SeriableSingleton)ois.readObject();
            System.out.println(instance1);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (ois != null) {
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
