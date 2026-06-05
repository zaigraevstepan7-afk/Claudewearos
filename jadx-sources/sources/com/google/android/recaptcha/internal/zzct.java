package com.google.android.recaptcha.internal;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import qi.k;
import qi.m;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzct implements zzdd {
    public static final zzct zza = new zzct();

    private zzct() {
    }

    private static final boolean zzb(List list) {
        ArrayList arrayList = new ArrayList(m.s0(list));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(Boolean.valueOf(((zzpq) it.next()).zzN()));
        }
        return !arrayList.contains(Boolean.FALSE);
    }

    @Override // com.google.android.recaptcha.internal.zzdd
    public final void zza(int i10, zzcj zzcjVar, zzpq... zzpqVarArr) throws zzae {
        if (!zzb(k.v0(zzpqVarArr))) {
            throw new zzae(4, 5, null);
        }
        for (zzpq zzpqVar : zzpqVarArr) {
            zzcjVar.zzc().zzb(zzpqVar.zzi());
        }
    }
}
