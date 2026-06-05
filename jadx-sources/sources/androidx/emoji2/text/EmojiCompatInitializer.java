package androidx.emoji2.text;

import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.v;
import j7.b;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import k3.a;
import r5.k;
import r5.l;
import r5.t;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements b {
    @Override // j7.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // j7.b
    public final Object b(Context context) {
        Object objB;
        t tVar = new t(new a(context, 1));
        tVar.f13730a = 1;
        if (k.f13733k == null) {
            synchronized (k.j) {
                try {
                    if (k.f13733k == null) {
                        k.f13733k = new k(tVar);
                    }
                } finally {
                }
            }
        }
        j7.a aVarC = j7.a.c(context);
        aVarC.getClass();
        synchronized (j7.a.f8732e) {
            try {
                objB = aVarC.f8733a.get(ProcessLifecycleInitializer.class);
                if (objB == null) {
                    objB = aVarC.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } finally {
            }
        }
        v vVarH = ((androidx.lifecycle.t) objB).h();
        vVarH.a(new l(this, vVarH));
        return Boolean.TRUE;
    }
}
