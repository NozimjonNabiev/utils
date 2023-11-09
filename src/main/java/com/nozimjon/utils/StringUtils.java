package com.nozimjon.utils;

import org.apache.commons.lang3.math.NumberUtils;
public class StringUtils {
    public static boolean isPositiveNumber(String str) {
        return NumberUtils.isCreatable(str) && Double.parseDouble(str) > 0;
    }
}
