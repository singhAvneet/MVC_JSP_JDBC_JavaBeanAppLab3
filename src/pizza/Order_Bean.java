package pizza;

public class Order_Bean {
	public String username;
	public String orderId;
public String  payment,toppings;
User_Bean obj=new User_Bean();
	public void setUsername(String username) {
		this.username=username;
		
	}
	public void setOrderId(String toppings2) {
		this.orderId=toppings2;
		
	} void setToppings(String toppings) {
		this.toppings=toppings;
	}

	public void setPayments(String payment) {
		this.payment=payment;
	}
	public void setObj(User_Bean obj) {
		this.obj=obj;
		
	}
	//*********************************************************
	public String getOrderId() {		
		return this.orderId;		
	}
	public User_Bean getObj() {		
		return this.obj;		
	}
	public String getUsername() {
		
		return this.username;
		
	}

	public String getToppings() {
		return this.toppings;
	}

	public String getPayment() {
		return this.payment;
	}
}
