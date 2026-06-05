package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzbue extends zzbyu {
    final /* synthetic */ zc.b zza;

    public zzbue(zzbuf zzbufVar, zc.b bVar) {
        this.zza = bVar;
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void zzb(String str) {
        this.zza.onFailure(str);
    }

    @Override // com.google.android.gms.internal.ads.zzbyv
    public final void zzc(String str, String str2, Bundle bundle) {
        this.zza.onSuccess(new zc.a(new f7.a(str)));
    }
}
