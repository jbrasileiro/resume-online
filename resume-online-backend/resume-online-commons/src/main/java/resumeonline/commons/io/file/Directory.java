package resumeonline.commons.io.file;

import java.io.File;
import java.io.IOException;

public class Directory
	extends
	File {

	private static final long serialVersionUID = 1L;

	private void verifyDirectory() {
		if (isFile()) {
			throw new IllegalArgumentException();
		}
	}

	public Directory(
		final String pathname) {
		super(pathname);
		verifyDirectory();
	}

	public Directory(
		final Directory directory,
		final String name) {
		super(directory, name);
		verifyDirectory();
	}

	@Override
	public final boolean createNewFile()
		throws IOException {
		throw new UnsupportedOperationException();
	}
}
