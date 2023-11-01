package com.springmvcprogram.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.springmvcprogram.dao.DataAccessObjectDao;
import com.springmvcprogram.model.AdminLoginDetails;
import com.springmvcprogram.model.FamilyDetailsModel;

@Controller
public class FamilyDetailsController {
	
	ModelAndView mv = new ModelAndView();
	
		@RequestMapping("/")
		
		public ModelAndView getStartUpPage()
		{
			mv.setViewName("Admin_Login.jsp");
			
			return mv;
		}
		
		@RequestMapping("ControlData")
		public ModelAndView getLoginPage(HttpServletRequest request)
		{
			String e = request.getParameter("email");
			String p = request.getParameter("pswd");
			
			AdminLoginDetails ald = new AdminLoginDetails(e, p);
			
			DataAccessObjectDao dao = new DataAccessObjectDao();
			
			String status = dao.checkLonginPage(ald);
			
			if(status.equals("Success"))
			{
				mv.setViewName("Administration.jsp");
			}
			else
			{
				mv.setViewName("Admin_Login.jsp");
			}
			return mv;
		}
		
		@RequestMapping(value="Family_Details", params = "insert")
		public ModelAndView getRegisterPage()
		{
			mv.setViewName("Family_Details_Registration.jsp");
			
			return mv;
		}
		
		@RequestMapping("Insert_Details")
		public ModelAndView setDataInRegisterPage(HttpServletRequest request)
		{
			String name = request.getParameter("name");
			int age = Integer.parseInt(request.getParameter("age"));
			long aadhar = Long.parseLong(request.getParameter("aadhar"));
			String pan = request.getParameter("pan");
			long mobile = Long.parseLong(request.getParameter("mobile"));
			String email = request.getParameter("email");
			String city = request.getParameter("city");
			
			FamilyDetailsModel fdm = new FamilyDetailsModel(name, age, aadhar, pan, mobile, email, city);
			
			DataAccessObjectDao.getInsertDetails(fdm);
			
			mv.setViewName("Administration.jsp");
			
			return mv;
		}
		
		@RequestMapping(value="Family_Details", params = "show")
		public ModelAndView getFamilyDetails()
		{
			ArrayList<FamilyDetailsModel> al = DataAccessObjectDao.getFamilyDetails();
			
			mv.addObject("result", al);
			
			mv.setViewName("Display_Details.jsp");
			
			return mv;
		}
		
		@RequestMapping(value="search")
		public ModelAndView searchData(long aadhar)
		{
			ArrayList<FamilyDetailsModel> al = DataAccessObjectDao.searchData(aadhar);
			
			mv.addObject("result", al);
			
			mv.setViewName("Display_Details.jsp");
			
			return mv;
			
		}
		
		@RequestMapping(value="Family_Details", params = "set")
		public ModelAndView setData()
		{
			mv.setViewName("Find_Aadhar.jsp");
			
			return mv;
		}
		
		@RequestMapping(value="Family_Details", params = "get")
		public ModelAndView getData()
		{
			ArrayList<FamilyDetailsModel> al = DataAccessObjectDao.getFamilyDetails();
			
			mv.addObject("result", al);
			
			mv.setViewName("Display_Details.jsp");
			
			return mv;
		}
		
		@RequestMapping(value="findemail")
		public ModelAndView findEmail(String email)
		{
			ArrayList<FamilyDetailsModel> al = DataAccessObjectDao.findEmail(email);
			
			mv.addObject("result", al);
			
			mv.setViewName("Display_Details.jsp");
			
			return mv;
		}
		
		@RequestMapping(value="Family_Details", params = "searchemail")
		public ModelAndView getEmail()
		{
			mv.setViewName("Find_Email_Id.jsp");
			
			return mv;
		}
		
		@RequestMapping(value="delete")
		public ModelAndView deleteDetails(HttpServletRequest request)
		{
			int id = Integer.parseInt(request.getParameter("id"));
			
			DataAccessObjectDao.getDelete(id);
			
			ArrayList<FamilyDetailsModel> al = DataAccessObjectDao.getFamilyDetails();
			
			mv.addObject("result", al);
			
			mv.setViewName("Display_Details.jsp");
			
			return mv;
		}
		
		@RequestMapping(value="edit")
		public ModelAndView editDetails(HttpServletRequest request)
		{
			int id = Integer.parseInt(request.getParameter("id"));
			
			mv.addObject("id", id);
			
			ArrayList<FamilyDetailsModel> al = DataAccessObjectDao.getEdit(id);
			
			mv.addObject("result", al);
			
			mv.setViewName("Update_Details.jsp");
			
			return mv;
		}
		
		@RequestMapping(value="update")
		public ModelAndView updateDetails(HttpServletRequest request, HttpServletResponse response) throws IOException
		{
			int id = Integer.parseInt(request.getParameter("id"));
			String name = request.getParameter("name");
			int age = Integer.parseInt(request.getParameter("age"));
			long aadhar = Long.parseLong(request.getParameter("aadhar"));
			String pan = request.getParameter("pan");
			long mobile = Long.parseLong(request.getParameter("mobile"));
			String email = request.getParameter("email");
			String city = request.getParameter("city");
			
			FamilyDetailsModel fdm = new FamilyDetailsModel(name, age, aadhar, pan, mobile, email, city);
			
			DataAccessObjectDao.getUpdate(fdm, id);
			
			ArrayList<FamilyDetailsModel> al = DataAccessObjectDao.getFamilyDetails();
			
			mv.addObject("result", al);
			
			mv.setViewName("Display_Details.jsp");
			
			return mv;
		}
		
}
