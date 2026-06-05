package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcde implements Iterable {
    private final List zza = new ArrayList();

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.zza.iterator();
    }

    public final zzcdd zza(zzcbz zzcbzVar) {
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcdd zzcddVar = (zzcdd) it.next();
            if (zzcddVar.zza == zzcbzVar) {
                return zzcddVar;
            }
        }
        return null;
    }

    public final void zzb(zzcdd zzcddVar) {
        this.zza.add(zzcddVar);
    }

    public final void zzc(zzcdd zzcddVar) {
        this.zza.remove(zzcddVar);
    }

    public final boolean zzd(zzcbz zzcbzVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = iterator();
        while (it.hasNext()) {
            zzcdd zzcddVar = (zzcdd) it.next();
            if (zzcddVar.zza == zzcbzVar) {
                arrayList.add(zzcddVar);
            }
        }
        int i10 = 0;
        if (arrayList.isEmpty()) {
            return false;
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((zzcdd) obj).zzb.zzf();
        }
        return true;
    }
}
