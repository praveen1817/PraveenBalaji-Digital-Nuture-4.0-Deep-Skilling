public class mainStudent
{
    public static void main(String[] args) {
        Student std =new Student("Praveen",713322,"A+");
        studentView view=new studentView();
        studentController display =new studentController(std,view);
        display.displaydetails();
        display.updateName("PraveenBalaji");
        display.displaydetails();
    }
}
