package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class zzaic {
    private static volatile int zze = 100;
    int zza;
    int zzb;
    int zzc;
    zzail zzd;
    private boolean zzf;

    public static int zza(int i10) {
        return (-(i10 & 1)) ^ (i10 >>> 1);
    }

    public abstract double zza();

    public abstract float zzb();

    public abstract int zzb(int i10);

    public abstract int zzc();

    public abstract void zzc(int i10);

    public abstract int zzd();

    public abstract void zzd(int i10);

    public abstract int zze();

    public abstract boolean zze(int i10);

    public abstract int zzf();

    public abstract int zzg();

    public abstract int zzh();

    public abstract int zzi();

    public abstract int zzj();

    public abstract long zzk();

    public abstract long zzl();

    public abstract long zzm();

    public abstract long zzn();

    public abstract long zzo();

    public abstract long zzp();

    public abstract zzaho zzq();

    public abstract String zzr();

    public abstract String zzs();

    public abstract boolean zzt();

    public abstract boolean zzu();

    private zzaic() {
        this.zzb = zze;
        this.zzc = f.API_PRIORITY_OTHER;
        this.zzf = false;
    }

    public static long zza(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static zzaic zza(byte[] bArr, int i10, int i11, boolean z2) {
        zzaif zzaifVar = new zzaif(bArr, i10, i11, z2);
        try {
            zzaifVar.zzb(i11);
            return zzaifVar;
        } catch (zzajk e10) {
            throw new IllegalArgumentException(e10);
        }
    }
}
