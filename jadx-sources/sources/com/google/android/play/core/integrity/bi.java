package com.google.android.play.core.integrity;

import android.os.Bundle;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
class bi extends kf.y {

    /* renamed from: a, reason: collision with root package name */
    final TaskCompletionSource f4075a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f4076b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super("com.google.android.play.core.integrity.protocol.IExpressIntegrityServiceCallback");
        this.f4076b = bnVar;
        this.f4075a = taskCompletionSource;
    }

    @Override // kf.z
    public final void b(Bundle bundle) {
        this.f4076b.f4084a.d(this.f4075a);
    }

    @Override // kf.z
    public void c(Bundle bundle) {
        this.f4076b.f4084a.d(this.f4075a);
    }

    @Override // kf.z
    public final void d(Bundle bundle) {
        this.f4076b.f4084a.d(this.f4075a);
    }

    @Override // kf.z
    public void e(Bundle bundle) {
        this.f4076b.f4084a.d(this.f4075a);
    }
}
