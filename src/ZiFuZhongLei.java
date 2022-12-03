import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ZiFuZhongLei {
    public static void main(String[] args) {
        String s ="yekmaakkcceekymbvb";
        char[] ch = s.toCharArray();
        Map <Character,Integer> map= new HashMap();

        for(int i = 0;i<ch.length;i++){

            if(!map.containsKey(ch[i])){
                map.put(ch[i],1);
            }else{
            int num = map.get(ch[i]);
            num++;
            map.put(ch[i],num);
            }
        }

        System.out.println(map);
//        for (Character o : map.keySet()) {
//
//        }
        File file = new File("D:\\test.txt");
        OutputStream os = null;
        InputStream is = null;

        try {

            os = new FileOutputStream(file);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            os.write(Arrays.toString(map.entrySet().toArray()).getBytes());
            is = new FileInputStream(file);
            byte[] by = new byte[100];
            int len = 0;
            while((len= is.read(by))!=-1){
//                for (byte b : by) {
//                    if(b!=0){
//                    System.out.print((char)b+"");
//                }}
                System.out.println(new String(by,0,len));
            }

        } catch (IOException e) {
            e.printStackTrace();
        }



    }

}
