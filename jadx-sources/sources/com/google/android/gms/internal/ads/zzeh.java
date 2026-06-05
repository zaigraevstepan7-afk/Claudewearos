package com.google.android.gms.internal.ads;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzeh {
    final /* synthetic */ zzel zza;
    private final WeakReference zzb;
    private final Executor zzc;

    public zzeh(zzel zzelVar, zzzn zzznVar, Executor executor) {
        this.zza = zzelVar;
        this.zzb = new WeakReference(zzznVar);
        this.zzc = executor;
    }

    public static /* synthetic */ void zza(zzeh zzehVar) throws Throwable {
        zzzn zzznVar = (zzzn) zzehVar.zzb.get();
        if (zzznVar != null) {
            zzznVar.zza.zzl(zzehVar.zza.zza());
        }
    }

    public final void zzb() {
        this.zzc.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeg
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                zzeh.zza(this.zza);
            }
        });
    }

    public final boolean zzc() {
        return this.zzb.get() == null;
    }
}
