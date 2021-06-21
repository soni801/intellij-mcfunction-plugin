package org.intellij.sdk.language;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

/**
 * @author Soni
 */

public class MinecraftFileType extends LanguageFileType
{
    public static final MinecraftFileType INSTANCE = new MinecraftFileType();
    
    private MinecraftFileType()
    {
        super(MinecraftLanguage.INSTANCE);
    }
    
    @NotNull
    @Override
    public String getName()
    {
        return "Minecraft File";
    }
    
    @NotNull
    @Override
    public String getDescription()
    {
        return "Minecraft function file";
    }
    
    @NotNull
    @Override
    public String getDefaultExtension()
    {
        return "mcfunction";
    }
    
    @Nullable
    @Override
    public Icon getIcon()
    {
        return MinecraftIcons.FILE;
    }
}