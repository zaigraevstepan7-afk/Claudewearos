package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzggp extends zzgfo {
    private final int zza;
    private final int zzb;
    private final int zzc = 16;
    private final zzggn zzd;

    public /* synthetic */ zzggp(int i10, int i11, int i12, zzggn zzggnVar, zzggo zzggoVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzd = zzggnVar;
    }

    public static zzggm zzd() {
        return new zzggm(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggp)) {
            return false;
        }
        zzggp zzggpVar = (zzggp) obj;
        return zzggpVar.zza == this.zza && zzggpVar.zzb == this.zzb && zzggpVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzggp.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), 16, this.zzd);
    }

    public final String toString() {
        StringBuilder sbK = m6.a.k("AesEax Parameters (variant: ", String.valueOf(this.zzd), ", ");
        sbK.append(this.zzb);
        sbK.append("-byte IV, 16-byte tag, and ");
        return m6.a.h(sbK, this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final boolean zza() {
        return this.zzd != zzggn.zzc;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final zzggn zze() {
        return this.zzd;
    }
}
