package Day5;

public class ReverseString {
    public static void main(String[] args) {
        String s = "ANANTH";
        String x="";
        int end=s.length()-1;

        while (0<=end) {
            x += s.charAt(end);
            end--;

            
        }

        System.out.println(x);

    }
}
