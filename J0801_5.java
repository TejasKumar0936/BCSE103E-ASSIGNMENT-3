import java.util.StringTokenizer;
class J0801_5{
    public static void main(String[] args){
        StringTokenizer st = new StringTokenizer("THIS IS EXAMPLE PROGRAM FOR nextTokens() function." , " ");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}