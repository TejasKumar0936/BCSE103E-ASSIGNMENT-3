import java.util.StringTokenizer;
class J0801_2{
    public static void main(String[] args){
        StringTokenizer st = new StringTokenizer("My,name,is,Tejas,Kumar");
        System.out.println("Next token is : " + st.nextToken(","));
    }
}