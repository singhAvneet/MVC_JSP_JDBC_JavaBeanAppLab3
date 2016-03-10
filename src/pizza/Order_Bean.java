package pizza;

public class Order_Bean {
	public String username;
public String  payment,toppings;
User_Bean obj=new User_Bean();
	public void setUsername(String username) {
		this.username=username;
		
	}
	
	public void setToppings(String toppings) {
		this.toppings=toppings;
	}

	public void setPayments(String payment) {
		this.payment=payment;
	}
	public void setObj(User_Bean obj) {
		this.obj=obj;
		
	}
	//*********************************************************
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
