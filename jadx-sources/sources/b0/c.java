package b0;

import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1284a;

    public /* synthetic */ c(int i10) {
        this.f1284a = i10;
    }

    public static final a b(int i10, String str) {
        WeakHashMap weakHashMap = f2.f1311w;
        return new a(i10, str);
    }

    public static final c2 d(int i10, String str) {
        WeakHashMap weakHashMap = f2.f1311w;
        return new c2(new u0(0, 0, 0, 0), str);
    }

    public static f2 e(f1.i0 i0Var) {
        View view = (View) i0Var.j(AndroidCompositionLocals_androidKt.f842f);
        f2 f2VarF = f(view);
        boolean zH = i0Var.h(f2VarF) | i0Var.h(view);
        Object objQ = i0Var.Q();
        if (zH || objQ == f1.m.f6385a) {
            objQ = new c1(3, f2VarF, view);
            i0Var.l0(objQ);
        }
        f1.s.c(f2VarF, (ej.c) objQ, i0Var);
        return f2VarF;
    }

    public static f2 f(View view) {
        f2 f2Var;
        WeakHashMap weakHashMap = f2.f1311w;
        synchronized (weakHashMap) {
            try {
                Object f2Var2 = weakHashMap.get(view);
                if (f2Var2 == null) {
                    f2Var2 = new f2(view);
                    weakHashMap.put(view, f2Var2);
                }
                f2Var = (f2) f2Var2;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f2Var;
    }

    @Override // b0.g
    public void c(s3.c cVar, int i10, int[] iArr, s3.m mVar, int[] iArr2) {
        switch (this.f1284a) {
            case 0:
                j.b(iArr, iArr2, false);
                break;
            case 1:
                j.c(i10, iArr, iArr2, false);
                break;
            case 2:
                if (mVar != s3.m.f14752a) {
                    j.b(iArr, iArr2, true);
                    break;
                } else {
                    j.c(i10, iArr, iArr2, false);
                    break;
                }
            default:
                if (mVar != s3.m.f14752a) {
                    j.c(i10, iArr, iArr2, true);
                    break;
                } else {
                    j.b(iArr, iArr2, false);
                    break;
                }
        }
    }

    public String toString() {
        switch (this.f1284a) {
            case 0:
                return "AbsoluteArrangement#Left";
            case 1:
                return "AbsoluteArrangement#Right";
            case 2:
                return "Arrangement#End";
            case 3:
                return "Arrangement#Start";
            default:
                return super.toString();
        }
    }
}
