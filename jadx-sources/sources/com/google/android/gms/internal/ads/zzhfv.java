package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzhfv {
    public static HashSet zza(int i10) {
        return new HashSet(zzd(i10));
    }

    public static LinkedHashMap zzb(int i10) {
        return new LinkedHashMap(zzd(i10));
    }

    public static List zzc(int i10) {
        return i10 == 0 ? Collections.EMPTY_LIST : new ArrayList(i10);
    }

    private static int zzd(int i10) {
        return i10 < 3 ? i10 + 1 : i10 < 1073741824 ? (int) ((i10 / 0.75f) + 1.0f) : f.API_PRIORITY_OTHER;
    }
}
