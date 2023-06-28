public class Student {
    private String rollNo;
    private String sName;
    private String department;
    private Subject[] subs;

    public Student(String rollNo, String sName, String department, Subject[] subs){
        this.rollNo = rollNo;
        this.sName = sName;
        this.department = department;
        this.subs = subs;

    }
    public String getRollNo(){ return rollNo;}
    public String getsName(){return sName;}
    public String  getDepartment(){return department;}
    public Subject[] getSubs() {return subs;}

    public void setDepartment(String department) {
        this.department = department;
    }
    public void setSubs(Subject[] subs) {
        this.subs = subs;

    }
    public String toString(){
        return "\n roll number: "+rollNo+
                "\n Name "+sName+
                "\n department: "+department;
    }
}

class StudentTest{
    public static void main(String[] args){
        Subject[] subs = new Subject[3];
        subs[0] = new Subject("1", "Sravanthi", 100, 99);
        subs[1] = new Subject("1", "Isha", 100, 98);
        subs[2] = new Subject("1", "Rakesh", 100, 97);
//        Student stu = new Student("A101","John","CE",new Subject[3]);
        Student stu = new Student("A101","John","CE",subs);
        System.out.println(stu);
        for(Subject s: stu.getSubs()){
            System.out.println(s);
        }
    }
}
