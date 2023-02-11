package mas.onboard.constant;

/**
 * @author Precious Pearl A. Sano <pr3_cious_15@yahoo.com>
 *
 * 
 */
public enum OnboardErrorCode {

	EXOB_NO_RECORD("No record found."), 
	EXOB_INV_PREV_STTS_CANCELLED("Invalid previous status is cancelled."), 
	EXOB_INV_OWNER("Not owner of account"),
	EXOB_INV_REQUEST("Invalid request.");
	
	private final String message;
	
	private OnboardErrorCode() {
		this.message = "";
	}
	
	private OnboardErrorCode(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
}
