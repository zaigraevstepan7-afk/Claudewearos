package w3;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import androidx.lifecycle.r0;
import c1.y2;
import com.anonlab.voidlauncher.R;
import java.util.UUID;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class v extends c.o {
    public final t A;
    public boolean B;

    /* renamed from: e, reason: collision with root package name */
    public ej.a f18543e;

    /* renamed from: f, reason: collision with root package name */
    public u f18544f;

    /* renamed from: z, reason: collision with root package name */
    public final View f18545z;

    public v(ej.a aVar, u uVar, View view, s3.m mVar, s3.c cVar, UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), uVar.f18540e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0);
        this.f18543e = aVar;
        this.f18544f = uVar;
        this.f18545z = view;
        float f10 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        u uVar2 = this.f18544f;
        Window window2 = getWindow();
        if (window2 != null) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            attributes.type = uVar2.f18542g;
            window2.setAttributes(attributes);
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        wd.a.N(window, this.f18544f.f18540e);
        window.setGravity(17);
        if (!this.f18544f.f18540e) {
            window.addFlags(65792);
            WindowManager.LayoutParams attributes2 = window.getAttributes();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 28) {
                o.f18529a.a(attributes2);
            }
            if (i10 >= 30) {
                p pVar = p.f18530a;
                pVar.b(attributes2, 0);
                pVar.c(attributes2, 0);
            }
            window.setAttributes(attributes2);
        }
        t tVar = new t(getContext(), window);
        setTitle(this.f18544f.f18541f);
        tVar.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        tVar.setClipChildren(false);
        tVar.setElevation(cVar.w0(f10));
        tVar.setOutlineProvider(new y2(3));
        this.A = tVar;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            e(viewGroup);
        }
        setContentView(tVar);
        r0.i(tVar, r0.e(view));
        r0.j(tVar, r0.f(view));
        uk.c.P(tVar, uk.c.C(view));
        f(this.f18543e, this.f18544f, mVar);
        c.b0 b0VarA = a();
        a aVar2 = new a(this, 1);
        fj.l.f(b0VarA, "<this>");
        b0VarA.a(this, new c.c0(aVar2));
    }

    public static final void e(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof t) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                e(viewGroup2);
            }
        }
    }

    public final void f(ej.a aVar, u uVar, s3.m mVar) {
        int i10;
        this.f18543e = aVar;
        this.f18544f = uVar;
        e0 e0Var = uVar.f18538c;
        boolean zB = m.b(this.f18545z);
        int iOrdinal = e0Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zB = true;
            } else {
                if (iOrdinal != 2) {
                    throw new b3.e();
                }
                zB = false;
            }
        }
        Window window = getWindow();
        fj.l.c(window);
        window.setFlags(zB ? 8192 : -8193, 8192);
        int iOrdinal2 = mVar.ordinal();
        if (iOrdinal2 == 0) {
            i10 = 0;
        } else {
            if (iOrdinal2 != 1) {
                throw new b3.e();
            }
            i10 = 1;
        }
        t tVar = this.A;
        tVar.setLayoutDirection(i10);
        boolean z2 = uVar.f18540e;
        boolean z10 = uVar.f18539d;
        Window window2 = tVar.C;
        boolean z11 = (tVar.G && z10 == tVar.E && z2 == tVar.F) ? false : true;
        tVar.E = z10;
        tVar.F = z2;
        if (z11) {
            WindowManager.LayoutParams attributes = window2.getAttributes();
            int i11 = z10 ? -2 : -1;
            if (i11 != attributes.width || !tVar.G) {
                window2.setLayout(i11, -2);
                tVar.G = true;
            }
        }
        setCanceledOnTouchOutside(uVar.f18537b);
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(z2 ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i10, KeyEvent keyEvent) {
        if (!this.f18544f.f18536a || !keyEvent.isTracking() || keyEvent.isCanceled() || i10 != 111) {
            return super.onKeyUp(i10, keyEvent);
        }
        this.f18543e.a();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0086  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = super.onTouchEvent(r10)
            w3.u r1 = r9.f18544f
            boolean r1 = r1.f18537b
            r2 = 3
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L86
            w3.t r1 = r9.A
            r1.getClass()
            float r5 = r10.getX()
            float r5 = java.lang.Math.abs(r5)
            r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L69
            float r5 = r10.getY()
            float r5 = java.lang.Math.abs(r5)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L69
            android.view.View r5 = r1.getChildAt(r3)
            if (r5 != 0) goto L34
            goto L69
        L34:
            int r6 = r1.getLeft()
            int r7 = r5.getLeft()
            int r7 = r7 + r6
            int r6 = r5.getWidth()
            int r6 = r6 + r7
            int r1 = r1.getTop()
            int r8 = r5.getTop()
            int r8 = r8 + r1
            int r1 = r5.getHeight()
            int r1 = r1 + r8
            float r5 = r10.getX()
            int r5 = hj.a.H(r5)
            if (r7 > r5) goto L69
            if (r5 > r6) goto L69
            float r5 = r10.getY()
            int r5 = hj.a.H(r5)
            if (r8 > r5) goto L69
            if (r5 > r1) goto L69
            goto L86
        L69:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L83
            if (r10 == r4) goto L77
            if (r10 == r2) goto L74
            goto L90
        L74:
            r9.B = r3
            return r0
        L77:
            boolean r10 = r9.B
            if (r10 == 0) goto L90
            ej.a r10 = r9.f18543e
            r10.a()
            r9.B = r3
            return r4
        L83:
            r9.B = r4
            return r4
        L86:
            int r10 = r10.getActionMasked()
            if (r10 == 0) goto L91
            if (r10 == r4) goto L91
            if (r10 == r2) goto L91
        L90:
            return r0
        L91:
            r9.B = r3
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: w3.v.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
