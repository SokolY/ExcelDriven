import java.io.IOException;

public class TestExecution {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DataDriven data = new DataDriven();
		System.out.println(data.getData("Login").get(1));
		System.out.println(data.getData("Delete Profile").get(3));

	}

}
