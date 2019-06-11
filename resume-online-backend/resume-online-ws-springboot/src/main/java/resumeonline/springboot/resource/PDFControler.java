package resumeonline.springboot.resource;

import javax.inject.Inject;

import org.springframework.http.CacheControl;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import resumeonline.core.service.ResumePDFService;

@RestController
@RequestMapping(
	value = "/PDF")
public class PDFControler {

	private final ResumePDFService resumePDFService;

	@Inject
	public PDFControler(
		ResumePDFService resumePDFService) {
		super();
		this.resumePDFService = resumePDFService;
	}

	@RequestMapping(
		value = "/download",
		method = RequestMethod.GET)
	public ResponseEntity<byte[]> download() {
		HttpHeaders headers = new HttpHeaders();
		byte[] content = resumePDFService.getResumeContent();
		headers.setCacheControl(CacheControl.noCache().getHeaderValue());
		return ResponseEntity.ok(content);
	}
}
