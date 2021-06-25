package org.intellij.sdk.language;

import com.intellij.lexer.Lexer;
import com.intellij.testFramework.LexerTestCase;

/**
 * @author Soni
 */

public class MinecraftLexerTest extends LexerTestCase
{
    public void testOne()
    {
        doTest("function as @e",
                "MinecraftTokenType.COMMAND ('function')\n" +
                        "WHITE_SPACE (' ')\n" +
                        "MinecraftTokenType.ARGUMENT ('as')\n" +
                        "WHITE_SPACE (' ')\n" +
                        "MinecraftTokenType.SELECTOR ('@e')");
    }
    
    @Override
    protected Lexer createLexer()
    {
        return new MinecraftLexerAdapter();
    }
    
    @Override
    protected String getDirPath()
    {
        return null;
    }
}