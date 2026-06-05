package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbfl {
    public static final zzbem zza = zzbem.zzb("gads:dynamite_load:fail:sample_rate", 10000);
    public static final zzbem zzb = zzbem.zzd("gads:report_dynamite_crash_in_background_thread", false);
    public static final zzbem zzc = new zzbem("gads:public_beta:traffic_multiplier", "1.0", 4);
    public static final zzbem zzd = new zzbem("gads:sdk_crash_report_class_prefix", "com.google.", 4);
    public static final zzbem zze;
    public static final zzbem zzf;

    static {
        zzbem.zzd("gads:sdk_crash_report_enabled", false);
        zze = zzbem.zzd("gads:sdk_crash_report_full_stacktrace", false);
        zzf = zzbem.zza("gads:trapped_exception_sample_rate", 0.01d);
    }
}
