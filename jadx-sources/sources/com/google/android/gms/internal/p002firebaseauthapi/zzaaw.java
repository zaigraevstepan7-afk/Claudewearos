package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.e0;
import com.google.android.gms.tasks.TaskCompletionSource;
import ig.d;
import jg.s;
import jg.x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzaaw extends zzacz<x, s> {
    private final d zzy;
    private final String zzz;

    public zzaaw(d dVar, String str) {
        super(2);
        e0.j(dVar, "credential cannot be null");
        this.zzy = dVar;
        e0.f(dVar.f8529a, "email cannot be null");
        e0.f(dVar.f8530b, "password cannot be null");
        this.zzz = str;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final String zza() {
        return "linkEmailAuthCredential";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacz
    public final void zzb() {
        jg.d dVarZza = zzaak.zza(this.zzc, this.zzk);
        ((s) this.zze).a(this.zzj, dVarZza);
        zzb(new x(dVarZza));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaciVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        d dVar = this.zzy;
        String str = dVar.f8529a;
        String str2 = dVar.f8530b;
        e0.e(str2);
        zzaciVar.zza(str, str2, ((jg.d) this.zzd).f8872a.zzf(), this.zzd.b(), this.zzz, this.zzb);
    }
}
