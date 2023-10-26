public class ReverseString {
    public static String stringReverse(String s){
        char[] charsArray = s.toCharArray();
        int i = 0;
        int j = charsArray.length-1;
        while(i<j){
            char temp = charsArray[i];
            charsArray[i] = charsArray[j];
            charsArray[j] = temp;
            i++;
            j--;

        }
        return new String(charsArray);
    }

    public static void main(String[] args) {
        String str = "hello, welcome";
        String s = stringReverse(str);
        System.out.println("Print Reverse: " + s);
    }
}
