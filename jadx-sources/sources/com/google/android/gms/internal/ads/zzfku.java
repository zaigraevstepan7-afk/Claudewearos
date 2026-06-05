package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfku implements Runnable {
    final /* synthetic */ zzfkv zza;

    public zzfku(zzfkv zzfkvVar) {
        this.zza = zzfkvVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzfkv zzfkvVar = this.zza;
        if (zzfkvVar.zzp != null) {
            zzfkd zzfkdVar = zzfkvVar.zzp;
            ((ud.b) zzfkvVar.zzq).getClass();
            zzfkdVar.zzj(System.currentTimeMillis(), zzfkvVar.zzr, zzfkvVar.zze.f12132d, zzfkvVar.zzD());
        }
    }
}
