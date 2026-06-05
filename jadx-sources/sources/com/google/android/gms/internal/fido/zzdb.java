package com.google.android.gms.internal.fido;

import java.util.Comparator;
import java.util.SortedSet;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzdb {
    public static boolean zza(Comparator comparator, Iterable iterable) {
        Comparator comparator2;
        comparator.getClass();
        iterable.getClass();
        if (iterable instanceof SortedSet) {
            comparator2 = ((SortedSet) iterable).comparator();
            if (comparator2 == null) {
                comparator2 = zzcq.zza;
            }
        } else {
            if (!(iterable instanceof zzda)) {
                return false;
            }
            comparator2 = ((zzda) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
