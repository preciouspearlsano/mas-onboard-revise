package mas.onboard.dto;

import java.util.List;

import lombok.Data;

/**
 * @author Precious Pearl A. Sano <pr3_cious_15@yahoo.com>
 *
 * 
 */
@Data
public class Onboard {
	private String submissionId;
	private String officerAcctId;
	private String firstName;
	private String middleName;
	private String lastName;
	private String status;
	private String submissionDate;
	private List<Doc> docs;
}
