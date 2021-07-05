// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.intellij.sdk.language.psi.MinecraftTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;
import com.intellij.lang.LightPsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class MinecraftParser implements PsiParser, LightPsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, null);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    r = parse_root_(t, b);
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b) {
    return parse_root_(t, b, 0);
  }

  static boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return minecraftFile(b, l + 1);
  }

  /* ********************************************************** */
  // COMMENT
  static boolean comment(PsiBuilder b, int l) {
    return consumeToken(b, COMMENT);
  }

  /* ********************************************************** */
  // COMMAND|ARGUMENT|SELECTOR|OBJECT|NUMBER|STRING
  public static boolean item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, ITEM, "<item>");
    r = consumeToken(b, COMMAND);
    if (!r) r = consumeToken(b, ARGUMENT);
    if (!r) r = consumeToken(b, SELECTOR);
    if (!r) r = consumeToken(b, OBJECT);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = consumeToken(b, STRING);
    exit_section_(b, l, m, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // (item|comment)*
  static boolean minecraftFile(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "minecraftFile")) return false;
    while (true) {
      int c = current_position_(b);
      if (!minecraftFile_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "minecraftFile", c)) break;
    }
    return true;
  }

  // item|comment
  private static boolean minecraftFile_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "minecraftFile_0")) return false;
    boolean r;
    r = item(b, l + 1);
    if (!r) r = comment(b, l + 1);
    return r;
  }

}
