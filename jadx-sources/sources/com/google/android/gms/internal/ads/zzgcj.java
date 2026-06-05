package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzgcj extends zzgcl {
    public zzgcj(zzfya zzfyaVar, boolean z2) {
        super(zzfyaVar, z2);
        zzz();
    }

    @Override // com.google.android.gms.internal.ads.zzgcl
    public final /* bridge */ /* synthetic */ Object zzD(List list) {
        ArrayList arrayListZzb = zzfyv.zzb(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzgck zzgckVar = (zzgck) it.next();
            arrayListZzb.add(zzgckVar != null ? zzgckVar.zza : null);
        }
        return Collections.unmodifiableList(arrayListZzb);
    }
}
