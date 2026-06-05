package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Looper;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfol implements com.google.android.gms.common.internal.b, com.google.android.gms.common.internal.c {
    private final zzfpe zza;
    private final zzfoy zzb;
    private final Object zzc = new Object();
    private boolean zzd = false;
    private boolean zze = false;

    public zzfol(Context context, Looper looper, zzfoy zzfoyVar) {
        this.zzb = zzfoyVar;
        this.zza = new zzfpe(context, looper, this, this, 12800000);
    }

    private final void zzb() {
        synchronized (this.zzc) {
            try {
                zzfpe zzfpeVar = this.zza;
                if (zzfpeVar.isConnected() || zzfpeVar.isConnecting()) {
                    zzfpeVar.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzc) {
            try {
                if (this.zze) {
                    return;
                }
                this.zze = true;
                try {
                    this.zza.zzp().zzg(new zzfpc(this.zzb.zzaV()));
                } catch (Exception unused) {
                } catch (Throwable th2) {
                    zzb();
                    throw th2;
                }
                zzb();
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final void zza() {
        synchronized (this.zzc) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    this.zza.checkAvailabilityAndConnect();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.c
    public final void onConnectionFailed(nd.b bVar) {
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnectionSuspended(int i10) {
    }
}
