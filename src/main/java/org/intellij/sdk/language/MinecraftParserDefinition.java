package org.intellij.sdk.language;

import com.intellij.lang.ASTNode;
import com.intellij.lang.ParserDefinition;
import com.intellij.lang.PsiParser;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.FileViewProvider;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiFile;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IFileElementType;
import com.intellij.psi.tree.TokenSet;
import org.intellij.sdk.language.parser.MinecraftParser;
import org.intellij.sdk.language.psi.MinecraftFile;
import org.intellij.sdk.language.psi.MinecraftTypes;
import org.jetbrains.annotations.NotNull;

/**
 * @author Soni
 */

public class MinecraftParserDefinition implements ParserDefinition
{
    public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
    public static final TokenSet COMMENTS = TokenSet.create(MinecraftTypes.COMMENT);
    
    public static final IFileElementType FILE = new IFileElementType(MinecraftLanguage.INSTANCE);
    
    @NotNull
    @Override
    public Lexer createLexer(Project project)
    {
        return new MinecraftLexerAdapter();
    }
    
    @NotNull
    @Override
    public TokenSet getWhitespaceTokens()
    {
        return WHITE_SPACES;
    }
    
    @NotNull
    @Override
    public TokenSet getCommentTokens()
    {
        return COMMENTS;
    }
    
    @NotNull
    @Override
    public TokenSet getStringLiteralElements()
    {
        return TokenSet.EMPTY;
    }
    
    @NotNull
    @Override
    public PsiParser createParser(final Project project)
    {
        return new MinecraftParser();
    }
    
    @Override
    public IFileElementType getFileNodeType()
    {
        return FILE;
    }
    
    @Override
    public PsiFile createFile(FileViewProvider viewProvider)
    {
        return new MinecraftFile(viewProvider);
    }
    
    @Override
    public SpaceRequirements spaceExistenceTypeBetweenTokens(ASTNode left, ASTNode right)
    {
        return SpaceRequirements.MAY;
    }
    
    @NotNull
    @Override
    public PsiElement createElement(ASTNode node)
    {
        return MinecraftTypes.Factory.createElement(node);
    }
}