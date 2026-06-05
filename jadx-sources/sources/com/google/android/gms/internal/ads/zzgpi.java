package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgpi extends zzgqc {
    private final int zza;
    private final int zzb;
    private final zzgpg zzc;

    public /* synthetic */ zzgpi(int i10, int i11, zzgpg zzgpgVar, zzgph zzgphVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = zzgpgVar;
    }

    public static zzgpf zze() {
        return new zzgpf(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgpi)) {
            return false;
        }
        zzgpi zzgpiVar = (zzgpi) obj;
        return zzgpiVar.zza == this.zza && zzgpiVar.zzd() == zzd() && zzgpiVar.zzc == this.zzc;
    }

    public final int hashCode() {
        return Objects.hash(zzgpi.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), this.zzc);
    }

    public final String toString() {
        StringBuilder sbK = m6.a.k("AES-CMAC Parameters (variant: ", String.valueOf(this.zzc), ", ");
        sbK.append(this.zzb);
        sbK.append("-byte tags, and ");
        return m6.a.h(sbK, this.zza, "-byte key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final boolean zza() {
        return this.zzc != zzgpg.zzd;
    }

    public final int zzb() {
        return this.zzb;
    }

    public final int zzc() {
        return this.zza;
    }

    public final int zzd() {
        zzgpg zzgpgVar = this.zzc;
        if (zzgpgVar == zzgpg.zzd) {
            return this.zzb;
        }
        if (zzgpgVar == zzgpg.zza || zzgpgVar == zzgpg.zzb || zzgpgVar == zzgpg.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgpg zzf() {
        return this.zzc;
    }
}
