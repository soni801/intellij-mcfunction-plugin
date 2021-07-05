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
    "\11\41\1\1\1\3\2\40\1\3\22\41\1\1\1\41\1\37\1\2\11\41\1\21\2\41\12\36\5\41"+
    "\1\4\1\35\40\41\1\5\1\17\1\11\1\6\1\12\1\30\1\27\1\32\1\16\1\41\1\26\1\23"+
    "\1\13\1\10\1\25\1\22\1\41\1\15\1\24\1\14\1\20\1\7\1\34\1\33\1\31\4\41\1\36"+
    "\6\41\1\40\32\41\1\0\77\41\12\36\46\41\12\36\14\41\12\36\20\41\12\36\6\41"+
    "\12\36\6\41\13\0\35\41\2\40\5\41\1\0\57\41\1\0\26\41\12\36\16\41\62\36");

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\1\2\1\3\13\4\1\5\10\4\1\3"+
    "\4\4\1\6\1\4\1\6\52\4\1\7\1\0\1\10"+
    "\27\4\1\3\34\4\1\10\3\4\1\3\7\4\1\3"+
    "\1\4\1\3\25\4\1\3\70\4\1\3\3\4\1\3"+
    "\57\4";

  private static int [] zzUnpackAction() {
    int [] result = new int[274];
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
    "\0\0\0\42\0\104\0\146\0\210\0\252\0\146\0\314"+
    "\0\356\0\u0110\0\u0132\0\u0154\0\u0176\0\u0198\0\u01ba\0\u01dc"+
    "\0\u01fe\0\u0220\0\u0242\0\u0264\0\u0286\0\u02a8\0\u02ca\0\u02ec"+
    "\0\u030e\0\u0330\0\u0352\0\u0374\0\u0396\0\u03b8\0\u03da\0\146"+
    "\0\u03fc\0\u041e\0\u0440\0\u0462\0\u0484\0\u04a6\0\u04c8\0\u04ea"+
    "\0\u050c\0\u052e\0\u0550\0\u0572\0\u0594\0\u05b6\0\u05d8\0\u05fa"+
    "\0\u061c\0\u063e\0\u0660\0\u0682\0\u06a4\0\u06c6\0\u06e8\0\u070a"+
    "\0\u072c\0\u074e\0\u0770\0\u0792\0\u07b4\0\u07d6\0\u07f8\0\u081a"+
    "\0\u083c\0\u085e\0\u0880\0\u08a2\0\u08c4\0\u08e6\0\u0908\0\u092a"+
    "\0\u094c\0\u096e\0\146\0\u0990\0\u0352\0\u09b2\0\u09d4\0\u09f6"+
    "\0\u0a18\0\u0a3a\0\u0a5c\0\u0a7e\0\u0aa0\0\u0ac2\0\u0ae4\0\u0b06"+
    "\0\u0b28\0\u0b4a\0\u0b6c\0\u0b8e\0\u0bb0\0\u0bd2\0\u0bf4\0\u0c16"+
    "\0\u0c38\0\u0c5a\0\u0c7c\0\u0c9e\0\u0cc0\0\u0ce2\0\u0d04\0\u0d26"+
    "\0\u0d48\0\u0d6a\0\u0d8c\0\u0dae\0\u0dd0\0\u0df2\0\u0e14\0\u0e36"+
    "\0\u0e58\0\u0e7a\0\u0e9c\0\u0ebe\0\u0ee0\0\u0f02\0\u0f24\0\u0f46"+
    "\0\u0f68\0\u0f8a\0\u0fac\0\u0fce\0\u0ff0\0\u1012\0\u1034\0\u1056"+
    "\0\u1078\0\u0990\0\u109a\0\u10bc\0\u10de\0\u1100\0\u1122\0\u1144"+
    "\0\u1166\0\u1188\0\u11aa\0\u11cc\0\u11ee\0\u1210\0\u1232\0\u1254"+
    "\0\u1276\0\u1298\0\u12ba\0\u12dc\0\u12fe\0\u1320\0\u1342\0\u1364"+
    "\0\u1386\0\u13a8\0\u13ca\0\u13ec\0\u140e\0\u1430\0\u1452\0\u1474"+
    "\0\u1496\0\u14b8\0\u14da\0\u14fc\0\u151e\0\u13ec\0\u1540\0\u1562"+
    "\0\u1584\0\u15a6\0\u15c8\0\u15ea\0\u160c\0\u162e\0\u1650\0\u1672"+
    "\0\u1694\0\u16b6\0\u16d8\0\u16fa\0\u171c\0\u173e\0\u1760\0\u1782"+
    "\0\u17a4\0\u17c6\0\u17e8\0\u180a\0\u182c\0\u184e\0\u1870\0\u1892"+
    "\0\u18b4\0\u18d6\0\u18f8\0\u191a\0\u193c\0\u195e\0\u1980\0\u19a2"+
    "\0\u19c4\0\u19e6\0\u1a08\0\u1a2a\0\u1a4c\0\u1a6e\0\u1a90\0\u1ab2"+
    "\0\u1ad4\0\u1af6\0\u1b18\0\u1b3a\0\u1b5c\0\u1b7e\0\u1ba0\0\u1bc2"+
    "\0\u1be4\0\u1c06\0\u1c28\0\u1c4a\0\u1c6c\0\u1c8e\0\u1cb0\0\u1cd2"+
    "\0\u1cf4\0\u1d16\0\u1d38\0\u1d5a\0\u1d7c\0\u1d9e\0\u1dc0\0\u1de2"+
    "\0\u1e04\0\u1e26\0\u1e48\0\u1e6a\0\u1e8c\0\u1eae\0\u1ed0\0\u1ef2"+
    "\0\u1f14\0\u1f36\0\u1f58\0\u1f7a\0\u1f9c\0\u1fbe\0\u1fe0\0\u2002"+
    "\0\u2024\0\u2046\0\u2068\0\u208a\0\u20ac\0\u20ce\0\u20f0\0\u2112"+
    "\0\u2134\0\u2156\0\u2178\0\u219a\0\u21bc\0\u21de\0\u2200\0\u2222"+
    "\0\u2244\0\u2266\0\u2288\0\u22aa\0\u22cc\0\u22ee\0\u2310\0\u2332"+
    "\0\u2354\0\u2376";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[274];
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
    "\1\0\1\2\1\3\1\2\1\4\1\5\1\6\2\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\25\1\26\1\27"+
    "\1\7\1\30\1\24\1\31\1\32\1\20\1\33\1\0"+
    "\1\7\1\0\1\2\1\0\1\2\36\0\3\3\1\0"+
    "\36\3\2\0\1\7\1\0\34\7\1\0\1\7\2\0"+
    "\1\7\1\0\2\7\1\34\1\7\1\35\3\7\1\36"+
    "\6\7\1\37\1\40\13\7\1\0\1\7\2\0\1\7"+
    "\1\0\1\7\1\41\4\7\1\42\3\7\1\43\21\7"+
    "\1\0\1\7\2\0\1\7\1\0\17\7\1\44\14\7"+
    "\1\0\1\7\2\0\1\7\1\0\4\7\1\45\17\7"+
    "\1\46\2\7\1\47\4\7\1\0\1\7\2\0\1\7"+
    "\1\0\6\7\1\4\11\7\1\50\13\7\1\0\1\7"+
    "\2\0\1\7\1\0\1\7\1\50\4\7\1\51\1\4"+
    "\1\7\1\52\1\53\3\7\1\4\15\7\1\0\1\7"+
    "\2\0\1\7\1\0\6\7\1\54\5\7\1\55\4\7"+
    "\1\56\12\7\1\0\1\7\2\0\1\7\1\0\4\7"+
    "\1\40\3\7\1\57\13\7\1\40\7\7\1\0\1\7"+
    "\2\0\1\7\1\0\1\7\1\60\17\7\1\61\12\7"+
    "\1\0\1\7\2\0\1\7\1\0\4\7\1\62\27\7"+
    "\1\0\1\7\2\0\1\7\1\0\15\7\1\20\14\7"+
    "\1\20\1\7\1\0\1\7\2\0\1\7\1\0\1\7"+
    "\1\63\4\7\1\64\5\7\1\65\2\7\1\66\1\7"+
    "\1\67\12\7\1\0\1\7\2\0\1\7\1\0\12\7"+
    "\1\70\6\7\1\71\12\7\1\0\1\7\2\0\1\7"+
    "\1\0\1\7\1\72\3\7\1\73\1\74\1\7\1\75"+
    "\3\7\1\76\1\7\1\77\15\7\1\0\1\7\2\0"+
    "\1\7\1\0\16\7\1\4\15\7\1\0\1\7\2\0"+
    "\1\7\1\0\12\7\1\100\21\7\1\0\1\7\2\0"+
    "\1\7\1\0\1\7\1\101\10\7\1\102\21\7\1\0"+
    "\1\7\2\0\1\7\1\0\1\7\1\103\10\7\1\104"+
    "\1\7\1\105\4\7\1\106\12\7\1\0\1\7\2\0"+
    "\1\7\1\0\6\7\1\107\25\7\1\0\1\7\2\0"+
    "\1\7\1\0\6\7\1\110\12\7\1\111\4\7\1\112"+
    "\5\7\1\0\1\7\2\0\1\7\1\0\1\7\1\113"+
    "\4\7\1\113\2\7\1\113\4\7\1\113\1\7\1\113"+
    "\13\7\1\0\1\7\2\114\1\33\1\0\33\33\1\115"+
    "\1\0\1\33\2\0\1\7\1\0\3\7\1\116\30\7"+
    "\1\0\1\7\2\0\1\7\1\0\5\7\1\117\26\7"+
    "\1\0\1\7\2\0\1\7\1\0\10\7\1\120\23\7"+
    "\1\0\1\7\2\0\1\7\1\0\12\7\1\121\21\7"+
    "\1\0\1\7\2\0\1\7\1\0\10\7\1\122\23\7"+
    "\1\0\1\7\2\0\1\7\1\0\13\7\1\123\5\7"+
    "\1\24\2\7\1\124\7\7\1\0\1\7\2\0\1\7"+
    "\1\0\24\7\1\125\7\7\1\0\1\7\2\0\1\7"+
    "\1\0\6\7\1\126\12\7\1\127\12\7\1\0\1\7"+
    "\2\0\1\7\1\0\5\7\1\130\26\7\1\0\1\7"+
    "\2\0\1\7\1\0\24\7\1\131\7\7\1\0\1\7"+
    "\2\0\1\7\1\0\6\7\1\132\7\7\1\133\15\7"+
    "\1\0\1\7\2\0\1\7\1\0\23\7\1\4\10\7"+
    "\1\0\1\7\2\0\1\7\1\0\1\7\1\134\15\7"+
    "\1\135\14\7\1\0\1\7\2\0\1\7\1\0\12\7"+
    "\1\136\21\7\1\0\1\7\2\0\1\7\1\0\7\7"+
    "\1\137\1\140\23\7\1\0\1\7\2\0\1\7\1\0"+
    "\5\7\1\141\11\7\1\142\14\7\1\0\1\7\2\0"+
    "\1\7\1\0\4\7\1\40\27\7\1\0\1\7\2\0"+
    "\1\7\1\0\10\7\1\143\23\7\1\0\1\7\2\0"+
    "\1\7\1\0\6\7\1\144\25\7\1\0\1\7\2\0"+
    "\1\7\1\0\4\7\1\145\27\7\1\0\1\7\2\0"+
    "\1\7\1\0\20\7\1\146\13\7\1\0\1\7\2\0"+
    "\1\7\1\0\17\7\1\147\14\7\1\0\1\7\2\0"+
    "\1\7\1\0\11\7\1\150\22\7\1\0\1\7\2\0"+
    "\1\7\1\0\11\7\1\151\22\7\1\0\1\7\2\0"+
    "\1\7\1\0\13\7\1\152\20\7\1\0\1\7\2\0"+
    "\1\7\1\0\1\7\1\153\32\7\1\0\1\7\2\0"+
    "\1\7\1\0\20\7\1\154\13\7\1\0\1\7\2\0"+
    "\1\7\1\0\20\7\1\155\13\7\1\0\1\7\2\0"+
    "\1\7\1\0\5\7\1\156\13\7\1\155\12\7\1\0"+
    "\1\7\2\0\1\7\1\0\3\7\1\157\21\7\1\4"+
    "\6\7\1\0\1\7\2\0\1\7\1\0\21\7\1\160"+
    "\4\7\1\161\5\7\1\0\1\7\2\0\1\7\1\0"+
    "\6\7\1\162\1\7\1\163\23\7\1\0\1\7\2\0"+
    "\1\7\1\0\21\7\1\164\12\7\1\0\1\7\2\0"+
    "\1\7\1\0\7\7\1\165\24\7\1\0\1\7\2\0"+
    "\1\7\1\0\1\7\1\166\4\7\1\167\2\7\1\170"+
    "\22\7\1\0\1\7\2\0\1\7\1\0\5\7\1\171"+
    "\11\7\1\172\14\7\1\0\1\7\2\0\1\7\1\0"+
    "\7\7\1\173\24\7\1\0\1\7\2\0\1\7\1\0"+
    "\3\7\1\137\30\7\1\0\1\7\2\0\1\7\1\0"+
    "\5\7\1\174\26\7\1\0\1\7\2\0\1\7\1\0"+
    "\17\7\1\172\14\7\1\0\1\7\2\0\1\7\1\0"+
    "\4\7\1\175\27\7\1\0\1\7\2\0\1\7\1\0"+
    "\11\7\1\176\22\7\1\0\1\7\2\0\1\7\1\0"+
    "\17\7\1\24\14\7\1\0\1\7\2\0\1\7\1\0"+
    "\1\7\1\177\32\7\1\0\1\7\2\0\1\7\1\0"+
    "\11\7\1\200\22\7\1\0\1\7\2\0\1\7\1\0"+
    "\12\7\1\201\21\7\1\0\1\7\3\114\1\0\33\114"+
    "\1\202\1\0\1\114\2\0\1\7\1\0\1\7\1\203"+
    "\32\7\1\0\1\7\2\0\1\7\1\0\26\7\1\204"+
    "\5\7\1\0\1\7\2\0\1\7\1\0\11\7\1\205"+
    "\22\7\1\0\1\7\2\0\1\7\1\0\23\7\1\55"+
    "\10\7\1\0\1\7\2\0\1\7\1\0\1\7\1\206"+
    "\32\7\1\0\1\7\2\0\1\7\1\0\14\7\1\50"+
    "\17\7\1\0\1\7\2\0\1\7\1\0\1\7\1\207"+
    "\32\7\1\0\1\7\2\0\1\7\1\0\24\7\1\210"+
    "\7\7\1\0\1\7\2\0\1\7\1\0\1\7\1\211"+
    "\32\7\1\0\1\7\2\0\1\7\1\0\4\7\1\137"+
    "\27\7\1\0\1\7\2\0\1\7\1\0\26\7\1\212"+
    "\5\7\1\0\1\7\2\0\1\7\1\0\6\7\1\213"+
    "\25\7\1\0\1\7\2\0\1\7\1\0\5\7\1\214"+
    "\26\7\1\0\1\7\2\0\1\7\1\0\6\7\1\215"+
    "\25\7\1\0\1\7\2\0\1\7\1\0\7\7\1\216"+
    "\24\7\1\0\1\7\2\0\1\7\1\0\6\7\1\217"+
    "\10\7\1\220\14\7\1\0\1\7\2\0\1\7\1\0"+
    "\23\7\1\221\10\7\1\0\1\7\2\0\1\7\1\0"+
    "\6\7\1\4\25\7\1\0\1\7\2\0\1\7\1\0"+
    "\17\7\1\137\14\7\1\0\1\7\2\0\1\7\1\0"+
    "\12\7\1\222\21\7\1\0\1\7\2\0\1\7\1\0"+
    "\21\7\1\223\12\7\1\0\1\7\2\0\1\7\1\0"+
    "\1\7\1\224\32\7\1\0\1\7\2\0\1\7\1\0"+
    "\7\7\1\4\24\7\1\0\1\7\2\0\1\7\1\0"+
    "\15\7\1\225\1\7\1\226\14\7\1\0\1\7\2\0"+
    "\1\7\1\0\20\7\1\227\13\7\1\0\1\7\2\0"+
    "\1\7\1\0\6\7\1\230\25\7\1\0\1\7\2\0"+
    "\1\7\1\0\2\7\1\231\5\7\1\232\23\7\1\0"+
    "\1\7\2\0\1\7\1\0\24\7\1\4\7\7\1\0"+
    "\1\7\2\0\1\7\1\0\17\7\1\233\14\7\1\0"+
    "\1\7\2\0\1\7\1\0\25\7\1\234\6\7\1\0"+
    "\1\7\2\0\1\7\1\0\12\7\1\235\21\7\1\0"+
    "\1\7\2\0\1\7\1\0\10\7\1\4\23\7\1\0"+
    "\1\7\2\0\1\7\1\0\1\7\1\236\32\7\1\0"+
    "\1\7\2\0\1\7\1\0\6\7\1\237\25\7\1\0"+
    "\1\7\2\0\1\7\1\0\11\7\1\240\22\7\1\0"+
    "\1\7\2\0\1\7\1\0\6\7\1\241\25\7\1\0"+
    "\1\7\2\0\1\7\1\0\2\7\1\4\31\7\1\0"+
    "\1\7\2\0\1\7\1\0\12\7\1\242\1\243\14\7"+
    "\1\244\3\7\1\0\1\7\2\0\1\7\1\0\11\7"+
    "\1\245\4\7\1\246\15\7\1\0\1\7\2\0\1\7"+
    "\1\0\7\7\1\247\24\7\1\0\1\7\2\0\1\7"+
    "\1\0\30\7\1\250\3\7\1\0\1\7\2\0\1\7"+
    "\1\0\5\7\1\251\26\7\1\0\1\7\2\0\1\7"+
    "\1\0\6\7\1\252\25\7\1\0\1\7\2\0\1\7"+
    "\1\0\22\7\1\4\11\7\1\0\1\7\2\0\1\7"+
    "\1\0\17\7\1\4\14\7\1\0\1\7\2\0\1\7"+
    "\1\0\6\7\1\253\25\7\1\0\1\7\2\0\1\7"+
    "\1\0\12\7\1\254\21\7\1\0\1\7\2\0\1\7"+
    "\1\0\5\7\1\255\26\7\1\0\1\7\2\0\1\7"+
    "\1\0\5\7\1\256\26\7\1\0\1\7\2\0\1\7"+
    "\1\0\10\7\1\257\23\7\1\0\1\7\2\0\1\7"+
    "\1\0\17\7\1\260\14\7\1\0\1\7\2\0\1\7"+
    "\1\0\10\7\1\261\23\7\1\0\1\7\2\0\1\7"+
    "\1\0\4\7\1\262\27\7\1\0\1\7\2\0\1\7"+
    "\1\0\21\7\1\263\12\7\1\0\1\7\2\0\1\7"+
    "\1\0\12\7\1\264\21\7\1\0\1\7\2\0\1\7"+
    "\1\0\16\7\1\265\15\7\1\0\1\7\2\0\1\7"+
    "\1\0\14\7\1\266\17\7\1\0\1\7\2\0\1\7"+
    "\1\0\12\7\1\267\21\7\1\0\1\7\2\0\1\7"+
    "\1\0\11\7\1\4\22\7\1\0\1\7\2\0\1\7"+
    "\1\0\1\7\1\270\32\7\1\0\1\7\2\0\1\7"+
    "\1\0\5\7\1\155\26\7\1\0\1\7\2\0\1\7"+
    "\1\0\14\7\1\271\17\7\1\0\1\7\2\0\1\7"+
    "\1\0\11\7\1\272\22\7\1\0\1\7\2\0\1\7"+
    "\1\0\7\7\1\273\24\7\1\0\1\7\2\0\1\7"+
    "\1\0\16\7\1\274\15\7\1\0\1\7\2\0\1\7"+
    "\1\0\11\7\1\275\22\7\1\0\1\7\2\0\1\7"+
    "\1\0\23\7\1\276\10\7\1\0\1\7\2\0\1\7"+
    "\1\0\16\7\1\137\15\7\1\0\1\7\2\0\1\7"+
    "\1\0\1\7\1\162\32\7\1\0\1\7\2\0\1\7"+
    "\1\0\10\7\1\277\23\7\1\0\1\7\2\0\1\7"+
    "\1\0\12\7\1\24\21\7\1\0\1\7\2\0\1\7"+
    "\1\0\12\7\1\70\21\7\1\0\1\7\2\0\1\7"+
    "\1\0\13\7\1\126\20\7\1\0\1\7\2\0\1\7"+
    "\1\0\20\7\1\300\13\7\1\0\1\7\2\0\1\7"+
    "\1\0\21\7\1\301\12\7\1\0\1\7\2\0\1\7"+
    "\1\0\12\7\1\302\21\7\1\0\1\7\2\0\1\7"+
    "\1\0\12\7\1\303\21\7\1\0\1\7\2\0\1\7"+
    "\1\0\20\7\1\304\13\7\1\0\1\7\2\0\1\7"+
    "\1\0\10\7\1\305\23\7\1\0\1\7\2\0\1\7"+
    "\1\0\10\7\1\306\23\7\1\0\1\7\2\0\1\7"+
    "\1\0\15\7\1\307\16\7\1\0\1\7\2\0\1\7"+
    "\1\0\6\7\1\310\25\7\1\0\1\7\2\0\1\7"+
    "\1\0\2\7\1\311\31\7\1\0\1\7\2\0\1\7"+
    "\1\0\2\7\1\312\31\7\1\0\1\7\2\0\1\7"+
    "\1\0\17\7\1\313\14\7\1\0\1\7\2\0\1\7"+
    "\1\0\21\7\1\314\12\7\1\0\1\7\2\0\1\7"+
    "\1\0\6\7\1\40\25\7\1\0\1\7\2\0\1\7"+
    "\1\0\21\7\1\315\12\7\1\0\1\7\2\0\1\7"+
    "\1\0\4\7\1\316\27\7\1\0\1\7\2\0\1\7"+
    "\1\0\10\7\1\317\23\7\1\0\1\7\2\0\1\7"+
    "\1\0\1\7\1\320\32\7\1\0\1\7\2\0\1\7"+
    "\1\0\7\7\1\321\1\7\1\311\22\7\1\0\1\7"+
    "\2\0\1\7\1\0\4\7\1\322\27\7\1\0\1\7"+
    "\2\0\1\7\1\0\10\7\1\323\23\7\1\0\1\7"+
    "\2\0\1\7\1\0\6\7\1\324\25\7\1\0\1\7"+
    "\2\0\1\7\1\0\26\7\1\276\5\7\1\0\1\7"+
    "\2\0\1\7\1\0\2\7\1\325\31\7\1\0\1\7"+
    "\2\0\1\7\1\0\6\7\1\326\25\7\1\0\1\7"+
    "\2\0\1\7\1\0\5\7\1\327\26\7\1\0\1\7"+
    "\2\0\1\7\1\0\11\7\1\277\22\7\1\0\1\7"+
    "\2\0\1\7\1\0\13\7\1\214\20\7\1\0\1\7"+
    "\2\0\1\7\1\0\1\7\1\330\32\7\1\0\1\7"+
    "\2\0\1\7\1\0\17\7\1\331\14\7\1\0\1\7"+
    "\2\0\1\7\1\0\5\7\1\332\26\7\1\0\1\7"+
    "\2\0\1\7\1\0\4\7\1\155\27\7\1\0\1\7"+
    "\2\0\1\7\1\0\10\7\1\137\23\7\1\0\1\7"+
    "\2\0\1\7\1\0\12\7\1\333\21\7\1\0\1\7"+
    "\2\0\1\7\1\0\20\7\1\50\13\7\1\0\1\7"+
    "\2\0\1\7\1\0\21\7\1\334\12\7\1\0\1\7"+
    "\2\0\1\7\1\0\1\7\1\335\32\7\1\0\1\7"+
    "\2\0\1\7\1\0\6\7\1\211\25\7\1\0\1\7"+
    "\2\0\1\7\1\0\6\7\1\336\25\7\1\0\1\7"+
    "\2\0\1\7\1\0\20\7\1\40\13\7\1\0\1\7"+
    "\2\0\1\7\1\0\4\7\1\337\27\7\1\0\1\7"+
    "\2\0\1\7\1\0\5\7\1\140\26\7\1\0\1\7"+
    "\2\0\1\7\1\0\20\7\1\340\13\7\1\0\1\7"+
    "\2\0\1\7\1\0\21\7\1\341\12\7\1\0\1\7"+
    "\2\0\1\7\1\0\12\7\1\342\21\7\1\0\1\7"+
    "\2\0\1\7\1\0\6\7\1\343\25\7\1\0\1\7"+
    "\2\0\1\7\1\0\1\7\1\104\17\7\1\344\12\7"+
    "\1\0\1\7\2\0\1\7\1\0\13\7\1\345\20\7"+
    "\1\0\1\7\2\0\1\7\1\0\14\7\1\140\17\7"+
    "\1\0\1\7\2\0\1\7\1\0\17\7\1\346\14\7"+
    "\1\0\1\7\2\0\1\7\1\0\21\7\1\330\12\7"+
    "\1\0\1\7\2\0\1\7\1\0\11\7\1\347\22\7"+
    "\1\0\1\7\2\0\1\7\1\0\4\7\1\4\27\7"+
    "\1\0\1\7\2\0\1\7\1\0\16\7\1\350\15\7"+
    "\1\0\1\7\2\0\1\7\1\0\1\7\1\271\32\7"+
    "\1\0\1\7\2\0\1\7\1\0\2\7\1\351\31\7"+
    "\1\0\1\7\2\0\1\7\1\0\21\7\1\352\12\7"+
    "\1\0\1\7\2\0\1\7\1\0\23\7\1\40\10\7"+
    "\1\0\1\7\2\0\1\7\1\0\12\7\1\247\21\7"+
    "\1\0\1\7\2\0\1\7\1\0\17\7\1\142\14\7"+
    "\1\0\1\7\2\0\1\7\1\0\13\7\1\353\20\7"+
    "\1\0\1\7\2\0\1\7\1\0\17\7\1\226\14\7"+
    "\1\0\1\7\2\0\1\7\1\0\6\7\1\354\25\7"+
    "\1\0\1\7\2\0\1\7\1\0\5\7\1\171\26\7"+
    "\1\0\1\7\2\0\1\7\1\0\10\7\1\355\23\7"+
    "\1\0\1\7\2\0\1\7\1\0\14\7\1\356\17\7"+
    "\1\0\1\7\2\0\1\7\1\0\6\7\1\357\25\7"+
    "\1\0\1\7\2\0\1\7\1\0\11\7\1\155\22\7"+
    "\1\0\1\7\2\0\1\7\1\0\30\7\1\4\3\7"+
    "\1\0\1\7\2\0\1\7\1\0\2\7\1\40\31\7"+
    "\1\0\1\7\2\0\1\7\1\0\15\7\1\225\16\7"+
    "\1\0\1\7\2\0\1\7\1\0\26\7\1\4\5\7"+
    "\1\0\1\7\2\0\1\7\1\0\14\7\1\360\17\7"+
    "\1\0\1\7\2\0\1\7\1\0\21\7\1\361\12\7"+
    "\1\0\1\7\2\0\1\7\1\0\13\7\1\362\20\7"+
    "\1\0\1\7\2\0\1\7\1\0\4\7\1\4\17\7"+
    "\1\151\7\7\1\0\1\7\2\0\1\7\1\0\21\7"+
    "\1\363\12\7\1\0\1\7\2\0\1\7\1\0\6\7"+
    "\1\364\25\7\1\0\1\7\2\0\1\7\1\0\17\7"+
    "\1\365\14\7\1\0\1\7\2\0\1\7\1\0\21\7"+
    "\1\366\12\7\1\0\1\7\2\0\1\7\1\0\16\7"+
    "\1\367\15\7\1\0\1\7\2\0\1\7\1\0\2\7"+
    "\1\137\31\7\1\0\1\7\2\0\1\7\1\0\21\7"+
    "\1\370\12\7\1\0\1\7\2\0\1\7\1\0\7\7"+
    "\1\371\24\7\1\0\1\7\2\0\1\7\1\0\23\7"+
    "\1\372\10\7\1\0\1\7\2\0\1\7\1\0\17\7"+
    "\1\373\14\7\1\0\1\7\2\0\1\7\1\0\4\7"+
    "\1\374\27\7\1\0\1\7\2\0\1\7\1\0\4\7"+
    "\1\162\27\7\1\0\1\7\2\0\1\7\1\0\4\7"+
    "\1\277\27\7\1\0\1\7\2\0\1\7\1\0\12\7"+
    "\1\375\21\7\1\0\1\7\2\0\1\7\1\0\1\7"+
    "\1\376\32\7\1\0\1\7\2\0\1\7\1\0\10\7"+
    "\1\377\23\7\1\0\1\7\2\0\1\7\1\0\2\7"+
    "\1\u0100\31\7\1\0\1\7\2\0\1\7\1\0\12\7"+
    "\1\270\21\7\1\0\1\7\2\0\1\7\1\0\17\7"+
    "\1\u0101\14\7\1\0\1\7\2\0\1\7\1\0\11\7"+
    "\1\u0102\22\7\1\0\1\7\2\0\1\7\1\0\6\7"+
    "\1\270\25\7\1\0\1\7\2\0\1\7\1\0\1\7"+
    "\1\u0103\32\7\1\0\1\7\2\0\1\7\1\0\10\7"+
    "\1\u0104\23\7\1\0\1\7\2\0\1\7\1\0\5\7"+
    "\1\137\26\7\1\0\1\7\2\0\1\7\1\0\21\7"+
    "\1\u0105\12\7\1\0\1\7\2\0\1\7\1\0\11\7"+
    "\1\162\22\7\1\0\1\7\2\0\1\7\1\0\12\7"+
    "\1\u0106\21\7\1\0\1\7\2\0\1\7\1\0\20\7"+
    "\1\u0107\13\7\1\0\1\7\2\0\1\7\1\0\1\7"+
    "\1\u0108\32\7\1\0\1\7\2\0\1\7\1\0\2\7"+
    "\1\276\31\7\1\0\1\7\2\0\1\7\1\0\7\7"+
    "\1\u0109\24\7\1\0\1\7\2\0\1\7\1\0\25\7"+
    "\1\4\6\7\1\0\1\7\2\0\1\7\1\0\7\7"+
    "\1\137\24\7\1\0\1\7\2\0\1\7\1\0\7\7"+
    "\1\u010a\24\7\1\0\1\7\2\0\1\7\1\0\16\7"+
    "\1\u010b\15\7\1\0\1\7\2\0\1\7\1\0\25\7"+
    "\1\u010c\6\7\1\0\1\7\2\0\1\7\1\0\6\7"+
    "\1\u010d\25\7\1\0\1\7\2\0\1\7\1\0\6\7"+
    "\1\u010e\25\7\1\0\1\7\2\0\1\7\1\0\1\7"+
    "\1\u010f\32\7\1\0\1\7\2\0\1\7\1\0\6\7"+
    "\1\u0110\25\7\1\0\1\7\2\0\1\7\1\0\7\7"+
    "\1\321\24\7\1\0\1\7\2\0\1\7\1\0\21\7"+
    "\1\u0111\12\7\1\0\1\7\2\0\1\7\1\0\30\7"+
    "\1\315\3\7\1\0\1\7\2\0\1\7\1\0\11\7"+
    "\1\u0112\22\7\1\0\1\7\2\0\1\7\1\0\14\7"+
    "\1\155\17\7\1\0\1\7\2\0\1\7\1\0\20\7"+
    "\1\4\13\7\1\0\1\7";

  private static int [] zzUnpackTrans() {
    int [] result = new int[9112];
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
    "\1\0\112\1\1\0\306\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[274];
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
            { return MinecraftTypes.COMMAND;
            } 
            // fall through
          case 11: break;
          case 4: 
            { return TokenType.BAD_CHARACTER;
            } 
            // fall through
          case 12: break;
          case 5: 
            { return MinecraftTypes.NUMBER;
            } 
            // fall through
          case 13: break;
          case 6: 
            { return MinecraftTypes.ARGUMENT;
            } 
            // fall through
          case 14: break;
          case 7: 
            { return MinecraftTypes.SELECTOR;
            } 
            // fall through
          case 15: break;
          case 8: 
            { return MinecraftTypes.STRING;
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
