package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Tasks;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzeve implements zzetu {
    private final zzbzq zza;
    private final ScheduledExecutorService zzb;
    private final zzgdm zzc;

    public zzeve(String str, zzbbd zzbbdVar, zzbzq zzbzqVar, ScheduledExecutorService scheduledExecutorService, zzgdm zzgdmVar) {
        this.zza = zzbzqVar;
        this.zzb = scheduledExecutorService;
        this.zzc = zzgdmVar;
    }

    public static /* synthetic */ zzevf zzc(zzeve zzeveVar, Exception exc) {
        zzeveVar.zza.zzw(exc, "AppSetIdInfoGmscoreSignal");
        return new zzevf(null, -1);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 43;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        zzbct zzbctVar = zzbdc.zzdf;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            if (((Boolean) tVar.f12230c.zzb(zzbdc.zzdk)).booleanValue()) {
                mf.a aVarZza = zzfsa.zza(Tasks.forResult(null), null);
                zzgci zzgciVar = new zzgci() { // from class: com.google.android.gms.internal.ads.zzevc
                    @Override // com.google.android.gms.internal.ads.zzgci
                    public final mf.a zza(Object obj) {
                        cd.b bVar = (cd.b) obj;
                        return bVar == null ? zzgdb.zzh(new zzevf(null, -1)) : zzgdb.zzh(new zzevf(bVar.f3219a, bVar.f3220b));
                    }
                };
                zzgdm zzgdmVar = this.zzc;
                mf.a aVarZzn = zzgdb.zzn(aVarZza, zzgciVar, zzgdmVar);
                if (((Boolean) zzbep.zza.zze()).booleanValue()) {
                    aVarZzn = zzgdb.zzo(aVarZzn, ((Long) zzbep.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzb);
                }
                return zzgdb.zze(aVarZzn, Exception.class, new zzfut() { // from class: com.google.android.gms.internal.ads.zzevd
                    @Override // com.google.android.gms.internal.ads.zzfut
                    public final Object apply(Object obj) {
                        return zzeve.zzc(this.zza, (Exception) obj);
                    }
                }, zzgdmVar);
            }
        }
        return zzgdb.zzh(new zzevf(null, -1));
    }
}
