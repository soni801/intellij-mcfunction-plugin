package org.intellij.sdk.language;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.intellij.sdk.language.psi.MinecraftTypes;
import com.intellij.psi.TokenType;

%%

%class MinecraftLexer
%implements FlexLexer
%unicode
%function advance
%type IElementType

WHITE_SPACE=[ \t\n\r]+
END_OF_LINE_COMMENT=("#")[^\r\n]*
COMMAND=execute|function|test
ARGUMENT=at|as|run
SELECTOR=@e|@a|@p|@s

%%

<YYINITIAL>
{
    {WHITE_SPACE}         { return TokenType.WHITE_SPACE; }
    {END_OF_LINE_COMMENT} { return MinecraftTypes.COMMENT; }
    {COMMAND}             { return MinecraftTypes.COMMAND; }
    {ARGUMENT}            { return MinecraftTypes.ARGUMENT; }
    {SELECTOR}            { return MinecraftTypes.SELECTOR; }
}

[^] { return TokenType.BAD_CHARACTER; }