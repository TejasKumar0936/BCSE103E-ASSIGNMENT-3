import java.util.StringTokenizer;
class J0801_1{
    public static void main(String[] args){
        StringTokenizer st = new StringTokenizer("My name is Tejas Kumar"," ");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}