package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzemn implements zzetu {
    private final Set zza;

    public zzemn(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzetu
    public final mf.a zzb() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return zzgdb.zzh(new zzeml(arrayList, null));
    }
}
