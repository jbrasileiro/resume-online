package resumeonline.commons.io.file.utils;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;

import resumeonline.commons.exeception.NoNewInstanceAllowed;

public final class FileReaderUtils {

	private FileReaderUtils() {
		super();
		throw new NoNewInstanceAllowed(getClass());
	}

	public static byte[] toByteArray(
		final File file)
		throws IOException {
		return FileUtils.readFileToByteArray(file);
	}

	public static byte[] toByteArray(
		InputStream source)
		throws IOException {
		return IOUtils.toByteArray(source);
	}
}
