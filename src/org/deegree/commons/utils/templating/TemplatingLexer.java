/* The following code was generated by JFlex 1.4.1 on 1/13/10 9:35 AM */

package org.deegree.commons.utils.templating;

import java_cup.runtime.*;

/**
 * <code>TemplatingLexer</code>
 *
 * @author <a href="mailto:schmitz@lat-lon.de">Andreas Schmitz</a>
 * @author last edited by: $Author$
 *
 * @version $Revision$, $Date$
 */

public class TemplatingLexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int TEMPLATE = 1;
  public static final int YYINITIAL = 0;
  public static final int MAP_VALUE = 3;
  public static final int MAP_KEY = 2;

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\10\0\1\1\1\0\1\7\1\0\2\1\22\0\1\4\16\0\1\11"+
    "\12\3\1\20\1\0\1\5\1\35\1\10\1\6\1\0\32\2\6\0"+
    "\1\22\2\2\1\30\1\15\1\21\1\34\1\2\1\31\1\2\1\32"+
    "\1\25\1\24\1\26\1\14\1\12\1\2\1\13\1\2\1\16\1\23"+
    "\1\27\1\2\1\33\1\17\1\2\57\0\1\2\12\0\1\2\4\0"+
    "\1\2\5\0\27\2\1\0\37\2\1\0\u013f\2\31\0\162\2\4\0"+
    "\14\2\16\0\5\2\11\0\1\2\213\0\1\2\13\0\1\2\1\0"+
    "\3\2\1\0\1\2\1\0\24\2\1\0\54\2\1\0\46\2\1\0"+
    "\5\2\4\0\202\2\10\0\105\2\1\0\46\2\2\0\2\2\6\0"+
    "\20\2\41\0\46\2\2\0\1\2\7\0\47\2\110\0\33\2\5\0"+
    "\3\2\56\0\32\2\5\0\13\2\43\0\2\2\1\0\143\2\1\0"+
    "\1\2\17\0\2\2\7\0\2\2\12\0\3\2\2\0\1\2\20\0"+
    "\1\2\1\0\36\2\35\0\3\2\60\0\46\2\13\0\1\2\u0152\0"+
    "\66\2\3\0\1\2\22\0\1\2\7\0\12\2\43\0\10\2\2\0"+
    "\2\2\2\0\26\2\1\0\7\2\1\0\1\2\3\0\4\2\3\0"+
    "\1\2\36\0\2\2\1\0\3\2\16\0\2\2\23\0\6\2\4\0"+
    "\2\2\2\0\26\2\1\0\7\2\1\0\2\2\1\0\2\2\1\0"+
    "\2\2\37\0\4\2\1\0\1\2\23\0\3\2\20\0\11\2\1\0"+
    "\3\2\1\0\26\2\1\0\7\2\1\0\2\2\1\0\5\2\3\0"+
    "\1\2\22\0\1\2\17\0\2\2\43\0\10\2\2\0\2\2\2\0"+
    "\26\2\1\0\7\2\1\0\2\2\1\0\5\2\3\0\1\2\36\0"+
    "\2\2\1\0\3\2\17\0\1\2\21\0\1\2\1\0\6\2\3\0"+
    "\3\2\1\0\4\2\3\0\2\2\1\0\1\2\1\0\2\2\3\0"+
    "\2\2\3\0\3\2\3\0\10\2\1\0\3\2\113\0\10\2\1\0"+
    "\3\2\1\0\27\2\1\0\12\2\1\0\5\2\46\0\2\2\43\0"+
    "\10\2\1\0\3\2\1\0\27\2\1\0\12\2\1\0\5\2\3\0"+
    "\1\2\40\0\1\2\1\0\2\2\43\0\10\2\1\0\3\2\1\0"+
    "\27\2\1\0\20\2\46\0\2\2\43\0\22\2\3\0\30\2\1\0"+
    "\11\2\1\0\1\2\2\0\7\2\72\0\60\2\1\0\2\2\14\0"+
    "\7\2\72\0\2\2\1\0\1\2\2\0\2\2\1\0\1\2\2\0"+
    "\1\2\6\0\4\2\1\0\7\2\1\0\3\2\1\0\1\2\1\0"+
    "\1\2\2\0\2\2\1\0\4\2\1\0\2\2\11\0\1\2\2\0"+
    "\5\2\1\0\1\2\25\0\2\2\42\0\1\2\77\0\10\2\1\0"+
    "\42\2\35\0\4\2\164\0\42\2\1\0\5\2\1\0\2\2\45\0"+
    "\6\2\112\0\46\2\12\0\51\2\7\0\132\2\5\0\104\2\5\0"+
    "\122\2\6\0\7\2\1\0\77\2\1\0\1\2\1\0\4\2\2\0"+
    "\7\2\1\0\1\2\1\0\4\2\2\0\47\2\1\0\1\2\1\0"+
    "\4\2\2\0\37\2\1\0\1\2\1\0\4\2\2\0\7\2\1\0"+
    "\1\2\1\0\4\2\2\0\7\2\1\0\7\2\1\0\27\2\1\0"+
    "\37\2\1\0\1\2\1\0\4\2\2\0\7\2\1\0\47\2\1\0"+
    "\23\2\105\0\125\2\14\0\u026c\2\2\0\10\2\12\0\32\2\5\0"+
    "\113\2\25\0\15\2\1\0\4\2\16\0\22\2\16\0\22\2\16\0"+
    "\15\2\1\0\3\2\17\0\64\2\43\0\1\2\4\0\1\2\103\0"+
    "\130\2\10\0\51\2\127\0\35\2\63\0\36\2\2\0\5\2\u038b\0"+
    "\154\2\224\0\234\2\4\0\132\2\6\0\26\2\2\0\6\2\2\0"+
    "\46\2\2\0\6\2\2\0\10\2\1\0\1\2\1\0\1\2\1\0"+
    "\1\2\1\0\37\2\2\0\65\2\1\0\7\2\1\0\1\2\3\0"+
    "\3\2\1\0\7\2\3\0\4\2\2\0\6\2\4\0\15\2\5\0"+
    "\3\2\1\0\7\2\164\0\1\2\15\0\1\2\202\0\1\2\4\0"+
    "\1\2\2\0\12\2\1\0\1\2\3\0\5\2\6\0\1\2\1\0"+
    "\1\2\1\0\1\2\1\0\4\2\1\0\3\2\1\0\7\2\3\0"+
    "\3\2\5\0\5\2\u0ebb\0\2\2\52\0\5\2\5\0\2\2\4\0"+
    "\126\2\6\0\3\2\1\0\132\2\1\0\4\2\5\0\50\2\4\0"+
    "\136\2\21\0\30\2\70\0\20\2\u0200\0\u19b6\2\112\0\u51a6\2\132\0"+
    "\u048d\2\u0773\0\u2ba4\2\u215c\0\u012e\2\2\0\73\2\225\0\7\2\14\0"+
    "\5\2\5\0\1\2\1\0\12\2\1\0\15\2\1\0\5\2\1\0"+
    "\1\2\1\0\2\2\1\0\2\2\1\0\154\2\41\0\u016b\2\22\0"+
    "\100\2\2\0\66\2\50\0\14\2\164\0\5\2\1\0\207\2\44\0"+
    "\32\2\6\0\32\2\13\0\131\2\3\0\6\2\2\0\6\2\2\0"+
    "\6\2\2\0\3\2\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\5\2\1\3\1\4\12\0\1\5\1\3"+
    "\1\0\1\3\1\6\1\1\1\3\1\0\1\7\33\0"+
    "\1\10\4\0\1\11\3\0\1\12\1\0\1\13\1\14"+
    "\1\15\1\0\1\16\26\0\1\17\2\20\1\21\1\22"+
    "\1\23\7\20\1\0";

  private static int [] zzUnpackAction() {
    int [] result = new int[109];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\36\0\74\0\132\0\170\0\226\0\264\0\322"+
    "\0\360\0\u010e\0\170\0\u012c\0\u014a\0\u0168\0\u0186\0\u01a4"+
    "\0\u01c2\0\u01e0\0\u01fe\0\u021c\0\u023a\0\u0258\0\u0276\0\u0294"+
    "\0\170\0\170\0\u02b2\0\132\0\u02d0\0\170\0\u02ee\0\u030c"+
    "\0\u032a\0\u0348\0\u0366\0\u0384\0\u03a2\0\u03c0\0\u03de\0\u03fc"+
    "\0\u041a\0\u0438\0\u0456\0\u0474\0\u0492\0\u04b0\0\u04ce\0\u04ec"+
    "\0\u050a\0\u0528\0\u0546\0\u0564\0\u0582\0\u05a0\0\u05be\0\u05dc"+
    "\0\u05fa\0\u0618\0\u0636\0\u0654\0\u0672\0\u0690\0\u0582\0\u06ae"+
    "\0\u06cc\0\u06ea\0\u05fa\0\u0708\0\u0726\0\170\0\170\0\u0744"+
    "\0\u06ae\0\u0762\0\u0780\0\u079e\0\u07bc\0\u07da\0\u07f8\0\u0816"+
    "\0\u0834\0\u0852\0\u0870\0\u088e\0\u08ac\0\u08ca\0\u08e8\0\u0906"+
    "\0\u0924\0\u0942\0\u0960\0\u097e\0\u099c\0\u09ba\0\u09d8\0\u0924"+
    "\0\u09f6\0\u0a14\0\u097e\0\170\0\u0a32\0\u0a50\0\u0a6e\0\u0a8c"+
    "\0\u0aaa\0\u0ac8\0\u0ae6\0\u0b04\0\u0b22";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[109];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\5\1\6\2\7\1\10\1\11\1\5\1\6\2\5"+
    "\6\7\1\5\14\7\1\5\1\0\1\12\2\0\1\12"+
    "\2\0\1\12\1\13\1\0\1\14\1\0\1\15\1\16"+
    "\1\17\2\0\1\20\2\0\1\21\1\0\1\22\1\23"+
    "\1\0\1\24\2\0\1\25\1\0\1\26\1\27\2\26"+
    "\1\27\1\30\1\26\1\12\1\31\24\26\1\32\1\33"+
    "\1\34\2\33\1\34\2\33\1\12\26\33\37\0\1\6"+
    "\2\0\1\6\2\0\1\6\30\0\3\7\5\0\6\7"+
    "\1\0\14\7\2\0\1\6\2\7\1\10\2\0\1\6"+
    "\2\0\6\7\1\0\14\7\3\0\1\35\3\0\1\36"+
    "\2\0\1\37\6\35\1\0\14\35\2\0\1\12\2\0"+
    "\1\12\2\0\1\12\41\0\1\40\52\0\1\41\34\0"+
    "\1\42\23\0\1\43\35\0\1\44\42\0\1\45\35\0"+
    "\1\46\35\0\1\47\41\0\1\50\33\0\1\51\11\0"+
    "\35\26\1\0\1\26\1\27\2\26\1\27\2\26\1\27"+
    "\25\26\7\0\1\36\27\0\7\33\1\0\26\33\2\0"+
    "\1\35\5\0\1\5\1\0\6\35\1\0\14\35\3\0"+
    "\1\35\7\0\6\35\1\0\14\35\15\0\1\52\51\0"+
    "\1\53\22\0\1\54\44\0\1\55\33\0\1\56\25\0"+
    "\1\57\47\0\1\60\36\0\1\61\40\0\1\62\32\0"+
    "\1\63\22\0\1\64\43\0\1\65\43\0\1\66\21\0"+
    "\1\67\41\0\1\70\23\0\1\71\46\0\1\72\43\0"+
    "\1\73\27\0\1\74\51\0\1\75\21\0\1\76\22\0"+
    "\2\77\6\0\6\77\1\0\14\77\21\0\1\100\42\0"+
    "\1\101\33\0\1\102\14\0\2\103\6\0\6\103\1\0"+
    "\14\103\21\0\1\104\32\0\1\105\53\0\1\106\32\0"+
    "\1\107\20\0\1\110\24\0\2\111\6\0\6\111\1\0"+
    "\14\111\23\0\1\112\26\0\1\113\46\0\1\114\31\0"+
    "\1\115\33\0\1\116\35\0\1\117\34\0\1\120\42\0"+
    "\1\121\37\0\1\114\1\122\27\0\1\123\33\0\1\124"+
    "\24\0\1\125\43\0\1\126\54\0\1\127\10\0\1\130"+
    "\35\0\1\131\31\0\2\125\2\132\6\125\6\132\1\133"+
    "\14\132\1\125\4\0\1\134\57\0\1\135\7\0\2\130"+
    "\2\136\6\130\6\136\1\137\14\136\1\130\2\0\2\140"+
    "\6\0\6\140\1\0\14\140\1\0\2\125\2\132\4\125"+
    "\1\0\1\125\6\132\1\133\14\132\3\125\2\141\6\125"+
    "\4\141\1\142\1\141\1\133\14\141\1\125\2\0\2\143"+
    "\6\0\6\143\1\0\14\143\33\0\1\144\3\0\2\130"+
    "\2\136\4\130\1\0\1\130\6\136\1\137\14\136\3\130"+
    "\2\145\6\130\6\145\1\137\14\145\1\130\2\125\2\141"+
    "\4\125\1\0\1\125\6\141\1\133\14\141\3\125\2\141"+
    "\4\125\1\0\1\125\3\141\1\146\2\141\1\133\14\141"+
    "\1\125\2\130\2\145\4\130\1\0\1\130\6\145\1\137"+
    "\14\145\1\130\2\125\2\141\4\125\1\0\1\125\6\141"+
    "\1\133\3\141\1\147\10\141\3\125\2\141\4\125\1\0"+
    "\1\125\1\150\5\141\1\133\14\141\3\125\2\141\4\125"+
    "\1\0\1\125\6\141\1\133\4\141\1\151\7\141\3\125"+
    "\2\141\4\125\1\0\1\125\6\141\1\133\1\141\1\152"+
    "\12\141\3\125\2\141\4\125\1\0\1\125\4\141\1\153"+
    "\1\141\1\133\14\141\3\125\2\141\4\125\1\0\1\125"+
    "\3\141\1\154\2\141\1\133\14\141\3\125\2\141\1\155"+
    "\3\125\1\0\1\125\6\141\1\133\14\141\3\125\2\141"+
    "\6\125\6\141\1\133\14\141\1\125";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2880];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\1\1\11\5\1\1\11\12\0\2\1\1\0"+
    "\2\11\2\1\1\0\1\11\33\0\1\1\4\0\1\1"+
    "\3\0\1\1\1\0\1\1\2\11\1\0\1\1\26\0"+
    "\4\1\1\11\10\1\1\0";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[109];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public TemplatingLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public TemplatingLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 1188) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzPushbackPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead < 0) {
      return true;
    }
    else {
      zzEndRead+= numRead;
      return false;
    }
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = zzPushbackPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = zzLexicalState;


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 5: 
          { return new Symbol(TemplatingSymbols.MAP_KEY_TOKEN, yyline, yycolumn, yytext().trim());
          }
        case 20: break;
        case 16: 
          { String s = yytext().trim().substring(8);
                String[] ss = s.split(":", 2);
                if(ss[1].startsWith("template ")) ss[1] = ss[1].substring(9);
                return new Symbol(TemplatingSymbols.FEATURE_TEMPLATE_CALL_TOKEN, yyline, yycolumn, ss);
          }
        case 21: break;
        case 9: 
          { String s = yytext().trim().substring(4);
                return new Symbol(TemplatingSymbols.ODD_CALL_TOKEN, yyline, yycolumn, s);
          }
        case 22: break;
        case 12: 
          { return new Symbol(TemplatingSymbols.INDEX_CALL_TOKEN, yyline, yycolumn);
          }
        case 23: break;
        case 8: 
          { return new Symbol(TemplatingSymbols.NAME_TOKEN, yyline, yycolumn);
          }
        case 24: break;
        case 17: 
          { String s = yytext().trim();
                String[] vals = s.split(":", 2);
                vals[1] = vals[1].substring(4);
                return new Symbol(TemplatingSymbols.MAP_CALL_TOKEN, yyline, yycolumn, vals);
          }
        case 25: break;
        case 13: 
          { return new Symbol(TemplatingSymbols.GMLID_TOKEN, yyline, yycolumn);
          }
        case 26: break;
        case 4: 
          { yybegin(YYINITIAL);
          }
        case 27: break;
        case 15: 
          { String s = yytext().trim().substring(9);
                return new Symbol(TemplatingSymbols.TEMPLATE_DEFINITION_TOKEN, yyline, yycolumn, s);
          }
        case 28: break;
        case 7: 
          { yybegin(TEMPLATE);
          }
        case 29: break;
        case 6: 
          { yybegin(MAP_VALUE);
          }
        case 30: break;
        case 19: 
          { String s = yytext().trim().substring(9);
                return new Symbol(TemplatingSymbols.PROPERTY_TEMPLATE_CALL_TOKEN, yyline, yycolumn, s.split(":", 2));
          }
        case 31: break;
        case 11: 
          { return new Symbol(TemplatingSymbols.VALUE_TOKEN, yyline, yycolumn);
          }
        case 32: break;
        case 10: 
          { yybegin(MAP_KEY);
                String s = yytext().trim().substring(4);
                return new Symbol(TemplatingSymbols.MAP_DEFINITION_TOKEN, yyline, yycolumn, s);
          }
        case 33: break;
        case 1: 
          { yybegin(MAP_KEY); return new Symbol(TemplatingSymbols.MAP_VALUE_TOKEN, yyline, yycolumn, yytext().trim());
          }
        case 34: break;
        case 18: 
          { return new Symbol(TemplatingSymbols.LINK_CALL_TOKEN, yyline, yycolumn);
          }
        case 35: break;
        case 14: 
          { String s = yytext().trim().substring(5);
                return new Symbol(TemplatingSymbols.EVEN_CALL_TOKEN, yyline, yycolumn, s);
          }
        case 36: break;
        case 3: 
          { 
          }
        case 37: break;
        case 2: 
          { return new Symbol(TemplatingSymbols.TEXT_TOKEN, yyline, yycolumn, yytext());
          }
        case 38: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(TemplatingSymbols.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
