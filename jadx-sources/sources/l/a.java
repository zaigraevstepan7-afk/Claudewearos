package l;

import android.view.View;
import android.view.ViewConfiguration;
import androidx.appcompat.view.menu.ActionMenuItemView;
import m.v0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a implements View.OnTouchListener, View.OnAttachStateChangeListener {
    public int A;
    public final int[] B;
    public final /* synthetic */ int C;
    public final /* synthetic */ View D;

    /* renamed from: a, reason: collision with root package name */
    public final float f9751a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9752b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9753c;

    /* renamed from: d, reason: collision with root package name */
    public final View f9754d;

    /* renamed from: e, reason: collision with root package name */
    public v0 f9755e;

    /* renamed from: f, reason: collision with root package name */
    public v0 f9756f;

    /* renamed from: z, reason: collision with root package name */
    public boolean f9757z;

    public a(View view) {
        this.B = new int[2];
        this.f9754d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f9751a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f9752b = tapTimeout;
        this.f9753c = (ViewConfiguration.getLongPressTimeout() + tapTimeout) / 2;
    }

    public final void a() {
        v0 v0Var = this.f9756f;
        View view = this.f9754d;
        if (v0Var != null) {
            view.removeCallbacks(v0Var);
        }
        v0 v0Var2 = this.f9755e;
        if (v0Var2 != null) {
            view.removeCallbacks(v0Var2);
        }
    }

    public final j b() {
        m.e eVar;
        switch (this.C) {
            case 0:
                b bVar = ((ActionMenuItemView) this.D).F;
                if (bVar == null || (eVar = ((m.f) bVar).f11082a.L) == null) {
                    return null;
                }
                return eVar.a();
            default:
                m.e eVar2 = ((m.g) this.D).f11091d.K;
                if (eVar2 == null) {
                    return null;
                }
                return eVar2.a();
        }
    }

    public final boolean c() {
        j jVarB;
        switch (this.C) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.D;
                g gVar = actionMenuItemView.D;
                return gVar != null && gVar.a(actionMenuItemView.A) && (jVarB = b()) != null && jVarB.d();
            default:
                ((m.g) this.D).f11091d.g();
                return true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0124  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: l.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.f9757z = false;
        this.A = -1;
        v0 v0Var = this.f9755e;
        if (v0Var != null) {
            this.f9754d.removeCallbacks(v0Var);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(ActionMenuItemView actionMenuItemView) {
        this((View) actionMenuItemView);
        this.C = 0;
        this.D = actionMenuItemView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(m.g gVar, m.g gVar2) {
        this(gVar2);
        this.C = 1;
        this.D = gVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }
}
