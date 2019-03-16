package death;

import javafx.application.Application;
import javafx.stage.Stage;

public class ourmain  extends Application {

	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
		
		primaryStage.setTitle("ATM");
		login log=new login(primaryStage);
		machine mac= new machine(primaryStage);
		log.preparescene();
		mac.preparescene();
		log.setMachine(mac);
		mac.setLogin(log);
		primaryStage.setScene(log.getscene());
		primaryStage.show();
		
	}
	

}
