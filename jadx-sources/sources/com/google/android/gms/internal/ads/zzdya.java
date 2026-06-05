package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import java.util.concurrent.Executor;
import qc.l0;
import rc.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzdya implements com.google.android.gms.common.internal.b, com.google.android.gms.common.internal.c {
    protected final zzcai zza = new zzcai();
    protected final Object zzb = new Object();
    protected boolean zzc = false;
    protected boolean zzd = false;
    protected zzbvo zze;
    protected zzbut zzf;

    public static void zzc(Context context, mf.a aVar, Executor executor) {
        if (((Boolean) zzbeu.zzj.zze()).booleanValue() || ((Boolean) zzbeu.zzh.zze()).booleanValue()) {
            zzgdb.zzr(aVar, new zzdxx(context), executor);
        }
    }

    @Override // com.google.android.gms.common.internal.b
    public abstract /* synthetic */ void onConnected(Bundle bundle);

    public void onConnectionFailed(nd.b bVar) {
        int i10 = l0.f13401b;
        k.b("Disconnected from remote ad request service.");
        this.zza.zzd(new zzdyp(1));
    }

    @Override // com.google.android.gms.common.internal.b
    public final void onConnectionSuspended(int i10) {
        int i11 = l0.f13401b;
        k.b("Cannot connect to remote service, fallback to local instance.");
    }

    public final void zzb() {
        synchronized (this.zzb) {
            try {
                this.zzd = true;
                if (this.zzf.isConnected() || this.zzf.isConnecting()) {
                    this.zzf.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
