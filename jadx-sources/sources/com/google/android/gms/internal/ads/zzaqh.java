package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzaqh {
    public final Object zza;
    public final zzapk zzb;
    public final zzaqk zzc;
    public boolean zzd;

    private zzaqh(zzaqk zzaqkVar) {
        this.zzd = false;
        this.zza = null;
        this.zzb = null;
        this.zzc = zzaqkVar;
    }

    public static zzaqh zza(zzaqk zzaqkVar) {
        return new zzaqh(zzaqkVar);
    }

    public static zzaqh zzb(Object obj, zzapk zzapkVar) {
        return new zzaqh(obj, zzapkVar);
    }

    public final boolean zzc() {
        return this.zzc == null;
    }

    private zzaqh(Object obj, zzapk zzapkVar) {
        this.zzd = false;
        this.zza = obj;
        this.zzb = zzapkVar;
        this.zzc = null;
    }
}
