package com.google.android.gms.internal.p002firebaseauthapi;

import cg.k;
import ig.r;
import ig.s;
import ig.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzadv extends t {
    private final /* synthetic */ t zza;
    private final /* synthetic */ String zzb;

    public zzadv(t tVar, String str) {
        this.zza = tVar;
        this.zzb = str;
    }

    @Override // ig.t
    public final void onCodeAutoRetrievalTimeOut(String str) {
        zzads.zza.remove(this.zzb);
        this.zza.onCodeAutoRetrievalTimeOut(str);
    }

    @Override // ig.t
    public final void onCodeSent(String str, s sVar) {
        this.zza.onCodeSent(str, sVar);
    }

    @Override // ig.t
    public final void onVerificationCompleted(r rVar) {
        zzads.zza.remove(this.zzb);
        this.zza.onVerificationCompleted(rVar);
    }

    @Override // ig.t
    public final void onVerificationFailed(k kVar) {
        zzads.zza.remove(this.zzb);
        this.zza.onVerificationFailed(kVar);
    }
}
