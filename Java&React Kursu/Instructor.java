
package gun3;

public class Instructor extends User {
    String gradeIt;
    
    public Instructor(String gradeIt, int userNumber, String passWord, String firstname, String lastName) {
        super(userNumber, passWord, firstname, lastName);
        this.gradeIt = gradeIt;
    }
    
    public String getGradeIt() {
        return gradeIt;
    }

    public void setGradeIt(String gradeIt) {
        this.gradeIt = gradeIt;
    }

    
}
