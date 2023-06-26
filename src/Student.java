public class Student {
    int rollNumber;
    String name;
    String course;
    int m1, m2 ,m3;
    public int total(){
        return m1 + m2+ m3;
    }
    public int average(){
        return total()/3;
    }
    public String toString(){
        return "RollNo: "+rollNumber+"\n"+"Name: "+name +"\n"+"course: "+"CSE"+"\n";
    }
    public char grade(){
        int avg = average();
        if(avg>70 && avg<=100)
            return 'A';
        else if(avg>60 && avg<=70)
            return 'B';
        else if(avg>50 && avg<=60)
            return 'C';
        else if(avg>40 && avg<=50)
            return 'D';
        else
            return 'E';
    }
}

class StudentTest{
public static void main(String[] args){
    Student s = new Student();
    s.rollNumber = 2233;
    s.name = "john";
    s.course = "degree";
    s.m1 = 60;
    s.m2 = 70;
    s.m3 = 80;
    System.out.println(s);
    System.out.println("student "+s.total());
    System.out.println("course "+s.average());
    System.out.println("grade "+s.grade());

}
}
