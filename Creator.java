import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Creator {
ArrayList<ArrayList<String>> questions = new ArrayList<ArrayList<String>>();
	public Creator(ArrayList<ArrayList<String>> qq){
	questions = qq;
}
	public String TakeTest(){
		ArrayList<ArrayList<String>> qq = removeTags(questions);
		String ret = "";
		for (int i = 0; i < questions.size(); i++) {
			ret+=questions.get(i).get(0)+"\n";
			List<Integer> randList = new ArrayList<Integer>();
			randList.add(1);
			randList.add(2);
			randList.add(3);
			randList.add(4);
			Collections.shuffle(randList);
			for (int j = 0; j < randList.size(); j++) {
			ret+=(char)((randList.get(j)+(int)'A')-1)+questions.get(i).get(randList.get(j))+"\n";
			}
			}
		return ret;
	}
	private ArrayList<ArrayList<String>> removeTags(ArrayList<ArrayList<String>> q2) {
		ArrayList<ArrayList<String>> qq=q2;
		for (int i = 0; i < qq.size(); i++) {
			for (int j = 0; j < qq.get(i).size(); j++) {
	qq.get(i).get(j).replaceAll("#","");
	qq.get(i).get(j).replaceAll("=","");
			}
		}
		return null;
	}
	public String grade(String s){
		int correct = 0;
		String[] answers = s.split(",");
		String[] cAnswers = getAnswers(questions);
		for (int i = 0; i < cAnswers.length; i++) {
			if(answers[i].equals(cAnswers[i])){
				correct++;
			}
		}
	return Double.toString(10.0*(double)(correct/cAnswers.length));
	}
	public String[] getAnswers(ArrayList<ArrayList<String>> qq) {
		ArrayList<String> ret = new ArrayList<String>();
		for (int i = 0; i < qq.size(); i++) {
			for (int j = 0; j < qq.get(i).size(); j++) {
				if(qq.get(i).get(j).contains("=")){
					ret.add(Character.toString((char)(j+(int)'A')));
				}
			}
		}
		return (String[]) ret.toArray();
	}
}
