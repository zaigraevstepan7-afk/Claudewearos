package p0;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b0.r;
import b0.t1;
import f1.i0;
import f1.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    public static final p f12635a = new p();

    public final void a(Drawable drawable, i0 i0Var, int i10) {
        i0Var.c0(257732500);
        int i11 = (i0Var.h(drawable) ? 4 : 2) | i10;
        if (i0Var.T(i11 & 1, (i11 & 3) != 2)) {
            v1.o oVarK = t1.k(w.e.j, v1.l.f17564b);
            boolean zH = i0Var.h(drawable);
            Object objQ = i0Var.Q();
            if (zH || objQ == f1.m.f6385a) {
                objQ = new ab.k(drawable, 27);
                i0Var.l0(objQ);
            }
            r.a(z1.h.e(oVarK, (ej.c) objQ), i0Var, 0);
        } else {
            i0Var.W();
        }
        f1.t1 t1VarU = i0Var.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ab.g(this, i10, 20, drawable);
        }
    }

    public final void b(final Icon icon, i0 i0Var, final int i10) {
        f1.t1 t1VarU;
        ej.e eVar;
        i0Var.c0(2116504409);
        int i11 = (i0Var.h(icon) ? 4 : 2) | i10;
        if (i0Var.T(i11 & 1, (i11 & 19) != 18)) {
            Context context = (Context) i0Var.j(AndroidCompositionLocals_androidKt.f838b);
            boolean zF = i0Var.f(icon) | i0Var.f(context);
            Object objQ = i0Var.Q();
            if (zF || objQ == f1.m.f6385a) {
                objQ = icon.loadDrawable(context);
                i0Var.l0(objQ);
            }
            Drawable drawable = (Drawable) objQ;
            if (drawable == null) {
                t1VarU = i0Var.u();
                if (t1VarU != null) {
                    final int i12 = 0;
                    eVar = new ej.e(this, icon, i10, i12) { // from class: p0.o

                        /* renamed from: a, reason: collision with root package name */
                        public final /* synthetic */ int f12632a;

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ p f12633b;

                        /* renamed from: c, reason: collision with root package name */
                        public final /* synthetic */ Icon f12634c;

                        {
                            this.f12632a = i12;
                            this.f12633b = this;
                        }

                        @Override // ej.e
                        public final Object invoke(Object obj, Object obj2) {
                            int i13 = this.f12632a;
                            i0 i0Var2 = (i0) obj;
                            ((Integer) obj2).getClass();
                            switch (i13) {
                                case 0:
                                    this.f12633b.b(this.f12634c, i0Var2, s.O(49));
                                    break;
                                default:
                                    this.f12633b.b(this.f12634c, i0Var2, s.O(49));
                                    break;
                            }
                            return pi.o.f13011a;
                        }
                    };
                    t1VarU.f6456d = eVar;
                }
                return;
            }
            a(drawable, i0Var, 48);
        } else {
            i0Var.W();
        }
        t1VarU = i0Var.u();
        if (t1VarU != null) {
            final int i13 = 1;
            eVar = new ej.e(this, icon, i10, i13) { // from class: p0.o

                /* renamed from: a, reason: collision with root package name */
                public final /* synthetic */ int f12632a;

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ p f12633b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ Icon f12634c;

                {
                    this.f12632a = i13;
                    this.f12633b = this;
                }

                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    int i132 = this.f12632a;
                    i0 i0Var2 = (i0) obj;
                    ((Integer) obj2).getClass();
                    switch (i132) {
                        case 0:
                            this.f12633b.b(this.f12634c, i0Var2, s.O(49));
                            break;
                        default:
                            this.f12633b.b(this.f12634c, i0Var2, s.O(49));
                            break;
                    }
                    return pi.o.f13011a;
                }
            };
            t1VarU.f6456d = eVar;
        }
    }
}
