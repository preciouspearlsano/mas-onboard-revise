package mas.onboard.exception;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Data;

@Data
public class OnboardExceptionBuilder {

	private String status;
	private String payload;
	private String message;
	
	public OnboardExceptionBuilder() {}
	
	public OnboardExceptionBuilder(String payload, String message) {
		this.status = "Expectation Failed.";
		this.payload = payload;
		this.message = message;
	}
	
	@Override
    public String toString() {
        try {
			return new ObjectMapper().writerWithDefaultPrettyPrinter().writeValueAsString(new OnboardExceptionBuilder(payload,message));
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
        return "OnboardExceptionBuilder";
    }
}
