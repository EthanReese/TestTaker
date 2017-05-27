package TestTaker;

import java.io.*;
improt java.util.Scanner;

public class Reader {
	Scanner fr;
	FileWriter fw;
	FileWriter scorewriter;

	public Reader(String filename, scorefilename) {
		try {
			fw = new FileWriter(filename);
			fr = new Scanner(new File(filename));
			scorewriter = new FileWriter(scorefilename);
		}
	}

	public ArrayList<ArrayList<String>> getQuestions() {
		ArrayList<ArrayList<String>> qs = new ArrayList<ArrayList<String>>();
		boolean inanswers = false;
		
		while (fr.hasNextLine()) {
			ArrayList<String> entry = new ArrayList<String>();
			
			for (int i = 0; i < 5; i++) {
				entry.add(fr.nextLine());
			}
			
			qs.add(entry);
		}
		
		return qs;
	}

	public void addQuestion(String question, String answers) {
		fw.append(question);
		fw.append(answers);
	}
	
	public void addScore(int score) {
		scorefile.append('\n');
		scorefile.append(Integer.toString(score));
	}
}
