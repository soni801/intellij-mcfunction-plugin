package org.intellij.sdk.language.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import org.intellij.sdk.language.MinecraftFileType;
import org.intellij.sdk.language.MinecraftLanguage;
import org.jetbrains.annotations.NotNull;

/**
 * @author Soni
 */

public class MinecraftFile extends PsiFileBase
{
    public MinecraftFile(@NotNull FileViewProvider viewProvider)
    {
        super(viewProvider, MinecraftLanguage.INSTANCE);
    }
    
    @NotNull
    @Override
    public FileType getFileType()
    {
        return MinecraftFileType.INSTANCE;
    }
    
    @Override
    public String toString()
    {
        return "Minecraft File";
    }
}