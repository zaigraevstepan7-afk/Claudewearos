package com.google.android.gms.internal.location;

import com.google.android.gms.common.api.internal.n;
import com.google.android.gms.location.LocationAvailability;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzaq implements n {
    final /* synthetic */ LocationAvailability zza;

    public zzaq(zzar zzarVar, LocationAvailability locationAvailability) {
        this.zza = locationAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final /* synthetic */ void notifyListener(Object obj) {
        throw m1.f(obj);
    }

    @Override // com.google.android.gms.common.api.internal.n
    public final void onNotifyListenerFailed() {
    }
}
