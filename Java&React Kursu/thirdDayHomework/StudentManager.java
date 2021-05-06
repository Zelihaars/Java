
package gun3;

public class StudentManager extends UserMaganer{
    public void add(Student student) {
		System.out.println(student.getFirstname() + student.getLastName() + " ögrencisi eklendi.");
	}
	
	public void delete(Student student) {
		System.out.println(student.getFirstname() + student.getLastName() + "öğrencisi silindi.");
}
}
