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

/**
 * Servlet implementation class ShowController
 */
@WebServlet("/ShowController")
public class ShowController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String findUsername=null;
	Connection con;
	Statement st;
	ResultSet rs;
	PreparedStatement ps; 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String orderId = "",payment=null;
		String name = request.getParameter("name");	
		PrintWriter pw=response.getWriter();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/customer?user=root&password=admin");
			ps=con.prepareStatement("Select * from customer.orders_table where username='"+name+"'"); 
			rs=ps.executeQuery();
		
			while(rs.next()){
				orderId+=rs.getString(1)+",";
			}
			Order_Bean order_beam=new Order_Bean();
			order_beam.setOrderId(orderId);
			order_beam.setUsername(name);
			 
			request.setAttribute("order_beam",order_beam);
			RequestDispatcher rd=request.getRequestDispatcher("orderDeatils.jsp");  
			rd.forward(request, response);
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
		
	}	

}
