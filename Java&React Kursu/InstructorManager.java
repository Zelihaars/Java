
package gun3;
public class InstructorManager extends UserMaganer{
    public void add (Instructor instructor) {
		System.out.println(instructor.getFirstname() + instructor.getLastName() + " eğitmen eklendi ");
	}
	public void delete (Instructor instructor) {
		System.out.println(instructor.getFirstname() + instructor.getLastName() + " eğitmen silindi.");
	}
}
