package com.google.android.gms.internal.ads;

import java.util.Objects;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgim extends zzgfo {
    private final zzgik zza;
    private final String zzb;
    private final zzgij zzc;
    private final zzgfo zzd;

    public /* synthetic */ zzgim(zzgik zzgikVar, String str, zzgij zzgijVar, zzgfo zzgfoVar, zzgil zzgilVar) {
        this.zza = zzgikVar;
        this.zzb = str;
        this.zzc = zzgijVar;
        this.zzd = zzgfoVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgim)) {
            return false;
        }
        zzgim zzgimVar = (zzgim) obj;
        return zzgimVar.zzc.equals(this.zzc) && zzgimVar.zzd.equals(this.zzd) && zzgimVar.zzb.equals(this.zzb) && zzgimVar.zza.equals(this.zza);
    }

    public final int hashCode() {
        return Objects.hash(zzgim.class, this.zzb, this.zzc, this.zzd, this.zza);
    }

    public final String toString() {
        zzgik zzgikVar = this.zza;
        zzgfo zzgfoVar = this.zzd;
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(zzgfoVar);
        String strValueOf3 = String.valueOf(zzgikVar);
        StringBuilder sb2 = new StringBuilder("LegacyKmsEnvelopeAead Parameters (kekUri: ");
        m1.s(sb2, this.zzb, ", dekParsingStrategy: ", strValueOf, ", dekParametersForNewKeys: ");
        sb2.append(strValueOf2);
        sb2.append(", variant: ");
        sb2.append(strValueOf3);
        sb2.append(")");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final boolean zza() {
        return this.zza != zzgik.zzb;
    }

    public final zzgfo zzb() {
        return this.zzd;
    }

    public final zzgik zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzb;
    }
}
