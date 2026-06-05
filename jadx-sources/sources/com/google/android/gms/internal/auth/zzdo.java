package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdo {
    public static zzdj zza(zzdj zzdjVar) {
        return ((zzdjVar instanceof zzdm) || (zzdjVar instanceof zzdk)) ? zzdjVar : zzdjVar instanceof Serializable ? new zzdk(zzdjVar) : new zzdm(zzdjVar);
    }

    public static zzdj zzb(Object obj) {
        return new zzdn(obj);
    }
}
