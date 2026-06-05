package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.tasks.TaskCompletionSource;
import ig.l;
import ig.p;
import jg.d;
import jg.s;
import jg.x;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzaas extends zzacz<x, s> {
    private final String zzaa;
    private final p zzy;
    private final String zzz;

    public zzaas(p pVar, String str, String str2) {
        super(2);
        e0.i(pVar);
        throw null;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final String zza() {
        return "finalizeMfaSignIn";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacz
    public final void zzb() {
        d dVarZza = zzaak.zza(this.zzc, this.zzk);
        l lVar = this.zzd;
        if (lVar != null && !((d) lVar).f8873b.f8920a.equalsIgnoreCase(dVarZza.f8873b.f8920a)) {
            zza(new Status(17024, null, null, null));
        } else {
            ((s) this.zze).a(this.zzj, dVarZza);
            zzb(new x(dVarZza));
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaciVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaciVar.zza(this.zzz, (p) null, this.zzaa, this.zzb);
    }
}
