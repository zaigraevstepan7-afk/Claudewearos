package ld;

import android.content.Context;
import com.google.android.gms.common.api.p;
import java.util.Iterator;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final qd.a f10921a = new qd.a("GoogleSignInCommon", new String[0]);

    public static void a(Context context) {
        i.W(context).X();
        Set set = p.f3611a;
        synchronized (set) {
        }
        Iterator it = set.iterator();
        if (it.hasNext()) {
            ((p) it.next()).getClass();
            throw new UnsupportedOperationException();
        }
        com.google.android.gms.common.api.internal.h.a();
    }
}
