package com.airbnb.android.showkase.models

/**
 * Interface implemented by the final class that's autogenerated by the ShowkaseProcessor. User's
 * of this library don't need to use this as it's for internal usage only.
 */
interface ShowkaseProvider {
    fun getShowkaseComponents(): List<ShowkaseBrowserComponent>

    fun getShowkaseColors(): List<ShowkaseBrowserColor>

    fun getShowkaseTypography(): List<ShowkaseBrowserTypography>

    fun metadata(): ShowkaseElementsMetadata {
        val componentList = getShowkaseComponents()
        val colorList = getShowkaseColors()
        val typographyList = getShowkaseTypography()
        return ShowkaseElementsMetadata(componentList, colorList, typographyList)
    }
}
