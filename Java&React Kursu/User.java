
package gun3;


public class User {
   int userNumber ;
   String passWord;
   String firstname ;
   String lastName;
    public User(int userNumber,String passWord, String firstname, String lastName) {
        this.userNumber = userNumber;
        this.passWord= passWord;
        this.firstname = firstname;
        this.lastName = lastName;
    }
   
    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }
    
    public String getpassWord(){
        return passWord;
    }
    
    public void setpassWord(String passWord){
            this.passWord= passWord;
    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   
}
