package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbfb {
    public static final zzbem zza = new zzbem("gads:gma_attestation:click:macro_string", "@click_attok@", 4);
    public static final zzbem zzb = new zzbem("gads:gma_attestation:click:query_param", "attok", 4);
    public static final zzbem zzc = zzbem.zzb("gads:gma_attestation:click:timeout", 2000);
    public static final zzbem zzd = zzbem.zzd("gads:gma_attestation:click:enable", false);
    public static final zzbem zze = zzbem.zzb("gads:gma_attestation:click:enable_dynamite_version", 213806100);
    public static final zzbem zzf = zzbem.zzd("gads:gma_attestation:click:qualification:enable", true);
    public static final zzbem zzg = zzbem.zzd("gads:gma_attestation:image_hash", false);
    public static final zzbem zzh = zzbem.zzd("gads:gma_attestation:impression:enable", true);
    public static final zzbem zzi;

    static {
        zzbem.zzd("gads:gma_attestation:request:enable_javascript", false);
        zzbem.zzd("gads:gma_attestation:request:enable", true);
        zzi = zzbem.zzd("gads:gma_attestation:click:report_error", true);
    }
}
