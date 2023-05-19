package util;

import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class CodeTransform {
    static String mykey="www.baidu.com";
    public static void test(String st1){
        char[] arr1=st1.toCharArray();
        for(int i=0;i<arr1.length;i++){
            System.out.println((int)arr1[i]);
        }
    }
    //编码
     public static String getBase64Encode(String sourceStr){
         BASE64Encoder en = new BASE64Encoder();
         byte[] keyByte=mykey.getBytes();
         int mxLength =keyByte.length, curPosition =0;
         byte b1;
        if(sourceStr==null || "".equals(sourceStr)){
            return "";
        }
        try{
            byte[] bt=sourceStr.getBytes("UTF-8");
            for(int i=0;i<bt.length;i++){
              b1=keyByte[curPosition];
              curPosition= (curPosition>=mxLength)?0:curPosition++;
              bt[i]= (byte) (b1-bt[i]);
            }
               sourceStr=en.encode(bt);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return sourceStr;
    }
    //解码
    public static String getMyDeconde(String str0) throws IOException {
        BASE64Decoder de =new BASE64Decoder();
        byte[] keyByte=mykey.getBytes();
        int mxLength =keyByte.length, curPosition =0;
        byte b1;
        byte[] bt=de.decodeBuffer(str0);
        for(int i=0;i<bt.length;i++){
            b1=keyByte[curPosition];
            curPosition= (curPosition>=mxLength)?0:curPosition++;
            bt[i]= (byte) (b1-bt[i]);
         }
       String str1=new String(bt);
        return str1;
    }
}
