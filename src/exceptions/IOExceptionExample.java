package exceptions;

import java.io.IOException;

public class IOExceptionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFileReader mfr = new MyFileReader();
		
		String s1 = null;
		String s2 = null;
		
		try {
			s1 = mfr.readFileToString("//Users//lironbendror//Downloads//thisFileDoesntExist.txt");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			s2 = mfr.readFileToString("//Users//lironbendror//Downloads//ReadMe.txt");
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println(s1);
		System.out.println("-----------------------");
		System.out.println(s2);
		
	}
}
