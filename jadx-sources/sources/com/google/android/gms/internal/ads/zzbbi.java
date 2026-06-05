package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.RemoteException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import mc.n;
import nc.t;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbbi {
    private ScheduledFuture zza = null;
    private final Runnable zzb = new zzbbe(this);
    private final Object zzc = new Object();
    private zzbbl zzd;
    private Context zze;
    private zzbbo zzf;

    public static /* bridge */ /* synthetic */ void zzh(zzbbi zzbbiVar) {
        synchronized (zzbbiVar.zzc) {
            try {
                zzbbl zzbblVar = zzbbiVar.zzd;
                if (zzbblVar == null) {
                    return;
                }
                if (zzbblVar.isConnected() || zzbbiVar.zzd.isConnecting()) {
                    zzbbiVar.zzd.disconnect();
                }
                zzbbiVar.zzd = null;
                zzbbiVar.zzf = null;
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzl() {
        synchronized (this.zzc) {
            try {
                if (this.zze != null && this.zzd == null) {
                    zzbbl zzbblVarZzd = zzd(new zzbbg(this), new zzbbh(this));
                    this.zzd = zzbblVarZzd;
                    zzbblVarZzd.checkAvailabilityAndConnect();
                }
            } finally {
            }
        }
    }

    public final long zza(zzbbm zzbbmVar) {
        synchronized (this.zzc) {
            try {
                if (this.zzf == null) {
                    return -2L;
                }
                if (this.zzd.zzp()) {
                    try {
                        return this.zzf.zze(zzbbmVar);
                    } catch (RemoteException e10) {
                        int i10 = l0.f13401b;
                        k.e("Unable to call into cache service.", e10);
                    }
                }
                return -2L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final zzbbj zzb(zzbbm zzbbmVar) {
        synchronized (this.zzc) {
            if (this.zzf == null) {
                return new zzbbj();
            }
            try {
                if (this.zzd.zzp()) {
                    return this.zzf.zzg(zzbbmVar);
                }
                return this.zzf.zzf(zzbbmVar);
            } catch (RemoteException e10) {
                int i10 = l0.f13401b;
                k.e("Unable to call into cache service.", e10);
                return new zzbbj();
            }
        }
    }

    public final synchronized zzbbl zzd(com.google.android.gms.common.internal.b bVar, com.google.android.gms.common.internal.c cVar) {
        return new zzbbl(this.zze, n.D.f11593t.b(), bVar, cVar);
    }

    public final void zzi(Context context) {
        if (context == null) {
            return;
        }
        synchronized (this.zzc) {
            try {
                if (this.zze != null) {
                    return;
                }
                this.zze = context.getApplicationContext();
                zzbct zzbctVar = zzbdc.zzeu;
                t tVar = t.f12227d;
                if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
                    zzl();
                } else {
                    if (((Boolean) tVar.f12230c.zzb(zzbdc.zzet)).booleanValue()) {
                        n.D.f11581g.zzc(new zzbbf(this));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void zzj() {
        zzbct zzbctVar = zzbdc.zzev;
        t tVar = t.f12227d;
        if (((Boolean) tVar.f12230c.zzb(zzbctVar)).booleanValue()) {
            synchronized (this.zzc) {
                try {
                    zzl();
                    ScheduledFuture scheduledFuture = this.zza;
                    if (scheduledFuture != null) {
                        scheduledFuture.cancel(false);
                    }
                    this.zza = zzcad.zzd.schedule(this.zzb, ((Long) tVar.f12230c.zzb(zzbdc.zzew)).longValue(), TimeUnit.MILLISECONDS);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
