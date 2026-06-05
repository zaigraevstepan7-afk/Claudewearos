package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import nc.h2;
import nc.t;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcwe extends zzdbm implements zzcvv {
    private final ScheduledExecutorService zzb;
    private ScheduledFuture zzc;
    private boolean zzd;

    public zzcwe(zzcwd zzcwdVar, Set set, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        super(set);
        this.zzd = false;
        this.zzb = scheduledExecutorService;
        zzo(zzcwdVar, executor);
    }

    public static /* synthetic */ void zza(zzcwe zzcweVar) {
        synchronized (zzcweVar) {
            int i10 = l0.f13401b;
            k.d("Timeout waiting for show call succeed to be called.");
            zzcweVar.zze(new zzdgf("Timeout for show call succeed."));
            zzcweVar.zzd = true;
        }
    }

    public final synchronized void zzb() {
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzc(final h2 h2Var) {
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzcvw
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((zzcvv) obj).zzc(h2Var);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zzd() {
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzcvx
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((zzcvv) obj).zzd();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.zzcvv
    public final void zze(final zzdgf zzdgfVar) {
        if (this.zzd) {
            return;
        }
        ScheduledFuture scheduledFuture = this.zzc;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        zzq(new zzdbl() { // from class: com.google.android.gms.internal.ads.zzcvz
            @Override // com.google.android.gms.internal.ads.zzdbl
            public final void zza(Object obj) {
                ((zzcvv) obj).zze(zzdgfVar);
            }
        });
    }

    public final void zzf() {
        this.zzc = this.zzb.schedule(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcvy
            @Override // java.lang.Runnable
            public final void run() {
                zzcwe.zza(this.zza);
            }
        }, ((Integer) t.f12227d.f12230c.zzb(zzbdc.zzkV)).intValue(), TimeUnit.MILLISECONDS);
    }
}
