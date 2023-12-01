package application;

import java.io.IOException;

import javafx.animation.PauseTransition;
import javafx.animation.RotateTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class DroneAnimation {
	ImageView droneImage;
	
	public DroneAnimation(ImageView droneImage) { 
		this.droneImage = droneImage; 
	}
	
	public void visitDroneAnimation(int xCord,int yCord, int droneX, int droneY)throws IOException {
		TranslateTransition tt1 = new TranslateTransition(); 
		tt1.setToX(0); 
		tt1.setToY(0);
		tt1.setDuration(Duration.millis(1000)); 
		tt1.setNode(droneImage);		
		RotateTransition rt1 = new RotateTransition(); 
		rt1.setByAngle(360); 
		rt1.setDuration(Duration.millis(2000));
		rt1.setNode(droneImage);		
		TranslateTransition tt2 = new TranslateTransition(); 
		tt2.setToX(xCord-droneX); 
		tt2.setToY(yCord-droneY);
		tt2.setDuration(Duration.millis(1000)); 
		tt2.setNode(droneImage);		
		PauseTransition pt1 = new PauseTransition(); 
		pt1.setDuration(Duration.millis(1000)); 
						
		SequentialTransition st = new SequentialTransition(tt1, rt1, pt1, tt2); 
		st.play();
	}
	
	public void scanWholeFarm() throws IOException { 

		TranslateTransition s1 = new TranslateTransition();
		s1.setToX(0);
		s1.setToY(0);
		s1.setDuration(Duration.millis(1000)); 
		RotateTransition rt0 = new RotateTransition();
	  	rt0.setByAngle(90);
	  	rt0.setDuration(Duration.millis(500));
	  	rt0.setNode(droneImage);
	  	
	  	s1.setNode(droneImage); TranslateTransition s2 = new TranslateTransition(); 
	  	s2.setToX(520);
	  	s2.setToY(40);
	  	s2.setDuration(Duration.millis(1000)); 	  		  	
	  	s2.setNode(droneImage);
	  	
	  	RotateTransition rt1 = new RotateTransition();
	  	rt1.setByAngle(90);
	  	rt1.setDuration(Duration.millis(500));
	  	rt1.setNode(droneImage);
	  		    
	    TranslateTransition s7 = new TranslateTransition(); 
	    s7.setToX(520); 
	    s7.setToY(190); 
	    s7.setDuration(Duration.millis(500)); 
	  	s7.setNode(droneImage);	  		  	
	    
	  	RotateTransition rt6 = new RotateTransition();
	  	rt6.setByAngle(90);
	  	rt6.setDuration(Duration.millis(500));
	  	rt6.setNode(droneImage);
	    
	  	TranslateTransition s8 = new TranslateTransition(); 
	  	s8.setToX(-380); 
	  	s8.setToY(190); 
	  	s8.setDuration(Duration.millis(1000)); 
	  	s8.setNode(droneImage);	  		  	
	    
	  	RotateTransition rt7 = new RotateTransition(); 
	  	rt7.setByAngle(-90); 
	  	rt7.setDuration(Duration.millis(500)); 
	  	rt7.setNode(droneImage);
	    
	  	TranslateTransition s9 = new TranslateTransition(); 
	  	s9.setToX(-380); 
	  	s9.setToY(300); 
	  	s9.setDuration(Duration.millis(500)); 
	  	s9.setNode(droneImage);	
	  	
	  	RotateTransition rt8 = new RotateTransition();
	  	rt8.setByAngle(-90);
	  	rt8.setDuration(Duration.millis(500)); 
	  	rt8.setNode(droneImage);
	  	
	    TranslateTransition s10 = new TranslateTransition();
	    s10.setToX(520);
	    s10.setToY(300);
	    s10.setDuration(Duration.millis(1000)); 
	  	s10.setNode(droneImage);
	  	
	    RotateTransition rt9 = new RotateTransition();
	    rt9.setByAngle(90); 
	    rt9.setDuration(Duration.millis(500)); 
	    rt9.setNode(droneImage);
	    
	    TranslateTransition s11 = new TranslateTransition();
	    s11.setToX(520);
	    s11.setToY(350); s11.setDuration(Duration.millis(500)); 
	  	s11.setNode(droneImage);	  		  
	  	
	  	RotateTransition rt10 = new RotateTransition(); 
	  	rt10.setByAngle(90);
	  	rt10.setDuration(Duration.millis(500)); 
	  	rt10.setNode(droneImage);
	  	
	    TranslateTransition s12 = new TranslateTransition(); 
	    s12.setToX(-380); 
	    s12.setToY(350); 
	    s12.setDuration(Duration.millis(1000)); 
	  	s12.setNode(droneImage);
	  	
	    RotateTransition rt15 = new RotateTransition(); 
	    rt15.setByAngle(90); 
	    rt15.setDuration(Duration.millis(500)); 
	    rt15.setNode(droneImage);
	    
	    TranslateTransition s17 = new TranslateTransition();
	    s17.setToX(0); 
	    s17.setToY(0); 
	    s17.setDuration(Duration.millis(1500)); 
	  	s17.setNode(droneImage);	  
	  	
	    
	  	SequentialTransition s = new SequentialTransition(
	  			s1, rt0,s2, rt1 ,s7, rt6, s8, rt7 ,s9, rt8, s10, 
	  			rt9 ,s11, rt10, s12, rt15, s17); 
	  	
	  	s.play(); 
	}

}
