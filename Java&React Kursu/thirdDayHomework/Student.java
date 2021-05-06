
package gun3;

public class Student extends User {
    String takeNote;
    
    public Student(String takeNote, int userNumber, String passWord, String firstname, String lastName) {
        super(userNumber, passWord, firstname, lastName);
        this.takeNote = takeNote;
    }
    public String getTakeNote() {
        return takeNote;
    }

    public void setTakeNote(String takeNote) {
        this.takeNote = takeNote;
    }

    
}
