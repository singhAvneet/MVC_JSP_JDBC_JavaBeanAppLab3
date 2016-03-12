<%@ page language="java" import="pizza.OrderController" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="stylesheet.css">
<title>Order here</title>
</head>
<body>


 <form method="post" action="OrderController">
 <h1 style="margin-left: 80px">Online Order Service</h1>
<p style="font-size: 100%;">Fill this online form for a pizza dilivery</p>
<h2>Hot Pizza</h2>
 <ul>
   <li style="list-style-type: none;  margin-bottom: 3px;">User Name: <input type ="text" name="name" size="20" id="name"></li>
    <li style="list-style-type: none; margin-bottom: 3px;">Street Address: <input type ="text" name="addres" size="20" id="addres"></li>
    <li style="list-style-type: none;">Phone Number: <input type ="text" name="phone" size="20" id="phone"></li>
     </ul>    
  <h3 style="margin-left: 40px">Which toppings would you like</h3>
 
  <ul style="margin-left: 30px;">
   <li style="list-style-type: decimal;"><input type="checkbox" name="topping" value="Pepperoni"/>Pepperoni</li>
   <li style="list-style-type: decimal;"><input type="checkbox" name="topping" value="Sausage"/>Sausage</li>
	<li style="list-style-type: decimal;"><input type="checkbox" name="topping" value="Cheese"/>Cheese</li>
</ul>

    <h3 style="margin-left: 80px">How would you like to pay</h3>
  <ul>
    <li style="list-style-type: decimal;"><INPUT TYPE="radio" NAME="radios" class="radios" VALUE="cash"  style="width: auto">Cash </li>   
     <li style="list-style-type: decimal;"><INPUT TYPE="radio" NAME="radios" class="radios" VALUE="cheque"  style="width: auto">Cheque </li>   
    <li style="list-style-type: decimal; font-style:italic;">Credit Card:</li>
    <ul style="margin-left: 30px;">
    <li style="list-style-type: circle;"><INPUT TYPE="radio" NAME="radios" class="radios" VALUE="MAster Card"  style="width: auto">Master Card</li>     
   <li style="list-style-type: circle;"><INPUT TYPE="radio" NAME="radios" class="radios" VALUE="Visa"  style="width: auto">Visa</li>   
   <li style="list-style-type: circle;"><INPUT TYPE="radio" NAME="radios" class="radios" VALUE="American Express" style="width: auto">American Express</li>
    </ul>   
  </ul>
  <fieldset class="account-action">
    <input class="btn" type="submit" name="submit" value="Order">    
  </fieldset>
</form>

</body>
</html>