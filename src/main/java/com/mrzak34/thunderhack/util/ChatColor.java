package com.mrzak34.thunderhack.util;


public enum ChatColor {

    BLACK('0'), DARK_BLUE('1'), DARK_GREEN('2'), DARK_AQUA('3'), DARK_RED('4'), DARK_PURPLE('5'), GOLD('6'), GRAY('7'), DARK_GRAY('8'), BLUE('9'), GREEN('a'), AQUA('b'), RED('c'), LIGHT_PURPLE('d'),
    YELLOW('e'), WHITE('f'), MAGIC('k', true), BOLD('l', true), STRIKETHROUGH('m', true), UNDERLINE('n', true), ITALIC('o', true), RESET('r');

    public static final char COLOR_CHAR = '\u00A7';

    private final char code;

    private final boolean isFormat;

    private final String toString;

    ChatColor(char code) {
        this(code, false);
    }


    ChatColor(char code, boolean isFormat) {
        this.code = code;
        this.isFormat = isFormat;
        toString = new String(new char[]
                { COLOR_CHAR, code });
    }

    public char getChar() {
        return code;
    }

    @Override
    public String toString() {
        return toString;
    }

    public boolean isFormat() {
        return isFormat;
    }

    public boolean isColor() {
        return !isFormat && this != RESET;
    }
}