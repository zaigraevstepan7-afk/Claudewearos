package com.google.android.recaptcha.internal;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzae extends Exception {
    private final Throwable zza;
    private final zzpg zzb;
    private final int zzc;
    private final int zzd;

    public zzae(int i10, int i11, Throwable th2) {
        this.zzc = i10;
        this.zzd = i11;
        this.zza = th2;
        zzpg zzpgVarZzf = zzph.zzf();
        zzpgVarZzf.zze(i11);
        zzpgVarZzf.zzp(i10);
        this.zzb = zzpgVarZzf;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.zza;
    }

    public final zzpg zza() {
        return this.zzb;
    }

    public final int zzb() {
        return this.zzd;
    }
}
