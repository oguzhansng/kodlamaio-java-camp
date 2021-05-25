package kodlamaio.northwind.core.utilities.results;

public class Result { // super type 

	private boolean success;
	private String message;

	public Result(boolean succcess) {
		this.success = succcess;

	}

	public Result(boolean succcess, String message) {
		this(succcess);
		this.message = message;

	}

	public boolean isSuccess() {
		return this.success;
	}

	public String getMessage() {
		return this.message;
	}

}
