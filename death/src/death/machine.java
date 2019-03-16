package death;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class machine {
	int i=0;
	int z=i,h=i;
	Scene scene;
	
	double amountbal=0;
	double bl=0;
	String  history[]= new String[100];
	Stage stage;
	login login;
	
	public machine(Stage stage){
		this.stage= stage;
	}
	
	
	public void preparescene(){
		
		
	Button logout= new Button("logout");
	TextField enter=new TextField();
	Button deposit= new Button("deposit");
	Button withdraw= new Button("withdraw");
	Button balance= new Button("balance");
	Button next= new Button("next");
	Button back= new Button("back");
	Label check=new Label();
	
	
	GridPane grid=new GridPane();
	
	grid.add(deposit, 0, 0);
	grid.add(withdraw, 0, 1);
	grid.add(balance, 1, 0);
	grid.add(next, 1, 1);
	grid.add(back, 1, 2);
	grid.add(check, 2, 2);
	grid.add(enter, 3, 3);
	
	
	deposit.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
		
			
			String val=enter.getText();
			amountbal= Double.parseDouble(val);
			 bl = amountbal + bl;
			 history[i]=("Deposit: "+val);
			 check.setText(history[i]);
			 i++;
            
             
			 z=i;
			 h=i;
		}
		
		
		
	});
	
	
	
withdraw.setOnAction(new EventHandler<ActionEvent>() {
		
		@Override
		public void handle(ActionEvent event) {
		
			
			String val=enter.getText();
			amountbal= Double.parseDouble(val);
			if(bl>amountbal) {
			 bl = bl - amountbal;
			 history[i]=("withdraw: "+val);
			 check.setText(history[i]);
			 i++;
			}
			else {
				check.setText("error");
			}
             
			z=i;
			 h=i;
		}
		
		
		
	});



balance.setOnAction(new EventHandler<ActionEvent>() {
	
	@Override
	public void handle(ActionEvent event) {
	
		
		
		 history[i]=("checkbalance"+bl);
		 check.setText(history[i]);
		 i++;
        
		 z=i;
		 h=i;
		
	}
	
	
	
});



next.setOnAction(new EventHandler<ActionEvent>() {
	
	@Override
	public void handle(ActionEvent event) {
	
z=z+1;
		if(z<history.length&&history[z]!=null) {
			
			check.setText(history[z]);
		}
		else {
			z=z-1;
				//check.setText("Nothing more to show");
		}
		
         h=z;
		
	}
	
	
	
});
	



back.setOnAction(new EventHandler<ActionEvent>() {
	
	@Override
	public void handle(ActionEvent event) {
	    h=h-1;
	    
	    if(h>=0) {
	    	check.setText(history[h]);
	    }
	    else {
	    	h=h+1;
	    	//check.setText("Nothing more to show");
	    }
	    z=h;
	}
	
	
	
});





logout.setOnAction(new EventHandler<ActionEvent>() {
	
	@Override
	public void handle(ActionEvent event) {
	
		
		stage.setScene(login.getscene());
	
		
		
	}
	
	
	
});



	



	
	scene= new Scene(grid,600,400);
	
	
	
	}
	public Scene getscene() {
		return this.scene;
	}


	
	public void setLogin(login login) {
		this.login = login;
	}
	
	
}


