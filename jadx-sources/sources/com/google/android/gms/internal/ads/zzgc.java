package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzgc implements zzgj {
    private final boolean zza;
    private final ArrayList zzb = new ArrayList(1);
    private int zzc;
    private zzgo zzd;

    public zzgc(boolean z2) {
        this.zza = z2;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public /* synthetic */ Map zze() {
        return Collections.EMPTY_MAP;
    }

    @Override // com.google.android.gms.internal.ads.zzgj
    public final void zzf(zzhj zzhjVar) {
        zzhjVar.getClass();
        ArrayList arrayList = this.zzb;
        if (arrayList.contains(zzhjVar)) {
            return;
        }
        arrayList.add(zzhjVar);
        this.zzc++;
    }

    public final void zzg(int i10) {
        zzgo zzgoVar = this.zzd;
        String str = zzex.zza;
        for (int i11 = 0; i11 < this.zzc; i11++) {
            ((zzhj) this.zzb.get(i11)).zza(this, zzgoVar, this.zza, i10);
        }
    }

    public final void zzh() {
        zzgo zzgoVar = this.zzd;
        String str = zzex.zza;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzhj) this.zzb.get(i10)).zzb(this, zzgoVar, this.zza);
        }
        this.zzd = null;
    }

    public final void zzi(zzgo zzgoVar) {
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzhj) this.zzb.get(i10)).zzc(this, zzgoVar, this.zza);
        }
    }

    public final void zzj(zzgo zzgoVar) {
        this.zzd = zzgoVar;
        for (int i10 = 0; i10 < this.zzc; i10++) {
            ((zzhj) this.zzb.get(i10)).zzd(this, zzgoVar, this.zza);
        }
    }
}
