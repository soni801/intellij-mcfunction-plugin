package org.intellij.sdk.language;

import com.intellij.lang.Language;

/**
 * @author Soni
 */

public class MinecraftLanguage extends Language
{
    public static final MinecraftLanguage INSTANCE = new MinecraftLanguage();
    
    private MinecraftLanguage()
    {
        super("Minecraft");
    }
}