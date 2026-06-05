package com.google.android.gms.internal.ads;

import android.content.Context;
import mc.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcic implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;

    public zzcic(zzhgh zzhghVar, zzhgh zzhghVar2) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzbvi zzb() {
        Context contextZza = ((zzchg) this.zza).zza();
        zzfhp zzfhpVar = (zzfhp) this.zzb.zzb();
        n nVar = n.D;
        zzbou zzbouVarZzb = nVar.f11591r.zzb(contextZza, rc.a.b(), zzfhpVar);
        zzboo zzbooVar = zzbor.zza;
        zzbouVarZzb.zza("google.afma.request.getAdDictionary", zzbooVar, zzbooVar);
        return new zzbvk(contextZza, nVar.f11591r.zzb(contextZza, rc.a.b(), zzfhpVar).zza("google.afma.sdkConstants.getSdkConstants", zzbooVar, zzbooVar), rc.a.b());
    }
}
