//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _01_random._5_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {

	// 1. Make a main method that includes all the steps below
public static void main(String[] args) {
	

	// 2. Get the user to enter a question for the 8 ball to answer
	JOptionPane.showInputDialog("Ask a question.");

	// 3. Make a variable and initialize it to a random number.
	//     ** You will need to make a random object!
	//     Limit the random numbers to be between 0 and 3
Random ran = new Random();	
int chez = ran.nextInt(4);
	// 4. If the random number is 0
	if(chez==(0)) {
	// -- tell the user "Yes"
JOptionPane.showMessageDialog(null, "Yes");
	}
	if(chez==(1)) {
	// -- tell the user "Yes"
JOptionPane.showMessageDialog(null, "No");
	}
	if(chez==(2)) {
	// -- tell the user "Yes"
JOptionPane.showMessageDialog(null, "Answer is unclear");
	}
	if(chez==(3)) {
	// -- tell the user "Yes"
JOptionPane.showMessageDialog(null, "Ask google");
	}
}
}
