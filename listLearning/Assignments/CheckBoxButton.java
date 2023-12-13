package Assignments;

public class CheckBoxButton extends Button{
	public void clickCheckButton() {
		System.out.println("derived from button");
	}

	public static void main(String[] args) {
		CheckBoxButton obj=new CheckBoxButton();
		obj.click();
        obj.clickCheckButton();
        obj.setText(null);

	}

}
