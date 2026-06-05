package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.e0;
import com.google.android.gms.tasks.TaskCompletionSource;
import ig.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzacd extends zzacz<Void, t> {
    private final zzyd zzy;

    public zzacd(zzagd zzagdVar) {
        super(8);
        e0.i(zzagdVar);
        this.zzy = new zzyd(zzagdVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final String zza() {
        return "verifyPhoneNumber";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaciVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaciVar.zza(this.zzy, this.zzb);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacz
    public final void zzb() {
    }
}
