package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzfvc implements Serializable {
    public static zzfvc zzc() {
        return zzfui.zza;
    }

    public static zzfvc zzd(Object obj) {
        return obj == null ? zzfui.zza : new zzfvj(obj);
    }

    public abstract zzfvc zza(zzfut zzfutVar);

    public abstract Object zzb(Object obj);
}
