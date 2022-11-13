package JFrame;

	import java.awt.FlowLayout;

	import java.awt.event.ActionEvent;

	import java.awt.event.ActionListener;

	import javax.swing.JButton;

	import javax.swing.JFrame;

	import javax.swing.JLabel;

	@SuppressWarnings("serial")
	public class JBookQuote2 extends JFrame implements ActionListener

	{

	//Set width and height of frame

	final int APPLICATION_WIDTH=500;

	final int APPLICATION_HEIGHT=100;

	//Set text of type string

	String bookQuote="Once there were four children whose names were Peter, Susan, Edmund, and Lucy";

	JButton btnDisplay=new JButton("Display Quote");

	//Create Label object with bookQuote

	JLabel quoteLabel=new JLabel();

	//Constructor that adds the button and label to the frame

	public JBookQuote2()

	{

	//Set title of frame

	setTitle("The Lion, The Witch, and The Wardrobe");

	//Set width and height of the frame

	setSize(APPLICATION_WIDTH, APPLICATION_HEIGHT);

	//Set layout flow layout

	setLayout(new FlowLayout());

	//Add button

	add(btnDisplay);

	//Add label

	add(quoteLabel);

	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	/**Add an action listener to the button */

	btnDisplay.addActionListener(this);

	}

	/*Override the method actionPerformed that sets the

	* bookQuote text to label when user clicks the button*/

	@Override

	public void actionPerformed(ActionEvent e)

	{

	quoteLabel.setText(bookQuote);

	}

	public static void main(String[] args)

	{

	//Create an instance of JBookQuote2

	JBookQuote2 bookFrame=new JBookQuote2();

	//Call setVisible to true

	bookFrame.setVisible(true);

	}

	}