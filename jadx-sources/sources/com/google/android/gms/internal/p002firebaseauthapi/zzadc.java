package com.google.android.gms.internal.p002firebaseauthapi;

import ig.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzadc implements zzadh {
    private final /* synthetic */ String zza;

    public zzadc(zzadb zzadbVar, String str) {
        this.zza = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadh
    public final void zza(t tVar, Object... objArr) {
        tVar.onCodeAutoRetrievalTimeOut(this.zza);
    }
}
