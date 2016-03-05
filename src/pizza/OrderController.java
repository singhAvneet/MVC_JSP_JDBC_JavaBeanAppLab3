package pizza;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;




@WebServlet("/OrderController")
public class OrderController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection con;
	Statement st;
	ResultSet rs;
	PreparedStatement ps; 
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String name = request.getParameter("name");
		String addres = request.getParameter("address");
		String phone = request.getParameter("phone");		
		String payment = request.getParameter("radios");//captures type of payment
		String[] toppingArray=request.getParameterValues("topping");
		String toppings ="" ;
		for (String s : toppingArray){
			if(s!=null)
				toppings+=s+",";
		}
		PrintWriter pw=response.getWriter();
		System.out.println(request);
		
		try{
			
		
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/customer?user=root&password=admin");
			st=con.createStatement();
			String query="INSERT INTO customer.order_table(name,addres,toppings,phone,payment) VALUES ('"+name+"','"+addres+"','"+toppings+"','"+phone+"','"+payment+"')";
				st.executeUpdate(query);
				pw.println("<h1>Sucessfully Added</h1>");
				pw.println("<a href=/singh_COMP303Assignment2/input.html>Back</a>");
				
			
			pw.println("</body></html>");
		}
		catch(ClassNotFoundException e){
			pw.println(e);
		}
		catch(SQLException e){
			pw.println(e);
			}
		catch(Exception e) {
			pw.println(e);
			}
		
	}	/*
		response.setContentType("text/html"); 
		PrintWriter out=response.getWriter();  
		String username=request.getParameter("username");  
		String password=request.getParameter("password");  
		OrderBean bean=new OrderBean();  
		bean.setUsername(username);  
		bean.setPassword(password); 
		request.setAttribute("bean",bean); 
		boolean status=bean.validate();  
		if(status){ 
			RequestDispatcher rd=request.getRequestDispatcher("Login.jsp");  
		rd.forward(request, response);  
		} 
		else
		{  
			RequestDispatcher rd=request.getRequestDispatcher("Error.jsp"); 
			rd.forward(request, response); 
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																				} 
	}
	}

*/
}