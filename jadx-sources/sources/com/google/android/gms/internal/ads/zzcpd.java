package com.google.android.gms.internal.ads;

import android.content.Context;
import qc.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcpd implements zzhfy {
    private final zzcou zza;
    private final zzhgh zzb;
    private final zzhgh zzc;
    private final zzhgh zzd;
    private final zzhgh zze;

    public zzcpd(zzcou zzcouVar, zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3, zzhgh zzhghVar4) {
        this.zza = zzcouVar;
        this.zzb = zzhghVar;
        this.zzc = zzhghVar2;
        this.zzd = zzhghVar3;
        this.zze = zzhghVar4;
    }

    public static zzddo zza(zzcou zzcouVar, final Context context, final rc.a aVar, final zzfbt zzfbtVar, final zzfco zzfcoVar) {
        return new zzddo(new zzcxf() { // from class: com.google.android.gms.internal.ads.zzcos
            @Override // com.google.android.gms.internal.ads.zzcxf
            public final void zzt() {
                n nVar = mc.n.D.f11588o;
                Context context2 = context;
                zzfco zzfcoVar2 = zzfcoVar;
                nVar.i(context2, aVar.f14321a, zzfbtVar.zzC.toString(), zzfcoVar2.zzf);
            }
        }, zzcad.zzg);
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        return zza(this.zza, (Context) this.zzb.zzb(), ((zzchu) this.zzc).zza(), ((zzcrm) this.zzd).zza(), ((zzcvi) this.zze).zza());
    }
}
