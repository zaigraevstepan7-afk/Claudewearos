package com.google.android.gms.common.internal;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n0 implements Handler.Callback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ o0 f3681a;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            synchronized (this.f3681a.f3682d) {
                try {
                    l0 l0Var = (l0) message.obj;
                    m0 m0Var = (m0) this.f3681a.f3682d.get(l0Var);
                    if (m0Var != null && m0Var.f3674a.isEmpty()) {
                        if (m0Var.f3676c) {
                            m0Var.f3680g.f3684f.removeMessages(1, m0Var.f3678e);
                            o0 o0Var = m0Var.f3680g;
                            o0Var.f3685g.b(o0Var.f3683e, m0Var);
                            m0Var.f3676c = false;
                            m0Var.f3675b = 2;
                        }
                        this.f3681a.f3682d.remove(l0Var);
                    }
                } finally {
                }
            }
            return true;
        }
        if (i10 != 1) {
            return false;
        }
        synchronized (this.f3681a.f3682d) {
            try {
                l0 l0Var2 = (l0) message.obj;
                m0 m0Var2 = (m0) this.f3681a.f3682d.get(l0Var2);
                if (m0Var2 != null && m0Var2.f3675b == 3) {
                    Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(l0Var2)), new Exception());
                    ComponentName componentName = m0Var2.f3679f;
                    if (componentName == null) {
                        l0Var2.getClass();
                        componentName = null;
                    }
                    if (componentName == null) {
                        String str = l0Var2.f3669b;
                        e0.i(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    m0Var2.onServiceDisconnected(componentName);
                }
            } finally {
            }
        }
        return true;
    }
}
