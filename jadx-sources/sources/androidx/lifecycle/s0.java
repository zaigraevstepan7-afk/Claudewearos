package androidx.lifecycle;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s0 implements a7.d {

    /* renamed from: a, reason: collision with root package name */
    public final mh.g f1127a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1128b;

    /* renamed from: c, reason: collision with root package name */
    public Bundle f1129c;

    /* renamed from: d, reason: collision with root package name */
    public final pi.m f1130d;

    public s0(mh.g gVar, b1 b1Var) {
        fj.l.f(gVar, "savedStateRegistry");
        this.f1127a = gVar;
        this.f1130d = u6.v.Q(new a7.e(b1Var, 1));
    }

    @Override // a7.d
    public final Bundle a() {
        Bundle bundleM = uk.c.m((pi.h[]) Arrays.copyOf(new pi.h[0], 0));
        Bundle bundle = this.f1129c;
        if (bundle != null) {
            bundleM.putAll(bundle);
        }
        for (Map.Entry entry : ((t0) this.f1130d.getValue()).f1131b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((c.g) ((o0) entry.getValue()).f1117a.f734e).a();
            if (!bundleA.isEmpty()) {
                fj.l.f(str, "key");
                bundleM.putBundle(str, bundleA);
            }
        }
        this.f1128b = false;
        return bundleM;
    }

    public final void b() {
        if (this.f1128b) {
            return;
        }
        Bundle bundleI = this.f1127a.i("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleM = uk.c.m((pi.h[]) Arrays.copyOf(new pi.h[0], 0));
        Bundle bundle = this.f1129c;
        if (bundle != null) {
            bundleM.putAll(bundle);
        }
        if (bundleI != null) {
            bundleM.putAll(bundleI);
        }
        this.f1129c = bundleM;
        this.f1128b = true;
    }
}
