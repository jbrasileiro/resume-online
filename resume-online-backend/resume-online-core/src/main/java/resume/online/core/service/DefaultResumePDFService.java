package resume.online.core.service;

import java.io.File;
import java.net.URL;

import resumeonline.commons.ResourceClassLoader;
import resumeonline.commons.exeception.ApplicationRuntimeException;
import resumeonline.commons.io.file.utils.FileReaderUtils;

public class DefaultResumePDFService
    implements
    ResumePDFService {

    @Override
    public byte[] getResumeContent() {
        try {
            URL resource = ResourceClassLoader.getResource(getClass(), "example.pdf");
            return FileReaderUtils.toByteArray(new File(resource.getPath()));
        } catch (Exception e) {
            throw new ApplicationRuntimeException(e);
        }
    }
}
