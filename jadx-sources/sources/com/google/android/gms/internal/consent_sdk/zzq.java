package com.google.android.gms.internal.consent_sdk;

import android.app.Application;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class zzq implements zzdo {
    private final zzdr zza;
    private final zzdr zzb;

    public zzq(zzdr zzdrVar, zzdr zzdrVar2) {
        this.zza = zzdrVar;
        this.zzb = zzdrVar2;
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdt, com.google.android.gms.internal.consent_sdk.zzds
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzn zza() {
        return new zzn((Application) this.zza.zza(), (zzaq) this.zzb.zza());
    }
}
