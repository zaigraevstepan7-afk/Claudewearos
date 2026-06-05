package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzamg implements Comparable {
    public final int zza;
    public final zzamb zzb;

    public zzamg(int i10, zzamb zzambVar) {
        this.zza = i10;
        this.zzb = zzambVar;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return Integer.compare(this.zza, ((zzamg) obj).zza);
    }
}
