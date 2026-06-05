package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbc {
    private final zzt zza = new zzt();

    public final zzbc zza(int i10) {
        this.zza.zza(i10);
        return this;
    }

    public final zzbc zzb(zzbd zzbdVar) {
        zzv zzvVar = zzbdVar.zza;
        for (int i10 = 0; i10 < zzvVar.zzb(); i10++) {
            this.zza.zza(zzvVar.zza(i10));
        }
        return this;
    }

    public final zzbc zzc(int... iArr) {
        for (int i10 = 0; i10 < 20; i10++) {
            this.zza.zza(iArr[i10]);
        }
        return this;
    }

    public final zzbc zzd(int i10, boolean z2) {
        if (z2) {
            this.zza.zza(i10);
        }
        return this;
    }

    public final zzbd zze() {
        return new zzbd(this.zza.zzb(), null);
    }
}
