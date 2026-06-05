package com.google.android.gms.internal.ads;

import android.content.Context;
import qc.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdff implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;
    private final zzhgh zzd;

    public zzdff(zzdey zzdeyVar, zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3, zzhgh zzhghVar4) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
        this.zzc = zzhghVar3;
        this.zzd = zzhghVar4;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final rc.a aVarZza = ((zzchu) this.zzb).zza();
        final zzfbt zzfbtVarZza = ((zzcrm) this.zzc).zza();
        final zzfco zzfcoVarZza = ((zzcvi) this.zzd).zza();
        return new zzddo(new zzcxf() { // from class: com.google.android.gms.internal.ads.zzdew
            @Override // com.google.android.gms.internal.ads.zzcxf
            public final void zzt() {
                n nVar = mc.n.D.f11588o;
                Context context2 = context;
                zzfco zzfcoVar = zzfcoVarZza;
                nVar.i(context2, aVarZza.f14321a, zzfbtVarZza.zzC.toString(), zzfcoVar.zzf);
            }
        }, zzcad.zzg);
    }
}
