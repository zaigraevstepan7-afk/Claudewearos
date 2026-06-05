package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.concurrent.Executor;
import mc.n;
import nc.t;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzdxw extends zzdya {
    private final Context zzg;
    private final Executor zzh;

    public zzdxw(Context context, Executor executor) {
        this.zzg = context;
        this.zzh = executor;
        this.zzf = new zzbut(context, n.D.f11593t.b(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.zzdya, com.google.android.gms.common.internal.b
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    try {
                        this.zzf.zzp().zzg(this.zze, ((Boolean) t.f12227d.f12230c.zzb(zzbdc.zzne)).booleanValue() ? new zzdxz(this.zza, this.zze) : new zzdxy(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzdyp(1));
                    } catch (Throwable th2) {
                        n.D.f11582h.zzw(th2, "RemoteAdRequestClientTask.onConnected");
                        this.zza.zzd(new zzdyp(1));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdya, com.google.android.gms.common.internal.c
    public final void onConnectionFailed(nd.b bVar) {
        int i10 = l0.f13401b;
        k.b("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzdyp(1));
    }

    public final mf.a zza(zzbvo zzbvoVar) {
        synchronized (this.zzb) {
            try {
                if (this.zzc) {
                    return this.zza;
                }
                this.zzc = true;
                this.zze = zzbvoVar;
                this.zzf.checkAvailabilityAndConnect();
                zzcai zzcaiVar = this.zza;
                zzcaiVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdxv
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.zza.zzb();
                    }
                }, zzcad.zzg);
                zzdya.zzc(this.zzg, zzcaiVar, this.zzh);
                return zzcaiVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
