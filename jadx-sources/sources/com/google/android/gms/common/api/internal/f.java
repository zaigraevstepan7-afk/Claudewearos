package com.google.android.gms.common.api.internal;

import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.ads.zzcdl;
import com.google.android.gms.internal.base.zau;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f extends zau {
    public final void a(com.google.android.gms.common.api.u uVar, com.google.android.gms.common.api.t tVar) {
        int i10 = BasePendingResult.zad;
        com.google.android.gms.common.internal.e0.i(uVar);
        sendMessage(obtainMessage(1, new Pair(uVar, tVar)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 1) {
            if (i10 != 2) {
                Log.wtf("BasePendingResult", m6.a.d(i10, "Don't know how to handle message: "), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.A);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        com.google.android.gms.common.api.u uVar = (com.google.android.gms.common.api.u) pair.first;
        com.google.android.gms.common.api.t tVar = (com.google.android.gms.common.api.t) pair.second;
        try {
            t0 t0Var = (t0) uVar;
            synchronized (t0Var.f3588b) {
                if (!tVar.getStatus().b()) {
                    t0Var.a(tVar.getStatus());
                    if (tVar instanceof zzcdl) {
                        try {
                            ((zzcdl) tVar).release();
                        } catch (RuntimeException e10) {
                            Log.w("TransformedResultImpl", "Unable to release ".concat(String.valueOf(tVar)), e10);
                        }
                    }
                }
            }
        } catch (RuntimeException e11) {
            BasePendingResult.zal(tVar);
            throw e11;
        }
    }
}
