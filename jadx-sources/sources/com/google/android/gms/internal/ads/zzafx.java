package com.google.android.gms.internal.ads;

import java.util.Objects;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzafx extends zzadf {
    public zzafx(final zzaee zzaeeVar, int i10, long j, long j4) {
        long j10;
        Objects.requireNonNull(zzaeeVar);
        zzadc zzadcVar = new zzadc() { // from class: com.google.android.gms.internal.ads.zzafu
            @Override // com.google.android.gms.internal.ads.zzadc
            public final long zza(long j11) {
                return zzaeeVar.zzb(j11);
            }
        };
        zzafv zzafvVar = new zzafv(zzaeeVar, i10, null);
        long jZza = zzaeeVar.zza();
        long j11 = zzaeeVar.zzj;
        int i11 = zzaeeVar.zzd;
        if (i11 > 0) {
            j10 = ((i11 + zzaeeVar.zzc) / 2) + 1;
        } else {
            int i12 = zzaeeVar.zza;
            long j12 = 4096;
            if (i12 == zzaeeVar.zzb && i12 > 0) {
                j12 = i12;
            }
            j10 = 64 + (((j12 * zzaeeVar.zzg) * zzaeeVar.zzh) / 8);
        }
        super(zzadcVar, zzafvVar, jZza, 0L, j11, j, j4, j10, Math.max(6, zzaeeVar.zzc));
    }
}
