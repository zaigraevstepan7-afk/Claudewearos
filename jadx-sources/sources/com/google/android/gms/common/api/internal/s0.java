package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.base.zau;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s0 extends zau {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t0 f3586a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(t0 t0Var, Looper looper) {
        super(looper);
        this.f3586a = t0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 == 1) {
                RuntimeException runtimeException = (RuntimeException) message.obj;
                Log.e("TransformedResultImpl", "Runtime exception on the transformation worker thread: ".concat(String.valueOf(runtimeException.getMessage())));
                throw runtimeException;
            }
            Log.e("TransformedResultImpl", "TransformationResultHandler received unknown message type: " + i10);
            return;
        }
        com.google.android.gms.common.api.r rVar = (com.google.android.gms.common.api.r) message.obj;
        synchronized (this.f3586a.f3588b) {
            try {
                t0 t0Var = this.f3586a.f3587a;
                com.google.android.gms.common.internal.e0.i(t0Var);
                if (rVar == null) {
                    t0Var.a(new Status(13, "Transform returned null", null, null));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
