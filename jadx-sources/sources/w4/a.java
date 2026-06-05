package w4;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.animation.PathInterpolator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final int f18551a;

    /* renamed from: b, reason: collision with root package name */
    public final b f18552b;

    /* renamed from: c, reason: collision with root package name */
    public l4.b f18553c;

    /* renamed from: d, reason: collision with root package name */
    public l4.b f18554d;

    /* renamed from: e, reason: collision with root package name */
    public c f18555e;

    /* renamed from: f, reason: collision with root package name */
    public final ColorDrawable f18556f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f18557g;

    /* renamed from: h, reason: collision with root package name */
    public int f18558h;

    static {
        new PathInterpolator(0.0f, 0.0f, 0.0f, 1.0f);
        new PathInterpolator(0.6f, 0.0f, 1.0f, 1.0f);
        new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);
        new PathInterpolator(0.4f, 0.0f, 1.0f, 1.0f);
    }

    public a(int i10, int i11) {
        b bVar = new b();
        bVar.f18559a = -1;
        bVar.f18560b = -1;
        l4.b bVar2 = l4.b.f9966e;
        bVar.f18561c = bVar2;
        bVar.f18562d = false;
        bVar.f18563e = null;
        bVar.f18564f = 0.0f;
        bVar.f18565g = 0.0f;
        bVar.f18566h = 1.0f;
        this.f18552b = bVar;
        this.f18553c = bVar2;
        this.f18554d = bVar2;
        this.f18555e = null;
        if (i10 != 1 && i10 != 2 && i10 != 4 && i10 != 8) {
            throw new IllegalArgumentException(m6.a.d(i10, "Unexpected side: "));
        }
        this.f18551a = i10;
        ColorDrawable colorDrawable = new ColorDrawable();
        this.f18556f = colorDrawable;
        this.f18558h = 0;
        this.f18557g = true;
        if (i11 != 0) {
            this.f18558h = i11;
            colorDrawable.setColor(i11);
            bVar.f18563e = colorDrawable;
            qh.c cVar = bVar.f18567i;
            if (cVar != null) {
                ((View) cVar.f13508c).setBackground(colorDrawable);
            }
        }
    }

    public final void a(float f10) {
        float f11 = f10 * 1.0f;
        b bVar = this.f18552b;
        if (bVar.f18566h != f11) {
            bVar.f18566h = f11;
            qh.c cVar = bVar.f18567i;
            if (cVar != null) {
                ((View) cVar.f13508c).setAlpha(f11);
            }
        }
    }

    public final void b(float f10) {
        float f11 = f10 * 1.0f;
        b bVar = this.f18552b;
        int i10 = this.f18551a;
        if (i10 == 1) {
            float f12 = (-(1.0f - f11)) * bVar.f18559a;
            if (bVar.f18564f != f12) {
                bVar.f18564f = f12;
                qh.c cVar = bVar.f18567i;
                if (cVar != null) {
                    ((View) cVar.f13508c).setTranslationX(f12);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 2) {
            float f13 = (-(1.0f - f11)) * bVar.f18560b;
            if (bVar.f18565g != f13) {
                bVar.f18565g = f13;
                qh.c cVar2 = bVar.f18567i;
                if (cVar2 != null) {
                    ((View) cVar2.f13508c).setTranslationY(f13);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 == 4) {
            float f14 = (1.0f - f11) * bVar.f18559a;
            if (bVar.f18564f != f14) {
                bVar.f18564f = f14;
                qh.c cVar3 = bVar.f18567i;
                if (cVar3 != null) {
                    ((View) cVar3.f13508c).setTranslationX(f14);
                    return;
                }
                return;
            }
            return;
        }
        if (i10 != 8) {
            return;
        }
        float f15 = (1.0f - f11) * bVar.f18560b;
        if (bVar.f18565g != f15) {
            bVar.f18565g = f15;
            qh.c cVar4 = bVar.f18567i;
            if (cVar4 != null) {
                ((View) cVar4.f13508c).setTranslationY(f15);
            }
        }
    }
}
