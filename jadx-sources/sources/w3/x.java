package w3;

import a2.f0;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import androidx.lifecycle.r0;
import c1.y2;
import com.anonlab.voidlauncher.R;
import f1.i0;
import f1.j1;
import f1.t1;
import java.util.UUID;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x extends w2.a {
    public ej.a C;
    public d0 D;
    public String E;
    public final View F;
    public final boolean G;
    public final b0 H;
    public final WindowManager I;
    public final WindowManager.LayoutParams J;
    public c0 K;
    public s3.m L;
    public final j1 M;
    public final j1 N;
    public s3.k O;
    public final f1.y P;
    public final Rect Q;
    public final t1.v R;
    public j6.l S;
    public final j1 T;
    public boolean U;
    public final int[] V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(ej.a aVar, d0 d0Var, String str, View view, s3.c cVar, c0 c0Var, UUID uuid, boolean z2) {
        super(view.getContext());
        int i10 = Build.VERSION.SDK_INT;
        b0 a0Var = i10 >= 30 ? new a0() : i10 >= 29 ? new y() : new b0();
        this.C = aVar;
        this.D = d0Var;
        this.E = str;
        this.F = view;
        this.G = z2;
        this.H = a0Var;
        Object systemService = view.getContext().getSystemService("window");
        fj.l.d(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.I = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        d0 d0Var2 = this.D;
        boolean zB = m.b(view);
        boolean z10 = d0Var2.f18491b;
        int i11 = d0Var2.f18490a;
        if (z10 && zB) {
            i11 |= 8192;
        } else if (z10 && !zB) {
            i11 &= -8193;
        }
        layoutParams.flags = i11;
        layoutParams.type = this.D.f18495f;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.J = layoutParams;
        this.K = c0Var;
        this.L = s3.m.f14752a;
        this.M = f1.s.A(null);
        this.N = f1.s.A(null);
        this.P = f1.s.q(new f0(this, 18));
        this.Q = new Rect();
        this.R = new t1.v(new j(this, 2));
        setId(android.R.id.content);
        r0.i(this, r0.e(view));
        r0.j(this, r0.f(view));
        uk.c.P(this, uk.c.C(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(cVar.w0((float) 8));
        setOutlineProvider(new y2(4));
        this.T = f1.s.A(s.f18535a);
        this.V = new int[2];
    }

    private final ej.e getContent() {
        return (ej.e) this.T.getValue();
    }

    private final s3.k getDisplayBounds() {
        int i10 = this.D.f18490a & 512;
        View view = this.F;
        b0 b0Var = this.H;
        Rect rect = this.Q;
        if (i10 == 0) {
            b0Var.getClass();
            view.getWindowVisibleDisplayFrame(rect);
        } else {
            b0Var.a(view, rect);
        }
        return new s3.k(rect.left, rect.top, rect.right, rect.bottom);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final t2.w getParentLayoutCoordinates() {
        return (t2.w) this.N.getValue();
    }

    private final void setContent(ej.e eVar) {
        this.T.setValue(eVar);
    }

    private final void setParentLayoutCoordinates(t2.w wVar) {
        this.N.setValue(wVar);
    }

    @Override // w2.a
    public final void a(int i10, i0 i0Var) {
        i0Var.c0(-857613600);
        int i11 = (i0Var.h(this) ? 4 : 2) | i10;
        if (i0Var.T(i11 & 1, (i11 & 3) != 2)) {
            getContent().invoke(i0Var, 0);
        } else {
            i0Var.W();
        }
        t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new s.f(this, i10, 7);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!this.D.f18492c) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                ej.a aVar = this.C;
                if (aVar != null) {
                    aVar.a();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // w2.a
    public final void g(boolean z2, int i10, int i11, int i12, int i13) {
        super.g(z2, i10, i11, i12, i13);
        this.D.getClass();
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int measuredWidth = childAt.getMeasuredWidth();
        WindowManager.LayoutParams layoutParams = this.J;
        layoutParams.width = measuredWidth;
        layoutParams.height = childAt.getMeasuredHeight();
        this.H.getClass();
        this.I.updateViewLayout(this, layoutParams);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.P.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui() {
        return this.J;
    }

    public final s3.m getParentLayoutDirection() {
        return this.L;
    }

    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final s3.l m18getPopupContentSizebOM6tXw() {
        return (s3.l) this.M.getValue();
    }

    public final c0 getPositionProvider() {
        return this.K;
    }

    @Override // w2.a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.U;
    }

    public final String getTestTag() {
        return this.E;
    }

    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    @Override // w2.a
    public final void h(int i10, int i11) {
        this.D.getClass();
        s3.k displayBounds = getDisplayBounds();
        super.h(View.MeasureSpec.makeMeasureSpec(displayBounds.c(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(displayBounds.a(), Integer.MIN_VALUE));
    }

    public final void n(f1.p pVar, ej.e eVar) {
        setParentCompositionContext(pVar);
        setContent(eVar);
        this.U = true;
    }

    public final void o(ej.a aVar, d0 d0Var, String str, s3.m mVar) {
        int i10;
        this.C = aVar;
        this.E = str;
        if (!fj.l.b(this.D, d0Var)) {
            d0Var.getClass();
            this.D = d0Var;
            boolean zB = m.b(this.F);
            boolean z2 = d0Var.f18491b;
            int i11 = d0Var.f18490a;
            if (z2 && zB) {
                i11 |= 8192;
            } else if (z2 && !zB) {
                i11 &= -8193;
            }
            WindowManager.LayoutParams layoutParams = this.J;
            layoutParams.flags = i11;
            this.H.getClass();
            this.I.updateViewLayout(this, layoutParams);
        }
        int iOrdinal = mVar.ordinal();
        if (iOrdinal != 0) {
            i10 = 1;
            if (iOrdinal != 1) {
                throw new b3.e();
            }
        } else {
            i10 = 0;
        }
        super.setLayoutDirection(i10);
    }

    @Override // w2.a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.R.d();
        if (!this.D.f18492c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.S == null) {
            this.S = new j6.l(this.C, 2);
        }
        p4.b.d(this, this.S);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        t1.v vVar = this.R;
        t1.f fVar = vVar.f15511h;
        if (fVar != null) {
            fVar.a();
        }
        vVar.a();
        if (Build.VERSION.SDK_INT >= 33) {
            p4.b.e(this, this.S);
        }
        this.S = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.D.f18493d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            ej.a aVar = this.C;
            if (aVar != null) {
                aVar.a();
                return true;
            }
        } else {
            if (motionEvent == null || motionEvent.getAction() != 4) {
                return super.onTouchEvent(motionEvent);
            }
            ej.a aVar2 = this.C;
            if (aVar2 != null) {
                aVar2.a();
            }
        }
        return true;
    }

    public final void p() {
        t2.w parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.E()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jI = parentLayoutCoordinates.I();
            long jX = this.G ? parentLayoutCoordinates.X(0L) : parentLayoutCoordinates.x(0L);
            long jRound = (Math.round(Float.intBitsToFloat((int) (jX >> 32))) << 32) | (Math.round(Float.intBitsToFloat((int) (jX & 4294967295L))) & 4294967295L);
            int i10 = (int) (jRound >> 32);
            int i11 = (int) (jRound & 4294967295L);
            s3.k kVar = new s3.k(i10, i11, ((int) (jI >> 32)) + i10, ((int) (jI & 4294967295L)) + i11);
            if (kVar.equals(this.O)) {
                return;
            }
            this.O = kVar;
            r();
        }
    }

    public final void q(t2.w wVar) {
        setParentLayoutCoordinates(wVar);
        p();
    }

    public final void r() {
        s3.l lVarM18getPopupContentSizebOM6tXw;
        s3.k kVar = this.O;
        if (kVar == null || (lVarM18getPopupContentSizebOM6tXw = m18getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j = lVarM18getPopupContentSizebOM6tXw.f14751a;
        s3.k displayBounds = getDisplayBounds();
        long jA = (displayBounds.a() & 4294967295L) | (displayBounds.c() << 32);
        fj.u uVar = new fj.u();
        uVar.f6806a = 0L;
        this.R.c(this, c.f18483z, new w(uVar, this, kVar, jA, j));
        long j4 = uVar.f6806a;
        WindowManager.LayoutParams layoutParams = this.J;
        layoutParams.x = (int) (j4 >> 32);
        layoutParams.y = (int) (j4 & 4294967295L);
        boolean z2 = this.D.f18494e;
        b0 b0Var = this.H;
        if (z2) {
            b0Var.b(this, (int) (jA >> 32), (int) (jA & 4294967295L));
        }
        b0Var.getClass();
        this.I.updateViewLayout(this, layoutParams);
    }

    public final void setParentLayoutDirection(s3.m mVar) {
        this.L = mVar;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m19setPopupContentSizefhxjrPA(s3.l lVar) {
        this.M.setValue(lVar);
    }

    public final void setPositionProvider(c0 c0Var) {
        this.K = c0Var;
    }

    public final void setTestTag(String str) {
        this.E = str;
    }

    public static /* synthetic */ void getParams$ui$annotations() {
    }

    public w2.a getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i10) {
    }
}
