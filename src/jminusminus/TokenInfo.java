// Copyright 2013 Bill Campbell, Swami Iyer and Bahar Akbal-Delibas

package jminusminus;

/**
 * An enum of token kinds. Each entry in this enum represents the kind of a
 * token along with its image (string representation).
 * 
 * When you add a new token to the scanner, you must also add an entry to this
 * enum specifying the kind and image of the new token.
 */

enum TokenKind {
    EOF("<EOF>"), 
    ABSTRACT("abstract"),
    BOOLEAN("boolean"), 
    BREAK("break"),				// added step 1
    BYTE("byte"),				// added step 1
    CASE("case"),				// added step 1
    CATCH("catch"),				// added step 1
    CHAR("char"), 
    CLASS("class"), 
    CONST("const"),				// added step 1
    CONTINUE("continue"),		// added step 1
    DEFAULT("default"),			// added step 1
    DO("do"),					// added step 1
    DOUBLE("double"),			// added step 1
    ELSE("else"), 
    EXTENDS("extends"), 
    FALSE("false"), 
    FINAL("final"),				// added step 1 
    FINALLY("finally"),			// added step 1 
    FLOAT("float"),				// added step 1
    FOR("for"),					// added step 1
    GOTO("goto"),				// added step 1
    IF("if"), 
    IMPLEMENTS("implements"),	// added step 1
    IMPORT("import"), 
    INSTANCEOF("instanceof"), 
    INT("int"), 
    INTERFACE("interface"),		// added step 1
    LONG("long"),				// added step 1
    NATIVE("native"),			// added step 1
    NEW("new"), 
    NULL("null"), 
    PACKAGE("package"), 
    PRIVATE("private"), 
    PROTECTED("protected"), 
    PUBLIC("public"), 
    RETURN("return"), 
    SHORT("short"),				// added step 1
    STATIC("static"), 
    STRICTFP("strictfp"),		// added step 1
    SUPER("super"), 
    SWITCH("switch"),			// added step 1
    SYNCHRONIZED("synchronized"),// added step 1
    THIS("this"), 
    THROW("throw"),				// added step 1
    THROWS("throws"),			// added step 1
    TRANSIENT("transient"),		// added step 1
    TRUE("true"), 
    TRY("try"),					// added step 1
    VOID("void"), 
    VOLATILE("volatile"),		// added step 1
    WHILE("while"), 
    
    ASSIGN("="),  
    DEC("--"),
    INC("++"),
        
    PLUS("+"), 
    PLUS_ASSIGN("+="),
    MINUS("-"),
    MINUS_ASSIGN("-="),
    STAR("*"),
    STAR_ASSIGN("*="), // s1
    DIV("/"),					// added step 0
    DIV_ASSIGN("/="),
    REM("%"),					// added step 0
    REM_ASSIGN("%="), // s1
    
    
    BINLSHIFT("<<"),				// added step 0
    BINLSHIFT_ASSIGN("<<="), // s1
    BINRSHIFT(">>"),				// added step 0 
    BINRSHIFT_ASSIGN(">>="), // s1
    LOGRSHIFT(">>>"), 
    LOGRSHIFT_ASSIGN(">>>="), // s1
    BITAND("&"),					// added step 0 
    BITAND_ASSIGN("&="), // s1
    BITOR("|"),					// added step 0 
    BITOR_ASSIGN("|="), // s1
    BITXOR("^"),					// added step 0 
    BITXOR_ASSIGN("^="), // s1
    
    EQUAL("=="),
    NOT_EQUAL("!="),
    LAND("&&"),
    LOR("||"),
    LNOT("!"),
    LT("<"),
    LE("<="),
    GT(">"),
    GE(">="),
    QMARK("?"), // Added step 1
    TILDE("~"),

    LPAREN("("),
    RPAREN(")"),
    LCURLY("{"),
    RCURLY("}"),
    LBRACK("["),
    RBRACK( "]"),
    SEMI(";"),
    COMMA(","),
    DOT("."),
    COLON(":"),					// added step 1
    
    IDENTIFIER("<IDENTIFIER>"),
    INT_LITERAL("<INT_LITERAL>"),
    CHAR_LITERAL("<CHAR_LITERAL>"),
    STRING_LITERAL("<STRING_LITERAL>");

    /** The token's string representation. */
    private String image;

    /**
     * Construct an instance TokenKind given its string representation.
     * 
     * @param image
     *            string representation of the token.
     */

    private TokenKind(String image) {
        this.image = image;
    }

    /**
     * Return the image of the token.
     * 
     * @return the token's image.
     */

    public String image() {
        return image;
    }

    /**
     * Return the string representation of the token.
     * 
     * @return the token's string representation.
     */

    public String toString() {
        return image;
    }

}

/**
 * A representation of tokens returned by the lexical analyzer method,
 * getNextToken(). A token has a kind identifying what kind of token it is, an
 * image for providing any semantic text, and the line in which it occurred in
 * the source file.
 */

class TokenInfo {

    /** Token kind. */
    private TokenKind kind;

    /**
     * Semantic text (if any). For example, the identifier name when the token
     * kind is IDENTIFIER. For tokens without a semantic text, it is simply its
     * string representation. For example, "+=" when the token kind is
     * PLUS_ASSIGN.
     */
    private String image;

    /** Line in which the token occurs in the source file. */
    private int line;

    /**
     * Construct a TokenInfo from its kind, the semantic text forming the token,
     * and its line number.
     * 
     * @param kind
     *            the token's kind.
     * @param image
     *            the semantic text comprising the token.
     * @param line
     *            the line in which the token occurs in the source file.
     */

    public TokenInfo(TokenKind kind, String image, int line) {
        this.kind = kind;
        this.image = image;
        this.line = line;
    }

    /**
     * Construct a TokenInfo from its kind, and its line number. Its image is
     * simply its string representation.
     * 
     * @param kind
     *            the token's identifying number.
     * @param line
     *            identifying the line on which the token was found.
     */

    public TokenInfo(TokenKind kind, int line) {
        this(kind, kind.toString(), line);
    }

    /**
     * Return the token's string representation.
     * 
     * @return the string representation.
     */

    public String tokenRep() {
        return kind.toString();
    }

    /**
     * Return the semantic text associated with the token.
     * 
     * @return the semantic text.
     */

    public String image() {
        return image;
    }

    /**
     * Return the line number associated with the token.
     * 
     * @return the line number.
     */

    public int line() {
        return line;
    }

    /**
     * Return the token's kind.
     * 
     * @return the kind.
     */

    public TokenKind kind() {
        return kind;
    }

    /**
     * Return the token's image.
     * 
     * @return the image.
     */

    public String toString() {
        return image;
    }

}
