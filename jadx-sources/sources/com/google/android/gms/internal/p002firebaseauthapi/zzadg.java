package com.google.android.gms.internal.p002firebaseauthapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.e0;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.firebase.auth.FirebaseAuth;
import ig.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class zzadg<ResultT, CallbackT> implements zzacx<ResultT> {
    private final zzacz<ResultT, CallbackT> zza;
    private final TaskCompletionSource<ResultT> zzb;

    public zzadg(zzacz<ResultT, CallbackT> zzaczVar, TaskCompletionSource<ResultT> taskCompletionSource) {
        this.zza = zzaczVar;
        this.zzb = taskCompletionSource;
    }

    @Override // com.google.android.gms.internal.p002firebaseauthapi.zzacx
    public final void zza(ResultT resultt, Status status) {
        e0.j(this.zzb, "completion source cannot be null");
        if (status == null) {
            this.zzb.setResult(resultt);
            return;
        }
        zzacz<ResultT, CallbackT> zzaczVar = this.zza;
        if (zzaczVar.zzs != null) {
            TaskCompletionSource<ResultT> taskCompletionSource = this.zzb;
            FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(zzaczVar.zzc);
            zzacz<ResultT, CallbackT> zzaczVar2 = this.zza;
            taskCompletionSource.setException(zzach.zza(firebaseAuth, zzaczVar2.zzs, ("reauthenticateWithCredential".equals(zzaczVar2.zza()) || "reauthenticateWithCredentialWithData".equals(this.zza.zza())) ? this.zza.zzd : null));
            return;
        }
        c cVar = zzaczVar.zzp;
        if (cVar != null) {
            this.zzb.setException(zzach.zza(status, cVar, zzaczVar.zzq, zzaczVar.zzr));
        } else {
            this.zzb.setException(zzach.zza(status));
        }
    }
}
