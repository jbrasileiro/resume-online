package resume.online.core.service;

import java.io.InputStream;

import resumeonline.commons.classloader.ResourceLoader;
import resumeonline.commons.exeception.ApplicationRuntimeException;
import resumeonline.commons.io.file.utils.FileReaderUtils;

public class DefaultResumePDFService
	implements
	ResumePDFService {

	private ResourceLoader loader;

	public DefaultResumePDFService(
		ResourceLoader loader) {
		super();
		this.loader = loader;
	}

	@Override
	public byte[] getResumeContent() {
		try {
			InputStream resource = loader.loadResourceAsStream("example.pdf");
			return FileReaderUtils.toByteArray(resource);
		} catch (Exception e) {
			throw new ApplicationRuntimeException(e);
		}
	}
}
