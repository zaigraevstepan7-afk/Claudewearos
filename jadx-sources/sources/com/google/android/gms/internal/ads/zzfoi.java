package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfoi implements com.google.android.gms.common.internal.b, com.google.android.gms.common.internal.c {
    protected final zzfpe zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;
    private final zzfnz zzf;
    private final long zzg;
    private final int zzh;

    public zzfoi(Context context, int i10, int i11, String str, String str2, String str3, zzfnz zzfnzVar) {
        this.zzb = str;
        this.zzh = i11;
        this.zzc = str2;
        this.zzf = zzfnzVar;
        HandlerThread handlerThread = new HandlerThread("GassDGClient");
        this.zze = handlerThread;
        handlerThread.start();
        this.zzg = System.currentTimeMillis();
        zzfpe zzfpeVar = new zzfpe(context, handlerThread.getLooper(), this, this, 19621000);
        this.zza = zzfpeVar;
        this.zzd = new LinkedBlockingQueue();
        zzfpeVar.checkAvailabilityAndConnect();
    }

    private final void zzd(int i10, long j, Exception exc) {
        this.zzf.zzc(i10, System.currentTimeMillis() - j, exc);
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnected(Bundle bundle) {
        zzfpj zzfpjVarZzc = zzc();
        if (zzfpjVarZzc != null) {
            try {
                zzfpq zzfpqVarZzf = zzfpjVarZzc.zzf(new zzfpo(1, this.zzh, this.zzb, this.zzc));
                zzd(5011, this.zzg, null);
                this.zzd.put(zzfpqVarZzf);
            } finally {
                try {
                } finally {
                }
            }
        }
    }

    @Override // com.google.android.gms.common.internal.c
    public final void onConnectionFailed(nd.b bVar) throws InterruptedException {
        try {
            zzd(4012, this.zzg, null);
            this.zzd.put(new zzfpq(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnectionSuspended(int i10) throws InterruptedException {
        try {
            zzd(4011, this.zzg, null);
            this.zzd.put(new zzfpq(null, 1));
        } catch (InterruptedException unused) {
        }
    }

    public final zzfpq zza(int i10) {
        zzfpq zzfpqVar;
        try {
            zzfpqVar = (zzfpq) this.zzd.poll(50000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            zzd(2009, this.zzg, e10);
            zzfpqVar = null;
        }
        zzd(3004, this.zzg, null);
        if (zzfpqVar != null) {
            if (zzfpqVar.zzc == 7) {
                zzfnz.zzg(3);
            } else {
                zzfnz.zzg(2);
            }
        }
        return zzfpqVar == null ? new zzfpq(null, 1) : zzfpqVar;
    }

    public final void zzb() {
        zzfpe zzfpeVar = this.zza;
        if (zzfpeVar != null) {
            if (zzfpeVar.isConnected() || zzfpeVar.isConnecting()) {
                zzfpeVar.disconnect();
            }
        }
    }

    public final zzfpj zzc() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
