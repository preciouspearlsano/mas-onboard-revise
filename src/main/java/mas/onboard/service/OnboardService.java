package mas.onboard.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.extern.slf4j.Slf4j;
import mas.onboard.constant.DocConstant;
import mas.onboard.constant.OnboardConstant;
import mas.onboard.constant.OnboardErrorCode;
import mas.onboard.dto.Doc;
import mas.onboard.dto.Onboard;
import mas.onboard.dto.OnboardSubmit;
import mas.onboard.dto.RequestSuccess;
import mas.onboard.dto.StatusRequest;
import mas.onboard.dto.StatusRequestView;
import mas.onboard.dto.StatusSearchRequest;
import mas.onboard.dto.ValidationResult;
import mas.onboard.exception.OnboardExceptionBuilder;
import mas.onboard.utils.DateUtils;
import mas.onboard.utils.ObjectUtils;

/**
 * @author Precious Pearl A. Sano <pr3_cious_15@yahoo.com>
 *
 * 
 */
@Slf4j
public class OnboardService {

	//getPearl
	//getPeter
	//getChacha
	
	final Logger logger = LoggerFactory.getLogger(OnboardService.class);
	
	private static List<Onboard> staticOnboards = new ArrayList<Onboard>();
	
	private ObjectUtils objectUtils = new ObjectUtils();
	
	private DateUtils dateUtils = new DateUtils();
	
	private static ObjectMapper mapper = new ObjectMapper();

	public OnboardService() {
	}
	
	public static Onboard getPearl() {
		return null;
	}
	
	public static Onboard getPeter() {
		Onboard onboard = new Onboard();
		onboard.setOfficerAcctId("officer123");
		onboard.setFirstName("Peter");
		onboard.setMiddleName("Sven");
		onboard.setLastName("Young");
		onboard.setSubmissionId("REF-456");
		List<Doc> docs = new ArrayList<Doc>();
		
		Doc doc = new Doc();
		doc.setId("1");
		doc.setObAcctId("REF-456");
		doc.setName("nbi");
		docs.add(doc);
		
		/*doc = new Doc();
		doc.setId("2");
		doc.setObAcctId("REF-456");
		doc.setName("philhealth");
		docs.add(doc);
		
		doc = new Doc();
		doc.setId("3");
		doc.setObAcctId("REF-456");
		doc.setName("pagibig");
		docs.add(doc);
		
		doc = new Doc();
		doc.setId("4");
		doc.setObAcctId("REF-456");
		doc.setName("tin");
		docs.add(doc);
		
		doc = new Doc();
		doc.setId("5");
		doc.setObAcctId("REF-456");
		doc.setName("sketchmap");
		docs.add(doc);
		
		doc = new Doc();
		doc.setId("6");
		doc.setObAcctId("REF-456");
		doc.setName("brgy");
		docs.add(doc);
		
		doc = new Doc();
		doc.setId("7");
		doc.setObAcctId("REF-456");
		doc.setName("medical");
		docs.add(doc);
		
		doc = new Doc();
		doc.setId("8");
		doc.setObAcctId("REF-456");
		doc.setName("drugtest");
		docs.add(doc);
		
		doc = new Doc();
		doc.setId("9");
		doc.setObAcctId("REF-456");
		doc.setName("coe");
		docs.add(doc);
		
		doc = new Doc();
		doc.setId("10");
		doc.setObAcctId("REF-456");
		doc.setName("tor");
		docs.add(doc);*/
		
		onboard.setDocs(docs);
		return onboard;
	}
	
