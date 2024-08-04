class Student{
    public int roll_no;
        public String name;
        Student(int roll_no, String name){
            this.roll_no = roll_no;
            this.name = name;
        }
}

class J0801_8{
    public static void main(String[] args){
        Student[] arr;
        arr = new Student[5];
        arr[0] = new Student(1,"Aman");
        arr[1] = new Student(2,"Patel");
        arr[2] = new Student(3,"Jesus");
        arr[3] = new Student(4,"Muhammad");
        arr[4] = new Student(5,"Aditya");
        for (int i = 0 ; i < arr.length ; i++){
            System.out.println("Element at " + i + ": " + arr[i].roll_no + " " + arr[i].name);
        }
    }
}