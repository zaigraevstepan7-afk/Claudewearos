package com.google.android.gms.internal.p002firebaseauthapi;

import ag.i;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.List;
import jg.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class zzaaq extends zzacz<Object, s> {
    private final String zzy;
    private final String zzz;

    public zzaaq(String str, String str2) {
        super(3);
        e0.f(str, "email cannot be null or empty");
        this.zzy = str;
        this.zzz = str2;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final String zza() {
        return "fetchSignInMethodsForEmail";
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacz
    public final void zzb() {
        List<String> listZza;
        if (this.zzl.zza() == null) {
            listZza = zzaq.zzh();
        } else {
            listZza = this.zzl.zza();
            e0.i(listZza);
        }
        zzb(new i(listZza, 8));
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzadl
    public final void zza(TaskCompletionSource taskCompletionSource, zzaci zzaciVar) {
        this.zzg = new zzadg(this, taskCompletionSource);
        zzaciVar.zze(this.zzy, this.zzz, this.zzb);
    }
}
