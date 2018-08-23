package checkpoint;

import javax.swing.JOptionPane;

public class Checkpoint {
	public static void main(String[] args) {
		int[] array = new int[Integer.parseInt(JOptionPane.showInputDialog("Array length"))];
		
		for(int i = 0; i < array.length; i++) {
			array[i] = Integer.parseInt(JOptionPane.showInputDialog("Give integer: "));
		}
		
		int r = 0;
		
		for(int i = 0; i < array.length; i++) {
			r+=array[i];
		}
		
		JOptionPane.showMessageDialog(null, "Your total is "+r);
		JOptionPane.showMessageDialog(null, "Avg is "+r/(double)(array.length));
	}
}
