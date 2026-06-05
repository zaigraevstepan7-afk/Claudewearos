package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzavl implements Runnable {
    final /* synthetic */ zzavm zza;

    public zzavl(zzavm zzavmVar) {
        this.zza = zzavmVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zBooleanValue;
        zzavm zzavmVar = this.zza;
        if (zzavmVar.zzb != null) {
            return;
        }
        synchronized (zzavm.zzc) {
            if (zzavmVar.zzb != null) {
                return;
            }
            boolean z2 = false;
            try {
                zBooleanValue = ((Boolean) zzbdc.zzcM.zze()).booleanValue();
            } catch (IllegalStateException unused) {
                zBooleanValue = false;
            }
            if (zBooleanValue) {
                try {
                    zzavm.zza = zzfpz.zzb(this.zza.zze.zza, "ADSHIELD", null);
                    z2 = zBooleanValue;
                } catch (Throwable unused2) {
                }
            } else {
                z2 = zBooleanValue;
            }
            this.zza.zzb = Boolean.valueOf(z2);
            zzavm.zzc.open();
        }
    }
}
