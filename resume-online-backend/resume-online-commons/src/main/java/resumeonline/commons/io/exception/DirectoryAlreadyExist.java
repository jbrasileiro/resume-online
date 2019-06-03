package resumeonline.commons.io.exception;

import java.io.IOException;

import org.apache.commons.lang3.StringUtils;

import resumeonline.commons.io.file.Directory;

public final class DirectoryAlreadyExist
	extends
	IOException {

	private static final long serialVersionUID = 1L;

	private static String message(
		final Directory directory,
		final String message) {
		final StringBuilder builder = new StringBuilder();
		if (StringUtils.isNotBlank(message)) {
			builder.append(message);
			builder.append('\n');
		}
		builder.append("Directory already exist: ".concat(directory.getPath()));
		return builder.toString();
	}

	public DirectoryAlreadyExist() {
		super();
	}

	public DirectoryAlreadyExist(
		final Directory directory) {
		this(directory, null, null);
	}

	public DirectoryAlreadyExist(
		final Directory directory,
		final String message) {
		this(directory, message, null);
	}

	public DirectoryAlreadyExist(
		final Directory directory,
		final Throwable cause) {
		this(directory, null, cause);
	}

	public DirectoryAlreadyExist(
		final Directory directory,
		final String message,
		final Throwable cause) {
		super(message(directory, message), cause);
	}
}
