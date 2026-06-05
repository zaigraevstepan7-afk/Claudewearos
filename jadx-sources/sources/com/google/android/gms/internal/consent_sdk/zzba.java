package com.google.android.gms.internal.consent_sdk;

import lf.c;
import lf.h;
import lf.i;
import lf.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzba implements j, i {
    private final j zza;
    private final i zzb;

    public /* synthetic */ zzba(j jVar, i iVar, zzbb zzbbVar) {
        this.zza = jVar;
        this.zzb = iVar;
    }

    @Override // lf.i
    public final void onConsentFormLoadFailure(h hVar) {
        this.zzb.onConsentFormLoadFailure(hVar);
    }

    @Override // lf.j
    public final void onConsentFormLoadSuccess(c cVar) {
        this.zza.onConsentFormLoadSuccess(cVar);
    }
}
