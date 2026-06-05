package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.tasks.TaskCompletionSource;
import ig.d;
import jg.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzabc extends zzacz<Void, s> {
    private final zzyf zzy;

    public zzabc(d dVar, String str) {
        super(2);
        e0.j(dVar, "Credential cannot be null");
        this.zzy = new zzyf(dVar, str);
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final String zza() {
        return "reauthenticateWithEmailLink";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacz
    public final void zzb() {
        jg.d dVarZza = zzaak.zza(this.zzc, this.zzk);
        if (!((jg.d) this.zzd).f8873b.f8920a.equalsIgnoreCase(dVarZza.f8873b.f8920a)) {
            zza(new Status(17024, null, null, null));
        } else {
            ((s) this.zze).a(this.zzj, dVarZza);
            zzb(null);
        }
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaciVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaciVar.zza(this.zzy, this.zzb);
    }
}
