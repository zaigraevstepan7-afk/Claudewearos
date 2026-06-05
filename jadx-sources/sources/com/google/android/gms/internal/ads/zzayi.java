package com.google.android.gms.internal.ads;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class zzayi implements Callable {
    protected final zzawv zza;
    protected final String zzb;
    protected final String zzc;
    protected final zzasr zzd;
    protected Method zze;
    protected final int zzf;
    protected final int zzg;

    public zzayi(zzawv zzawvVar, String str, String str2, zzasr zzasrVar, int i10, int i11) {
        this.zza = zzawvVar;
        this.zzb = str;
        this.zzc = str2;
        this.zzd = zzasrVar;
        this.zzf = i10;
        this.zzg = i11;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ Object call() {
        int i10;
        try {
            long jNanoTime = System.nanoTime();
            zzawv zzawvVar = this.zza;
            Method methodZzi = zzawvVar.zzi(this.zzb, this.zzc);
            this.zze = methodZzi;
            if (methodZzi == null) {
                return null;
            }
            zza();
            zzavm zzavmVarZzd = zzawvVar.zzd();
            if (zzavmVarZzd == null || (i10 = this.zzf) == Integer.MIN_VALUE) {
                return null;
            }
            zzavmVarZzd.zzc(this.zzg, i10, (System.nanoTime() - jNanoTime) / 1000, null, null);
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public abstract void zza();
}
