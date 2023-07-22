package _03_string_conversion._4_voting_booth;

import javax.swing.JOptionPane;

public class voting_booth {
	public static void main(String[] args) {
	String age = JOptionPane.showInputDialog(null, "Hold old are you?");
	int ageNum = Integer.parseInt(age);
	if(ageNum > 17) {
	JOptionPane.showInputDialog(null, "Who do you vote for president?");
	}
	else {	
	JOptionPane.showMessageDialog(null, "Nobody cares about who you vote for.");	
	}	
		
		
		
		
		
		

	}
}
