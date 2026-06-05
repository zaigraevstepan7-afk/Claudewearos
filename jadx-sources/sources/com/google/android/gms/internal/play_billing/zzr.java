package com.google.android.gms.internal.play_billing;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzr {
    Object zza;
    zzu zzb;
    private zzw zzc = zzw.zze();
    private boolean zzd;

    public final void finalize() {
        zzw zzwVar;
        zzu zzuVar = this.zzb;
        if (zzuVar != null && !zzuVar.isDone()) {
            zzuVar.zzc(new zzs("The completer object was garbage collected - this future would otherwise never complete. The tag was: ".concat(String.valueOf(this.zza))));
        }
        if (this.zzd || (zzwVar = this.zzc) == null) {
            return;
        }
        zzwVar.zzd(null);
    }

    public final void zza() {
        this.zza = null;
        this.zzb = null;
        this.zzc.zzd(null);
    }

    public final boolean zzb(Object obj) {
        this.zzd = true;
        zzu zzuVar = this.zzb;
        boolean z2 = zzuVar != null && zzuVar.zza(obj);
        if (z2) {
            this.zza = null;
            this.zzb = null;
            this.zzc = null;
        }
        return z2;
    }
}
