package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzes implements zzdt {
    private static final List zza = new ArrayList(50);
    private final Handler zzb;

    public zzes(Handler handler) {
        this.zzb = handler;
    }

    public static /* bridge */ /* synthetic */ void zzm(zzeq zzeqVar) {
        List list = zza;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(zzeqVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static zzeq zzn() {
        zzeq zzeqVar;
        List list = zza;
        synchronized (list) {
            try {
                zzeqVar = list.isEmpty() ? new zzeq(null) : (zzeq) list.remove(list.size() - 1);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zzeqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final Looper zza() {
        return this.zzb.getLooper();
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final zzds zzb(int i10) {
        Handler handler = this.zzb;
        zzeq zzeqVarZzn = zzn();
        zzeqVarZzn.zzb(handler.obtainMessage(i10), this);
        return zzeqVarZzn;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final zzds zzc(int i10, Object obj) {
        Handler handler = this.zzb;
        zzeq zzeqVarZzn = zzn();
        zzeqVarZzn.zzb(handler.obtainMessage(i10, obj), this);
        return zzeqVarZzn;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final zzds zzd(int i10, int i11, int i12) {
        Handler handler = this.zzb;
        zzeq zzeqVarZzn = zzn();
        zzeqVarZzn.zzb(handler.obtainMessage(i10, i11, i12), this);
        return zzeqVarZzn;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final zzds zze(int i10, int i11, int i12, Object obj) {
        Handler handler = this.zzb;
        zzeq zzeqVarZzn = zzn();
        zzeqVarZzn.zzb(handler.obtainMessage(31, 0, 0, obj), this);
        return zzeqVarZzn;
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zzf(Object obj) {
        this.zzb.removeCallbacksAndMessages(null);
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final void zzg(int i10) {
        this.zzb.removeMessages(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final boolean zzh(int i10) {
        return this.zzb.hasMessages(1);
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final boolean zzi(Runnable runnable) {
        return this.zzb.post(runnable);
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final boolean zzj(int i10) {
        return this.zzb.sendEmptyMessage(i10);
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final boolean zzk(int i10, long j) {
        return this.zzb.sendEmptyMessageAtTime(2, j);
    }

    @Override // com.google.android.gms.internal.ads.zzdt
    public final boolean zzl(zzds zzdsVar) {
        return ((zzeq) zzdsVar).zzc(this.zzb);
    }
}
