package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.internal.n;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzat implements n {
    final /* synthetic */ Location zza;

    public zzat(zzau zzauVar, Location location) {
        this.zza = location;
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final /* synthetic */ void notifyListener(Object obj) {
        throw m1.f(obj);
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final void onNotifyListenerFailed() {
    }
}
