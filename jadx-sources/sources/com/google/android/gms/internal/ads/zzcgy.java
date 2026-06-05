package com.google.android.gms.internal.ads;

import nc.s3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcgy {
    public final int zza;
    public final int zzb;
    private final int zzc;

    private zzcgy(int i10, int i11, int i12) {
        this.zzc = i10;
        this.zzb = i11;
        this.zza = i12;
    }

    public static zzcgy zza() {
        return new zzcgy(0, 0, 0);
    }

    public static zzcgy zzb(int i10, int i11) {
        return new zzcgy(1, i10, i11);
    }

    public static zzcgy zzc(s3 s3Var) {
        return s3Var.f12223d ? new zzcgy(3, 0, 0) : s3Var.B ? new zzcgy(2, 0, 0) : s3Var.A ? new zzcgy(0, 0, 0) : new zzcgy(1, s3Var.f12225f, s3Var.f12222c);
    }

    public static zzcgy zzd() {
        return new zzcgy(5, 0, 0);
    }

    public static zzcgy zze() {
        return new zzcgy(4, 0, 0);
    }

    public final boolean zzf() {
        return this.zzc == 0;
    }

    public final boolean zzg() {
        return this.zzc == 2;
    }

    public final boolean zzh() {
        return this.zzc == 5;
    }

    public final boolean zzi() {
        return this.zzc == 3;
    }

    public final boolean zzj() {
        return this.zzc == 4;
    }
}
