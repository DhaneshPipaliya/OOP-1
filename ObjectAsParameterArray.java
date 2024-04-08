public class ObjectAsParameterArray {
    String name;
    int RollNo;
    float cgpa;
    ObjectAsParameterArray(){
        name="Dhanesh";
        RollNo=35;
        cgpa=6.84f;
    }
    ObjectAsParameterArray(int a, float b, String a1){
        RollNo=a;
        cgpa=b;
        name=a1;
    }
    public void CalculateGrade(ObjectAsParameterArray A, ObjectAsParameterArray B){
        System.out.println("Calculating for Student 1:");
        if(A.RollNo>=5.0){
            System.out.println("Grade is:"+A.RollNo+"\tCGPA:"+A.cgpa+"\tAA");
        }
        else {
            System.out.println("Grade is:"+A.RollNo+"\tCGPA:"+A.cgpa+"\tFF");
        }

        System.out.println("Calculating for Student 2:");
        if(B.RollNo>=5.0){
            System.out.println("Grade is:"+B.RollNo+"\tCGPA:"+B.cgpa+"\tAA");
        }
        else {
            System.out.println("Grade is:"+B.RollNo+"\tCGPA:"+B.cgpa+"\tFF");
        }
    }
    public ObjectAsParameterArray MaxCgpa(ObjectAsParameterArray A, ObjectAsParameterArray B){
        if (A.cgpa>B.cgpa){
            return A;
        }
        else {
            return B;
        }
    }
    public static void main(String[] args) {
        ObjectAsParameterArray ob1 = new ObjectAsParameterArray();
        ObjectAsParameterArray ob2 = new ObjectAsParameterArray(3,5.84f,"Dk");
        ObjectAsParameterArray ob3 = new ObjectAsParameterArray();
//        ob1.CalculateGrade(ob1,ob2);
        ob3 = ob3.MaxCgpa(ob1,ob2);

        System.out.println("MAX CGPA is:"+ob3.RollNo+"\nName:"+ob3.name+"\nCGPA:"+ob3.cgpa);
    }
}
