package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzenl implements zzetu {
    final zzbzq zza;
    cd.a zzb;
    private final ScheduledExecutorService zzc;
    private final zzgdm zzd;
    private final Context zze;

    public zzenl(Context context, zzbzq zzbzqVar, ScheduledExecutorService scheduledExecutorService, zzgdm zzgdmVar) {
        if (!((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzdj)).booleanValue()) {
            this.zzb = new com.google.android.gms.internal.appset.zzr(context);
        }
        this.zze = context;
        this.zza = zzbzqVar;
        this.zzc = scheduledExecutorService;
        this.zzd = zzgdmVar;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 11;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        zzbct zzbctVar = zzbdc.zzdf;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            if (!((Boolean) tVar.f12230c.zzb(zzbdc.zzdk)).booleanValue()) {
                if (!((Boolean) tVar.f12230c.zzb(zzbdc.zzdg)).booleanValue()) {
                    return zzgdb.zzm(zzfsa.zza(this.zzb.getAppSetIdInfo(), null), new zzfut() { // from class: com.google.android.gms.internal.ads.zzeni
                        @Override // com.google.android.gms.internal.ads.zzfut
                        public final Object apply(Object obj) {
                            cd.b bVar = (cd.b) obj;
                            return new zzenm(bVar.f3219a, bVar.f3220b);
                        }
                    }, zzcad.zzg);
                }
                Task taskZza = ((Boolean) tVar.f12230c.zzb(zzbdc.zzdj)).booleanValue() ? zzfds.zza(this.zze) : this.zzb.getAppSetIdInfo();
                if (taskZza == null) {
                    return zzgdb.zzh(new zzenm(null, -1));
                }
                mf.a aVarZzn = zzgdb.zzn(zzfsa.zza(taskZza, null), new zzgci() { // from class: com.google.android.gms.internal.ads.zzenj
                    @Override // com.google.android.gms.internal.ads.zzgci
                    public final mf.a zza(Object obj) {
                        cd.b bVar = (cd.b) obj;
                        return bVar == null ? zzgdb.zzh(new zzenm(null, -1)) : zzgdb.zzh(new zzenm(bVar.f3219a, bVar.f3220b));
                    }
                }, zzcad.zzg);
                if (((Boolean) tVar.f12230c.zzb(zzbdc.zzdh)).booleanValue()) {
                    aVarZzn = zzgdb.zzo(aVarZzn, ((Long) tVar.f12230c.zzb(zzbdc.zzdi)).longValue(), TimeUnit.MILLISECONDS, this.zzc);
                }
                return zzgdb.zze(aVarZzn, Exception.class, new zzfut() { // from class: com.google.android.gms.internal.ads.zzenk
                    @Override // com.google.android.gms.internal.ads.zzfut
                    public final Object apply(Object obj) {
                        this.zza.zza.zzw((Exception) obj, "AppSetIdInfoSignal");
                        return new zzenm(null, -1);
                    }
                }, this.zzd);
            }
        }
        return zzgdb.zzh(new zzenm(null, -1));
    }
}
