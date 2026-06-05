package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbad implements Comparator {
    public zzbad(zzbaf zzbafVar) {
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzbaj zzbajVar = (zzbaj) obj;
        zzbaj zzbajVar2 = (zzbaj) obj2;
        int i10 = zzbajVar.zzc - zzbajVar2.zzc;
        return i10 != 0 ? i10 : Long.compare(zzbajVar.zza, zzbajVar2.zza);
    }
}
