package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzhfo implements Iterator {
    int zza = 0;
    final /* synthetic */ zzhfp zzb;

    public zzhfo(zzhfp zzhfpVar) {
        this.zzb = zzhfpVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.zza;
        zzhfp zzhfpVar = this.zzb;
        return i10 < zzhfpVar.zza.size() || zzhfpVar.zzb.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.zza;
        zzhfp zzhfpVar = this.zzb;
        List list = zzhfpVar.zza;
        if (i10 >= list.size()) {
            list.add(zzhfpVar.zzb.next());
            return next();
        }
        int i11 = this.zza;
        this.zza = i11 + 1;
        return list.get(i11);
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
