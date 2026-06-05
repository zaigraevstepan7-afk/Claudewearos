package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import ig.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzadf implements zzadh {
    private final /* synthetic */ Status zza;

    public zzadf(zzadb zzadbVar, Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final void zza(t tVar, Object... objArr) {
        tVar.onVerificationFailed(zzach.zza(this.zza));
    }
}
