package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.HandlerThread;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfog implements com.google.android.gms.common.internal.b, com.google.android.gms.common.internal.c {
    protected final zzfpe zza;
    private final String zzb;
    private final String zzc;
    private final LinkedBlockingQueue zzd;
    private final HandlerThread zze;

    public zzfog(Context context, String str, String str2) {
        this.zzb = str;
        this.zzc = str2;
        HandlerThread handlerThread = new HandlerThread("GassClient");
        this.zze = handlerThread;
        handlerThread.start();
        zzfpe zzfpeVar = new zzfpe(context, handlerThread.getLooper(), this, this, 9200000);
        this.zza = zzfpeVar;
        this.zzd = new LinkedBlockingQueue();
        zzfpeVar.checkAvailabilityAndConnect();
    }

    public static zzato zza() {
        zzasr zzasrVarZza = zzato.zza();
        zzasrVarZza.zzB(32768L);
        return (zzato) zzasrVarZza.zzbr();
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnected(Bundle bundle) {
        zzfpj zzfpjVarZzd = zzd();
        if (zzfpjVarZzd != null) {
            try {
                try {
                    this.zzd.put(zzfpjVarZzd.zze(new zzfpf(this.zzb, this.zzc)).zza());
                } catch (Throwable unused) {
                    this.zzd.put(zza());
                }
            } catch (InterruptedException unused2) {
            } catch (Throwable th2) {
                zzc();
                this.zze.quit();
                throw th2;
            }
            zzc();
            this.zze.quit();
        }
    }

    @Override // com.google.android.gms.common.internal.c
    public final void onConnectionFailed(nd.b bVar) throws InterruptedException {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnectionSuspended(int i10) throws InterruptedException {
        try {
            this.zzd.put(zza());
        } catch (InterruptedException unused) {
        }
    }

    public final zzato zzb(int i10) {
        zzato zzatoVar;
        try {
            zzatoVar = (zzato) this.zzd.poll(5000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            zzatoVar = null;
        }
        return zzatoVar == null ? zza() : zzatoVar;
    }

    public final void zzc() {
        zzfpe zzfpeVar = this.zza;
        if (zzfpeVar != null) {
            if (zzfpeVar.isConnected() || zzfpeVar.isConnecting()) {
                zzfpeVar.disconnect();
            }
        }
    }

    public final zzfpj zzd() {
        try {
            return this.zza.zzp();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }
}
