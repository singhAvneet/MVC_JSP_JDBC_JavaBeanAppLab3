<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="NewFile.css">
<title>Check Out</title>
</head>
<body >
<form>
<h1 style="margin-left: 200px">Welcome ${Orderbean.username}</h1>
<a  href=/Ahdieh_Avneet_COMP303Lab3/OrderForm.jsp>Back</a>
 <h3 >Your booking details are follows: </h3>

 <h2>Phone Address:<span style="color:#395870;font-size: 100%;">${Orderbean.addres}</span></h2>
 <h2>Phone Number:<span style="color:#395870;font-size: 100%;">${Orderbean.phone}</span></h2>
 <h2>Selected toppings:<span style="color:#395870;font-size: 100%;">${Orderbean.toppings}</span></h2>
 <h2>Payment:<span style="color:#395870;font-size: 100%;">${Orderbean.payment}</span></h2>
 
 <h3 style="margin-left: 200px">Your online order completed.</h2>
  <h3 style="margin-left: 200px">Pizza will be delivered soon.</h2>
</form>
</body>
</html>