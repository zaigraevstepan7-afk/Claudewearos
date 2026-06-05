package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzezg {
    private final zzfeb zza;
    private final zzcux zzb;
    private final Executor zzc;
    private zzeze zzd;

    public zzezg(zzfeb zzfebVar, zzcux zzcuxVar, Executor executor) {
        this.zza = zzfebVar;
        this.zzb = zzcuxVar;
        this.zzc = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Deprecated
    public final zzfel zze() {
        zzfco zzfcoVarZzf = this.zzb.zzf();
        return this.zza.zzc(zzfcoVarZzf.zzd, zzfcoVarZzf.zzf, zzfcoVarZzf.zzj);
    }

    public final mf.a zzc() {
        mf.a aVarZzh;
        zzeze zzezeVar = this.zzd;
        if (zzezeVar != null) {
            return zzgdb.zzh(zzezeVar);
        }
        if (((Boolean) zzbfj.zza.zze()).booleanValue()) {
            zzgcs zzgcsVarZzw = zzgcs.zzw(this.zzb.zzb().zzf(this.zza.zza()));
            zzezd zzezdVar = new zzezd(this);
            Executor executor = this.zzc;
            aVarZzh = (zzgcs) zzgdb.zze((zzgcs) zzgdb.zzm(zzgcsVarZzw, zzezdVar, executor), zzdyp.class, new zzezc(this), executor);
        } else {
            zzeze zzezeVar2 = new zzeze(null, zze(), null);
            this.zzd = zzezeVar2;
            aVarZzh = zzgdb.zzh(zzezeVar2);
        }
        return zzgdb.zzm(aVarZzh, new zzfut() { // from class: com.google.android.gms.internal.ads.zzezb
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                return (zzeze) obj;
            }
        }, this.zzc);
    }
}
