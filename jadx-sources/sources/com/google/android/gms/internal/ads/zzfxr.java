package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfxr extends zzfxu {
    public zzfxr() {
        super(null);
    }

    public static final zzfxu zzf(int i10) {
        return i10 < 0 ? zzfxu.zzb : i10 > 0 ? zzfxu.zzc : zzfxu.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfxu
    public final int zza() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzfxu
    public final zzfxu zzb(int i10, int i11) {
        return zzf(Integer.compare(i10, i11));
    }

    @Override // com.google.android.gms.internal.ads.zzfxu
    public final zzfxu zzc(Object obj, Object obj2, Comparator comparator) {
        return zzf(comparator.compare(obj, obj2));
    }

    @Override // com.google.android.gms.internal.ads.zzfxu
    public final zzfxu zzd(boolean z2, boolean z10) {
        return zzf(Boolean.compare(z2, z10));
    }

    @Override // com.google.android.gms.internal.ads.zzfxu
    public final zzfxu zze(boolean z2, boolean z10) {
        return zzf(Boolean.compare(z10, z2));
    }
}
