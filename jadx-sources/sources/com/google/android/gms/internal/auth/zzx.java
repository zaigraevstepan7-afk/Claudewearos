package com.google.android.gms.internal.auth;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zzx extends i {
    final /* synthetic */ TaskCompletionSource zza;

    public zzx(zzab zzabVar, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final void onResult(Status status) {
        zzab.zzf(status, null, this.zza);
    }
}
