package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdij {
    private zzbgk zza;

    public zzdij(zzdhu zzdhuVar) {
        this.zza = zzdhuVar;
    }

    public final synchronized zzbgk zza() {
        return this.zza;
    }

    public final synchronized void zzb(zzbgk zzbgkVar) {
        this.zza = zzbgkVar;
    }
}
