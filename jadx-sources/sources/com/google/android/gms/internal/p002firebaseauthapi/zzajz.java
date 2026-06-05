package com.google.android.gms.internal.p002firebaseauthapi;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzajz extends zzaju {
    private static <E> zzajl<E> zzc(Object obj, long j) {
        return (zzajl) zzamm.zze(obj, j);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaju
    public final <L> List<L> zza(Object obj, long j) {
        zzajl zzajlVarZzc = zzc(obj, j);
        if (zzajlVarZzc.zzc()) {
            return zzajlVarZzc;
        }
        int size = zzajlVarZzc.size();
        zzajl zzajlVarZza = zzajlVarZzc.zza(size == 0 ? 10 : size << 1);
        zzamm.zza(obj, j, zzajlVarZza);
        return zzajlVarZza;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaju
    public final void zzb(Object obj, long j) {
        zzc(obj, j).zzb();
    }

    private zzajz() {
        super();
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzaju
    public final <E> void zza(Object obj, Object obj2, long j) {
        zzajl zzajlVarZzc = zzc(obj, j);
        zzajl zzajlVarZzc2 = zzc(obj2, j);
        int size = zzajlVarZzc.size();
        int size2 = zzajlVarZzc2.size();
        if (size > 0 && size2 > 0) {
            if (!zzajlVarZzc.zzc()) {
                zzajlVarZzc = zzajlVarZzc.zza(size2 + size);
            }
            zzajlVarZzc.addAll(zzajlVarZzc2);
        }
        if (size > 0) {
            zzajlVarZzc2 = zzajlVarZzc;
        }
        zzamm.zza(obj, j, zzajlVarZzc2);
    }
}
