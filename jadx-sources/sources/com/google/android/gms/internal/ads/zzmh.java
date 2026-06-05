package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzmh {
    public static final zzmh zza = new zzmh(new zzmg());
    public final zzfyk zzb;
    public final Double zzc = null;
    public final Double zzd = null;
    public final boolean zze = true;
    public final boolean zzf = false;

    private zzmh(zzmg zzmgVar) {
        this.zzb = zzmgVar.zza;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzmh) && this.zzb.equals(((zzmh) obj).zzb);
    }

    public final int hashCode() {
        return Objects.hash(this.zzb, null, null, Boolean.TRUE, Boolean.FALSE);
    }
}
