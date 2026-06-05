package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzfzq implements Comparator {
    public static zzfzq zzb(Comparator comparator) {
        return new zzfxq(comparator);
    }

    public static zzfzq zzc() {
        return zzfzo.zza;
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public zzfzq zza() {
        return new zzfzz(this);
    }

    public final zzfzq zzd(zzfut zzfutVar) {
        return new zzfxb(zzfutVar, this);
    }
}
