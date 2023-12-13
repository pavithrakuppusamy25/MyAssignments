package interfaceAssignment;

public class ConcreteClass implements DataBaseConnection {

	public static void main(String[] args) {
		ConcreteClass obj=new ConcreteClass();
		obj.connect();
        obj.disConnect();
         obj.disConnect();

	}

	@Override
	public void connect() {
		System.out.println("connect of inter");
		
	}

	@Override
	public void disConnect() {
		System.out.println("disconnect of inter");
		
	}

	@Override
	public void executeUpdate() {
		System.out.println("executeUpdate of inter");
		
	}

}
