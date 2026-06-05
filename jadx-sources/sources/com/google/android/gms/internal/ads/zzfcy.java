package com.google.android.gms.internal.ads;

import mc.n;
import nc.s;
import nc.t;
import rc.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfcy implements zzgcx {
    final /* synthetic */ zzcfe zza;
    final /* synthetic */ zzcml zzb;
    final /* synthetic */ zzfjq zzc;
    final /* synthetic */ zzebs zzd;

    public zzfcy(zzcfe zzcfeVar, zzcml zzcmlVar, zzfjq zzfjqVar, zzebs zzebsVar) {
        this.zza = zzcfeVar;
        this.zzb = zzcmlVar;
        this.zzc = zzfjqVar;
        this.zzd = zzebsVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zzb(Object obj) {
        zzcml zzcmlVar;
        String str = (String) obj;
        zzcfe zzcfeVar = this.zza;
        zzfbt zzfbtVarZzD = zzcfeVar.zzD();
        if (zzfbtVarZzD != null && !zzfbtVarZzD.zzai) {
            p pVar = zzfbtVarZzD.zzax;
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzkn)).booleanValue() && (zzcmlVar = this.zzb) != null && zzcml.zzj(str)) {
                zzcmlVar.zzi(str, this.zzc, s.f12202f.f12207e, pVar);
                return;
            } else {
                this.zzc.zzd(str, pVar, null, null);
                return;
            }
        }
        zzfbw zzfbwVarZzR = zzcfeVar.zzR();
        if (zzfbwVarZzR == null) {
            n.D.f11582h.zzw(new IllegalArgumentException("Common configuration cannot be null"), "BufferingGmsgHandlers.getBufferingClickGmsgHandler");
            return;
        }
        n nVar = n.D;
        nVar.f11584k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean zZzA = nVar.f11582h.zzA(zzcfeVar.getContext());
        boolean z2 = false;
        boolean z10 = ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzgs)).booleanValue() && zzfbtVarZzD != null && zzfbtVarZzD.zzS;
        if (zzfbtVarZzD != null && zzfbtVarZzD.zzad != null) {
            z2 = true;
        }
        int i10 = 2;
        if (!zZzA && !z10 && !z2) {
            i10 = 1;
        }
        this.zzd.zzd(new zzebu(jCurrentTimeMillis, zzfbwVarZzR.zzb, str, i10));
    }

    @Override // com.google.android.gms.internal.ads.zzgcx
    public final void zza(Throwable th2) {
    }
}
