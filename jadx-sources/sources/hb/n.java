package hb;

import android.graphics.RuntimeShader;
import android.os.Build;
import c1.u6;
import p2.k0;
import qj.z;
import t.u0;
import v1.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public final z f7829a;

    /* renamed from: b, reason: collision with root package name */
    public final ej.e f7830b;

    /* renamed from: c, reason: collision with root package name */
    public final u0 f7831c;

    /* renamed from: d, reason: collision with root package name */
    public final u0 f7832d;

    /* renamed from: e, reason: collision with root package name */
    public final t.c f7833e;

    /* renamed from: f, reason: collision with root package name */
    public final t.c f7834f;

    /* renamed from: g, reason: collision with root package name */
    public long f7835g;

    /* renamed from: h, reason: collision with root package name */
    public final RuntimeShader f7836h;

    /* renamed from: i, reason: collision with root package name */
    public final o f7837i;
    public final o j;

    public n(z zVar, ej.e eVar) {
        RuntimeShader runtimeShaderC;
        fj.l.f(zVar, "animationScope");
        this.f7829a = zVar;
        this.f7830b = eVar;
        this.f7831c = new u0(0.5f, 300.0f, Float.valueOf(0.001f));
        this.f7832d = new u0(0.5f, 300.0f, new b2.b((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L)));
        this.f7833e = t.d.a(0.0f, 0.001f);
        this.f7834f = new t.c(new b2.b(0L), t.d.f15141o, new b2.b((Float.floatToRawIntBits(1.0f) << 32) | (Float.floatToRawIntBits(1.0f) & 4294967295L)), 8);
        this.f7835g = 0L;
        if (Build.VERSION.SDK_INT >= 33) {
            j.j();
            runtimeShaderC = j.c();
        } else {
            runtimeShaderC = null;
        }
        this.f7836h = runtimeShaderC;
        k kVar = new k(this, 0);
        v1.l lVar = v1.l.f17564b;
        this.f7837i = z1.h.g(lVar, kVar);
        this.j = k0.a(lVar, zVar, new u6(this, 3));
    }

    public /* synthetic */ n(z zVar) {
        this(zVar, new g3.z(9));
    }
}
