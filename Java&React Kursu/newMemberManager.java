package dayfourtask2;

public class newMemberManager {
    public void add(newMember newmember){
        System.out.println(newmember.getTc() + newmember.getFirstName() + newmember.getLastName() + "üyesi eklendi");
    }
    public void delete (newMember newmember){
        System.out.println(newmember.getTc() + newmember.getFirstName() + newmember.getLastName() + "üyesi silindi ");
    }
     
    public void uptade(newMember newmember){
        System.out.println(newmember.getTc() + newmember.getFirstName() + newmember.getLastName() + "üyesi güncellendi ");
    }
}
