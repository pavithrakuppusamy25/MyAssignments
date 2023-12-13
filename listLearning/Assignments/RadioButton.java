package Assignments;

public class RadioButton extends Button{
	public void selectRadioButton() {
		System.out.println("radio buttn from radio");
	}

	public static void main(String[] args) {
		RadioButton obj=new RadioButton();
		obj.selectRadioButton();
        obj.click();
        obj.setText(null);
        obj.submit();

	}
	

}
