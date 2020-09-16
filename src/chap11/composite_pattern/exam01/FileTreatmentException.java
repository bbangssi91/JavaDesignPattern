package chap11.composite_pattern.exam01;

public class FileTreatmentException extends RuntimeException {

	private static final long serialVersionUID = 5191329355178623559L;

	public FileTreatmentException() {
	}

	public FileTreatmentException(String message) {
		super(message);
	}

	public FileTreatmentException(Throwable cause) {
		super(cause);
	}

	public FileTreatmentException(String message, Throwable cause) {
		super(message, cause);
	}

	public FileTreatmentException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
