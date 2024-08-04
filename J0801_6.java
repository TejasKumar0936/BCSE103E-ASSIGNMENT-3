import java.util.StringTokenizer;
class J0801_6{
    public static void main(String[] args){
        StringTokenizer st = new StringTokenizer("Example text for program" , " ");
        System.out.println("Total number of Tokens: " + st.countTokens());
    }
}