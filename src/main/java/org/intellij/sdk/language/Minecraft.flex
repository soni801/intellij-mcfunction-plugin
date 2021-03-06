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
%eof{  return;
%eof}

WHITE_SPACE=[ \t\n\r]+
END_OF_LINE_COMMENT=("#")[^\r\n]*
COMMAND=\?|advancement|attribute|ban|ban-ip|banlist|bossbar|clear|clone|data|datapack|debug|defaultgamemode|deop|difficulty|effect|enchant|execute|experience|fill|forceload|function|gamemode|gamerule|give|help|item|kick|kill|list|locate|locatebiome|loot|me|msg|op|pardon|pardon-ip|particle|perf|playsound|publish|recipe|reload|save-all|save-off|save-on|say|schedule|scoreboard|seed|setblock|setidletimeout|setworldspawn|spawnpoint|spectate|spreadplayers|stop|stopsound|summon|tag|team|teammsg|teleport|tell|tellraw|time|title|tm|tp|trigger|w|weather|whitelist|worldborder|xp
ARGUMENT=align|anchored|as|at|facing|in|positioned|rotated|store|if|unless|run|add|empty|join|leave|list|modify|remove|players|objectives|grant|revoke|query|set|center|creative|survival|adventure|spectator|replace|subtitle|actionbar
SELECTOR=@p|@r|@a|@e|@s
OBJECT=[^ \t\n\r!=]*:[^ \t\n\r\]]*
NUMBER=(\d|\~|-)+
STRING=\"(.*)\"

%%

<YYINITIAL>
{
    {WHITE_SPACE}         { return TokenType.WHITE_SPACE; }
    {END_OF_LINE_COMMENT} { return MinecraftTypes.COMMENT; }
    {COMMAND}             { return MinecraftTypes.COMMAND; }
    {ARGUMENT}            { return MinecraftTypes.ARGUMENT; }
    {SELECTOR}            { return MinecraftTypes.SELECTOR; }
    {OBJECT}              { return MinecraftTypes.OBJECT; }
    {NUMBER}              { return MinecraftTypes.NUMBER; }
    {STRING}              { return MinecraftTypes.STRING; }
}

[\S]+ { return TokenType.BAD_CHARACTER; }
