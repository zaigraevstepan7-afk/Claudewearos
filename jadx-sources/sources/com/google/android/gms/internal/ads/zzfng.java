package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfng implements Runnable {
    @Override // java.lang.Runnable
    public final void run() {
        if (zzfnj.zzc != null) {
            zzfnj.zzc.post(zzfnj.zzd);
            zzfnj.zzc.postDelayed(zzfnj.zze, 200L);
        }
    }
}
