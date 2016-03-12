<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="stylesheet.css">
<title>Order Details</title>
</head>
<body>
<form>
<h1 style="margin-left: 200px">Thanks ${order_beam.username}</h1>
<a  href=/Ahdieh_Avneet_COMP303Lab3/OrderForm.jsp>Back</a>
 <h3 >Your order details are follows: </h3>
 <h2>Order Id:<span style="color:#395870;font-size: 100%;margin-left: 5px;">${order_beam.orderId}</span></h2>
 <h2>Address:<span style="color:#395870;font-size: 100%; margin-left: 5px;">${user_beam.addres}</span></h2>
 
 <h3 style="margin-left: 200px">Thanks for you purchase</h2>
  <h3 style="margin-left: 200px">You may track you order </h2>
  
  
</body>
</html>