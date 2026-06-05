package com.google.android.gms.internal.ads;

import android.content.Context;
import mc.n;
import nc.t;
import qc.o0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzezn implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;

    public zzezn(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
        this.zzc = zzhghVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzezk zzb() {
        zzbzk zzbzkVarN;
        Context context = (Context) this.zza.zzb();
        zzfdx zzfdxVar = (zzfdx) this.zzb.zzb();
        zzfep zzfepVar = (zzfep) this.zzc.zzb();
        zzbct zzbctVar = zzbdc.zzgv;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            zzbzkVarN = ((o0) n.D.f11582h.zzi()).n();
        } else {
            o0 o0Var = (o0) n.D.f11582h.zzi();
            synchronized (o0Var.f13414a) {
                zzbzkVarN = o0Var.f13426n;
            }
        }
        boolean z2 = false;
        if (zzbzkVarN != null && zzbzkVarN.zzh()) {
            z2 = true;
        }
        if (((Integer) tVar.f12230c.zzb(zzbdc.zzgx)).intValue() > 0) {
            if (!((Boolean) tVar.f12230c.zzb(zzbdc.zzgu)).booleanValue() || z2) {
                zzfeo zzfeoVarZza = zzfepVar.zza(zzfef.Rewarded, context, zzfdxVar, new zzeyo(new zzeyl()));
                zzeza zzezaVar = new zzeza(new zzeyz());
                zzfeb zzfebVar = zzfeoVarZza.zza;
                zzgdm zzgdmVar = zzcad.zza;
                return new zzeyq(zzezaVar, new zzeyw(zzfebVar, zzgdmVar), zzfeoVarZza.zzb, zzfebVar.zza().zzf, zzgdmVar);
            }
        }
        return new zzeyz();
    }
}
