package mas.onboard.dto;

import java.util.List;

import lombok.Data;

/**
 * @author Precious Pearl A. Sano <pr3_cious_15@yahoo.com>
 *
 * 
 */
@Data
public class StatusRequest {
	private String officerAcctId;
	private List<Onboard> onboards;
}
