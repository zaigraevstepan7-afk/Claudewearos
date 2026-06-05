package com.google.android.gms.internal.ads;

import android.content.Context;
import qc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcuj implements zzhfy {
    private final zzhgh zza;
    private final zzhgh zzb;
    private final zzhgh zzc;

    public zzcuj(zzhgh zzhghVar, zzhgh zzhghVar2, zzhgh zzhghVar3) {
        this.zza = zzhghVar;
        this.zzb = zzhghVar2;
        this.zzc = zzhghVar3;
    }

    @Override // com.google.android.gms.internal.ads.zzhgn, com.google.android.gms.internal.ads.zzhgm
    public final /* bridge */ /* synthetic */ Object zzb() {
        final Context context = (Context) this.zza.zzb();
        final rc.a aVarZza = ((zzchu) this.zzb).zza();
        final zzfco zzfcoVarZza = ((zzcvi) this.zzc).zza();
        return new zzfut() { // from class: com.google.android.gms.internal.ads.zzcui
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                zzfbt zzfbtVar = (zzfbt) obj;
                k kVar = new k(context);
                kVar.f13385c = zzfbtVar.zzB;
                kVar.f13388f = zzfbtVar.zzC.toString();
                kVar.f13387e = aVarZza.f14321a;
                kVar.f13386d = zzfcoVarZza.zzf;
                return kVar;
            }
        };
    }
}
