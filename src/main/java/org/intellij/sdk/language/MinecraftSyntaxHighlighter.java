package org.intellij.sdk.language;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors;
import com.intellij.openapi.editor.HighlighterColors;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import org.intellij.sdk.language.psi.MinecraftTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

/**
 * @author Soni
 */

public class MinecraftSyntaxHighlighter extends SyntaxHighlighterBase
{
    public static final TextAttributesKey COMMAND = createTextAttributesKey("MINECRAFT_COMMAND", DefaultLanguageHighlighterColors.KEYWORD);
    public static final TextAttributesKey ARGUMENT = createTextAttributesKey("MINECRAFT_ARGUMENT", DefaultLanguageHighlighterColors.INSTANCE_METHOD);
    public static final TextAttributesKey SELECTOR = createTextAttributesKey("MINECRAFT_SELECTOR", DefaultLanguageHighlighterColors.INSTANCE_FIELD);
    public static final TextAttributesKey NUMBER = createTextAttributesKey("MINECRAFT_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    public static final TextAttributesKey COMMENT = createTextAttributesKey("MINECRAFT_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    public static final TextAttributesKey BAD_CHARACTER = createTextAttributesKey("MINECRAFT_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

    private static final TextAttributesKey[] COMMAND_KEYS = new TextAttributesKey[]{COMMAND};
    private static final TextAttributesKey[] ARGUMENT_KEYS = new TextAttributesKey[]{ARGUMENT};
    private static final TextAttributesKey[] SELECTOR_KEYS = new TextAttributesKey[]{SELECTOR};
    private static final TextAttributesKey[] NUMBER_KEYS = new TextAttributesKey[]{NUMBER};
    private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
    private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
    private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];
    
    @NotNull
    @Override
    public Lexer getHighlightingLexer()
    {
        return new MinecraftLexerAdapter();
    }
    
    @NotNull
    @Override
    public TextAttributesKey[] getTokenHighlights(IElementType tokenType)
    {
        if (tokenType.equals(MinecraftTypes.COMMAND))       return COMMAND_KEYS;
        else if (tokenType.equals(MinecraftTypes.ARGUMENT)) return ARGUMENT_KEYS;
        else if (tokenType.equals(MinecraftTypes.SELECTOR)) return SELECTOR_KEYS;
        else if (tokenType.equals(MinecraftTypes.NUMBER)) return NUMBER_KEYS;
        else if (tokenType.equals(MinecraftTypes.COMMENT))  return COMMENT_KEYS;
        else if (tokenType.equals(TokenType.BAD_CHARACTER)) return BAD_CHAR_KEYS;
        else return EMPTY_KEYS;
    }
}