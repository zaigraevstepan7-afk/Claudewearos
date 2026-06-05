package mi;

import android.view.WindowId;
import f1.f1;
import f1.j1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c {

    /* renamed from: d, reason: collision with root package name */
    public WindowId f11740d;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11743g;

    /* renamed from: a, reason: collision with root package name */
    public final j1 f11737a = f1.s.A(new b2.b(9205357640488583168L));

    /* renamed from: b, reason: collision with root package name */
    public final j1 f11738b = f1.s.A(new b2.e(9205357640488583168L));

    /* renamed from: c, reason: collision with root package name */
    public final f1 f11739c = new f1(0.0f);

    /* renamed from: e, reason: collision with root package name */
    public final t1.w f11741e = new t1.w();

    /* renamed from: f, reason: collision with root package name */
    public final j1 f11742f = f1.s.A(null);

    public final f2.b a() {
        return (f2.b) this.f11742f.getValue();
    }

    public final long b() {
        return ((b2.b) this.f11737a.getValue()).f1500a;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HazeArea(");
        sb2.append("positionOnScreen=" + b2.b.h(b()) + ", ");
        sb2.append("size=" + b2.e.h(((b2.e) this.f11738b.getValue()).f1514a) + ", ");
        sb2.append("zIndex=" + this.f11739c.g() + ", ");
        sb2.append("contentLayer=" + a() + ", ");
        sb2.append("contentDrawing=" + this.f11743g);
        sb2.append(")");
        return sb2.toString();
    }
}
