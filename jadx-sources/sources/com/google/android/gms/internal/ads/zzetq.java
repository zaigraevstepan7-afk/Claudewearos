package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzetq implements zzett {
    private final Bundle zza;

    public zzetq(Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        Bundle bundle = this.zza;
        zzcut zzcutVar = (zzcut) obj;
        if (bundle.isEmpty()) {
            return;
        }
        zzcutVar.zzb.putBundle("shared_pref", bundle);
    }

    @Override // com.google.android.gms.internal.ads.zzett
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Bundle bundle = this.zza;
        zzcut zzcutVar = (zzcut) obj;
        if (bundle.isEmpty()) {
            return;
        }
        zzcutVar.zza.putBundle("shared_pref", bundle);
    }
}
