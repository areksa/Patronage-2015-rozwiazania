package pl.areksa;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class App {
	private ArrayList<Double> NumbArr;

	public App() {
		NumbArr = new ArrayList<Double>();
	}

	public void readFile(String file) throws FileNotFoundException {
		Scanner inFile = new Scanner(new FileReader(file));
		while (inFile.hasNext()) {
			String s = inFile.next();
			double d = Double.parseDouble(s);
			NumbArr.add(d);
		}
	}

	public void operations() {
		System.out.println("Liczby znajduj¹ce siê w pliku dane.txt:");

		for (Iterator iterator = NumbArr.iterator(); iterator.hasNext();) {
			double n = (Double) iterator.next();
			System.out.println(n);
		}

		Collections.sort(NumbArr);
		System.out.println("Posortowane rosn¹co liczby z pliku dane.txt:");
		for (Iterator iterator = NumbArr.iterator(); iterator.hasNext();) {
			double n = (Double) iterator.next();
			System.out.println(n);
		}

		double s = 0;
		for (Iterator iterator = NumbArr.iterator(); iterator.hasNext();) {
			s = s + (Double) iterator.next();
		}
		System.out.println("Suma liczb znajduj¹cych siê w pliku dane.txt: \n"
				+ s);
		double m = s / NumbArr.size();
		System.out.println("Œrednia arytmetyczna liczb znajduj¹cych siê w pliku dane.txt: \n" + m);
	}

	public static void main(String[] args) {
		try {
			App Solution = new App();
			Solution.readFile("dane.txt");
			Solution.operations();
		} catch (IOException ioe) {
			System.out.print("Trouble reading from the file: " + ioe.getMessage());
		}
	}
}
