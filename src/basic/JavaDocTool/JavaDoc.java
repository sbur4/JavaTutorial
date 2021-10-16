package src.basic.JavaDocTool;

class JavaDoc {

    /**
     * @author (classes and interfaces only, required) / Adds the author of a class.
     * {@code} Displays text in code font without interpreting the text as HTML markup or nested javadoc tags.
     * {@docRoot} Represents the relative path to the generated document's root directory from any generated page.
     * @apiNote
     * @category 
     * @deprecated (or @serialField or @serialData) / Adds a comment indicating that this API should no longer be used.
     * @exception  (@throws is a synonym added in Javadoc 1.2) / Adds a Throws subheading to the generated documentation, with the classname and description text.
     * @hidden
     * @implNote
     * @implSpec
     * {@inheritDoc} / Inherits a comment from the nearest inheritable class or implementable interface.
     * {@link} Inserts an in-line link with the visible text label that points to the documentation for the specified package, class, or member name of a referenced class.
     * {@linkplain} 	Identical to {@link}, except the link's label is displayed in plain text than code font.
     * @param (methods and constructors only) / Adds a parameter with the specified parameter-name followed by the specified description to the "Parameters" section
     * @return (methods only) / Adds a "Returns" section with the description text.
     * @see Adds a "See Also" heading with a link or text entry that points to reference.
     * @serial Used in the doc comment for a default serializable field.
     * @serialData (or @serialField or @serialData) / Documents the data written by the writeObject( ) or writeExternal( ) methods.
     * @serialField Documents an ObjectStreamField component.
     * @since Adds a "Since" heading with the specified since-text to the generated documentation.
     * @throws The @throws and @exception tags are synonyms.
     * {@value} When {@value} is used in the doc comment of a static field, it displays the value of that constant.
     * @version(classes and interfaces only, required. See footnote 1) / Adds a "Version" subheading with the specified version-text to the generated docs when the -version option is used
     * 
     */

    public static void main(String[] args) {
        System.out.println("Hello EPAM");
    }

}