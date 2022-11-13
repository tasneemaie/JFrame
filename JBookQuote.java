package JFrame;
import javax.swing.JFrame;

import javax.swing.JLabel;
public class JBookQuote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Set width and height of frame

		final int APPLICATION_WIDTH=500;

		final int APPLICATION_HEIGHT=100;

		//Create an instance of JFrame and set a title

		JFrame quoteFrame=new JFrame();

		quoteFrame.setTitle("Book Quote");

		quoteFrame.setSize(APPLICATION_WIDTH,

		APPLICATION_HEIGHT);

		//Set text of type string

		String bookQuote

		="Once there were four children whose names were Peter, Susan, Edmund, and Lucy";

		//Create Label object with bookQuote

		JLabel quoteLabel

		=new JLabel(bookQuote);

		//Add label

		quoteFrame.add(quoteLabel);

		//Call setVisible to true

		quoteFrame.setVisible(true);

		quoteFrame.setDefaultCloseOperation

		(JFrame.EXIT_ON_CLOSE);

		}

		
	}


