package Assignments;import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Button extends WebElement{
	public void submit() {
		System.out.println("click for submitted");
	}

	public static void main(String[] args) {
		Button obj=new Button();
		obj.click();
        obj.setText(null);
        obj.submit();

	}

}
