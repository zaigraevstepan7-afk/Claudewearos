package androidx.work;

import android.content.Context;
import ef.f;
import j7.b;
import java.util.Collections;
import java.util.List;
import t7.m;
import u7.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class WorkManagerInitializer implements b {

    /* renamed from: a, reason: collision with root package name */
    public static final String f1223a = m.l("WrkMgrInitializer");

    @Override // j7.b
    public final List a() {
        return Collections.EMPTY_LIST;
    }

    @Override // j7.b
    public final Object b(Context context) {
        m.g().c(f1223a, "Initializing WorkManager with default configuration.", new Throwable[0]);
        k.q0(context, new t7.b(new f()));
        return k.p0(context);
    }
}
