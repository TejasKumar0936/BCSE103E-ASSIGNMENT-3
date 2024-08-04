import java.util.StringTokenizer;
class J0801_3{
    public static void main(String[] args){
        StringTokenizer st = new StringTokenizer("My name is Tejas Kumar" , " ");
        while (st.hasMoreElements()){
            System.out.println(st.nextToken());
        }
    }
}