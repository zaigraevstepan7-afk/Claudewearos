package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.e0;
import com.google.android.gms.tasks.TaskCompletionSource;
import ig.a;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzacb extends zzacz<Void, Void> {
    private final zzyk zzy;

    public zzacb(String str, String str2, a aVar) {
        super(6);
        e0.e(str);
        e0.e(str2);
        e0.i(aVar);
        this.zzy = new zzyk(str, str2, aVar);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final String zza() {
        return "verifyBeforeUpdateEmail";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacz
    public final void zzb() {
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaciVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaciVar.zza(this.zzy, this.zzb);
    }
}
