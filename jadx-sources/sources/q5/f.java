package q5;

import android.animation.ValueAnimator;
import android.os.Build;
import android.os.Looper;
import android.util.AndroidRuntimeException;
import android.view.Choreographer;
import ef.x;
import java.util.ArrayList;
import l3.y;
import l7.l;
import t0.j;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: p, reason: collision with root package name */
    public static final d f13249p = new d(1);

    /* renamed from: q, reason: collision with root package name */
    public static final d f13250q = new d(2);

    /* renamed from: r, reason: collision with root package name */
    public static final d f13251r = new d(3);

    /* renamed from: s, reason: collision with root package name */
    public static final d f13252s = new d(4);

    /* renamed from: t, reason: collision with root package name */
    public static final d f13253t = new d(5);

    /* renamed from: u, reason: collision with root package name */
    public static final d f13254u = new d(0);

    /* renamed from: d, reason: collision with root package name */
    public final x f13258d;

    /* renamed from: e, reason: collision with root package name */
    public final a.a f13259e;
    public final float j;

    /* renamed from: m, reason: collision with root package name */
    public g f13266m;

    /* renamed from: n, reason: collision with root package name */
    public float f13267n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f13268o;

    /* renamed from: a, reason: collision with root package name */
    public float f13255a = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    public float f13256b = Float.MAX_VALUE;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13257c = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f13260f = false;

    /* renamed from: g, reason: collision with root package name */
    public final float f13261g = Float.MAX_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public final float f13262h = -3.4028235E38f;

    /* renamed from: i, reason: collision with root package name */
    public long f13263i = 0;

    /* renamed from: k, reason: collision with root package name */
    public final ArrayList f13264k = new ArrayList();

    /* renamed from: l, reason: collision with root package name */
    public final ArrayList f13265l = new ArrayList();

    public f(x xVar, a.a aVar) {
        this.f13258d = xVar;
        this.f13259e = aVar;
        if (aVar == f13251r || aVar == f13252s || aVar == f13253t) {
            this.j = 0.1f;
        } else if (aVar == f13254u) {
            this.j = 0.00390625f;
        } else if (aVar == f13249p || aVar == f13250q) {
            this.j = 0.002f;
        } else {
            this.j = 1.0f;
        }
        this.f13266m = null;
        this.f13267n = Float.MAX_VALUE;
        this.f13268o = false;
    }

    public static c b() {
        ThreadLocal threadLocal = c.f13237i;
        if (threadLocal.get() == null) {
            threadLocal.set(new c(new b(0)));
        }
        return (c) threadLocal.get();
    }

    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object, q5.a] */
    public final void a(float f10) {
        if (this.f13260f) {
            this.f13267n = f10;
            return;
        }
        if (this.f13266m == null) {
            this.f13266m = new g(f10);
        }
        g gVar = this.f13266m;
        double d10 = f10;
        gVar.f13277i = d10;
        double d11 = (float) d10;
        if (d11 > this.f13261g) {
            throw new UnsupportedOperationException("Final position of the spring cannot be greater than the max value.");
        }
        if (d11 < this.f13262h) {
            throw new UnsupportedOperationException("Final position of the spring cannot be less than the min value.");
        }
        double dAbs = Math.abs(this.j * 0.75f);
        gVar.f13272d = dAbs;
        gVar.f13273e = dAbs * 62.5d;
        b bVar = b().f13242e;
        bVar.getClass();
        if (Thread.currentThread() != ((Looper) bVar.f13236c).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        boolean z2 = this.f13260f;
        if (z2 || z2) {
            return;
        }
        this.f13260f = true;
        if (!this.f13257c) {
            this.f13256b = this.f13259e.F(this.f13258d);
        }
        float f11 = this.f13256b;
        if (f11 > this.f13261g || f11 < this.f13262h) {
            throw new IllegalArgumentException("Starting value need to be in between min value and max value");
        }
        c cVarB = b();
        ArrayList arrayList = cVarB.f13239b;
        if (arrayList.size() == 0) {
            ((Choreographer) cVarB.f13242e.f13235b).postFrameCallback(new y(1, cVarB.f13241d));
            if (Build.VERSION.SDK_INT >= 33) {
                cVarB.f13244g = ValueAnimator.getDurationScale();
                if (cVarB.f13245h == null) {
                    cVarB.f13245h = new j(cVarB);
                }
                final j jVar = cVarB.f13245h;
                if (((a) jVar.f15363b) == null) {
                    ?? r12 = new ValueAnimator.DurationScaleChangeListener() { // from class: q5.a
                        @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                        public final void onChanged(float f12) {
                            ((c) jVar.f15364c).f13244g = f12;
                        }
                    };
                    jVar.f15363b = r12;
                    ValueAnimator.registerDurationScaleChangeListener(r12);
                }
            }
        }
        if (arrayList.contains(this)) {
            return;
        }
        arrayList.add(this);
    }

    public final void c(float f10) {
        this.f13259e.X(this.f13258d, f10);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f13265l;
            if (i10 >= arrayList.size()) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    if (arrayList.get(size) == null) {
                        arrayList.remove(size);
                    }
                }
                return;
            }
            if (arrayList.get(i10) != null) {
                ((l) arrayList.get(i10)).getClass();
                throw null;
            }
            i10++;
        }
    }

    public final void d() {
        if (this.f13266m.f13270b <= 0.0d) {
            throw new UnsupportedOperationException("Spring animations can only come to an end when there is damping");
        }
        b bVar = b().f13242e;
        bVar.getClass();
        if (Thread.currentThread() != ((Looper) bVar.f13236c).getThread()) {
            throw new AndroidRuntimeException("Animations may only be started on the same thread as the animation handler");
        }
        if (this.f13260f) {
            this.f13268o = true;
        }
    }
}
