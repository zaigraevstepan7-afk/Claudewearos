package com.google.android.gms.internal.ads;

import nc.a1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzazp extends a1 {
    private final gc.e zza;

    public zzazp(gc.e eVar) {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
        this.zza = eVar;
    }

    public final gc.e zzb() {
        return this.zza;
    }

    @Override // nc.b1
    public final void zzc(String str, String str2) {
        this.zza.onAppEvent(str, str2);
    }
}
