package _03_string_conversion._1_intro;

import javax.swing.JOptionPane;

public class Convert {
	public static void main(String[] args) {
		String quantity = JOptionPane.showInputDialog(null, "Enter a number.");
		int num = Integer.parseInt(quantity);
	}
}
