package ri;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
import java.util.ConcurrentModificationException;
import t4.l0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public int f14535a;

    /* renamed from: b, reason: collision with root package name */
    public int f14536b;

    /* renamed from: c, reason: collision with root package name */
    public int f14537c;

    /* renamed from: d, reason: collision with root package name */
    public Object f14538d;

    public f() {
        if (ef.f.f5981a == null) {
            ef.f.f5981a = new ef.f();
        }
    }

    public int a(int i10) {
        if (i10 < this.f14537c) {
            return ((ByteBuffer) this.f14538d).getShort(this.f14536b + i10);
        }
        return 0;
    }

    public void b() {
        if (((g) this.f14538d).A != this.f14537c) {
            throw new ConcurrentModificationException();
        }
    }

    public abstract Object c(View view);

    public abstract void d(View view, Object obj);

    public void e() {
        while (true) {
            int i10 = this.f14535a;
            g gVar = (g) this.f14538d;
            if (i10 >= gVar.f14544f || gVar.f14541c[i10] >= 0) {
                return;
            } else {
                this.f14535a = i10 + 1;
            }
        }
    }

    public void f(View view, Object obj) {
        Object tag;
        if (Build.VERSION.SDK_INT >= this.f14536b) {
            d(view, obj);
            return;
        }
        if (Build.VERSION.SDK_INT >= this.f14536b) {
            tag = c(view);
        } else {
            tag = view.getTag(this.f14535a);
            if (!((Class) this.f14538d).isInstance(tag)) {
                tag = null;
            }
        }
        if (g(tag, obj)) {
            View.AccessibilityDelegate accessibilityDelegateC = l0.c(view);
            t4.b bVar = accessibilityDelegateC == null ? null : accessibilityDelegateC instanceof t4.a ? ((t4.a) accessibilityDelegateC).f15691a : new t4.b(accessibilityDelegateC);
            if (bVar == null) {
                bVar = new t4.b();
            }
            l0.l(view, bVar);
            view.setTag(this.f14535a, obj);
            l0.g(view, this.f14537c);
        }
    }

    public abstract boolean g(Object obj, Object obj2);

    public boolean hasNext() {
        return this.f14535a < ((g) this.f14538d).f14544f;
    }

    public void remove() {
        g gVar = (g) this.f14538d;
        b();
        if (this.f14536b == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        gVar.c();
        gVar.l(this.f14536b);
        this.f14536b = -1;
        this.f14537c = gVar.A;
    }
}
