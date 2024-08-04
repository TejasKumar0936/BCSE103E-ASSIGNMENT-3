import java.util.StringTokenizer;
class J0801_4{
    public static void main(String[] args){
        StringTokenizer st = new StringTokenizer("A path from a point approximately 330 metres east of the most south westerly corner of 17 Batherton Close, Widnes and approximately 208 metres east-south-east of the most southerly corner of Unit 3 Foundry Industrial Estate");
        while (st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }
}