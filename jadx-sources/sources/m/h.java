package m;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.anonlab.voidlauncher.R;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h implements l.n {
    public g A;
    public Drawable B;
    public boolean C;
    public boolean D;
    public boolean E;
    public int F;
    public int G;
    public int H;
    public boolean I;
    public e K;
    public e L;
    public a8.e M;
    public f N;

    /* renamed from: a, reason: collision with root package name */
    public final Context f11099a;

    /* renamed from: b, reason: collision with root package name */
    public Context f11100b;

    /* renamed from: c, reason: collision with root package name */
    public l.h f11101c;

    /* renamed from: d, reason: collision with root package name */
    public final LayoutInflater f11102d;

    /* renamed from: e, reason: collision with root package name */
    public l.m f11103e;

    /* renamed from: z, reason: collision with root package name */
    public ActionMenuView f11105z;

    /* renamed from: f, reason: collision with root package name */
    public final int f11104f = R.layout.abc_action_menu_item_layout;
    public final SparseBooleanArray J = new SparseBooleanArray();
    public final d8.e O = new d8.e(this);

    public h(Context context) {
        this.f11099a = context;
        this.f11102d = LayoutInflater.from(context);
    }

    @Override // l.n
    public final void a(l.h hVar, boolean z2) {
        e();
        e eVar = this.L;
        if (eVar != null && eVar.b()) {
            eVar.f9831i.dismiss();
        }
        l.m mVar = this.f11103e;
        if (mVar != null) {
            mVar.a(hVar, z2);
        }
    }

    @Override // l.n
    public final boolean b(l.i iVar) {
        return false;
    }

    @Override // l.n
    public final boolean c() {
        int size;
        ArrayList arrayListK;
        int i10;
        boolean z2;
        h hVar = this;
        l.h hVar2 = hVar.f11101c;
        if (hVar2 != null) {
            arrayListK = hVar2.k();
            size = arrayListK.size();
        } else {
            size = 0;
            arrayListK = null;
        }
        int i11 = hVar.H;
        int i12 = hVar.G;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ActionMenuView actionMenuView = hVar.f11105z;
        int i13 = 0;
        boolean z10 = false;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            i10 = 2;
            z2 = true;
            if (i13 >= size) {
                break;
            }
            l.i iVar = (l.i) arrayListK.get(i13);
            int i16 = iVar.f9819y;
            if ((i16 & 2) == 2) {
                i14++;
            } else if ((i16 & 1) == 1) {
                i15++;
            } else {
                z10 = true;
            }
            if (hVar.I && iVar.B) {
                i11 = 0;
            }
            i13++;
        }
        if (hVar.D && (z10 || i15 + i14 > i11)) {
            i11--;
        }
        int i17 = i11 - i14;
        SparseBooleanArray sparseBooleanArray = hVar.J;
        sparseBooleanArray.clear();
        int i18 = 0;
        int i19 = 0;
        while (i18 < size) {
            l.i iVar2 = (l.i) arrayListK.get(i18);
            int i20 = iVar2.f9819y;
            boolean z11 = (i20 & 2) == i10 ? z2 : false;
            int i21 = iVar2.f9797b;
            if (z11) {
                View viewD = hVar.d(iVar2, null, actionMenuView);
                viewD.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                int measuredWidth = viewD.getMeasuredWidth();
                i12 -= measuredWidth;
                if (i19 == 0) {
                    i19 = measuredWidth;
                }
                if (i21 != 0) {
                    sparseBooleanArray.put(i21, z2);
                }
                iVar2.d(z2);
            } else if ((i20 & 1) == z2) {
                boolean z12 = sparseBooleanArray.get(i21);
                boolean z13 = ((i17 > 0 || z12) && i12 > 0) ? z2 : false;
                if (z13) {
                    View viewD2 = hVar.d(iVar2, null, actionMenuView);
                    viewD2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    int measuredWidth2 = viewD2.getMeasuredWidth();
                    i12 -= measuredWidth2;
                    if (i19 == 0) {
                        i19 = measuredWidth2;
                    }
                    z13 &= i12 + i19 > 0;
                }
                if (z13 && i21 != 0) {
                    sparseBooleanArray.put(i21, true);
                } else if (z12) {
                    sparseBooleanArray.put(i21, false);
                    for (int i22 = 0; i22 < i18; i22++) {
                        l.i iVar3 = (l.i) arrayListK.get(i22);
                        if (iVar3.f9797b == i21) {
                            if ((iVar3.f9818x & 32) == 32) {
                                i17++;
                            }
                            iVar3.d(false);
                        }
                    }
                }
                if (z13) {
                    i17--;
                }
                iVar2.d(z13);
            } else {
                iVar2.d(false);
                i18++;
                i10 = 2;
                hVar = this;
                z2 = true;
            }
            i18++;
            i10 = 2;
            hVar = this;
            z2 = true;
        }
        return z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r7v4, types: [l.o] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    public final View d(l.i iVar, View view, ActionMenuView actionMenuView) {
        View view2 = iVar.f9820z;
        View view3 = view2 != null ? view2 : null;
        if (view3 == null || ((iVar.f9819y & 8) != 0 && view2 != null)) {
            ActionMenuItemView actionMenuItemView = view instanceof l.o ? (l.o) view : (l.o) this.f11102d.inflate(this.f11104f, (ViewGroup) actionMenuView, false);
            actionMenuItemView.b(iVar);
            ActionMenuItemView actionMenuItemView2 = actionMenuItemView;
            actionMenuItemView2.setItemInvoker(this.f11105z);
            if (this.N == null) {
                this.N = new f(this);
            }
            actionMenuItemView2.setPopupCallback(this.N);
            view3 = actionMenuItemView;
        }
        view3.setVisibility(iVar.B ? 8 : 0);
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        actionMenuView.getClass();
        if (!(layoutParams instanceof j)) {
            view3.setLayoutParams(ActionMenuView.j(layoutParams));
        }
        return view3;
    }

    public final boolean e() {
        ActionMenuView actionMenuView;
        a8.e eVar = this.M;
        if (eVar != null && (actionMenuView = this.f11105z) != null) {
            actionMenuView.removeCallbacks(eVar);
            this.M = null;
            return true;
        }
        e eVar2 = this.K;
        if (eVar2 == null) {
            return false;
        }
        if (eVar2.b()) {
            eVar2.f9831i.dismiss();
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.n
    public final void f() {
        int i10;
        ActionMenuView actionMenuView = this.f11105z;
        ArrayList arrayList = null;
        boolean z2 = false;
        if (actionMenuView != null) {
            l.h hVar = this.f11101c;
            if (hVar != null) {
                hVar.i();
                ArrayList arrayListK = this.f11101c.k();
                int size = arrayListK.size();
                i10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    l.i iVar = (l.i) arrayListK.get(i11);
                    if ((iVar.f9818x & 32) == 32) {
                        View childAt = actionMenuView.getChildAt(i10);
                        l.i itemData = childAt instanceof l.o ? ((l.o) childAt).getItemData() : null;
                        View viewD = d(iVar, childAt, actionMenuView);
                        if (iVar != itemData) {
                            viewD.setPressed(false);
                            viewD.jumpDrawablesToCurrentState();
                        }
                        if (viewD != childAt) {
                            ViewGroup viewGroup = (ViewGroup) viewD.getParent();
                            if (viewGroup != null) {
                                viewGroup.removeView(viewD);
                            }
                            this.f11105z.addView(viewD, i10);
                        }
                        i10++;
                    }
                }
            } else {
                i10 = 0;
            }
            while (i10 < actionMenuView.getChildCount()) {
                if (actionMenuView.getChildAt(i10) == this.A) {
                    i10++;
                } else {
                    actionMenuView.removeViewAt(i10);
                }
            }
        }
        this.f11105z.requestLayout();
        l.h hVar2 = this.f11101c;
        if (hVar2 != null) {
            hVar2.i();
            ArrayList arrayList2 = hVar2.f9784i;
            int size2 = arrayList2.size();
            for (int i12 = 0; i12 < size2; i12++) {
                ((l.i) arrayList2.get(i12)).getClass();
            }
        }
        l.h hVar3 = this.f11101c;
        if (hVar3 != null) {
            hVar3.i();
            arrayList = hVar3.j;
        }
        if (this.D && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z2 = !((l.i) arrayList.get(0)).B;
            } else if (size3 > 0) {
                z2 = true;
            }
        }
        if (z2) {
            if (this.A == null) {
                this.A = new g(this, this.f11099a);
            }
            ViewGroup viewGroup2 = (ViewGroup) this.A.getParent();
            if (viewGroup2 != this.f11105z) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(this.A);
                }
                ActionMenuView actionMenuView2 = this.f11105z;
                g gVar = this.A;
                actionMenuView2.getClass();
                j jVarI = ActionMenuView.i();
                jVarI.f11106a = true;
                actionMenuView2.addView(gVar, jVarI);
            }
        } else {
            g gVar2 = this.A;
            if (gVar2 != null) {
                ViewParent parent = gVar2.getParent();
                ActionMenuView actionMenuView3 = this.f11105z;
                if (parent == actionMenuView3) {
                    actionMenuView3.removeView(this.A);
                }
            }
        }
        this.f11105z.setOverflowReserved(this.D);
    }

    public final boolean g() {
        l.h hVar;
        if (!this.D) {
            return false;
        }
        e eVar = this.K;
        if ((eVar != null && eVar.b()) || (hVar = this.f11101c) == null || this.f11105z == null || this.M != null) {
            return false;
        }
        hVar.i();
        if (hVar.j.isEmpty()) {
            return false;
        }
        a8.e eVar2 = new a8.e(8, this, new e(this, this.f11100b, this.f11101c, this.A));
        this.M = eVar2;
        this.f11105z.post(eVar2);
        return true;
    }

    @Override // l.n
    public final void h(l.m mVar) {
        throw null;
    }

    @Override // l.n
    public final void i(Context context, l.h hVar) {
        this.f11100b = context;
        LayoutInflater.from(context);
        this.f11101c = hVar;
        Resources resources = context.getResources();
        if (!this.E) {
            this.D = true;
        }
        int i10 = 2;
        this.F = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i11 = configuration.screenWidthDp;
        int i12 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i11 > 600 || ((i11 > 960 && i12 > 720) || (i11 > 720 && i12 > 960))) {
            i10 = 5;
        } else if (i11 >= 500 || ((i11 > 640 && i12 > 480) || (i11 > 480 && i12 > 640))) {
            i10 = 4;
        } else if (i11 >= 360) {
            i10 = 3;
        }
        this.H = i10;
        int measuredWidth = this.F;
        if (this.D) {
            if (this.A == null) {
                g gVar = new g(this, this.f11099a);
                this.A = gVar;
                if (this.C) {
                    gVar.setImageDrawable(this.B);
                    this.B = null;
                    this.C = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.A.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.A.getMeasuredWidth();
        } else {
            this.A = null;
        }
        this.G = measuredWidth;
        float f10 = resources.getDisplayMetrics().density;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // l.n
    public final boolean j(l.r rVar) {
        boolean z2;
        if (rVar.hasVisibleItems()) {
            l.r rVar2 = rVar;
            while (true) {
                l.h hVar = rVar2.f9839w;
                if (hVar == this.f11101c) {
                    break;
                }
                rVar2 = (l.r) hVar;
            }
            l.i iVar = rVar2.f9840x;
            ActionMenuView actionMenuView = this.f11105z;
            View view = null;
            if (actionMenuView != null) {
                int childCount = actionMenuView.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = actionMenuView.getChildAt(i10);
                    if ((childAt instanceof l.o) && ((l.o) childAt).getItemData() == iVar) {
                        view = childAt;
                        break;
                    }
                    i10++;
                }
            }
            if (view != null) {
                rVar.f9840x.getClass();
                int size = rVar.f9781f.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size) {
                        z2 = false;
                        break;
                    }
                    MenuItem item = rVar.getItem(i11);
                    if (item.isVisible() && item.getIcon() != null) {
                        z2 = true;
                        break;
                    }
                    i11++;
                }
                e eVar = new e(this, this.f11100b, rVar, view);
                this.L = eVar;
                eVar.f9829g = z2;
                l.j jVar = eVar.f9831i;
                if (jVar != null) {
                    jVar.o(z2);
                }
                e eVar2 = this.L;
                if (!eVar2.b()) {
                    if (eVar2.f9827e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                    }
                    eVar2.d(0, 0, false, false);
                }
                l.m mVar = this.f11103e;
                if (mVar != null) {
                    mVar.c(rVar);
                }
                return true;
            }
        }
        return false;
    }

    @Override // l.n
    public final boolean k(l.i iVar) {
        return false;
    }
}
