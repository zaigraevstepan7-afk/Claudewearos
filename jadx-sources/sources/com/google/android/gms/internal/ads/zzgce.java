package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgce extends zzgcc {
    private zzgce() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgcc
    public final int zza(zzgcg zzgcgVar) {
        int i10;
        synchronized (zzgcgVar) {
            i10 = zzgcgVar.remainingField - 1;
            zzgcgVar.remainingField = i10;
        }
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzgcc
    public final void zzb(zzgcg zzgcgVar, Set set, Set set2) {
        synchronized (zzgcgVar) {
            try {
                if (zzgcgVar.seenExceptionsField == null) {
                    zzgcgVar.seenExceptionsField = set2;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public /* synthetic */ zzgce(zzgcf zzgcfVar) {
        super(null);
    }
}
