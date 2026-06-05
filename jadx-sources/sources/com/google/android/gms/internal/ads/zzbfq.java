package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbfq {
    public static final zzbem zza = zzbem.zzd("gads:trustless_token_for_decagon:enabled", true);
    public static final zzbem zzb;

    static {
        zzbem.zzd("gads:invalidate_token_at_refresh_start", true);
        zzbem.zzd("gms:expose_token_for_gma:enabled", true);
        zzbem.zzd("gads:referesh_rate_limit", false);
        zzb = zzbem.zzb("gads:timeout_for_trustless_token:millis", 2000L);
        zzbem.zzd("gads:token_anonymization:enabled", true);
        zzbem.zzb("gads:cached_token:ttl_millis", 10800000L);
    }
}
