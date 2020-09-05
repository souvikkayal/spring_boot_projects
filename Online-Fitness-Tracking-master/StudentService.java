package com.example.Service;
//import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.Model.StudentModel;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studreprositoryobj;
	//@Autowired
	//private StudentRepository1 studreprository1obj;
	// METHOD FOR ADD STUDENT DETAILS TO DATABASE
	public StudentModel addStudentDetails(StudentModel smobj)
	{
		smobj = studreprositoryobj.save(smobj);
		return smobj;
	}
	
	public StudentModel searchStudentByEmail(String email)
	{
		StudentModel smobj = studreprositoryobj.findByEmail(email);
		return smobj;
	}
	/*public List<StudentModel> searchStudentByEmailId(String email)
	 {
		 System.out.println("inside find by email ");
		 List<StudentModel>a=studreprository1obj.findByEmailId(email);
		 return a;
	 }*/
}
