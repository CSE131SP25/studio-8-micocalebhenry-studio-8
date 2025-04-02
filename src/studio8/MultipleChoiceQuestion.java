package studio8;

import support.cse131.NotYetImplementedException;

public class MultipleChoiceQuestion extends Question {
	private String[] choices;
	/**
	 * Constructor
	 * @param prompt
	 * @param answer
	 * @param points
	 * @param choices
	 */
	public MultipleChoiceQuestion(String prompt, String answer, int points, String[] choices) {
		// Call the super class constructor, then create and set
		// instance variables for any values that aren't handled
		// by the base class
		super(prompt, answer, points);
		this.choices = choices;
	}
	
	/**
	 * Display the prompt for the question in addition to 
	 * the choices present for the question.
	 */
	
	public void displayPrompt() {
		super.displayPrompt();
		for (int i=0; i<choices.length; i++) {
			System.out.println((i+1)+ ". " + choices[i]);
		}	
	}
	
	/**
	 * Getter method for the available choices
	 * @return String[] of choices
	 */
	public String[] getChoices() {
		return choices;
	}
	
	public static void main(String[] args) {
		String[] options =  new String[4];
		options[0] = "blue";
		options[1] = "green";
		options[2] = "neon red";
		options[3] = "pink";
		
		MultipleChoiceQuestion mcq = new MultipleChoiceQuestion("What color is the sky?", "blue", 3, options);
		mcq.displayPrompt();
		Question q = new Question("What color is the sky?", "blue", 3);
		q.displayPrompt();
	}

}
