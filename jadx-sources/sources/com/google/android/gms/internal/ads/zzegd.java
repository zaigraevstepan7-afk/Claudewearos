package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzegd {
    private final Executor zza;
    private final ScheduledExecutorService zzb;
    private final zzcqy zzc;
    private final zzegt zzd;
    private final zzfjm zze;
    private final zzgdv zzf = zzgdv.zze();
    private final AtomicBoolean zzg = new AtomicBoolean();
    private zzege zzh;
    private zzfcf zzi;

    public zzegd(Executor executor, ScheduledExecutorService scheduledExecutorService, zzcqy zzcqyVar, zzegt zzegtVar, zzfjm zzfjmVar) {
        this.zza = executor;
        this.zzb = scheduledExecutorService;
        this.zzc = zzcqyVar;
        this.zzd = zzegtVar;
        this.zze = zzfjmVar;
    }

    private final synchronized mf.a zzd(zzfbt zzfbtVar) {
        Iterator it = zzfbtVar.zza.iterator();
        while (it.hasNext()) {
            zzede zzedeVarZza = this.zzc.zza(zzfbtVar.zzb, (String) it.next());
            if (zzedeVarZza != null && zzedeVarZza.zzb(this.zzi, zzfbtVar)) {
                return zzgdb.zzo(zzedeVarZza.zza(this.zzi, zzfbtVar), zzfbtVar.zzR, TimeUnit.MILLISECONDS, this.zzb);
            }
        }
        return zzgdb.zzg(new zzdwe(3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zze(zzfbt zzfbtVar) {
        mf.a aVarZzd = zzd(zzfbtVar);
        this.zzd.zzf(this.zzi, zzfbtVar, aVarZzd, this.zze);
        zzgdb.zzr(aVarZzd, new zzegc(this, zzfbtVar), this.zza);
    }

    public final synchronized mf.a zzb(zzfcf zzfcfVar) {
        try {
            if (!this.zzg.getAndSet(true)) {
                List list = zzfcfVar.zzb.zza;
                if (list.isEmpty()) {
                    this.zzf.zzd(new zzegx(3, zzeha.zzc(zzfcfVar)));
                } else {
                    this.zzi = zzfcfVar;
                    zzegt zzegtVar = this.zzd;
                    this.zzh = new zzege(zzfcfVar, zzegtVar, this.zzf);
                    zzegtVar.zzk(list);
                    zzfbt zzfbtVarZza = this.zzh.zza();
                    while (zzfbtVarZza != null) {
                        zze(zzfbtVarZza);
                        zzfbtVarZza = this.zzh.zza();
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.zzf;
    }
}
