# JavaDoc
JavaDoc is a tool used to properly comment (document) Java programs. You can export Java Doc
programs into an HTML web-site for other programmers to read and understand your implementation.
- You can also add your own HTML tags onto a JavaDoc comment block

# How to Generate JavaDoc in Eclipse
Click "project" then click "Generate Javadoc" then pick the folders and packages of the Java program that you wish to generate a Java documentation.
- Once generated, a "doc" folder is created in the main directory for the Java project
- This "doc" folder is the web-site for your Java Documentation to your program
	- Open the "index.html" file inside the "doc" folder in a web-browser to see the web-site

# Formatting with JavaDoc
In order to format a comment into a Java Doc comment, use double asterisks on a block-comment.

Here's an example of a JavaDoc comment:
```(java)
/**
* This is a JavaDoc comment!
*/
```

This is NOT an example of a JavaDoc comment:
```(java)
/*
* This is NOT a JavaDoc comment...
*/

### JavaDoc Scope
By default, only public methods, classes, or fields will show their annotations whenever generating a JavaDoc. Not even protected methods, classes, or fields show annotations.
- However, you can specify if you wish to show private, package, or protected visibility whenever generating a JavaDoc in Eclipse
	- Whenever generating the JavaDoc, just pick the options for ```Create JavaDoc for members with visibility:```

# Annotations
JavaDoc uses annotations to note specific parts of a program.
- @author: Provides information about the author.
	- Ex: Name, e-mail address, web-site, etc.
- @version: Indicates the version.
- @since: Indicates the version which this method, class, or field was created.
- @param: The parameter description for a method.
- @return: The return description for a method.
- @throws: The exceptions thrown by a method or constructor.
- @deprecated: The method, class or field has been deprecated (means its out-dated, or not recommended to use).
- @see: A link to another class or method.

An example of using an annotation:
```(java)
/**
* @author Pravat Bhusal
* @author pravat.bhusal@gmail.com
* public class myClass {}
*/
```



