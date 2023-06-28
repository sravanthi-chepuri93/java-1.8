public class Subject {
    private String subId;
    private String name;
    private int maxMarks;
    private int marksScored;


    public Subject(String subId, String name, int maxMarks, int marksScored){
        this.subId = subId;
        this.name = name;
        this.maxMarks = maxMarks;
        this.marksScored = marksScored;
    }
    public String getSubId(){return subId;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getMarksScored(){return marksScored;}

    public void setMarksScored(int marksScored) {
        this.marksScored = marksScored;
    }

    public void setMaxMarks(int maxMarks) {
        this.maxMarks = maxMarks;
    }

    boolean isQualified(){
        return marksScored>=maxMarks/10*4;
    }
    public String toString(){
        return "\n SubjectID: "+subId+
                "\n Name "+name+
                "\n MarksObtained: "+marksScored;
    }
}
class test{
    public static void main(String[] args){
        Subject subs[] = new Subject[3];// array of subject objects
        subs[0] = new Subject("A101","data structures",100,70);
        subs[1] = new Subject("A102", "Networking", 100, 85);
        subs[2] = new Subject("A103", " Operating Systems", 100, 77);

        for(Subject s: subs){
            System.out.println(s);// calling toString method automatically
        }


    }
}

/*
Based on the provided code snippet, it appears that you have a class named Subject and you are creating an array of
 Subject objects named subs with a size of 3. You then initialize each element of the array with different Subject objects,
 providing values for their attributes such as subject code, name, maximum marks, and obtained marks.

Next, you have a for loop that iterates over each element in the subs array. Within the loop, you print each Subject
object by calling the toString() method implicitly. The toString() method is a built-in method in Java that returns a string
representation of the object. By default, it returns the fully qualified name of the class followed by the memory address of the object.
 */
