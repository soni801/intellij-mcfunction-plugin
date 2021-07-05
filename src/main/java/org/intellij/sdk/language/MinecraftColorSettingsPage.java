package org.intellij.sdk.language;

import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighter;
import com.intellij.openapi.options.colors.AttributesDescriptor;
import com.intellij.openapi.options.colors.ColorDescriptor;
import com.intellij.openapi.options.colors.ColorSettingsPage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.Map;

/**
 * @author Soni
 */

public class MinecraftColorSettingsPage implements ColorSettingsPage
{
    private static final AttributesDescriptor[] DESCRIPTORS = new AttributesDescriptor[]{
            new AttributesDescriptor("Command", MinecraftSyntaxHighlighter.COMMAND),
            new AttributesDescriptor("Argument", MinecraftSyntaxHighlighter.ARGUMENT),
            new AttributesDescriptor("Selector", MinecraftSyntaxHighlighter.SELECTOR),
            new AttributesDescriptor("Object", MinecraftSyntaxHighlighter.OBJECT),
            new AttributesDescriptor("Number", MinecraftSyntaxHighlighter.NUMBER),
            new AttributesDescriptor("String", MinecraftSyntaxHighlighter.STRING),
            new AttributesDescriptor("Comment", MinecraftSyntaxHighlighter.COMMENT),
            new AttributesDescriptor("Bad Value", MinecraftSyntaxHighlighter.BAD_CHARACTER)
    };
    
    @Nullable
    @Override
    public Icon getIcon()
    {
        return MinecraftIcons.FILE;
    }
    
    @NotNull
    @Override
    public SyntaxHighlighter getHighlighter()
    {
        return new MinecraftSyntaxHighlighter();
    }
    
    @NotNull
    @Override
    public String getDemoText()
    {
        return "# This is a comment\n" +
               "execute as @a run tellraw @s \"ok\"\n" +
               "function minecraft:tick\n" +
               "tp @e[type=!minecraft:player] 285 73 127";
    }
    
    @Nullable
    @Override
    public Map<String, TextAttributesKey> getAdditionalHighlightingTagToDescriptorMap()
    {
        return null;
    }
    
    @NotNull
    @Override
    public AttributesDescriptor @NotNull [] getAttributeDescriptors()
    {
        return DESCRIPTORS;
    }
    
    @NotNull
    @Override
    public ColorDescriptor @NotNull [] getColorDescriptors()
    {
        return ColorDescriptor.EMPTY_ARRAY;
    }
    
    @NotNull
    @Override
    public String getDisplayName()
    {
        return "Minecraft function";
    }
}