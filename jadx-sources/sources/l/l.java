package l;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.anonlab.voidlauncher.R;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final Context f9823a;

    /* renamed from: b, reason: collision with root package name */
    public final h f9824b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f9825c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9826d;

    /* renamed from: e, reason: collision with root package name */
    public View f9827e;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9829g;

    /* renamed from: h, reason: collision with root package name */
    public m f9830h;

    /* renamed from: i, reason: collision with root package name */
    public j f9831i;
    public PopupWindow.OnDismissListener j;

    /* renamed from: f, reason: collision with root package name */
    public int f9828f = 8388611;

    /* renamed from: k, reason: collision with root package name */
    public final k f9832k = new k(this);

    public l(Context context, h hVar, View view, boolean z2, int i10, int i11) {
        this.f9823a = context;
        this.f9824b = hVar;
        this.f9827e = view;
        this.f9825c = z2;
        this.f9826d = i10;
    }

    public final j a() {
        j qVar;
        if (this.f9831i == null) {
            Context context = this.f9823a;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            if (Math.min(point.x, point.y) >= context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width)) {
                qVar = new e(context, this.f9827e, this.f9826d, this.f9825c);
            } else {
                qVar = new q(this.f9823a, this.f9824b, this.f9827e, this.f9826d, this.f9825c);
            }
            qVar.l(this.f9824b);
            qVar.r(this.f9832k);
            qVar.n(this.f9827e);
            qVar.h(this.f9830h);
            qVar.o(this.f9829g);
            qVar.p(this.f9828f);
            this.f9831i = qVar;
        }
        return this.f9831i;
    }

    public final boolean b() {
        j jVar = this.f9831i;
        return jVar != null && jVar.d();
    }

    public void c() {
        this.f9831i = null;
        PopupWindow.OnDismissListener onDismissListener = this.j;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final void d(int i10, int i11, boolean z2, boolean z10) {
        j jVarA = a();
        jVarA.s(z10);
        if (z2) {
            if ((Gravity.getAbsoluteGravity(this.f9828f, this.f9827e.getLayoutDirection()) & 7) == 5) {
                i10 -= this.f9827e.getWidth();
            }
            jVarA.q(i10);
            jVarA.t(i11);
            int i12 = (int) ((this.f9823a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            jVarA.f9821a = new Rect(i10 - i12, i11 - i12, i10 + i12, i11 + i12);
        }
        jVarA.e();
    }
}
