package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzbby {
    private final InputStream zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final boolean zze;

    private zzbby(InputStream inputStream, boolean z2, boolean z10, long j, boolean z11) {
        this.zza = inputStream;
        this.zzb = z2;
        this.zzc = z10;
        this.zzd = j;
        this.zze = z11;
    }

    public static zzbby zzb(InputStream inputStream, boolean z2, boolean z10, long j, boolean z11) {
        return new zzbby(inputStream, z2, z10, j, z11);
    }

    public final long zza() {
        return this.zzd;
    }

    public final InputStream zzc() {
        return this.zza;
    }

    public final boolean zzd() {
        return this.zzb;
    }

    public final boolean zze() {
        return this.zze;
    }

    public final boolean zzf() {
        return this.zzc;
    }
}
