import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Creator {
ArrayList<ArrayList<String>> questions = new ArrayList<ArrayList<String>>();
	public Creator(ArrayList<ArrayList<String>> qq){
	questions = qq;
}
	public String TakeTest(){
		String ret = "";
		for (int i = 0; i < questions.size(); i++) {
			ret+=questions.get(i).get(0)+"\n";
			List<Integer> randList = new ArrayList<Integer>();
			randList.add(1);
			randList.add(2);
			randList.add(3);
			randList.add(4);
			Collections.shuffle(questions);
			for (int j = 0; j < randList.size(); j++) {
			ret+=questions.get(i).get(j)+"\n";
			}
			}
		return ret;
	}
}
