package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzame {
    private static final Comparator zza = new Comparator() { // from class: com.google.android.gms.internal.ads.zzamd
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return Integer.compare(((zzame) obj).zzb.zzb, ((zzame) obj2).zzb.zzb);
        }
    };
    private final zzamf zzb;
    private final int zzc;

    public /* synthetic */ zzame(zzamf zzamfVar, int i10, zzami zzamiVar) {
        this.zzb = zzamfVar;
        this.zzc = i10;
    }
}
