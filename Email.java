public class Email {
	private String subject;
	private String body;

	public Email(String subject, String body) {
		this.subject = subject;
		this.body = body;
	}

	public String getSubject() {
		return subject;
	}

	public String getBody() {
		return body;
	}
}