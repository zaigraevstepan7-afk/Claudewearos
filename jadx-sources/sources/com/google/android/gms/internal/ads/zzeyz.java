package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeyz implements zzezk {
    private zzcux zza;

    @Override // com.google.android.gms.internal.ads.zzezk
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final synchronized zzcux zzd() {
        return this.zza;
    }

    public final synchronized mf.a zzb(zzezl zzezlVar, zzezj zzezjVar, zzcux zzcuxVar) {
        zzcrz zzcrzVarZzb;
        try {
            if (zzcuxVar != null) {
                this.zza = zzcuxVar;
            } else {
                this.zza = (zzcux) zzezjVar.zza(zzezlVar.zzb).zzh();
            }
            zzcrzVarZzb = this.zza.zzb();
        } catch (Throwable th2) {
            throw th2;
        }
        return zzcrzVarZzb.zzh(zzcrzVarZzb.zzi());
    }

    @Override // com.google.android.gms.internal.ads.zzezk
    public final /* bridge */ /* synthetic */ mf.a zzc(zzezl zzezlVar, zzezj zzezjVar, Object obj) {
        return zzb(zzezlVar, zzezjVar, null);
    }
}
