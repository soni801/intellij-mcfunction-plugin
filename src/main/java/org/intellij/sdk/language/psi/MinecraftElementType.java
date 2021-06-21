package org.intellij.sdk.language.psi;

import com.intellij.psi.tree.IElementType;
import org.intellij.sdk.language.MinecraftLanguage;
import org.jetbrains.annotations.NonNls;
import org.jetbrains.annotations.NotNull;

/**
 * @author Soni
 */

public class MinecraftElementType extends IElementType
{
    public MinecraftElementType(@NotNull @NonNls String debugName)
    {
        super(debugName, MinecraftLanguage.INSTANCE);
    }
}