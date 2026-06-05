package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzcbm implements Runnable {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzcbn zzb;

    public zzcbm(zzcbn zzcbnVar, boolean z2) {
        this.zza = z2;
        this.zzb = zzcbnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzK("windowVisibilityChanged", "isVisible", String.valueOf(this.zza));
    }
}
