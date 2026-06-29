package com.alfie51m.pronounsMC;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;

public class ColorUtil {

    private static final LegacyComponentSerializer LEGACY = LegacyComponentSerializer.legacyAmpersand();

    /**
     * Converts a legacy &-code string into an Adventure Component.
     */
    public static Component component(String text) {
        return LEGACY.deserialize(text);
    }

    /**
     * Converts a legacy &-code string to its formatted plain representation.
     * Use component(String) when sending to players for proper Adventure support.
     */
    public static String color(String text) {
        // Kept for compatibility with PlaceholderAPI expansion and internal string usage
        return LegacyComponentSerializer.legacySection().serialize(LEGACY.deserialize(text));
    }
}
