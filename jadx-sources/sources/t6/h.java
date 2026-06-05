package t6;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import c1.u1;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h extends b0 {

    /* renamed from: s, reason: collision with root package name */
    public static TimeInterpolator f15902s;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15903g;

    /* renamed from: h, reason: collision with root package name */
    public ArrayList f15904h;

    /* renamed from: i, reason: collision with root package name */
    public ArrayList f15905i;
    public ArrayList j;

    /* renamed from: k, reason: collision with root package name */
    public ArrayList f15906k;

    /* renamed from: l, reason: collision with root package name */
    public ArrayList f15907l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f15908m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f15909n;

    /* renamed from: o, reason: collision with root package name */
    public ArrayList f15910o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f15911p;

    /* renamed from: q, reason: collision with root package name */
    public ArrayList f15912q;

    /* renamed from: r, reason: collision with root package name */
    public ArrayList f15913r;

    public static void h(ArrayList arrayList) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((t0) arrayList.get(size)).f16046a.animate().cancel();
        }
    }

    @Override // t6.b0
    public final boolean a(t0 t0Var, t0 t0Var2, u1 u1Var, u1 u1Var2) {
        int i10;
        int i11;
        int i12 = u1Var.f2736a;
        int i13 = u1Var.f2737b;
        if (t0Var2.o()) {
            int i14 = u1Var.f2736a;
            i11 = u1Var.f2737b;
            i10 = i14;
        } else {
            i10 = u1Var2.f2736a;
            i11 = u1Var2.f2737b;
        }
        if (t0Var == t0Var2) {
            return g(t0Var, i12, i13, i10, i11);
        }
        View view = t0Var.f16046a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        l(t0Var);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        View view2 = t0Var2.f16046a;
        l(t0Var2);
        view2.setTranslationX(-((int) ((i10 - i12) - translationX)));
        view2.setTranslationY(-((int) ((i11 - i13) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList arrayList = this.f15906k;
        f fVar = new f();
        fVar.f15887a = t0Var;
        fVar.f15888b = t0Var2;
        fVar.f15889c = i12;
        fVar.f15890d = i13;
        fVar.f15891e = i10;
        fVar.f15892f = i11;
        arrayList.add(fVar);
        return true;
    }

    @Override // t6.b0
    public final void d(t0 t0Var) {
        ArrayList arrayList = this.f15907l;
        ArrayList arrayList2 = this.f15908m;
        ArrayList arrayList3 = this.f15909n;
        View view = t0Var.f16046a;
        view.animate().cancel();
        ArrayList arrayList4 = this.j;
        int size = arrayList4.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (((g) arrayList4.get(size)).f15897a == t0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                c(t0Var);
                arrayList4.remove(size);
            }
        }
        j(this.f15906k, t0Var);
        if (this.f15904h.remove(t0Var)) {
            view.setAlpha(1.0f);
            c(t0Var);
        }
        if (this.f15905i.remove(t0Var)) {
            view.setAlpha(1.0f);
            c(t0Var);
        }
        for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
            ArrayList arrayList5 = (ArrayList) arrayList3.get(size2);
            j(arrayList5, t0Var);
            if (arrayList5.isEmpty()) {
                arrayList3.remove(size2);
            }
        }
        for (int size3 = arrayList2.size() - 1; size3 >= 0; size3--) {
            ArrayList arrayList6 = (ArrayList) arrayList2.get(size3);
            int size4 = arrayList6.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                }
                if (((g) arrayList6.get(size4)).f15897a == t0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    c(t0Var);
                    arrayList6.remove(size4);
                    if (arrayList6.isEmpty()) {
                        arrayList2.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = arrayList.size() - 1; size5 >= 0; size5--) {
            ArrayList arrayList7 = (ArrayList) arrayList.get(size5);
            if (arrayList7.remove(t0Var)) {
                view.setAlpha(1.0f);
                c(t0Var);
                if (arrayList7.isEmpty()) {
                    arrayList.remove(size5);
                }
            }
        }
        this.f15912q.remove(t0Var);
        this.f15910o.remove(t0Var);
        this.f15913r.remove(t0Var);
        this.f15911p.remove(t0Var);
        i();
    }

    @Override // t6.b0
    public final void e() {
        ArrayList arrayList = this.f15909n;
        ArrayList arrayList2 = this.f15907l;
        ArrayList arrayList3 = this.f15908m;
        ArrayList arrayList4 = this.f15906k;
        ArrayList arrayList5 = this.f15905i;
        ArrayList arrayList6 = this.f15904h;
        ArrayList arrayList7 = this.j;
        int size = arrayList7.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            g gVar = (g) arrayList7.get(size);
            View view = gVar.f15897a.f16046a;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            c(gVar.f15897a);
            arrayList7.remove(size);
        }
        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
            c((t0) arrayList6.get(size2));
            arrayList6.remove(size2);
        }
        int size3 = arrayList5.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            t0 t0Var = (t0) arrayList5.get(size3);
            t0Var.f16046a.setAlpha(1.0f);
            c(t0Var);
            arrayList5.remove(size3);
        }
        for (int size4 = arrayList4.size() - 1; size4 >= 0; size4--) {
            f fVar = (f) arrayList4.get(size4);
            t0 t0Var2 = fVar.f15887a;
            if (t0Var2 != null) {
                k(fVar, t0Var2);
            }
            t0 t0Var3 = fVar.f15888b;
            if (t0Var3 != null) {
                k(fVar, t0Var3);
            }
        }
        arrayList4.clear();
        if (f()) {
            for (int size5 = arrayList3.size() - 1; size5 >= 0; size5--) {
                ArrayList arrayList8 = (ArrayList) arrayList3.get(size5);
                for (int size6 = arrayList8.size() - 1; size6 >= 0; size6--) {
                    g gVar2 = (g) arrayList8.get(size6);
                    View view2 = gVar2.f15897a.f16046a;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    c(gVar2.f15897a);
                    arrayList8.remove(size6);
                    if (arrayList8.isEmpty()) {
                        arrayList3.remove(arrayList8);
                    }
                }
            }
            for (int size7 = arrayList2.size() - 1; size7 >= 0; size7--) {
                ArrayList arrayList9 = (ArrayList) arrayList2.get(size7);
                for (int size8 = arrayList9.size() - 1; size8 >= 0; size8--) {
                    t0 t0Var4 = (t0) arrayList9.get(size8);
                    t0Var4.f16046a.setAlpha(1.0f);
                    c(t0Var4);
                    arrayList9.remove(size8);
                    if (arrayList9.isEmpty()) {
                        arrayList2.remove(arrayList9);
                    }
                }
            }
            for (int size9 = arrayList.size() - 1; size9 >= 0; size9--) {
                ArrayList arrayList10 = (ArrayList) arrayList.get(size9);
                for (int size10 = arrayList10.size() - 1; size10 >= 0; size10--) {
                    f fVar2 = (f) arrayList10.get(size10);
                    t0 t0Var5 = fVar2.f15887a;
                    if (t0Var5 != null) {
                        k(fVar2, t0Var5);
                    }
                    t0 t0Var6 = fVar2.f15888b;
                    if (t0Var6 != null) {
                        k(fVar2, t0Var6);
                    }
                    if (arrayList10.isEmpty()) {
                        arrayList.remove(arrayList10);
                    }
                }
            }
            h(this.f15912q);
            h(this.f15911p);
            h(this.f15910o);
            h(this.f15913r);
            ArrayList arrayList11 = this.f15833b;
            if (arrayList11.size() > 0) {
                arrayList11.get(0).getClass();
                throw new ClassCastException();
            }
            arrayList11.clear();
        }
    }

    @Override // t6.b0
    public final boolean f() {
        return (this.f15905i.isEmpty() && this.f15906k.isEmpty() && this.j.isEmpty() && this.f15904h.isEmpty() && this.f15911p.isEmpty() && this.f15912q.isEmpty() && this.f15910o.isEmpty() && this.f15913r.isEmpty() && this.f15908m.isEmpty() && this.f15907l.isEmpty() && this.f15909n.isEmpty()) ? false : true;
    }

    public final boolean g(t0 t0Var, int i10, int i11, int i12, int i13) {
        View view = t0Var.f16046a;
        int translationX = i10 + ((int) view.getTranslationX());
        int translationY = i11 + ((int) t0Var.f16046a.getTranslationY());
        l(t0Var);
        int i14 = i12 - translationX;
        int i15 = i13 - translationY;
        if (i14 == 0 && i15 == 0) {
            c(t0Var);
            return false;
        }
        if (i14 != 0) {
            view.setTranslationX(-i14);
        }
        if (i15 != 0) {
            view.setTranslationY(-i15);
        }
        ArrayList arrayList = this.j;
        g gVar = new g();
        gVar.f15897a = t0Var;
        gVar.f15898b = translationX;
        gVar.f15899c = translationY;
        gVar.f15900d = i12;
        gVar.f15901e = i13;
        arrayList.add(gVar);
        return true;
    }

    public final void i() {
        if (f()) {
            return;
        }
        ArrayList arrayList = this.f15833b;
        if (arrayList.size() <= 0) {
            arrayList.clear();
        } else {
            arrayList.get(0).getClass();
            throw new ClassCastException();
        }
    }

    public final void j(ArrayList arrayList, t0 t0Var) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f fVar = (f) arrayList.get(size);
            if (k(fVar, t0Var) && fVar.f15887a == null && fVar.f15888b == null) {
                arrayList.remove(fVar);
            }
        }
    }

    public final boolean k(f fVar, t0 t0Var) {
        if (fVar.f15888b == t0Var) {
            fVar.f15888b = null;
        } else {
            if (fVar.f15887a != t0Var) {
                return false;
            }
            fVar.f15887a = null;
        }
        View view = t0Var.f16046a;
        View view2 = t0Var.f16046a;
        view.setAlpha(1.0f);
        view2.setTranslationX(0.0f);
        view2.setTranslationY(0.0f);
        c(t0Var);
        return true;
    }

    public final void l(t0 t0Var) {
        if (f15902s == null) {
            f15902s = new ValueAnimator().getInterpolator();
        }
        t0Var.f16046a.animate().setInterpolator(f15902s);
        d(t0Var);
    }
}
