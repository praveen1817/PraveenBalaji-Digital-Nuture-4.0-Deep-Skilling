public class Student {
    private String name;
    private int studentId;
    private String grade;
    public Student(String name,int studentId,String grade ){
        this.name=name;
        this.studentId=studentId;
        this.grade=grade;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;

    }
    public int getId(){
        return studentId;
    }
    public void setId(int studentId){
        this.studentId=studentId;

    }
    public String getGrade(){
        return grade;
    }
    public void setGrade(String name){
        this.grade=grade;

    }

}
