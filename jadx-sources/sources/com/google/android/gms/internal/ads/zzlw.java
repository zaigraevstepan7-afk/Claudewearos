package com.google.android.gms.internal.ads;

import android.os.Looper;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzlw {
    private final zzlv zza;
    private final zzlu zzb;
    private final zzbl zzc;
    private int zzd;
    private Object zze;
    private final Looper zzf;
    private final int zzg;
    private boolean zzh;
    private boolean zzi;

    public zzlw(zzlu zzluVar, zzlv zzlvVar, zzbl zzblVar, int i10, zzdj zzdjVar, Looper looper) {
        this.zzb = zzluVar;
        this.zza = zzlvVar;
        this.zzc = zzblVar;
        this.zzf = looper;
        this.zzg = i10;
    }

    public final int zza() {
        return this.zzd;
    }

    public final Looper zzb() {
        return this.zzf;
    }

    public final zzlv zzc() {
        return this.zza;
    }

    public final zzlw zzd() {
        zzdd.zzf(!this.zzh);
        this.zzh = true;
        this.zzb.zzo(this);
        return this;
    }

    public final zzlw zze(Object obj) {
        zzdd.zzf(!this.zzh);
        this.zze = obj;
        return this;
    }

    public final zzlw zzf(int i10) {
        zzdd.zzf(!this.zzh);
        this.zzd = i10;
        return this;
    }

    public final Object zzg() {
        return this.zze;
    }

    public final synchronized void zzh(boolean z2) {
        this.zzi = z2 | this.zzi;
        notifyAll();
    }

    public final synchronized boolean zzi() {
        return false;
    }
}
