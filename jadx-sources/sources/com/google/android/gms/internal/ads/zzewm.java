package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import nc.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzewm implements zzetu {
    private final zzbzq zza;
    private final boolean zzb;
    private final boolean zzc;
    private final ScheduledExecutorService zzd;
    private final zzgdm zze;
    private final int zzf;
    private final int zzg;

    public zzewm(zzbzq zzbzqVar, boolean z2, boolean z10, zzbzf zzbzfVar, zzgdm zzgdmVar, String str, ScheduledExecutorService scheduledExecutorService, int i10, int i11) {
        this.zza = zzbzqVar;
        this.zzb = z2;
        this.zzc = z10;
        this.zze = zzgdmVar;
        this.zzd = scheduledExecutorService;
        this.zzf = i10;
        this.zzg = i11;
    }

    public static /* synthetic */ zzewn zzc(zzewm zzewmVar, Exception exc) {
        zzewmVar.zza.zzw(exc, "TrustlessTokenSignal");
        return new zzewn(null);
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        boolean zContains;
        zzbct zzbctVar = zzbdc.zzhf;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue() && this.zzc) {
            return zzgdb.zzh(new zzewn(null));
        }
        if (this.zzg == 2) {
            return zzgdb.zzh(new zzewn(null));
        }
        if (((Boolean) tVar.f12230c.zzb(zzbdc.zzhh)).booleanValue()) {
            zContains = Arrays.asList(((String) tVar.f12230c.zzb(zzbdc.zzhi)).split(",")).contains(String.valueOf(this.zzf));
        } else {
            zContains = this.zzb;
        }
        if (!zContains) {
            return zzgdb.zzh(new zzewn(null));
        }
        mf.a aVarZzh = zzgdb.zzh(null);
        zzfut zzfutVar = new zzfut() { // from class: com.google.android.gms.internal.ads.zzewk
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                return new zzewn((String) obj);
            }
        };
        zzgdm zzgdmVar = this.zze;
        return zzgdb.zze(zzgdb.zzo(zzgdb.zzm(aVarZzh, zzfutVar, zzgdmVar), ((Long) zzbfq.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzd), Exception.class, new zzfut() { // from class: com.google.android.gms.internal.ads.zzewl
            @Override // com.google.android.gms.internal.ads.zzfut
            public final Object apply(Object obj) {
                return zzewm.zzc(this.zza, (Exception) obj);
            }
        }, zzgdmVar);
    }
}
