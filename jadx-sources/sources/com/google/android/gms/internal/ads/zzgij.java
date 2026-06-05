package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgij {
    public static final zzgij zza = new zzgij("ASSUME_AES_GCM");
    public static final zzgij zzb = new zzgij("ASSUME_XCHACHA20POLY1305");
    public static final zzgij zzc = new zzgij("ASSUME_CHACHA20POLY1305");
    public static final zzgij zzd = new zzgij("ASSUME_AES_CTR_HMAC");
    public static final zzgij zze = new zzgij("ASSUME_AES_EAX");
    public static final zzgij zzf = new zzgij("ASSUME_AES_GCM_SIV");
    private final String zzg;

    private zzgij(String str) {
        this.zzg = str;
    }

    public final String toString() {
        return this.zzg;
    }
}
