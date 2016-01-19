package naflib;

import com.mongodb.MongoClientException;

public class IdNotExistException extends MongoClientException {

	private static final long serialVersionUID = 1L;

	public IdNotExistException(String message) {
		super(message);
	}
}
