package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.e;
import com.google.android.gms.common.internal.e0;
import ee.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzay extends zzan {
    private e zza;

    public zzay(e eVar) {
        e0.a("listener can't be null.", eVar != null);
        this.zza = eVar;
    }

    @Override // com.google.android.gms.internal.location.zzao
    public final void zzb(j jVar) {
        this.zza.setResult(jVar);
        this.zza = null;
    }
}
