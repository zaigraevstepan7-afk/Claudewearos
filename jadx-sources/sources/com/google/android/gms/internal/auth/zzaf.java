package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzaf extends zzah {
    final /* synthetic */ zzag zza;

    public zzaf(zzag zzagVar) {
        this.zza = zzagVar;
    }

    @Override // com.google.android.gms.internal.auth.zzah, ed.c
    public final void zzc(boolean z2) {
        this.zza.setResult((zzag) new zzak(z2 ? Status.f3488e : zzal.zza));
    }
}
