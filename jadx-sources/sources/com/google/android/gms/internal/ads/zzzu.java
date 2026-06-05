package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.google.android.gms.internal.ads.zzbch;
import java.io.IOException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
@SuppressLint({"HandlerLeak"})
/* loaded from: classes.dex */
final class zzzu extends Handler implements Runnable {
    final /* synthetic */ zzaaa zza;
    private final zzzv zzb;
    private final long zzc;
    private zzzs zzd;
    private IOException zze;
    private int zzf;
    private Thread zzg;
    private boolean zzh;
    private volatile boolean zzi;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzzu(zzaaa zzaaaVar, Looper looper, zzzv zzzvVar, zzzs zzzsVar, int i10, long j) {
        super(looper);
        this.zza = zzaaaVar;
        this.zzb = zzzvVar;
        this.zzd = zzzsVar;
        this.zzc = j;
    }

    private final void zzd() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j = jElapsedRealtime - this.zzc;
        zzzs zzzsVar = this.zzd;
        zzzsVar.getClass();
        zzzsVar.zzL(this.zzb, jElapsedRealtime, j, this.zzf);
        this.zze = null;
        zzaaa zzaaaVar = this.zza;
        zzaai zzaaiVar = zzaaaVar.zzc;
        zzzu zzzuVar = zzaaaVar.zzd;
        zzzuVar.getClass();
        zzaaiVar.execute(zzzuVar);
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.zzi) {
            return;
        }
        int i10 = message.what;
        if (i10 == 1) {
            zzd();
            return;
        }
        if (i10 == 4) {
            throw ((Error) message.obj);
        }
        zzaaa zzaaaVar = this.zza;
        zzaaaVar.zzd = null;
        long j = this.zzc;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j4 = jElapsedRealtime - j;
        zzzs zzzsVar = this.zzd;
        zzzsVar.getClass();
        if (this.zzh) {
            zzzsVar.zzJ(this.zzb, jElapsedRealtime, j4, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 2) {
            try {
                zzzsVar.zzK(this.zzb, jElapsedRealtime, j4);
                return;
            } catch (RuntimeException e10) {
                zzea.zzd("LoadTask", "Unexpected exception handling load completed", e10);
                this.zza.zze = new zzzy(e10);
                return;
            }
        }
        if (i11 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.zze = iOException;
        int i12 = this.zzf + 1;
        this.zzf = i12;
        zzzt zzztVarZzu = zzzsVar.zzu(this.zzb, jElapsedRealtime, j4, iOException, i12);
        if (zzztVarZzu.zza == 3) {
            zzaaaVar.zze = this.zze;
        } else if (zzztVarZzu.zza != 2) {
            if (zzztVarZzu.zza == 1) {
                this.zzf = 1;
            }
            zzc(zzztVarZzu.zzb != -9223372036854775807L ? zzztVarZzu.zzb : Math.min((this.zzf - 1) * zzbch.zzq.zzf, 5000));
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z2;
        try {
            synchronized (this) {
                z2 = this.zzh;
                this.zzg = Thread.currentThread();
            }
            if (!z2) {
                zzzv zzzvVar = this.zzb;
                Trace.beginSection("load:".concat(zzzvVar.getClass().getSimpleName()));
                try {
                    zzzvVar.zzh();
                    Trace.endSection();
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
            }
            synchronized (this) {
                this.zzg = null;
                Thread.interrupted();
            }
            if (this.zzi) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e10) {
            if (this.zzi) {
                return;
            }
            obtainMessage(3, e10).sendToTarget();
        } catch (Exception e11) {
            if (this.zzi) {
                return;
            }
            zzea.zzd("LoadTask", "Unexpected exception loading stream", e11);
            obtainMessage(3, new zzzy(e11)).sendToTarget();
        } catch (OutOfMemoryError e12) {
            if (this.zzi) {
                return;
            }
            zzea.zzd("LoadTask", "OutOfMemory error loading stream", e12);
            obtainMessage(3, new zzzy(e12)).sendToTarget();
        } catch (Error e13) {
            if (!this.zzi) {
                zzea.zzd("LoadTask", "Unexpected error loading stream", e13);
                obtainMessage(4, e13).sendToTarget();
            }
            throw e13;
        }
    }

    public final void zza(boolean z2) {
        this.zzi = z2;
        this.zze = null;
        if (hasMessages(1)) {
            this.zzh = true;
            removeMessages(1);
            if (!z2) {
                sendEmptyMessage(2);
            }
        } else {
            synchronized (this) {
                try {
                    this.zzh = true;
                    this.zzb.zzg();
                    Thread thread = this.zzg;
                    if (thread != null) {
                        thread.interrupt();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        if (z2) {
            this.zza.zzd = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            zzzs zzzsVar = this.zzd;
            zzzsVar.getClass();
            zzzsVar.zzJ(this.zzb, jElapsedRealtime, jElapsedRealtime - this.zzc, true);
            this.zzd = null;
        }
    }

    public final void zzb(int i10) {
        IOException iOException = this.zze;
        if (iOException != null && this.zzf > i10) {
            throw iOException;
        }
    }

    public final void zzc(long j) {
        zzaaa zzaaaVar = this.zza;
        zzdd.zzf(zzaaaVar.zzd == null);
        zzaaaVar.zzd = this;
        if (j > 0) {
            sendEmptyMessageDelayed(1, j);
        } else {
            zzd();
        }
    }
}
