package com.google.android.gms.internal.ads;

import java.util.Objects;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzggf extends zzgfo {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final zzggd zze;
    private final zzggc zzf;

    public /* synthetic */ zzggf(int i10, int i11, int i12, int i13, zzggd zzggdVar, zzggc zzggcVar, zzgge zzggeVar) {
        this.zza = i10;
        this.zzb = i11;
        this.zzc = i12;
        this.zzd = i13;
        this.zze = zzggdVar;
        this.zzf = zzggcVar;
    }

    public static zzggb zzf() {
        return new zzggb(null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzggf)) {
            return false;
        }
        zzggf zzggfVar = (zzggf) obj;
        return zzggfVar.zza == this.zza && zzggfVar.zzb == this.zzb && zzggfVar.zzc == this.zzc && zzggfVar.zzd == this.zzd && zzggfVar.zze == this.zze && zzggfVar.zzf == this.zzf;
    }

    public final int hashCode() {
        return Objects.hash(zzggf.class, Integer.valueOf(this.zza), Integer.valueOf(this.zzb), Integer.valueOf(this.zzc), Integer.valueOf(this.zzd), this.zze, this.zzf);
    }

    public final String toString() {
        StringBuilder sbM = m1.m("AesCtrHmacAead Parameters (variant: ", String.valueOf(this.zze), ", hashType: ", String.valueOf(this.zzf), ", ");
        sbM.append(this.zzc);
        sbM.append("-byte IV, and ");
        sbM.append(this.zzd);
        sbM.append("-byte tags, and ");
        sbM.append(this.zza);
        sbM.append("-byte AES key, and ");
        return m6.a.h(sbM, this.zzb, "-byte HMAC key)");
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final boolean zza() {
        return this.zze != zzggd.zzc;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final int zze() {
        return this.zzd;
    }

    public final zzggc zzg() {
        return this.zzf;
    }

    public final zzggd zzh() {
        return this.zze;
    }
}
