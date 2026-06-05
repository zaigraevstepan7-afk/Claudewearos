package com.google.android.gms.internal.ads;

import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgmp extends zzgfa {
    private final String zza;
    private final zzgut zzb;

    public /* synthetic */ zzgmp(String str, zzgut zzgutVar, zzgmq zzgmqVar) {
        this.zza = str;
        this.zzb = zzgutVar;
    }

    public final String toString() {
        String str = this.zza;
        int iOrdinal = this.zzb.ordinal();
        return m1.k("(typeUrl=", str, ", outputPrefixType=", iOrdinal != 1 ? iOrdinal != 2 ? iOrdinal != 3 ? iOrdinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK", ")");
    }

    @Override // com.google.android.gms.internal.ads.zzgfa
    public final boolean zza() {
        return this.zzb != zzgut.RAW;
    }
}
