/* The following code was generated by JFlex 1.7.0 tweaked for IntelliJ platform */

package org.intellij.sdk.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.intellij.sdk.language.psi.MinecraftTypes;
import com.intellij.psi.TokenType;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.7.0
 * from the specification file <tt>Minecraft.flex</tt>
 */
class MinecraftLexer implements FlexLexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   * Chosen bits are [10, 6, 5]
   * Total runtime size is 4224 bytes
   */
  public static int ZZ_CMAP(int ch) {
    return ZZ_CMAP_A[(ZZ_CMAP_Y[(ZZ_CMAP_Z[ch>>11]<<6)|((ch>>5)&0x3f)]<<5)|(ch&0x1f)];
  }

  /* The ZZ_CMAP_Z table has 544 entries */
  static final char ZZ_CMAP_Z[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\1\6\15\5\1\7\1\10\11\5\1\11\1\12\1\5\1\13\1\14\11"+
    "\5\1\15\14\5\1\16\2\5\1\17\u01e2\5");

  /* The ZZ_CMAP_Y table has 1024 entries */
  static final char ZZ_CMAP_Y[] = zzUnpackCMap(
    "\1\0\1\1\1\2\1\3\1\4\1\5\55\6\1\7\3\6\1\10\6\6\1\7\14\6\1\11\3\6\1\11\3\6"+
    "\1\11\3\6\1\11\3\6\1\11\3\6\1\11\3\6\1\11\3\6\1\11\3\6\1\11\3\6\1\11\2\6\1"+
    "\10\3\6\1\10\2\6\1\7\10\6\1\7\1\6\1\10\57\6\1\5\12\6\1\7\1\10\11\6\1\11\3"+
    "\6\1\10\5\6\1\12\5\6\1\10\2\6\1\10\4\6\1\12\35\6\1\13\1\14\1\15\175\6\1\5"+
    "\160\6\1\7\24\6\1\10\1\6\1\7\5\6\2\10\2\6\1\10\14\6\1\10\130\6\1\10\54\6\1"+
    "\7\35\6\1\11\3\6\1\10\1\6\1\16\4\6\1\10\10\6\1\10\12\6\1\10\3\6\1\10\13\6"+
    "\1\10\3\6\1\7\2\6\1\10\15\6\1\7\32\6\1\10\60\6\1\7\6\6\1\10\143\6\1\17\1\20"+
    "\12\6\1\10\65\6");

  /* The ZZ_CMAP_A table has 544 entries */
  static final char ZZ_CMAP_A[] = zzUnpackCMap(
    "\11\25\1\1\1\3\2\24\1\3\22\25\1\1\1\25\1\23\1\2\14\25\12\22\6\25\1\20\40\25"+
    "\1\16\1\25\1\6\1\25\1\4\1\11\2\25\1\13\4\25\1\12\1\14\1\21\1\25\1\17\1\15"+
    "\1\10\1\7\2\25\1\5\14\25\1\24\32\25\1\0\77\25\12\22\46\25\12\22\14\25\12\22"+
    "\20\25\12\22\6\25\12\22\6\25\13\0\35\25\2\24\5\25\1\0\57\25\1\0\26\25\12\22"+
    "\16\25\62\22");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\7\3\1\4\4\3\1\5\1\3"+
    "\1\6\1\0\1\7\3\3\1\7\1\3\1\10\6\3";

  private static int [] zzUnpackAction() {
    int [] result = new int[32];
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
    "\0\0\0\26\0\54\0\102\0\130\0\156\0\204\0\232"+
    "\0\260\0\306\0\334\0\362\0\u0108\0\u011e\0\u0134\0\130"+
    "\0\u014a\0\130\0\u0160\0\362\0\u0176\0\u018c\0\u01a2\0\u0160"+
    "\0\u01b8\0\130\0\u01ce\0\u01e4\0\u01fa\0\u0210\0\u0226\0\u023c";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[32];
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
    "\1\0\1\2\1\3\1\2\1\4\3\5\1\6\1\7"+
    "\4\5\1\10\1\11\1\12\1\5\1\13\1\14\1\0"+
    "\1\5\1\0\1\2\1\0\1\2\22\0\3\3\1\0"+
    "\22\3\2\0\1\5\1\0\1\5\1\15\16\5\1\0"+
    "\1\5\2\0\1\5\1\0\20\5\1\0\1\5\2\0"+
    "\1\5\1\0\1\16\17\5\1\0\1\5\2\0\1\5"+
    "\1\0\3\5\1\17\14\5\1\0\1\5\2\0\1\5"+
    "\1\0\4\5\1\20\4\5\1\20\6\5\1\0\1\5"+
    "\2\0\1\5\1\0\3\5\1\21\14\5\1\0\1\5"+
    "\2\0\1\5\1\0\1\22\10\5\2\22\2\5\1\22"+
    "\2\5\1\0\1\5\2\0\1\5\1\0\16\5\1\13"+
    "\1\5\1\0\1\5\2\23\1\14\1\0\17\14\1\24"+
    "\1\0\1\14\2\0\1\5\1\0\1\25\17\5\1\0"+
    "\1\5\2\0\1\5\1\0\11\5\1\26\6\5\1\0"+
    "\1\5\2\0\1\5\1\0\6\5\1\27\11\5\1\0"+
    "\1\5\2\0\1\5\1\0\6\5\1\20\11\5\1\0"+
    "\1\5\3\23\1\0\17\23\1\30\1\0\1\23\2\0"+
    "\1\5\1\0\2\5\1\31\15\5\1\0\1\5\2\0"+
    "\1\5\1\0\4\5\1\32\13\5\1\0\1\5\2\0"+
    "\1\5\1\0\2\5\1\33\15\5\1\0\1\5\2\0"+
    "\1\5\1\0\3\5\1\34\14\5\1\0\1\5\2\0"+
    "\1\5\1\0\4\5\1\35\13\5\1\0\1\5\2\0"+
    "\1\5\1\0\4\5\1\36\13\5\1\0\1\5\2\0"+
    "\1\5\1\0\7\5\1\37\10\5\1\0\1\5\2\0"+
    "\1\5\1\0\1\32\17\5\1\0\1\5\2\0\1\5"+
    "\1\0\10\5\1\40\7\5\1\0\1\5\2\0\1\5"+
    "\1\0\6\5\1\32\11\5\1\0\1\5";

  private static int [] zzUnpackTrans() {
    int [] result = new int[594];
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
  private static final String[] ZZ_ERROR_MSG = {
    "Unknown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\1\0\21\1\1\0\15\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[32];
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
  private CharSequence zzBuffer = "";

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  MinecraftLexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    int size = 0;
    for (int i = 0, length = packed.length(); i < length; i += 2) {
      size += packed.charAt(i);
    }
    char[] map = new char[size];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < packed.length()) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart() {
    return zzStartRead;
  }

  public final int getTokenEnd() {
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end, int initialState) {
    zzBuffer = buffer;
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      {@code false}, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
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
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position {@code pos} from the
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
    return zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occurred while scanning.
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
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL/*, zzEndReadL*/);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + ZZ_CMAP(zzInput) ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
        zzAtEOF = true;
        zzDoEOF();
        return null;
      }
      else {
        switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
          case 1: 
            { return TokenType.WHITE_SPACE;
            } 
            // fall through
          case 9: break;
          case 2: 
            { return MinecraftTypes.COMMENT;
            } 
            // fall through
          case 10: break;
          case 3: 
            { return TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 11: break;
          case 4: 
            { return MinecraftTypes.NUMBER;
            } 
            // fall through
          case 12: break;
          case 5: 
            { return MinecraftTypes.ARGUMENT;
            } 
            // fall through
          case 13: break;
          case 6: 
            { return MinecraftTypes.SELECTOR;
            } 
            // fall through
          case 14: break;
          case 7: 
            { return MinecraftTypes.STRING;
            } 
            // fall through
          case 15: break;
          case 8: 
            { return MinecraftTypes.COMMAND;
            } 
            // fall through
          case 16: break;
          default:
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
