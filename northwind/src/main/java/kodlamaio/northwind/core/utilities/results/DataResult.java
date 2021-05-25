package kodlamaio.northwind.core.utilities.results;

public class DataResult<T> extends Result {

	private T data;

	public DataResult(T data, boolean succcess, String message) {
		super(succcess, message);
		this.data = data;

	}

	public DataResult(T data, boolean succcess) {
		super(succcess);
		this.data = data;

	}

	public T getData() {
		return this.data;
	}
}
