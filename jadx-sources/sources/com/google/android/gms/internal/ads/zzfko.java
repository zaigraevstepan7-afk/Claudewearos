package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfko implements Comparator {
    final /* synthetic */ zzfkv zza;

    public zzfko(zzfkv zzfkvVar) {
        this.zza = zzfkvVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        zzfkm zzfkmVar = (zzfkm) obj;
        zzfkm zzfkmVar2 = (zzfkm) obj2;
        Object objZzc = zzfkmVar2.zzc();
        zzfkv zzfkvVar = this.zza;
        int iCompare = Double.compare(zzfkv.zzc(zzfkvVar, zzfkvVar.zza(objZzc)), zzfkv.zzc(zzfkvVar, zzfkvVar.zza(zzfkmVar.zzc())));
        return iCompare == 0 ? Long.compare(zzfkmVar.zzb(), zzfkmVar2.zzb()) : iCompare;
    }
}
