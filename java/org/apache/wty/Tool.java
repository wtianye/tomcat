package org.apache.wty;

public class Tool {
    //Properties采用的是ISO5589-1编码，读取中文时乱码，所以要转化一下
    public static String shiftISO55891StringToUTF8(String s) {
        byte[] bytes = new byte[s.length()];
        for (int i = 0; i < s.length(); i++) {
            int a = s.charAt(i);
            byte b = (byte) a;
            bytes[i] = b;
        }
        return new String(bytes);
    }
}
