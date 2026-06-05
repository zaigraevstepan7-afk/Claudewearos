package com.google.android.gms.internal.ads;

import android.content.Context;
import rc.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdsm implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;
    private final zzhgh zzd;

    public zzdsm(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3, zzhgh zzhghVar4, zzhgh zzhghVar5) {
        this.zza = zzhghVar2;
        this.zzb = zzhghVar3;
        this.zzc = zzhghVar4;
        this.zzd = zzhghVar5;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final Object zzb() {
        zzgdm zzgdmVarZzc = zzffm.zzc();
        o oVar = (o) this.zza.zzb();
        yc.b bVar = (yc.b) this.zzb;
        yc.a aVar = new yc.a((Context) bVar.f20274a.zzb(), (rc.a) bVar.f20275b.zzb());
        ((yc.d) this.zzc).getClass();
        return new zzdsh(zzgdmVarZzc, oVar, aVar, new yc.c(), ((zzchg) this.zzd).zza());
    }
}
