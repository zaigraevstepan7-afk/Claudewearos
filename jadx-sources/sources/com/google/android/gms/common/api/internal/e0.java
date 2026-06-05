package com.google.android.gms.common.api.internal;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class e0 implements Executor {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3531a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f3532b;

    public /* synthetic */ e0(Handler handler, int i10) {
        this.f3531a = i10;
        this.f3532b = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f3531a) {
            case 0:
                this.f3532b.post(runnable);
                return;
            case 1:
                runnable.getClass();
                Handler handler = this.f3532b;
                if (handler.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler + " is shutting down");
            default:
                runnable.getClass();
                Handler handler2 = this.f3532b;
                if (handler2.post(runnable)) {
                    return;
                }
                throw new RejectedExecutionException(handler2 + " is shutting down");
        }
    }
}
