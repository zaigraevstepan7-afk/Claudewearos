package com.google.android.gms.internal.ads;

import nc.h2;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzeik implements zzcxa {
    boolean zza = false;
    final /* synthetic */ zzedh zzb;
    final /* synthetic */ zzcai zzc;

    public zzeik(zzeil zzeilVar, zzedh zzedhVar, zzcai zzcaiVar) {
        this.zzb = zzedhVar;
        this.zzc = zzcaiVar;
    }

    private final synchronized void zze(h2 h2Var) {
        int i10 = 1;
        if (true == ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzfJ)).booleanValue()) {
            i10 = 3;
        }
        this.zzc.zzd(new zzedi(i10, h2Var));
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final synchronized void zza(int i10) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(new h2(i10, zzeil.zze(this.zzb.zza, i10), "undefined", null, null));
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final synchronized void zzb(h2 h2Var) {
        if (this.zza) {
            return;
        }
        this.zza = true;
        zze(h2Var);
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final synchronized void zzc(int i10, String str) {
        try {
            if (this.zza) {
                return;
            }
            this.zza = true;
            if (str == null) {
                str = zzeil.zze(this.zzb.zza, i10);
            }
            zze(new h2(i10, str, "undefined", null, null));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcxa
    public final synchronized void zzd() {
        this.zzc.zzc(null);
    }
}
