package com.google.android.gms.internal.p000authapi;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.i;
import com.google.android.gms.tasks.TaskCompletionSource;
import yd.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
final class zban extends i {
    final /* synthetic */ TaskCompletionSource zba;

    public zban(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.j
    public final void onResult(Status status) {
        f.g0(status, null, this.zba);
    }
}
