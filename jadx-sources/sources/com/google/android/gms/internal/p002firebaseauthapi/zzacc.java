package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.internal.e0;
import com.google.android.gms.tasks.TaskCompletionSource;
import ig.b0;
import jg.d;
import jg.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzacc extends zzacz<Void, s> {
    private final b0 zzy;

    public zzacc(b0 b0Var) {
        super(2);
        e0.j(b0Var, "request cannot be null");
        this.zzy = b0Var;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final String zza() {
        return "updateProfile";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacz
    public final void zzb() {
        ((s) this.zze).a(this.zzj, zzaak.zza(this.zzc, this.zzk));
        zzb(null);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaciVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaciVar.zza(((d) this.zzd).f8872a.zzf(), this.zzy, this.zzb);
    }
}
