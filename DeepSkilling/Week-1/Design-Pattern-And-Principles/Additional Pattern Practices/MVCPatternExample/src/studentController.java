public class studentController {
    private Student student;
    private studentView view;
    public studentController(Student student,studentView view){
        this.student=student;
        this.view=view;
    }
    public void updateName(String name){
        student.setName(name);

    }
    public void updateId(int studentId){
        student.setId(studentId);
    }
    public void updategrade(String grade){
        student.setGrade(grade);
    }
    void displaydetails(){
        view.displayStudentDetails(student.getName(),student.getId(),student.getGrade());
    }

}
