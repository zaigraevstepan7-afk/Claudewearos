package com.google.android.gms.internal.fido;

import java.util.Comparator;
import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgl {
    static final String zza;
    static final Comparator zzb;

    static {
        Comparator comparator;
        String strConcat = zzgl.class.getName().concat("$UnsafeComparator");
        zza = strConcat;
        try {
            Object[] enumConstants = Class.forName(strConcat).getEnumConstants();
            Objects.requireNonNull(enumConstants);
            comparator = (Comparator) enumConstants[0];
        } catch (Throwable unused) {
            comparator = zzgk.INSTANCE;
        }
        zzb = comparator;
    }
}