	public static Onboard getChacha() {
		Onboard onboard = new Onboard();
		onboard.setOfficerAcctId("officer123");
		onboard.setFirstName("Chacha");
		onboard.setMiddleName("Xyz");
		onboard.setLastName("Lee");
		onboard.setSubmissionId("REF-123");
		List<Doc> docs = new ArrayList<Doc>();
		
		Doc doc = new Doc();
		doc.setId("1");
		doc.setObAcctId("REF-123");
		doc.setName("nbi");
		docs.add(doc);
		
		doc = new Doc();
		doc.setId("2");
		doc.setObAcctId("REF-123");
		doc.setName("philhealth");
		docs.add(doc);
		
		doc = new Doc();
		doc.setId("3");
		doc.setObAcctId("REF-123");
		doc.setName("pagibig");
		docs.add(doc);
		
		doc = new Doc();
		doc.setId("4");
		doc.setObAcctId("REF-123");
		doc.setName("tin");
		docs.add(doc);
		
		doc = new Doc();
		doc.setId("5");
		doc.setObAcctId("REF-123");
		doc.setName("sketchmap");
		docs.add(doc);
		
		doc = new Doc();
		doc.setId("6");
		doc.setObAcctId("REF-123");
		doc.setName("brgy");
		docs.add(doc);
		
		doc = new Doc();
		doc.setId("7");
		doc.setObAcctId("REF-123");
		doc.setName("medical");
		docs.add(doc);
		
		doc = new Doc();
		doc.setId("8");
		doc.setObAcctId("REF-123");
		doc.setName("drugtest");
		docs.add(doc);
		
		doc = new Doc();
		doc.setId("9");
		doc.setObAcctId("REF-123");
		doc.setName("coe");
		docs.add(doc);
		
		doc = new Doc();
		doc.setId("10");
		doc.setObAcctId("REF-123");
		doc.setName("tor");
		docs.add(doc);
		
		onboard.setDocs(docs);
		return onboard;
	}
	
	public static void main(String[] args) throws JsonProcessingException {
		Onboard onboard = new Onboard();
		onboard.setOfficerAcctId("officer123");
		onboard.setFirstName("Chacha");
		onboard.setMiddleName("Xyz");
		onboard.setLastName("Lee");
		onboard.setSubmissionId("REF-123");
		List<Doc> docs = new ArrayList<Doc>();
		
		Doc doc = new Doc();
		doc.setId("1");
		doc.setObAcctId("REF-123");
		doc.setName("nbi");
		docs.add(doc);
		
		doc = new Doc();
		doc.setId("2");
		doc.setObAcctId("REF-123");
		doc.setName("philhealth");
		docs.add(doc);
		
		doc = new Doc();
		doc.setId("3");
		doc.setObAcctId("REF-123");
		doc.setName("pagibig");
		docs.add(doc);
		
		doc = new Doc();
		doc.setId("4");
		doc.setObAcctId("REF-123");
		doc.setName("tin");
		docs.add(doc);
		
		doc = new Doc();
		doc.setId("5");
		doc.setObAcctId("REF-123");
		doc.setName("sketchmap");
		docs.add(doc);
		
		doc = new Doc();
		doc.setId("6");
		doc.setObAcctId("REF-123");
		doc.setName("brgy");
		docs.add(doc);
		
		doc = new Doc();
		doc.setId("7");
		doc.setObAcctId("REF-123");
		doc.setName("medical");
		docs.add(doc);
		
		doc = new Doc();
		doc.setId("8");
		doc.setObAcctId("REF-123");
		doc.setName("drugtest");
		docs.add(doc);
		
		doc = new Doc();
		doc.setId("9");
		doc.setObAcctId("REF-123");
		doc.setName("coe");
		docs.add(doc);
		
		doc = new Doc();
		doc.setId("10");
		doc.setObAcctId("REF-123");
		doc.setName("tor");
		docs.add(doc);
		
		onboard.setDocs(docs);
		var onboards = new ArrayList<Onboard>();
		onboards.add(onboard);
		var request = new StatusRequest();
		request.setOfficerAcctId("officer000");
		request.setOnboards(onboards);
		System.out.println("Template submit request " + mapper
				.writerWithDefaultPrettyPrinter()
				.writeValueAsString(request));
		
		var service = new OnboardService();
		service.submitOnboard(request);
	}
	
	/**
	 * @param loginId
	 * @return StatusRequestView
	 */
	public StatusRequestView getOnboardListInstall() {
		log.info(" # getOnboardListInstall");
		
		var install = new ArrayList<Onboard>();
		
		install.add(getPeter());
		install.add(getChacha());
		
		staticOnboards = install;
		
		var response = new StatusRequestView();
		response.setOnboards(staticOnboards);
		response.setTotal(staticOnboards.size());
		return response;
	}
	
	/**
	 * @param loginId
	 * @return StatusRequestView
	 */
	public static StatusRequestView getOnboardList(String loginId) {
		log.info(" # getOnboardList");
		
		var onboards = new ArrayList<Onboard>();
		
		staticOnboards.stream().forEach(onboard -> {
			if (loginId.equalsIgnoreCase(onboard.getOfficerAcctId())) {
				onboards.add(onboard);
			}
		});
		
		var response = new StatusRequestView();
		response.setOnboards(onboards);
		response.setTotal(onboards.size());
		return response;
	}
	
