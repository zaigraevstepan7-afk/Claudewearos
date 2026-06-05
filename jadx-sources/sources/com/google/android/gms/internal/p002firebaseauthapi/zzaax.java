package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.e0;
import com.google.android.gms.tasks.TaskCompletionSource;
import ig.d;
import ig.l;
import jg.s;
import jg.x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzaax extends zzacz<x, s> {
    private final d zzy;

    public zzaax(d dVar) {
        super(2);
        e0.j(dVar, "credential cannot be null");
        this.zzy = dVar;
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
        l lVar = this.zzd;
        dVar.getClass();
        dVar.f8532d = ((jg.d) lVar).f8872a.zzf();
        dVar.f8533e = true;
        zzaciVar.zza(new zzyf(dVar, null), this.zzb);
    }
}
