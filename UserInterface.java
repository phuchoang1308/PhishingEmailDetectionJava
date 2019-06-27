public class UserInterface {
	private TextBox subjectTextBox;
	private TextBox bodyTextBox;
	private Button runButton;
	private Button exitButton;

	public UserInterface() {
	}

	public void runButtonCallback() {
		Email email = new Email(subjectTextBox.getText(), bodyTextBox.getText());
		if(PhishingEmailDetector.detect(email)) {
		}
		else {
		}
	}

	public void exitButtonCallback() {
	}
}