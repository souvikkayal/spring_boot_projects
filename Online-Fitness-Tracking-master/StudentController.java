package com.example.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.Model.AddmissionModel;
import com.example.Model.CourseModel;
import com.example.Model.StudentModel;
import com.example.Service.AddmissionService;
import com.example.Service.CourseService;
import com.example.Service.StudentService;


@Controller
public class StudentController {
	
	@Autowired
	private StudentService studserviceobj;
	@Autowired
	private CourseService courseservice;
	@Autowired
	private AddmissionService addmissionservice;
	// FOR ADDING STUDENT TO DATABASE
	@RequestMapping(method=RequestMethod.POST, value="/register")
	public ModelAndView addStudent(StudentModel studmodelobj)
	{
		studmodelobj = studserviceobj.addStudentDetails(studmodelobj);
		ModelAndView mv = new ModelAndView();
		mv.setViewName("studlogin.jsp");
		return mv;
	}
	// FOR UPDATE STUDENT TO DATABASE
	@RequestMapping(method=RequestMethod.POST, value="/update")
	public ModelAndView addUpdateStudent(StudentModel studmodelobj, HttpSession session)
	{
		studmodelobj = studserviceobj.addStudentDetails(studmodelobj);
		session.setAttribute("studname", studmodelobj.getName());
		ModelAndView mv = new ModelAndView();
		mv.setViewName("afterupdatestudent.jsp");
		return mv;
	}
	// MATCH EMAIL AND PASSWORD FOR STUDENT LOGIN
	@RequestMapping(method=RequestMethod.POST, value ="/searchstudbyemail")
	public ModelAndView getStudentByEmail(@RequestParam String email, String password,HttpSession session)
	{
		StudentModel foundstud = studserviceobj.searchStudentByEmail(email);
		System.out.println(foundstud.getEmail());
		System.out.println(foundstud.getPassword());
		ModelAndView mv = new ModelAndView();
		
		if(email.equals(foundstud.getEmail()) && password.equals(foundstud.getPassword()))
		{
			session.setAttribute("studid", email);
			session.setAttribute("studname", foundstud.getName());
			mv.setViewName("studafterlogin.jsp");
		}
		else
		{
			mv.addObject("msg", "Invalid Email Id or Password");
			mv.setViewName("studlogin.jsp");
		}
		return mv;
	}
	//FOR GET ALL RECORD FROM COURSE DB
	@RequestMapping("/showallcourse")
	public String openAdminViewAllCourse(HttpSession session)
	{
		ArrayList<CourseModel>courselist = courseservice.getAllCourseRecordFromDB();
		session.setAttribute("clist", courselist);
		System.out.println(courselist.size());
		return "studshowallcourse.jsp";
		 
	}
	//FOR GET ALL RECORD FROM COURSE DB 
	@RequestMapping(method=RequestMethod.POST, value="/searchbycourse")
	public String searchCourses(@RequestParam String coursename, HttpSession session)
	{
		ArrayList<CourseModel> findcourse = courseservice.searchCourseBycoursename(coursename);
		session.setAttribute("clist", findcourse);
		return "studshowallcourse.jsp";
	}
	/*
	//Search Student By EmailId
	@RequestMapping(method=RequestMethod.POST,value="/searchstudentbyemailid")
	public ModelAndView searchStudentDetails(HttpSession session)
	{
		String studemail = (String)session.getAttribute("studid");
		List<StudentModel>a=studserviceobj.searchStudentByEmailId(studemail);
		System.out.println(a.size());
		ModelAndView mv=new ModelAndView();
		if(a.size()>0)
		{
			mv.addObject("info",a);
			System.out.println(a);
		}
		else
		{
			mv.addObject("msg","invalid email");
		}
		mv.setViewName("searchstudbyemail.jsp");
		return mv;
		
	}*/
	//FOR ADDMISSION COURSE
	@RequestMapping(value="/course", method = RequestMethod.POST)
	public String addAddmissions(@RequestParam String email,AddmissionModel addmodel, HttpSession session)
	{
		//CourseModel coursem = courseservice.getCourseRecordFromDB(addmodel.getAddmissionid());
		
		addmodel = addmissionservice.addAddmission(addmodel);
		String studemail = (String)session.getAttribute(email);
		ArrayList<AddmissionModel> addlist = addmissionservice.getAlldbSearchByEmail(studemail);
		session.setAttribute("studid", addmodel.getEmail());
		session.setAttribute("addmissionlist", addlist);
		return "afterstudaddmission.jsp";
	}
	
	//FOR GET ALL RECORD FROM ADDMISSION DB
			@RequestMapping("/studshowalladdmission")
			public String studentViewAlladdmission(@RequestParam String email,HttpSession session)
			{
				String studemail = (String)session.getAttribute(email);
				ArrayList<AddmissionModel> addlist = addmissionservice.getAlldbSearchByEmail(studemail);
				session.setAttribute("addmissionlist", addlist);
				System.out.println(addlist.size());
				return "studshowaddmission.jsp";
			}
			
			//FOR DELETE ADDMISSION FROM DB
			@RequestMapping("/deleteid")
			public String studentAddmissionDelete(@RequestParam int id,HttpSession session)
			{
				addmissionservice.deleteAddmissionRecord(id);
				String studemail = (String)session.getAttribute("studid");
				ArrayList<AddmissionModel> addlist = addmissionservice.getAlldbSearchByEmail(studemail);
				session.setAttribute("addmissionlist", addlist);
				
				return "afteraddmissiondelete.jsp";
			}
			
			//FOR LOGOUT STUDENT
			@RequestMapping("/studlogout")
			public String logout(HttpSession session) 
			{
				session.removeAttribute("studname");
				session.removeAttribute("studid");
				session.invalidate();
				
				return "home.jsp";
			}

}
