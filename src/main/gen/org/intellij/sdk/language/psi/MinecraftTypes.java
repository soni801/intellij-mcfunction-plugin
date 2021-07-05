// This is a generated file. Not intended for manual editing.
package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.intellij.sdk.language.psi.impl.*;

public interface MinecraftTypes {

  IElementType ITEM = new MinecraftElementType("ITEM");

  IElementType ARGUMENT = new MinecraftTokenType("ARGUMENT");
  IElementType COMMAND = new MinecraftTokenType("COMMAND");
  IElementType COMMENT = new MinecraftTokenType("COMMENT");
  IElementType NUMBER = new MinecraftTokenType("NUMBER");
  IElementType OBJECT = new MinecraftTokenType("OBJECT");
  IElementType SELECTOR = new MinecraftTokenType("SELECTOR");
  IElementType STRING = new MinecraftTokenType("STRING");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
      if (type == ITEM) {
        return new MinecraftItemImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
