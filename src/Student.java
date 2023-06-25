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
    public char grade(){
        if(average()>70 && average()<=100)
            return 'A';
        else if(average()>60 && average()<=70)
            return 'B';
        else if(average()>50 && average()<=60)
            return 'C';
        else if(average()>40 && average()<=50)
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
    System.out.println("name "+s.name);
    System.out.println("roll number "+s.rollNumber);
    System.out.println("degree "+s.course);
    System.out.println("student "+s.total());
    System.out.println("course "+s.average());
    System.out.println("grade "+s.grade());

}
}
