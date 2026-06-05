package c1;

import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import com.anonlab.voidlauncher.R;
import java.util.UUID;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c3 extends c.o {
    public final View A;
    public final x2 B;

    /* renamed from: e, reason: collision with root package name */
    public ej.a f1962e;

    /* renamed from: f, reason: collision with root package name */
    public w3 f1963f;

    /* renamed from: z, reason: collision with root package name */
    public long f1964z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(ej.a aVar, w3 w3Var, long j, View view, s3.m mVar, s3.c cVar, UUID uuid, t.c cVar2, qj.z zVar) {
        super(new ContextThemeWrapper(view.getContext(), R.style.EdgeToEdgeFloatingDialogWindowTheme), 0);
        boolean z2 = false;
        this.f1962e = aVar;
        this.f1963f = w3Var;
        this.f1964z = j;
        this.A = view;
        float f10 = 8;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        wd.a.N(window, false);
        x2 x2Var = new x2(getContext());
        x2Var.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        x2Var.setClipChildren(false);
        x2Var.setElevation(cVar.w0(f10));
        x2Var.setOutlineProvider(new y2(0));
        this.B = x2Var;
        setContentView(x2Var);
        androidx.lifecycle.r0.i(x2Var, androidx.lifecycle.r0.e(view));
        androidx.lifecycle.r0.j(x2Var, androidx.lifecycle.r0.f(view));
        uk.c.P(x2Var, uk.c.C(view));
        e(this.f1962e, this.f1963f, this.f1964z, mVar);
        p7.k kVar = new p7.k(window.getDecorView());
        int i10 = Build.VERSION.SDK_INT;
        yd.f p1Var = i10 >= 35 ? new t4.p1(window, kVar) : i10 >= 30 ? new t4.o1(window, kVar) : new t4.n1(window, kVar);
        this.f1963f.getClass();
        long j4 = this.f1964z;
        long j10 = c2.w.f3057g;
        p1Var.f0(!c2.w.d(j4, j10) && ((double) c2.e0.w(j4)) <= 0.5d);
        this.f1963f.getClass();
        if (!c2.w.d(this.f1964z, j10) && c2.e0.w(r10) <= 0.5d) {
            z2 = true;
        }
        p1Var.e0(z2);
        a().a(this, new b3(this.f1963f.f2822b, zVar, cVar2, new a7.e(this, 3)));
    }

    public final void e(ej.a aVar, w3 w3Var, long j, s3.m mVar) {
        this.f1962e = aVar;
        this.f1963f = w3Var;
        this.f1964z = j;
        w3.e0 e0Var = w3Var.f2821a;
        ViewGroup.LayoutParams layoutParams = this.A.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        int i10 = 1;
        boolean z2 = (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
        int iOrdinal = e0Var.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                z2 = true;
            } else {
                if (iOrdinal != 2) {
                    throw new b3.e();
                }
                z2 = false;
            }
        }
        Window window = getWindow();
        fj.l.c(window);
        window.setFlags(z2 ? 8192 : -8193, 8192);
        int iOrdinal2 = mVar.ordinal();
        if (iOrdinal2 == 0) {
            i10 = 0;
        } else if (iOrdinal2 != 1) {
            throw new b3.e();
        }
        this.B.setLayoutDirection(i10);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        Window window3 = getWindow();
        if (window3 != null) {
            window3.setSoftInputMode(Build.VERSION.SDK_INT >= 30 ? 48 : 16);
        }
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (zOnTouchEvent) {
            this.f1962e.a();
        }
        return zOnTouchEvent;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