	/**
	 * @param submissionId
	 * @return String of StatusRequest and OnboardExceptionBuilder
	 */
	public String loadOnboard(StatusSearchRequest search) {
		log.info(" # loadOnboard");
		
		var response = new StatusRequest();
		
		var onboards = new ArrayList<Onboard>();
		
		staticOnboards.stream().forEach(onboard -> {
			if (searchContains(search,onboard,OnboardConstant.LOAD_METHOD)) {
				onboards.add(onboard);
			}
		});
		
		response.setOfficerAcctId(search.getOfficerAcctId());
		response.setOnboards(onboards);
		
		if (response.getOnboards() != null && response.getOnboards().size()==0) {
			return new OnboardExceptionBuilder(OnboardConstant.EMPTY, OnboardErrorCode.EXOB_NO_RECORD.getMessage()).toString();
		}
		
		return buildResponse(response);
	}
	
	/**
	 * @param submissionId
	 * @return String of StatusRequest and OnboardExceptionBuilder
	 */
	public String getOnboardStatus(StatusSearchRequest search) {
		log.info(" # getOnboardStatus");
		
		var response = new StatusRequest();
		
		var onboards = new ArrayList<Onboard>();
		
		staticOnboards.stream().forEach(onboard -> {
			if (searchContains(search,onboard,OnboardConstant.STATUS_METHOD)) {
				
				onboards.add(onboard);
			}
		});

		response.setOnboards(onboards);
		
		if (objectUtils.isEmpty(search.getFirstName()) && 
				objectUtils.isEmpty(search.getLastName()) && 
				objectUtils.isEmpty(search.getMiddleName()) && 
				objectUtils.isEmpty(search.getFirstName()) && 
				objectUtils.isEmpty(search.getSubmissionId()) && 
				objectUtils.isEmpty(search.getOfficerAcctId())) {
			response.setOnboards(staticOnboards);
		} 
		
		response.setOfficerAcctId(search.getOfficerAcctId());
		
		if (response.getOnboards() != null && response.getOnboards().size() == 0) {
			return new OnboardExceptionBuilder(OnboardConstant.EMPTY, OnboardErrorCode.EXOB_NO_RECORD.getMessage()).toString();
		}
		
		return buildResponse(response);
	}
	
	private String buildResponse(Object response) {
		var print = "";
		try {
			print = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(response);
		} catch (JsonProcessingException e) {
			log.warn("buildResponse conversion error.");
		}
		return print;
	}

