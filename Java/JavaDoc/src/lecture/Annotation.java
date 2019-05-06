package lecture;

/** An Annotation class as an example of using JavaDoc.
 * @author Pravat Bhusal
 * @author https://shadowsych.github.io/
 * @version 1.0
 * @since 1.0
 */
public class Annotation {
	/**
	 * The name of this annotation.
	 */
	public String name;

	/**
	 * The author of this annotation.
	 * Note: This will NOT show on the JavaDoc, since it only accepts public fields.
	 * Note: If you wish to show this on JavaDoc, read "JavaDoc Scope" in the README.md
	 */
	protected String author;

	/* (non-Javadoc)
	 * The version of this annotation.
	 * Note: The 'public String version' will show on JavaDoc but with no notes
	 * 		or annotations because this comment uses non-JavaDoc commenting.
	 */
	public int version;

	/**
	 * Construct an Annotation.
	 * @param name the name of the annotation
	 * @param author the author of the annotation
	 * @param version the version of this annotation
	 */
	public Annotation(String name, String author, int version) {
		this.name = name;
		this.author = author;
		this.version = version;
	}

	/**
	 * Set the name of this annotation.
	 * @param name the new name of this annotation
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Set the author of this annotation.
	 * @param author the new author of this annotation
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * Set the version of this annotation.
	 * @param version the new version of the annotation
	 * @throws IllegalArgumentException if sent a version less than or equal to 0.
	 */
	public void setVersion(int version) {
		if(version <= 0) {
			throw new IllegalArgumentException("Version cannot be less than or equal to 0!");
		}
		this.version = version;
	}

	/**
	 * Get the name of this annotation.
	 * @return The name of this annotation.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Get the author of this annotation.
	 * @return The author of this annotation.
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * Get the version of this annotation.
	 * @return The version of this annotation.
	 */
	public int getVersion() {
		return version;
	}

	/**
	 * Get this annotation as a String.
	 * @deprecated
	 * <p>
	 * The Annotation class no longer should use this method.
	 * <p>
	 * Use toString(), instead.
	 * @see #toString()
	 * @return This annotation as a String.
	 */
	public String getString() {
		return "Author: " + author + ", Name: " + name + ", Version:" + version;
	}

	/**
	 * Get this annotation as a String.
	 * @return This annotation as a String.
	 */
	@Override
	public String toString() {
		return "Author: " + author + ", Name: " + name + ", Version:" + version;
	}
}
