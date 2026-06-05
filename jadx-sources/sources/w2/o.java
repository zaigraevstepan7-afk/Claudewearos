package w2;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o extends fj.m implements ej.c {

    /* renamed from: b, reason: collision with root package name */
    public static final o f18336b;

    /* renamed from: c, reason: collision with root package name */
    public static final o f18337c;

    /* renamed from: d, reason: collision with root package name */
    public static final o f18338d;

    /* renamed from: e, reason: collision with root package name */
    public static final o f18339e;

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f18340a;

    static {
        int i10 = 1;
        f18336b = new o(i10, 0);
        f18337c = new o(i10, 1);
        f18338d = new o(i10, 2);
        f18339e = new o(i10, 3);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(int i10, int i11) {
        super(i10);
        this.f18340a = i11;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f18340a) {
            case 0:
                return Boolean.TRUE;
            case 1:
                d3.n nVarK = ((d3.r) obj).k();
                return Boolean.valueOf(nVarK.f4758a.c(d3.v.B));
            case 2:
                f1.v vVar = AndroidCompositionLocals_androidKt.f837a;
                f1.n1 n1Var = (f1.n1) obj;
                n1Var.getClass();
                f1.s.H(n1Var, vVar);
                return ((Context) f1.s.H(n1Var, AndroidCompositionLocals_androidKt.f838b)).getResources();
            default:
                return Boolean.valueOf(f0.e(obj));
        }
    }
}
