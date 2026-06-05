package com.google.android.play.core.integrity;

import android.content.Context;
import com.google.android.gms.tasks.TaskCompletionSource;
import kf.i0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class be extends i0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f4060a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ bn f4061b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public be(bn bnVar, TaskCompletionSource taskCompletionSource, Context context) {
        super(taskCompletionSource);
        this.f4060a = context;
        this.f4061b = bnVar;
    }

    @Override // kf.i0
    public final void b() {
        this.f4061b.f4087d.trySetResult(Integer.valueOf(kf.g.a(this.f4060a)));
    }
}
