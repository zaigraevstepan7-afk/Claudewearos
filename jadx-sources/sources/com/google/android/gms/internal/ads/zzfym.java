package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzfym extends zzfwf {
    final /* synthetic */ Iterator zza;
    final /* synthetic */ zzfvf zzb;

    public zzfym(Iterator it, zzfvf zzfvfVar) {
        this.zza = it;
        this.zzb = zzfvfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwf
    public final Object zza() {
        zzfvf zzfvfVar;
        Object next;
        do {
            Iterator it = this.zza;
            if (!it.hasNext()) {
                zzb();
                return null;
            }
            zzfvfVar = this.zzb;
            next = it.next();
        } while (!zzfvfVar.zza(next));
        return next;
    }
}
