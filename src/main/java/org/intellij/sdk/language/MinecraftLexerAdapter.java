package org.intellij.sdk.language;

import com.intellij.lexer.FlexAdapter;

/**
 * @author Soni
 */

public class MinecraftLexerAdapter extends FlexAdapter
{
    public MinecraftLexerAdapter()
    {
        super(new MinecraftLexer(null));
    }
}