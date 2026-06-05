package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class y implements com.google.android.gms.common.api.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.google.android.gms.common.api.r f3717a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ TaskCompletionSource f3718b;

    public y(com.google.android.gms.common.api.r rVar, TaskCompletionSource taskCompletionSource, lh.e eVar) {
        this.f3717a = rVar;
        this.f3718b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.q
    public final void a(Status status) {
        boolean zB = status.b();
        TaskCompletionSource taskCompletionSource = this.f3718b;
        if (!zB) {
            taskCompletionSource.setException(e0.m(status));
            return;
        }
        this.f3717a.await(0L, TimeUnit.MILLISECONDS);
        taskCompletionSource.setResult(null);
    }
}
