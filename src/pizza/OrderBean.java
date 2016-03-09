package pizza;

public class OrderBean {
	public String username;
public String  addres,phone,payment,toppings;
	public void setUsername(String username) {
		this.username=username;
		
	}

	
	public void setAddress(String addres) {
		this.addres=addres;
	}

	public void setphone(String phone) {
		this.phone=phone;
	}

	public void setToppings(String toppings) {
		this.toppings=toppings;
	}

	public void setPayments(String payment) {
		this.payment=payment;
	}
	//*********************************************************
	public String getUsername() {
		
		return this.username;
		
	}

	
	public String getAddres() {
		return this.addres;
	}

	public String getPhone() {
		return this.phone;
	}

	public String getToppings() {
		return this.toppings;
	}

	public String getPayment() {
		return this.payment;
	}


}
