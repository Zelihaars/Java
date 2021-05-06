
package gun3;

public class UserMaganer {
    public void add(User user){
        System.out.println(user.firstname + user.lastName + " eklendi");
    }
    public void delete (User user){
        System.out.println(user.firstname + user.lastName + " silindi");
    }
}
