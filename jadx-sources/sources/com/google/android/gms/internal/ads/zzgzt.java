package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgzt {
    public static final List zza(Object obj, long j) {
        zzgzh zzgzhVar = (zzgzh) zzhbs.zzh(obj, j);
        if (zzgzhVar.zzc()) {
            return zzgzhVar;
        }
        int size = zzgzhVar.size();
        zzgzh zzgzhVarZzf = zzgzhVar.zzf(size == 0 ? 10 : size + size);
        zzhbs.zzv(obj, j, zzgzhVarZzf);
        return zzgzhVarZzf;
    }
}
