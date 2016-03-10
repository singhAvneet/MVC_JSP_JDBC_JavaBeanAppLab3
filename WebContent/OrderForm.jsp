<%@ page language="java" import="pizza.OrderController" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="NewFile.css">
<title>Order here</title>
</head>
<body>


 <form method="post" action="OrderController">
 <h1 style="margin-left: 80px">Online Order Service</h1>
<p style="font-size: 100%;">Fill this online form for a pizza dilivery</p>
<h2>Hot Pizza</h2>
  <fieldset class="account-info">
   <label>     UserName:<span> <input type ="text" name="name" size="20" id="name"></span>   </label>
    <label>     Street Address: <input type ="text" name="addres" size="20" id="addres">    </label>
     <label>    Phone Number: <input type ="text" name="phone" size="20" id="phone">    </label>     
  </fieldset>  <h3 style="margin-left: 40px">Which toppings would you like</h3>
 <label style="margin-left: 80px">    1.<input type="checkbox" name="topping" value="Pepperoni"  checked="checked" /> <span style="color:#395870;font-size: 100%;">Peporroni</span></p>
    </label>
    <label style="margin-left: 80px">	2.<input type="checkbox" name="topping" value="Sausage" /><span style="color:#395870;font-size: 100%;">Sausage</span></p>
	</label>
	<label style="margin-left: 80px">	3.<input type="checkbox" name="topping" value="Cheese" checked="checked" /> <span style="color:#395870;font-size: 100%;">Cheese</span></p>
	</label>
    <h3 style="margin-left: 80px">How would you like to pay</h3>
  <fieldset class="account-info">
    <label >     <INPUT TYPE="radio" NAME="radios" VALUE="cash" CHECKED style="width: auto">Cash <BR>    
     <INPUT TYPE="radio" NAME="radios" VALUE="cheque" CHECKED style="width: auto">Cheque <BR>   
    <h3 style="margin-left: 40px">Credit Card:</h3> 

   <INPUT TYPE="radio" NAME="radios" VALUE="MAster Card" CHECKED style="width: auto">Master Card<BR>    
   <INPUT TYPE="radio" NAME="radios" VALUE="Visa" CHECKED style="width: auto">Visa<BR>   
   <INPUT TYPE="radio" NAME="radios" VALUE="American Express" CHECKED style="width: auto">American Express<BR>     
    </label>     
  </fieldset>
  <fieldset class="account-action">
    <input class="btn" type="submit" name="submit" value="Order">    
  </fieldset>
</form>




 <form method="get" action="OrderController">
 <label>     UserName:<span> <input type ="text" name="name" size="20" id="name"></span>   </label>
  <fieldset class="account-action">
    <input class="btn" type="submit" name="submit" value="Show My Order">    
  </fieldset>
</form>



</body>
</html>