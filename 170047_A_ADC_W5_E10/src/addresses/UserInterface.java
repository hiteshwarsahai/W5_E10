package addresses;

import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.shape.Rectangle;

/*******
 * <p> Title: UserInterface Class. </p>
 * 
 * <p> Description: A JavaFX demonstration application: This controller class describes the user
 * interface for the Exercise10 demonstration application </p>
 * 
 * <p> Copyright: Lynn Robert Carter © 2018-08-26 </p>
 * 
 * @author Lynn Robert Carter
 * @editing Author: Hiteshwar sahai
 * 
 * 
 * @version 2.03	2018-07-19 Baseline
 * @version 3.00	2018-08-26 An enhancement for Exercise 11
 * 
 */
public class UserInterface {

	
	/**********************************************************************************************

	Class Attributes
	
	**********************************************************************************************/

	// Attributes used to establish the display and control panel within the window provided to us
	private static final double THIS_WINDOW_HEIGHT = Exercise10AddressesTestMainline.WINDOW_HEIGHT;
	private static final double CONTROL_PANEL_HEIGHT = THIS_WINDOW_HEIGHT - 110;
	private static final double THIS_WINDOW_WIDTH = Exercise10AddressesTestMainline.WINDOW_WIDTH;	
	
	// These attributes put a graphical frame around the portion of the window that receives the
	// black squares representing alive cells
	private Rectangle rect_outer =  new Rectangle(0,0,THIS_WINDOW_WIDTH, CONTROL_PANEL_HEIGHT-5);
	private Rectangle rect_middle = new Rectangle(5,5,THIS_WINDOW_WIDTH-10, CONTROL_PANEL_HEIGHT-15);
	private Rectangle rect_inner =  new Rectangle(6,6,THIS_WINDOW_WIDTH-12, CONTROL_PANEL_HEIGHT-17);

	// This attribute holds the text that will be displayed 
	private TextArea blk_Text = 
			new TextArea("The addresses that are displayed on the console should be displayed here too!");
		
	
	/**********************************************************************************************

	Constructors
	
	**********************************************************************************************/

	/**********
	 * This constructor established the user interface with all of the graphical widgets that are
	 * use to make the user interface work.
	 * 
	 * @param theRoot	This parameter is the Pane that JavaFX expects the application to use when
	 * 					it sets up the GUI elements.
	 */
	public UserInterface(Pane theRoot) {
				
		// Set the fill colors for the border frame for the game's output of the simulation
		rect_outer.setFill(Color.LIGHTGRAY);
		rect_middle.setFill(Color.BLACK);
		rect_inner.setFill(Color.WHITE);
		
		// Place a text area into the window and just within the above frame and make it not editable
		setupTextAreaUI(blk_Text, "Monaco", 14, 6, 6, THIS_WINDOW_WIDTH-12, CONTROL_PANEL_HEIGHT-17, false);		

		// Place all of the just-initialized GUI elements into the pane with the exception of the
		// Stop button.  That widget will replace the Start button, once the Start has been pressed
		theRoot.getChildren().addAll(rect_outer, rect_middle, rect_inner, blk_Text);
	}

	
	/**********************************************************************************************

	Helper methods - Used to set up the JavaFX widgets and simplify the code above
	
	**********************************************************************************************/

	/**********
	 * Private local method to initialize the standard fields for a text field
	 */
	private void setupTextAreaUI(TextArea t, String ff, double f, double x, double y, double w, double h, boolean e){
		t.setFont(Font.font(ff, f));
		t.setPrefWidth(w);
		t.setPrefHeight(h);	
		t.setLayoutX(x);
		t.setLayoutY(y);	
		t.setEditable(e);
		t.setWrapText(true);
	}

	
	/**********************************************************************************************

	Action methods - Used cause things to happen during the execution of the application
	
	**********************************************************************************************/
	public void appendAddress(UnitedStatesAddress IrcarterAddress, QatarBusinessAddress cmuQatarAddress, IndiaAddress MaharishimarkandeshwaruniversityAddress, ParentAddress ParentAddress)
	{
		blk_Text.setText(IrcarterAddress +"\n" +"----------------------------" +"\n"+cmuQatarAddress +"\n" + MaharishimarkandeshwaruniversityAddress +"\n");
		blk_Text.appendText(ParentAddress + "\n");
	}
}
