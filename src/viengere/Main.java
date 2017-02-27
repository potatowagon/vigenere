package viengere;

import java.util.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("hi");
		Scanner sc = new Scanner(System.in);

		ArrayList<Character> table = new ArrayList<Character>();
		table.add('A');
		table.add('B');
		table.add('C');
		table.add('D');
		table.add('E');
		table.add('F');
		table.add('G');
		table.add('H');
		table.add('I');
		table.add('J');
		table.add('K');
		table.add('L');
		table.add('M');
		table.add('N');
		table.add('O');
		table.add('P');
		table.add('Q');
		table.add('R');
		table.add('S');
		table.add('T');
		table.add('U');
		table.add('V');
		table.add('W');
		table.add('X');
		table.add('Y');
		table.add('Z');

		ArrayList<Integer> keyNum = new ArrayList<Integer>();

		while (true) {

			String key = sc.nextLine();
			key = key.replaceAll("\\s+","");
			
			String plaintext = sc.nextLine();
			plaintext = plaintext.trim();
			
			keyNum.clear();
			key = key.toUpperCase();
			plaintext = plaintext.toUpperCase();
			String crypted = "";

			for (int i = 0; i < key.length(); i++) {
				
				keyNum.add(table.indexOf(key.charAt(i)));
				//System.out.println();
			}
			
			int x = 0;
			for (int i = 0; i < plaintext.length(); i++) {
				char c = plaintext.charAt(i);
				
				if(c != ' ') {
		
					int r = (table.indexOf(c) + keyNum.get(x % keyNum.size())) % 26;
					//System.out.println("r"+r);
					crypted += table.get(r);
					x++;
				}
				else {
					crypted += " ";
				}
			}
			
			System.out.println(crypted);
		}
		

	}
}
