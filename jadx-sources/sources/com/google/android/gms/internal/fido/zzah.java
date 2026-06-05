package com.google.android.gms.internal.fido;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzah {
    private static final Object zza = new Object();
    private static volatile boolean zzb = false;
    private static volatile zzag zzc = null;
    private static volatile boolean zzd = false;
    private static volatile zzag zze;

    public static void zza() {
        zzd = true;
    }

    public static void zzb() {
        if (zze == null) {
            zze = new zzag(null);
        }
    }

    public static void zzc() {
        if (zzc == null) {
            zzc = new zzag(null);
        }
    }

    public static boolean zzd() {
        synchronized (zza) {
        }
        return false;
    }
}
