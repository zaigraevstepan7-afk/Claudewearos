package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import mc.n;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcnu implements zzazu {
    private final ScheduledExecutorService zza;
    private final ud.a zzb;
    private ScheduledFuture zzc;
    private long zzd = -1;
    private long zze = -1;
    private Runnable zzf = null;
    private boolean zzg = false;

    public zzcnu(ScheduledExecutorService scheduledExecutorService, ud.a aVar) {
        this.zza = scheduledExecutorService;
        this.zzb = aVar;
        n.D.f11581g.zzc(this);
    }

    @Override // com.google.android.gms.internal.ads.zzazu
    public final void zza(boolean z2) {
        if (z2) {
            zzc();
        } else {
            zzb();
        }
    }

    public final synchronized void zzb() {
        try {
            if (this.zzg) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzc;
            if (scheduledFuture == null || scheduledFuture.isDone()) {
                this.zze = -1L;
            } else {
                this.zzc.cancel(true);
                long j = this.zzd;
                ((ud.b) this.zzb).getClass();
                this.zze = j - SystemClock.elapsedRealtime();
            }
            this.zzg = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzc() {
        ScheduledFuture scheduledFuture;
        try {
            if (this.zzg) {
                if (this.zze > 0 && (scheduledFuture = this.zzc) != null && scheduledFuture.isCancelled()) {
                    this.zzc = this.zza.schedule(this.zzf, this.zze, TimeUnit.MILLISECONDS);
                }
                this.zzg = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzd(int i10, Runnable runnable) {
        this.zzf = runnable;
        ((ud.b) this.zzb).getClass();
        long j = i10;
        this.zzd = SystemClock.elapsedRealtime() + j;
        this.zzc = this.zza.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }
}
