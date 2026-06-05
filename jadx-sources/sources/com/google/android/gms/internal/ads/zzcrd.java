package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzcrd implements zzegu {
    public final List zza;

    public zzcrd(List list) {
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzegu
    public final void zzq() {
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            zzgdb.zzr((mf.a) it.next(), new zzcrc(this), zzgdt.zzc());
        }
    }

    public zzcrd(zzcqv zzcqvVar) {
        this.zza = Collections.singletonList(zzgdb.zzh(zzcqvVar));
    }
}
