package com.springmvcprogram.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.springmvcprogram.model.AdminLoginDetails;
import com.springmvcprogram.model.FamilyDetailsModel;

public class DataAccessObjectDao {
	
	private static String url="jdbc:mysql://localhost:3306/MainProjectSpringMVCProgram";
	private static String user="root";
	private static String password="Sarath#*2468";
	private static Connection con=null;
	private static Statement s=null;
	private static PreparedStatement ps=null;
	private static ResultSet rs=null;
	
	private static String adminLoginDetails="select * from Admin_Login_Details";
	
	private static String insert="insert into Family_Details(Full_Name, Age, Aadhar_Number, Pan_Number, Mobile_Number, Email_Id, City_Name) values(?,?,?,?,?,?,?)";
	
	public static String selectDetails="select * from Family_Details";
	
	public static String edit="select * from Family_Details where F_id=?";
	
	public static String update="update Family_Details set Full_Name=?, Age=?, Aadhar_Number=?, Pan_Number=?, Mobile_Number=?, Email_Id=?, City_Name=? where F_id=?";
	
	public static String delete="delete from Family_Details where F_id=?";
	
	public static String search="select * from Family_Details where Aadhar_Number=?";
	
	public static String findemail="select * from Family_Details where Email_Id=?";
	
	public String checkLonginPage(AdminLoginDetails ald)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
			s=con.createStatement();
			rs=s.executeQuery(adminLoginDetails);
			
			while(rs.next())
			{
				String vemail = rs.getString("Admin_Email_Id");
				String vpassword = rs.getString("Admin_Password");
				
				if(vemail.equals(ald.getEmail()) && vpassword.equals(ald.getPassword()))
				{
					return "Success";
				}
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(rs != null)
			{
				try {
					rs.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(s != null)
			{
				try {
					s.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(con != null)
			{
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return "Failure";
	}
	
	public static void getInsertDetails(FamilyDetailsModel fdm)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
			ps=con.prepareStatement(insert);
			ps.setString(1, fdm.getName());
			ps.setInt(2, fdm.getAge());
			ps.setLong(3, fdm.getAadhar());
			ps.setString(4, fdm.getPan());
			ps.setLong(5, fdm.getMobile());
			ps.setString(6, fdm.getEmail());
			ps.setString(7, fdm.getCity());
			ps.executeLargeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				
				if (ps != null) {
					ps.close();
				}
				if (con!=null)
				{
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static ArrayList<FamilyDetailsModel> getFamilyDetails()
	{
		ArrayList<FamilyDetailsModel> al = new ArrayList<FamilyDetailsModel>();
		
		FamilyDetailsModel fdm=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
			ps=con.prepareStatement(selectDetails);
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				int id = rs.getInt("F_id");
				String name = rs.getString("Full_Name");
				int age = rs.getInt("Age");
				long aadhar = rs.getLong("Aadhar_Number");
				String pan = rs.getString("Pan_Number");
				long mobile = rs.getLong("Mobile_Number");
				String email = rs.getString("Email_Id");
				String city = rs.getString("City_Name");
				
				fdm=new FamilyDetailsModel(id, name, age, aadhar, pan, mobile, email, city);
				
				al.add(fdm);
				
			}
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				if(rs != null)
				{
					rs.close();
				}
				
				if (ps != null) {
					ps.close();
				}
				if (con!=null)
				{
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return al;
	}
	
	public static ArrayList<FamilyDetailsModel> getEdit(int id)
	{
		ArrayList<FamilyDetailsModel> al = new ArrayList<FamilyDetailsModel>();
		
		FamilyDetailsModel fdm=null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
			ps=con.prepareStatement(edit);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				String name = rs.getString("Full_Name");
				int age = rs.getInt("Age");
				long aadhar = rs.getLong("Aadhar_Number");
				String pan = rs.getString("Pan_Number");
				long mobile = rs.getLong("Mobile_Number");
				String email = rs.getString("Email_Id");
				String city = rs.getString("City_Name");
				
				fdm = new FamilyDetailsModel(name, age, aadhar, pan, mobile, email, city);
				
				al.add(fdm);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				if(rs != null)
				{
					rs.close();
				}
				
				if (ps != null) {
					ps.close();
				}
				if (con!=null)
				{
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return al;
	}
	
	public static void getUpdate(FamilyDetailsModel fdm, int id)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
			ps=con.prepareStatement(update);
			ps.setString(1, fdm.getName());
			ps.setInt(2, fdm.getAge());
			ps.setLong(3, fdm.getAadhar());
			ps.setString(4, fdm.getPan());
			ps.setLong(5, fdm.getMobile());
			ps.setString(6, fdm.getEmail());
			ps.setString(7, fdm.getCity());
			ps.setInt(8, id);
			ps.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				
				if (ps != null) {
					ps.close();
				}
				if (con!=null)
				{
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void getDelete(int id)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
			ps=con.prepareStatement(delete);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				
				if (ps != null) {
					ps.close();
				}
				if (con!=null)
				{
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static ArrayList<FamilyDetailsModel> searchData(long aadhar)
	{
		ArrayList<FamilyDetailsModel> al = new ArrayList<FamilyDetailsModel>();
		
		FamilyDetailsModel fdm = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
			ps=con.prepareStatement(search);
			ps.setLong(1, aadhar);
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				int id = rs.getInt("F_id");
				String name = rs.getString("Full_Name");
				int age = rs.getInt("Age");
				long adhar = rs.getLong("Aadhar_Number");
				String pan = rs.getString("Pan_Number");
				long mobile = rs.getLong("Mobile_Number");
				String email = rs.getString("Email_Id");
				String city = rs.getString("City_Name");
				
				fdm = new FamilyDetailsModel(id, name, age, adhar, pan, mobile, email, city);
				
				al.add(fdm);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				if(rs != null)
				{
					rs.close();
				}
				
				if (ps != null) {
					ps.close();
				}
				if (con!=null)
				{
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return al;
	}
	
	public static ArrayList<FamilyDetailsModel> findEmail(String email)
	{
		ArrayList<FamilyDetailsModel> al = new ArrayList<FamilyDetailsModel>();
		
		FamilyDetailsModel fdm = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection(url, user, password);
			ps=con.prepareStatement(findemail);
			ps.setString(1, email);
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				int id = rs.getInt("F_id");
				String name = rs.getString("Full_Name");
				int age = rs.getInt("Age");
				long adhar = rs.getLong("Aadhar_Number");
				String pan = rs.getString("Pan_Number");
				long mobile = rs.getLong("Mobile_Number");
				String email1 = rs.getString("Email_Id");
				String city = rs.getString("City_Name");
				
				fdm = new FamilyDetailsModel(id, name, age, adhar, pan, mobile, email1, city);
				
				al.add(fdm);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				if(rs != null)
				{
					rs.close();
				}
				
				if (ps != null) {
					ps.close();
				}
				if (con!=null)
				{
					con.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return al;
	}

}
