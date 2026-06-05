package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgha extends zzgfo {
    private final int zza;
    private final int zzb = 12;
    private final int zzc = 16;
    private final zzggy zzd;

    public /* synthetic */ zzgha(int i10, int i11, int i12, zzggy zzggyVar, zzggz zzggzVar) {
        this.zza = i10;
        this.zzd = zzggyVar;
    }

    public static zzggx zzc() {
        return new zzggx(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgha)) {
            return false;
        }
        zzgha zzghaVar = (zzgha) obj;
        return zzghaVar.zza == this.zza && zzghaVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzgha.class, Integer.valueOf(this.zza), 12, 16, this.zzd);
    }

    public final String toString() {
        return m6.a.h(m6.a.k("AesGcm Parameters (variant: ", String.valueOf(this.zzd), ", 12-byte IV, 16-byte tag, and "), this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final boolean zza() {
        return this.zzd != zzggy.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final zzggy zzd() {
        return this.zzd;
    }
}
