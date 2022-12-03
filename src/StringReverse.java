import java.util.Arrays;

public class StringReverse {
    public static void main(String[] args) {
        String s = "abcdefg";
        char[] ch = s.toCharArray();
        int start = 0;
        int end = ch.length-1;
        while(start<=end){
            char a = ch[start];
            ch[start]=ch[end];
            ch[end]=a;
            start++;
            end--;
        }
        String s1 =new String(ch);
//        for (char c : ch) {
//            s1+=c;
//
//        }
        System.out.println(s1);
    }

}
