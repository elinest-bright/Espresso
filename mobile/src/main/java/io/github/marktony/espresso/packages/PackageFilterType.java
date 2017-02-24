package io.github.marktony.espresso.packages;

/**
 * Created by lizhaotailang on 2017/2/25.
 * Used with the bottom navigation in the packages fragment.
 */

public enum PackageFilterType {

    /**
     * Do not filter the packages.
     */
    ALL,

    /**
     * Filters only the on the way (not complete or delivered) packages.
     */
    ON_THE_WAY,

    /**
     * Filters only the delivered packages.
     */
    DELIVERED
}