package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzflq {
    private final String zza;
    private final String zzb;

    private zzflq(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public static zzflq zza(String str, String str2) {
        zzfmz.zzb(str, "Name is null or empty");
        zzfmz.zzb(str2, "Version is null or empty");
        return new zzflq(str, str2);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
