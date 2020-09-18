package chap13.visitor_pattern;

public class FileTreatmentException extends RuntimeException{

	private static final long serialVersionUID = -3298131880895765301L;

	public FileTreatmentException() {
		super();
	}

	public FileTreatmentException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public FileTreatmentException(String message, Throwable cause) {
		super(message, cause);
	}

	public FileTreatmentException(String message) {
		super(message);
	}

	public FileTreatmentException(Throwable cause) {
		super(cause);
	}

}
