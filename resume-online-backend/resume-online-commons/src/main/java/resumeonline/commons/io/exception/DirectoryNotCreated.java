package resumeonline.commons.io.exception;

import java.io.File;
import java.io.IOException;

import org.apache.commons.lang3.StringUtils;

public final class DirectoryNotCreated
	extends
	IOException {

	private static final long serialVersionUID = 1L;

	private static String message(
		File file,
		String message) {
		StringBuilder builder = new StringBuilder();
		if(StringUtils.isNotBlank(message)) {
			builder.append(message);
			builder.append('\n');
		}
		builder.append("Directory was not created.");
		builder.append("\npath          : " + file.getPath());
		builder.append("\nexists        : " + file.exists());
		builder.append("\nfree space    : " + file.getFreeSpace());
		builder.append("\ntotal space   : " + file.getTotalSpace());
		builder.append("\nusable space  : " + file.getUsableSpace());
		builder.append("\nmodified      : " + file.lastModified());
		builder.append("\nlength        : " + file.length());
		builder.append("\nfile          : " + file.isFile());
		builder.append("\ndirectory     : " + file.isDirectory());
		builder.append("\nabsolute      : " + file.isAbsolute());
		builder.append("\nhiden         : " + file.isHidden());
		builder.append("\nread          : " + file.canRead());
		builder.append("\nwrite         : " + file.canWrite());
		builder.append("\nexecute       : " + file.canExecute());
		return builder.toString();
	}

	public DirectoryNotCreated(
		File file) {
		this(file, null, null);
	}

	public DirectoryNotCreated(
		File file,
		String message) {
		this(file, message, null);
	}

	public DirectoryNotCreated(
		File file,
		Throwable cause) {
		this(file, null, cause);
	}

	public DirectoryNotCreated(
		File file,
		String message,
		Throwable cause) {
		super(message(file, message), cause);
	}
}
