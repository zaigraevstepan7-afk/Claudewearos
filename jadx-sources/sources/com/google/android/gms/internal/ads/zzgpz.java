package com.google.android.gms.internal.ads;

import java.util.Objects;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgpz extends zzgqc {
    private final int zza;
    private final int zzb;
    private final zzgpx zzc;
    private final zzgpw zzd;

    public /* synthetic */ zzgpz(int i10, int i11, zzgpx zzgpxVar, zzgpw zzgpwVar, zzgpy zzgpyVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzgpxVar;
        this.zzd = zzgpwVar;
    }

    public static zzgpv zze() {
        return new zzgpv(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgpz)) {
            return false;
        }
        zzgpz zzgpzVar = (zzgpz) obj;
        return zzgpzVar.zza == this.zza && zzgpzVar.zzd() == zzd() && zzgpzVar.zzc == this.zzc && zzgpzVar.zzd == this.zzd;
    }

    public final int hashCode() {
        return Objects.hash(zzgpz.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc, this.zzd);
    }

    public final String toString() {
        StringBuilder sbM = m1.m("HMAC Parameters (variant: ", String.valueOf(this.zzc), ", hashType: ", String.valueOf(this.zzd), ", ");
        sbM.append(this.zzb);
        sbM.append("-byte tags, and ");
        return m6.a.h(sbM, this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final boolean zza() {
        return this.zzc != zzgpx.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzgpx zzgpxVar = this.zzc;
        if (zzgpxVar == zzgpx.zzd) {
            return this.zzb;
        }
        if (zzgpxVar == zzgpx.zza || zzgpxVar == zzgpx.zzb || zzgpxVar == zzgpx.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgpw zzf() {
        return this.zzd;
    }

    public final zzgpx zzg() {
        return this.zzc;
    }
}