	private boolean searchContains(StatusSearchRequest search, Onboard onboard, String method) {
		var found = false;
		var login = false;
		try {
			System.out.println("   .mapper search " + mapper.writeValueAsString(search));
			System.out.println("   .mapper onboard " + mapper.writeValueAsString(onboard));
			System.out.println("   .mapper method " + method);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (objectUtils.nonNull(search.getSubmissionId()) && 
				search.getSubmissionId().equalsIgnoreCase(onboard.getSubmissionId())) {
			found = true;
		}
		if (method.contains(OnboardConstant.STATUS_METHOD) &&
				(objectUtils.nonNull(search.getOfficerAcctId()) && search.getOfficerAcctId().equalsIgnoreCase(onboard.getOfficerAcctId()))) {
			login = true;
		} else {
			if (objectUtils.isEmpty(search.getOfficerAcctId()) ||
					(objectUtils.nonNull(search.getOfficerAcctId()) && search.getOfficerAcctId().equalsIgnoreCase(onboard.getOfficerAcctId()))) {
				login = true;
			}
		}
		
		if (objectUtils.nonNull(search.getFirstName()) && search.getFirstName().equalsIgnoreCase(onboard.getFirstName())) {
			found = true;
		}
		if (objectUtils.nonNull(search.getMiddleName()) && search.getMiddleName().equalsIgnoreCase(onboard.getMiddleName())) {
			found = true;
		}
		if (objectUtils.nonNull(search.getLastName()) && search.getLastName().equalsIgnoreCase(onboard.getLastName())) {
			found = true;
		}
		if (objectUtils.nonNull(search.getStatus()) && search.getStatus().equalsIgnoreCase(onboard.getStatus())) {
			found = true;
		}
		System.out.println("   .found " + found );
		System.out.println("   .login " + login );
		if (!login) found = false;
		return found;
	}
	
	/**
	 * @param submissionId
	 * @return RequestSuccess
	 * @throws JsonProcessingException 
	 */
	public String cancelOnboard(StatusSearchRequest search) throws JsonProcessingException  {
		log.info(" # cancelOnboard");
		
		var response = new OnboardSubmit();
		
		var submissionDate = dateUtils.getDate();
		
		var onboards = new ArrayList<Onboard>();
		
		var recordFound = new RequestSuccess();
		recordFound.setSuccess(true);
		
		if (Objects.isNull(staticOnboards) ||
				(Objects.nonNull(staticOnboards) && staticOnboards.size() == 0)) {
			
			recordFound.setSuccess(false);
			recordFound.setRemarks(OnboardErrorCode.EXOB_NO_RECORD.getMessage());
		} else {
			
			staticOnboards.stream().forEach(onboard -> {
				if (searchContains(search,onboard,OnboardConstant.CANCEL_METHOD)) {
					if (Objects.isNull(onboard.getStatus()) || 
							(Objects.nonNull(onboard.getStatus()) && !onboard.getStatus().equalsIgnoreCase(OnboardConstant.OB_CANCELLED))){
						
						onboard.setSubmissionId(onboard.getSubmissionId());
						onboard.setSubmissionDate(submissionDate);
						onboard.setStatus(OnboardConstant.OB_CANCELLED);
						onboards.add(onboard);
						
						response.setSubmissionId(onboard.getSubmissionId());
						response.setSubmissionDate(submissionDate);
						response.setStatus(onboard.getStatus());
					} else
					if (Objects.nonNull(onboard.getStatus()) && onboard.getStatus().equalsIgnoreCase(OnboardConstant.OB_CANCELLED)) {
						
						recordFound.setSuccess(false);
						recordFound.setRemarks(OnboardErrorCode.EXOB_INV_PREV_STTS_CANCELLED.getMessage());
					}
					
				}
			});
		}
		
		if ((Objects.nonNull(recordFound.getRemarks()) && recordFound.getRemarks().isEmpty()) && 
				Objects.nonNull(search) && Objects.nonNull(onboards) && onboards.size() == 0) {
			recordFound.setSuccess(false);
			recordFound.setRemarks(OnboardErrorCode.EXOB_NO_RECORD.getMessage());
		}
		
		var responseString = "";
		if (!recordFound.isSuccess()) responseString = buildResponse(recordFound);
		else responseString = buildResponse(response);
		
		return responseString;
	}
	
	



	/**
	 * @param onboard
	 * @return
	 */
	private Onboard buildOnboard(Onboard request) {
		Onboard onboard = new Onboard();
		onboard.setSubmissionId(UUID.randomUUID().toString());
		if (!ObjectUtils.nullSafe(request.getSubmissionId()).isEmpty()) {
			onboard.setSubmissionId(request.getSubmissionId());
		}
		onboard.setOfficerAcctId(request.getOfficerAcctId());
		onboard.setFirstName(request.getFirstName());
		onboard.setMiddleName(request.getMiddleName());
		onboard.setLastName(request.getLastName());
		onboard.setStatus(OnboardConstant.OB_COMPLETED);
		onboard.setSubmissionDate(dateUtils.getDate());
		return onboard;
	}

	
	/**
	 * @param request
	 * @return OnboardSubmit
	 * @throws JsonProcessingException 
	 */
	public String submitOnboard(StatusRequest request) throws JsonProcessingException {
		log.info(" # submitOnboard");
		
		var responseString = "";
		var response = new OnboardSubmit();

		var validation = new ValidationResult();
		
		List<Onboard> onbboards = mapper.convertValue(request.getOnboards(), new TypeReference<List<Onboard>>() { });
		request.setOnboards(onbboards);
		
		if (Objects.nonNull(request) && Objects.nonNull(request.getOnboards())) {
			request.getOnboards().stream().forEach(onboard -> {
				if (Objects.isNull(onboard.getStatus()) || 
						(Objects.nonNull(onboard.getStatus()) &&
								!onboard.getStatus().equalsIgnoreCase(OnboardConstant.OB_CANCELLED) &&
								!onboard.getStatus().equalsIgnoreCase(OnboardConstant.OB_COMPLETED))) {
					
					var search = new StatusSearchRequest();
					search.setSubmissionId(onboard.getSubmissionId());

					var prevStatusRequestErr = "";
					
					String prevStatusRequestStr;
					prevStatusRequestStr = loadOnboard(search);

					if (prevStatusRequestStr.contains(OnboardErrorCode.EXOB_NO_RECORD.getMessage())) {
						prevStatusRequestErr = prevStatusRequestStr;
					}
					validation.setResponse(validationOwner(onboard));

					if (validation.getResponse().isEmpty()) {

						var status = validationOnboard(request);
						var submissionDate = dateUtils.getDate();
						
						if (!objectUtils.isEmpty(prevStatusRequestErr)) {
							var txnObNew = buildOnboard(onboard);
							txnObNew.setSubmissionDate(submissionDate);
							txnObNew.setOfficerAcctId(request.getOfficerAcctId());

							onboard.getDocs().stream().forEach(doc -> {
								doc.setObAcctId(txnObNew.getSubmissionId());
								doc = buildOnboardDoc(doc);
							});

							var submissionId = txnObNew.getSubmissionId();
							txnObNew.setStatus(getStatus(status.isSuccess()));
							
							staticOnboards.add(txnObNew);
							log.info("Total staticOnboards : " + staticOnboards.size());
							
							response.setSubmissionId(submissionId);
							response.setStatus(getStatus(status.isSuccess()));
							response.setSubmissionDate(submissionDate);
						} else {
							staticOnboards = staticOnboards.stream()
								.filter(previous -> previous.getSubmissionId().equalsIgnoreCase(onboard.getSubmissionId()))
							    .map(previous -> buildOnboardUpdate(previous,onboard,status.isSuccess(),submissionDate)).collect(Collectors.toList());
							response.setSubmissionId(onboard.getSubmissionId());
							response.setStatus(getStatus(status.isSuccess()));
							response.setSubmissionDate(submissionDate);
						}
					}
				}//if
			});
		} else {
			responseString = new OnboardExceptionBuilder(OnboardConstant.EMPTY, OnboardErrorCode.EXOB_INV_REQUEST.getMessage()).toString();
		}
		
		
		if (!validation.getResponse().isEmpty()) responseString =  validation.getResponse(); 
		else responseString = buildResponse(response);
		log.info(" # submitOnboard finalResponse - " + responseString);
		return responseString;
	}


	/**
	 * @param previous
	 * @return
	 */
	private Onboard buildOnboardUpdate(Onboard previous, Onboard latest,boolean status,String submissionDate) {
		previous = buildOnboard(latest);
		previous.setSubmissionDate(submissionDate);
    	previous.setStatus(getStatus(status));
    	
    	var docsUpdate = new ArrayList<Doc>();
    	for (Doc doc : latest.getDocs()) {
    		doc.setObAcctId(previous.getSubmissionId());
			doc = buildOnboardDoc(doc);
			docsUpdate.add(doc);
    	}
    	
    	previous.setDocs(docsUpdate);
		
		return previous;
	}

	/**
	 * @param onboard
	 * @param 
	 */
	private String validationOwner(Onboard onboard) {
		
		for (Onboard staticOb : staticOnboards) {
			if (!onboard.getOfficerAcctId().equalsIgnoreCase(staticOb.getOfficerAcctId())
					&& Objects.nonNull(onboard.getSubmissionId())) {
				var result = new OnboardExceptionBuilder(OnboardConstant.EMPTY, OnboardErrorCode.EXOB_INV_OWNER.getMessage());
				return result.toString();
			}
		}
		return "";
		
	}
	

	/**
	 * @param doc
	 * @return
	 */
	private Doc buildOnboardDoc(Doc doc) {
		Doc tmp = new Doc();
		tmp.setName(doc.getName());
		tmp.setObAcctId(doc.getObAcctId());
		return tmp;
	}
	
	/**
	 * @param status
	 * @return
	 */
	private String getStatus(boolean status) {
		if (status) {
			return OnboardConstant.OB_COMPLETED;
		} else {
			return OnboardConstant.OB_PENDING;
		}
	}

	
	/**
	 * @param request
	 * @return 
	 * @return RequestSuccess
	 */
	public RequestSuccess validationOnboard(StatusRequest request) {
		RequestSuccess response = new RequestSuccess();
		response.setSuccess(false);
		
		request.getOnboards().stream().forEach(onboard -> {
			if (Objects.nonNull(onboard) && Objects.nonNull(onboard.getDocs())) {
				var missing = new ArrayList<String>();
				for (String name : DocConstant.DOC) {
					var exist = false;
					for (Doc doc : onboard.getDocs()) {
						if (name.contains(doc.getName())) exist = true;
					}
					if (!exist) missing.add(name);
				}
				if (missing.size() == 0) response.setSuccess(true);
				if (missing.size() > 0) {
					response.setSuccess(false);
					response.setRemarks("Remaining doc(s): " + missing.toString());
				}
			}
		});
		return response;
	}
	
}
