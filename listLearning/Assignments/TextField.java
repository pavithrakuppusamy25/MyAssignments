package Assignments;

public class TextField extends WebElement{
	public void text() {
		System.out.println("textfrombase");
	}

	public static void main(String[] args) {
		TextField obj=new TextField();
		obj.click();
        obj.text();
        obj.setText(null);
		

	}

}
