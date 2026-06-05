package com.google.android.play.core.integrity;

import com.google.android.gms.tasks.TaskCompletionSource;
import kf.i0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
abstract class bm extends i0 {

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ bn f4083f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm(bn bnVar, TaskCompletionSource taskCompletionSource) {
        super(taskCompletionSource);
        this.f4083f = bnVar;
    }

    @Override // kf.i0
    public final void a(Exception exc) {
        if (!(exc instanceof kf.f)) {
            super.a(exc);
        } else if (bn.l(this.f4083f)) {
            super.a(new StandardIntegrityException(-2, exc));
        } else {
            super.a(new StandardIntegrityException(-9, exc));
        }
    }
}
