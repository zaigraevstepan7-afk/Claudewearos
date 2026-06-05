package com.google.android.gms.internal.ads;

import java.util.Objects;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzgms extends zzgfa {
    private final zzgom zza;

    public zzgms(zzgom zzgomVar) {
        this.zza = zzgomVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgms)) {
            return false;
        }
        zzgom zzgomVar = ((zzgms) obj).zza;
        zzgom zzgomVar2 = this.zza;
        return zzgomVar2.zzc().zzg().equals(zzgomVar.zzc().zzg()) && zzgomVar2.zzc().zzi().equals(zzgomVar.zzc().zzi()) && zzgomVar2.zzc().zzh().equals(zzgomVar.zzc().zzh());
    }

    public final int hashCode() {
        zzgom zzgomVar = this.zza;
        return Objects.hash(zzgomVar.zzc(), zzgomVar.zzd());
    }

    public final String toString() {
        zzgom zzgomVar = this.zza;
        String strZzi = zzgomVar.zzc().zzi();
        int iOrdinal = zzgomVar.zzc().zzg().ordinal();
        return m1.k("(typeUrl=", strZzi, ", outputPrefixType=", iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final boolean zza() {
        return this.zza.zzc().zzg() != zzgut.RAW;
    }

    public final zzgom zzb() {
        return this.zza;
    }
}
