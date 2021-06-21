// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.intellij.sdk.language.psi.impl.*;

public interface MinecraftTypes {

  IElementType PROPERTY = new MinecraftElementType("PROPERTY");

  IElementType COMMENT = new MinecraftTokenType("COMMENT");
  IElementType CRLF = new MinecraftTokenType("CRLF");
  IElementType KEY = new MinecraftTokenType("KEY");
  IElementType SEPARATOR = new MinecraftTokenType("SEPARATOR");
  IElementType VALUE = new MinecraftTokenType("VALUE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == PROPERTY) {
        return new MinecraftPropertyImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
