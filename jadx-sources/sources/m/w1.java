package m;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w1 implements l.n {

    /* renamed from: a, reason: collision with root package name */
    public l.h f11199a;

    /* renamed from: b, reason: collision with root package name */
    public l.i f11200b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Toolbar f11201c;

    public w1(Toolbar toolbar) {
        this.f11201c = toolbar;
    }

    @Override // l.n
    public final boolean b(l.i iVar) {
        Toolbar toolbar = this.f11201c;
        toolbar.c();
        ViewParent parent = toolbar.A.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.A);
            }
            toolbar.addView(toolbar.A);
        }
        View view = iVar.f9820z;
        if (view == null) {
            view = null;
        }
        toolbar.B = view;
        this.f11200b = iVar;
        ViewParent parent2 = view.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.B);
            }
            x1 x1VarG = Toolbar.g();
            x1VarG.f11209a = (toolbar.G & 112) | 8388611;
            x1VarG.f11210b = 2;
            toolbar.B.setLayoutParams(x1VarG);
            toolbar.addView(toolbar.B);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((x1) childAt.getLayoutParams()).f11210b != 2 && childAt != toolbar.f812a) {
                toolbar.removeViewAt(childCount);
                toolbar.f813a0.add(childAt);
            }
        }
        toolbar.requestLayout();
        iVar.B = true;
        iVar.f9808n.o(false);
        toolbar.s();
        return true;
    }

    @Override // l.n
    public final boolean c() {
        return false;
    }

    @Override // l.n
    public final void f() {
        if (this.f11200b != null) {
            l.h hVar = this.f11199a;
            if (hVar != null) {
                int size = hVar.f9781f.size();
                for (int i10 = 0; i10 < size; i10++) {
                    if (this.f11199a.getItem(i10) == this.f11200b) {
                        return;
                    }
                }
            }
            k(this.f11200b);
        }
    }

    @Override // l.n
    public final void i(Context context, l.h hVar) {
        l.i iVar;
        l.h hVar2 = this.f11199a;
        if (hVar2 != null && (iVar = this.f11200b) != null) {
            hVar2.d(iVar);
        }
        this.f11199a = hVar;
    }

    @Override // l.n
    public final boolean j(l.r rVar) {
        return false;
    }

    @Override // l.n
    public final boolean k(l.i iVar) {
        Toolbar toolbar = this.f11201c;
        toolbar.removeView(toolbar.B);
        toolbar.removeView(toolbar.A);
        toolbar.B = null;
        ArrayList arrayList = toolbar.f813a0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.f11200b = null;
        toolbar.requestLayout();
        iVar.B = false;
        iVar.f9808n.o(false);
        toolbar.s();
        return true;
    }

    @Override // l.n
    public final void a(l.h hVar, boolean z2) {
    }
}
