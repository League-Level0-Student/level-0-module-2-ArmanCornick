package _01_random._6_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class Lottery_Ticket {
public static void main(String[] args) {
Random ran = new Random();	
String lottery = "";
for(int i=0; i < 6; i ++)	{
int chez = ran.nextInt(100);
lottery += chez + " ";
}
JOptionPane.showMessageDialog(null, lottery);	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
