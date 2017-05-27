package TestTaker;

public class TestTaker {
	System.out.println("Your input options are test or create");

	Scanner scanner = new Scanner(System.in);
	Creator creator = new creator();
	Reader reader = new reader();

	Boolean running = true;
	while(running = false){
		System.out.println("Your inputs are test, create, and quit");
		String input  = scanner.nextLine();
		if(input.toUpperCase() == "TEST"){
			System.out.println(creator.takeTest());
		}
		else if(input.toUpperCase() == "QUIT"){
			running = false;
		}
		else if(input.toUpperCase() == "CREATE"){
			System.out.println("Please enter a question.");
			String question = "-"
			question += scanner.nextLine();
			question += "\n"
			System.out.println("Please enter the possible answers separated by the '#' character. Indicate the correct answer with the '=' character");
			String answerBlock = scanner.nextLine();
			for (int i = 0; i < answerBlock.length(); i++) {
				if(answerBlock.charAt(i) == '#' || answerBlock.charAt(i) == '='){
					input = input.substring(0,i-1) + "\n" + input.substring(i-1, input.length());
				}
			}
			reader.addQuestion(question, answerBlock);

		}
		else{
			System.out.println("Please enter a valid input")
		}
	}


	public static void main(String[] args) {
		new TestTaker();
	}

}
