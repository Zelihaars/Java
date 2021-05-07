package dayfourtask2;

public class newMember {
    String firstName;
    String lastName ;
    String tc;
    String dateBirthday;

    public newMember(String firstName, String lastName, String tc, String dateBirthday) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.tc = tc;
        this.dateBirthday = dateBirthday;
    } 

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firsrName) {
        this.firstName = firsrName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getTc() {
        return tc;
    }

    public void setTc(String tc) {
        this.tc = tc;
    }

    public String getDateBirthday() {
        return dateBirthday;
    }

    public void setDateBirthday(String dateBirthday) {
        this.dateBirthday = dateBirthday;
    }
    
}
