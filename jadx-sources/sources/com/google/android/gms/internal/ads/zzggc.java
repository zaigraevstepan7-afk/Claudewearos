package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzggc {
    public static final zzggc zza = new zzggc("SHA1");
    public static final zzggc zzb = new zzggc("SHA224");
    public static final zzggc zzc = new zzggc("SHA256");
    public static final zzggc zzd = new zzggc("SHA384");
    public static final zzggc zze = new zzggc("SHA512");
    private final String zzf;

    private zzggc(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
