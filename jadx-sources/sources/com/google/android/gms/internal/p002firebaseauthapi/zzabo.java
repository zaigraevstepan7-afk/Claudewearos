package com.google.android.gms.internal.p002firebaseauthapi;

import a.a;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.tasks.TaskCompletionSource;
import ig.c;
import jg.d;
import jg.s;
import jg.x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzabo extends zzacz<x, s> {
    private final zzags zzy;

    public zzabo(c cVar, String str) {
        super(2);
        e0.j(cVar, "credential cannot be null");
        this.zzy = a.c0(cVar, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final String zza() {
        return "signInWithCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacz
    public final void zzb() {
        d dVarZza = zzaak.zza(this.zzc, this.zzk);
        ((s) this.zze).a(this.zzj, dVarZza);
        zzb(new x(dVarZza));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaciVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaciVar.zza(this.zzy, this.zzb);
    }
}
