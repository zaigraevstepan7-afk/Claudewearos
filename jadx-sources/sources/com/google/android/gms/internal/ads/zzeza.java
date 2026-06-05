package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeza implements zzezk {
    private final zzezk zza;
    private zzcux zzb;

    public zzeza(zzezk zzezkVar) {
        this.zza = zzezkVar;
    }

    @Override // com.google.android.gms.internal.ads.zzezk
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcux zzd() {
        return this.zzb;
    }

    public final synchronized mf.a zzb(zzezl zzezlVar, zzezj zzezjVar, zzcux zzcuxVar) {
        zzbvo zzbvoVar;
        this.zzb = zzcuxVar;
        if (zzcuxVar == null || (zzbvoVar = zzezlVar.zza) == null) {
            return ((zzeyz) this.zza).zzb(zzezlVar, zzezjVar, zzcuxVar);
        }
        zzcrz zzcrzVarZzb = zzcuxVar.zzb();
        return zzcrzVarZzb.zzh(zzcrzVarZzb.zzj(zzgdb.zzh(zzbvoVar)));
    }

    @Override // com.google.android.gms.internal.ads.zzezk
    public final /* bridge */ /* synthetic */ mf.a zzc(zzezl zzezlVar, zzezj zzezjVar, Object obj) {
        return zzb(zzezlVar, zzezjVar, null);
    }
}
