package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import nc.t;
import qc.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcyo extends zzdbm {
    private final ScheduledExecutorService zzb;
    private final ud.a zzc;
    private long zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private ScheduledFuture zzi;
    private ScheduledFuture zzj;

    public zzcyo(ScheduledExecutorService scheduledExecutorService, ud.a aVar) {
        super(Collections.EMPTY_SET);
        this.zzd = -1L;
        this.zze = -1L;
        this.zzf = -1L;
        this.zzg = -1L;
        this.zzh = false;
        this.zzb = scheduledExecutorService;
        this.zzc = aVar;
    }

    private final synchronized void zzf(long j) {
        try {
            ScheduledFuture scheduledFuture = this.zzi;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.zzi.cancel(false);
            }
            ((ud.b) this.zzc).getClass();
            this.zzd = SystemClock.elapsedRealtime() + j;
            this.zzi = this.zzb.schedule(new zzcyl(this, null), j, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private final synchronized void zzg(long j) {
        try {
            ScheduledFuture scheduledFuture = this.zzj;
            if (scheduledFuture != null && !scheduledFuture.isDone()) {
                this.zzj.cancel(false);
            }
            ((ud.b) this.zzc).getClass();
            this.zze = SystemClock.elapsedRealtime() + j;
            this.zzj = this.zzb.schedule(new zzcym(this, null), j, TimeUnit.MILLISECONDS);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zza() {
        this.zzh = false;
        zzf(0L);
    }

    public final synchronized void zzb() {
        try {
            if (this.zzh) {
                return;
            }
            ScheduledFuture scheduledFuture = this.zzi;
            if (scheduledFuture == null || scheduledFuture.isCancelled()) {
                this.zzf = -1L;
            } else {
                this.zzi.cancel(false);
                long j = this.zzd;
                ((ud.b) this.zzc).getClass();
                this.zzf = j - SystemClock.elapsedRealtime();
            }
            ScheduledFuture scheduledFuture2 = this.zzj;
            if (scheduledFuture2 == null || scheduledFuture2.isCancelled()) {
                this.zzg = -1L;
            } else {
                this.zzj.cancel(false);
                long j4 = this.zze;
                ((ud.b) this.zzc).getClass();
                this.zzg = j4 - SystemClock.elapsedRealtime();
            }
            this.zzh = true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzc() {
        ScheduledFuture scheduledFuture;
        ScheduledFuture scheduledFuture2;
        try {
            if (this.zzh) {
                if (this.zzf > 0 && (scheduledFuture2 = this.zzi) != null && scheduledFuture2.isCancelled()) {
                    zzf(this.zzf);
                }
                if (this.zzg > 0 && (scheduledFuture = this.zzj) != null && scheduledFuture.isCancelled()) {
                    zzg(this.zzg);
                }
                this.zzh = false;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void zzd(int i10) {
        l0.k("In scheduleRefresh: " + i10);
        if (i10 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i10);
            if (this.zzh) {
                long j = this.zzf;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.zzf = millis;
                return;
            }
            ((ud.b) this.zzc).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznt)).booleanValue()) {
                long j4 = this.zzd;
                if (jElapsedRealtime >= j4 || j4 - jElapsedRealtime > millis) {
                    zzf(millis);
                }
            } else {
                long j10 = this.zzd;
                if (jElapsedRealtime > j10 || j10 - jElapsedRealtime > millis) {
                    zzf(millis);
                }
            }
        }
    }

    public final synchronized void zze(int i10) {
        l0.k("In scheduleShowRefreshedAd: " + i10);
        if (i10 > 0) {
            long millis = TimeUnit.SECONDS.toMillis(i10);
            if (this.zzh) {
                long j = this.zzg;
                if (j <= 0 || millis >= j) {
                    millis = j;
                }
                this.zzg = millis;
                return;
            }
            ((ud.b) this.zzc).getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (((Boolean) t.f12227d.f12230c.zzb(zzbdc.zznt)).booleanValue()) {
                if (jElapsedRealtime == this.zze) {
                    l0.k("In scheduleShowRefreshedAd: currentTimeMs = scheduledShowTimeMs");
                }
                long j4 = this.zze;
                if (jElapsedRealtime >= j4 || j4 - jElapsedRealtime > millis) {
                    zzg(millis);
                }
            } else {
                long j10 = this.zze;
                if (jElapsedRealtime > j10 || j10 - jElapsedRealtime > millis) {
                    zzg(millis);
                }
            }
        }
    }
}
