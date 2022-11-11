package distanceFromAverage;

import javax.swing.JOptionPane;

public class DistanceFromAverage {

	public static void main(String[] args) {
		int count = 1;
		int num = 0;
		int total = 0;
		
		try {
		while(count<=15 || num!=999) {
					
			num = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter a number or 999 to quit: "));
			total += num;
			double avg = total / count;
			double distance = avg - num;
			JOptionPane.showMessageDialog(null, "The average is " + avg + " and "+ num + " is " + distance + " away.");
			count += 1;
		}
		}
		catch(NumberFormatException e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}
}
