package androidx.fragment.app;

import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import com.anonlab.voidlauncher.R;
import fj.l;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import t4.b0;
import t4.l0;
import t4.m1;
import v5.a;
import w5.c0;
import w5.i0;
import w5.n0;
import w5.o0;
import w5.t;
import w5.v;
import w5.w;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class FragmentContainerView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f1046a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f1047b;

    /* renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f1048c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1049d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet) {
        String str;
        super(context, attributeSet, 0);
        l.f(context, "context");
        this.f1046a = new ArrayList();
        this.f1047b = new ArrayList();
        this.f1049d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f17865b, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(0);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    public final void a(View view) {
        if (this.f1047b.contains(view)) {
            this.f1046a.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public final void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        l.f(view, "child");
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if ((tag instanceof t ? (t) tag : null) != null) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    @Override // android.view.ViewGroup, android.view.View
    public final WindowInsets dispatchApplyWindowInsets(WindowInsets windowInsets) {
        m1 m1VarD;
        l.f(windowInsets, "insets");
        m1 m1VarD2 = m1.d(null, windowInsets);
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f1048c;
        if (onApplyWindowInsetsListener != null) {
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(this, windowInsets);
            l.e(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe\u2026lyWindowInsets(v, insets)");
            m1VarD = m1.d(null, windowInsetsOnApplyWindowInsets);
        } else {
            Field field = l0.f15744a;
            WindowInsets windowInsetsC = m1VarD2.c();
            if (windowInsetsC != null) {
                WindowInsets windowInsetsB = b0.b(this, windowInsetsC);
                if (!windowInsetsB.equals(windowInsetsC)) {
                    m1VarD2 = m1.d(this, windowInsetsB);
                }
            }
            m1VarD = m1VarD2;
        }
        if (!m1VarD.f15751a.o()) {
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                l0.b(getChildAt(i10), m1VarD);
            }
        }
        return windowInsets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        l.f(canvas, "canvas");
        if (this.f1049d) {
            ArrayList arrayList = this.f1046a;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                super.drawChild(canvas, (View) obj, getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j) {
        l.f(canvas, "canvas");
        l.f(view, "child");
        if (this.f1049d) {
            ArrayList arrayList = this.f1046a;
            if (!arrayList.isEmpty() && arrayList.contains(view)) {
                return false;
            }
        }
        return super.drawChild(canvas, view, j);
    }

    @Override // android.view.ViewGroup
    public final void endViewTransition(View view) {
        l.f(view, "view");
        this.f1047b.remove(view);
        if (this.f1046a.remove(view)) {
            this.f1049d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends t> F getFragment() {
        w wVar;
        t tVar;
        i0 i0VarL;
        View view = this;
        while (true) {
            wVar = null;
            if (view == null) {
                tVar = null;
                break;
            }
            Object tag = view.getTag(R.id.fragment_container_view_tag);
            tVar = tag instanceof t ? (t) tag : null;
            if (tVar != null) {
                break;
            }
            Object parent = view.getParent();
            view = parent instanceof View ? (View) parent : null;
        }
        if (tVar == null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                }
                if (context instanceof w) {
                    wVar = (w) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (wVar == null) {
                throw new IllegalStateException("View " + this + " is not within a subclass of FragmentActivity.");
            }
            i0VarL = ((v) wVar.M.f449b).f18779z;
        } else {
            if (tVar.N == null || !tVar.D) {
                throw new IllegalStateException("The Fragment " + tVar + " that owns View " + this + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
            }
            i0VarL = tVar.l();
        }
        return (F) i0VarL.B(getId());
    }

    @Override // android.view.View
    public final WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        l.f(windowInsets, "insets");
        return windowInsets;
    }

    @Override // android.view.ViewGroup
    public final void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View childAt = getChildAt(childCount);
                l.e(childAt, "view");
                a(childAt);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void removeView(View view) {
        l.f(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViewAt(int i10) {
        View childAt = getChildAt(i10);
        l.e(childAt, "view");
        a(childAt);
        super.removeViewAt(i10);
    }

    @Override // android.view.ViewGroup
    public final void removeViewInLayout(View view) {
        l.f(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public final void removeViews(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            l.e(childAt, "view");
            a(childAt);
        }
        super.removeViews(i10, i11);
    }

    @Override // android.view.ViewGroup
    public final void removeViewsInLayout(int i10, int i11) {
        int i12 = i10 + i11;
        for (int i13 = i10; i13 < i12; i13++) {
            View childAt = getChildAt(i13);
            l.e(childAt, "view");
            a(childAt);
        }
        super.removeViewsInLayout(i10, i11);
    }

    public final void setDrawDisappearingViewsLast(boolean z2) {
        this.f1049d = z2;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener) {
        this.f1048c = onApplyWindowInsetsListener;
    }

    @Override // android.view.ViewGroup
    public final void startViewTransition(View view) {
        l.f(view, "view");
        if (view.getParent() == this) {
            this.f1047b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentContainerView(Context context, AttributeSet attributeSet, i0 i0Var) {
        View view;
        super(context, attributeSet);
        l.f(context, "context");
        l.f(attributeSet, "attrs");
        this.f1046a = new ArrayList();
        this.f1047b = new ArrayList();
        this.f1049d = true;
        String classAttribute = attributeSet.getClassAttribute();
        int i10 = 0;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a.f17865b, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(0) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(1);
        typedArrayObtainStyledAttributes.recycle();
        int id2 = getId();
        t tVarB = i0Var.B(id2);
        if (classAttribute != null && tVarB == null) {
            if (id2 == -1) {
                throw new IllegalStateException(t.m1.j("FragmentContainerView must have an android:id to add Fragment ", classAttribute, string != null ? " with tag ".concat(string) : ""));
            }
            c0 c0VarG = i0Var.G();
            context.getClassLoader();
            t tVarA = c0VarG.a(classAttribute);
            l.e(tVarA, "fm.fragmentFactory.insta\u2026ontext.classLoader, name)");
            tVarA.Q = id2;
            tVarA.R = id2;
            tVarA.S = string;
            tVarA.M = i0Var;
            v vVar = i0Var.f18662w;
            tVarA.N = vVar;
            tVarA.X = true;
            if ((vVar == null ? null : vVar.f18776d) != null) {
                tVarA.X = true;
            }
            w5.a aVar = new w5.a(i0Var);
            aVar.f18599o = true;
            tVarA.Y = this;
            tVarA.I = true;
            aVar.f(getId(), tVarA, string, 1);
            if (!aVar.f18592g) {
                i0 i0Var2 = aVar.f18601q;
                if (i0Var2.f18662w != null && !i0Var2.J) {
                    i0Var2.y(true);
                    w5.a aVar2 = i0Var2.f18648h;
                    if (aVar2 != null) {
                        aVar2.f18602r = false;
                        aVar2.d();
                        if (i0.J(3)) {
                            Log.d("FragmentManager", "Reversing mTransitioningOp " + i0Var2.f18648h + " as part of execSingleAction for action " + aVar);
                        }
                        i0Var2.f18648h.e(false, false);
                        i0Var2.f18648h.a(i0Var2.L, i0Var2.M);
                        ArrayList arrayList = i0Var2.f18648h.f18586a;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj = arrayList.get(i11);
                            i11++;
                            t tVar = ((o0) obj).f18704b;
                            if (tVar != null) {
                                tVar.F = false;
                            }
                        }
                        i0Var2.f18648h = null;
                    }
                    aVar.a(i0Var2.L, i0Var2.M);
                    i0Var2.f18642b = true;
                    try {
                        i0Var2.U(i0Var2.L, i0Var2.M);
                        i0Var2.d();
                        i0Var2.f0();
                        if (i0Var2.K) {
                            i0Var2.K = false;
                            i0Var2.d0();
                        }
                        ((HashMap) i0Var2.f18643c.f216b).values().removeAll(Collections.singleton(null));
                    } catch (Throwable th2) {
                        i0Var2.d();
                        throw th2;
                    }
                }
            } else {
                throw new IllegalStateException("This transaction is already being added to the back stack");
            }
        }
        ArrayList arrayListX = i0Var.f18643c.x();
        int size2 = arrayListX.size();
        while (i10 < size2) {
            Object obj2 = arrayListX.get(i10);
            i10++;
            n0 n0Var = (n0) obj2;
            t tVar2 = n0Var.f18698c;
            if (tVar2.R == getId() && (view = tVar2.Z) != null && view.getParent() == null) {
                tVar2.Y = this;
                n0Var.b();
                n0Var.k();
            }
        }
    }
}
