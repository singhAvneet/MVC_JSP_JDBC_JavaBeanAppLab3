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
	String findUsername=null;
	Connection con;
	Statement st;
	ResultSet rs;
	PreparedStatement ps; 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");	
		PrintWriter pw=response.getWriter();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/customer?user=root&password=admin");
			ps=con.prepareStatement("Select * from customer.orders_table where username='"+name+"'"); 
			rs=ps.executeQuery();
			pw.println("<html>");
			pw.println("<body><h1>Product Details</h1>");
			while(rs.next()){
				int orderId=rs.getInt(1);
				String toppings=rs.getString(2);
				String payment=rs.getString(3);
				String username=rs.getString(4);
				pw.println(toppings);
			}
			pw.println("</html>");
			pw.println("</body>");
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
		
		
		

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String name = request.getParameter("name");
		String addres = request.getParameter("addres");
		String phone = request.getParameter("phone");
		String payment = request.getParameter("radios");//captures type of payment
		String[] toppingArray=request.getParameterValues("topping");
		String toppings ="" ;
		
		for (String s : toppingArray){
			if(s!=null)
				toppings+=s+",";
		}
		
		PrintWriter pw=response.getWriter();
		/*OrderBean Orderbean=new OrderBean();  
		Orderbean.setUsername(name);  
		Orderbean.setAddress(addres); 
		Orderbean.setphone(phone);  
		Orderbean.setToppings(toppings); 
		Orderbean.setPayments(payment); 
		request.setAttribute("Orderbean",Orderbean);*/
		User_Bean user_beam=new User_Bean();  
		user_beam.setUsername(name);  
		user_beam.setAddres(addres); 
		user_beam.setPhone(phone); 
		Order_Bean order_beam=new Order_Bean();  
		order_beam.setToppings(toppings);  
		order_beam.setPayments(payment); 
		order_beam.setUsername(name); 
		order_beam.setObj(user_beam); 
		request.setAttribute("order_beam",order_beam);
		
		
	
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost/customer?user=root&password=admin");
			ps=con.prepareStatement("Select * from customer.user_table " ); //where username='"+name+"'"
			rs=ps.executeQuery();		
			st=con.createStatement();
			boolean founded=false;
				while(rs.next()){
					if(rs.getString(1).equals(name)){
						founded=true;
					}					
				}
				if(!founded){
						String query="INSERT INTO customer.user_table(username,phone,addres) VALUES ('"+name+"','"+phone+"','"+addres+"')";	
						st.executeUpdate(query);					
					}
			founded=false;			
			String  query="INSERT INTO customer.orders_table(toppings,payment,username) VALUES ('"+toppings+"','"+payment+"','"+name+"')";
			st.executeUpdate(query);
				RequestDispatcher rd=request.getRequestDispatcher("checkout.jsp");  
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