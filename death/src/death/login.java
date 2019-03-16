package death;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class login {

	machine machine;
	Stage stage;
	validtest test;
	Scene scene;
	public login(Stage primaryStage) {
		this.stage= primaryStage;
		
	}
	public void preparescene(){
		test = new validtest();
		
	Button login= new Button("login");
	TextField username=new TextField();
	PasswordField password = new PasswordField();
	Label userlab=new Label("username");
	Label passlab=new Label("password");

	Label valid=new Label();
	
	GridPane grid=new GridPane();
	
	grid.add(userlab, 0, 0);
	grid.add(passlab, 0, 1);
	grid.add(username, 1, 0);
	grid.add(password, 1, 1);
	grid.add(login, 1, 2);
	grid.add(valid, 2, 2);
	
	login.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
			
			String Username=username.getText();
			String pass=password.getText();
			
			boolean conf= test.valid(Username, pass);
			
			if(conf) {
				
				valid.setText("welcome");
				stage.setScene(machine.getscene());
			}else {
				valid.setText("wrong pass or name");
			}
			
		}
		
	});
	
	scene= new Scene(grid,600,400);
	
	
	
	}
	public Scene getscene() {
		return this.scene;
	}

	
	
	public void setMachine(machine machine) {
		this.machine = machine;
	}
	
}
