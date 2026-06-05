package nf;

import java.nio.charset.Charset;
import zf.e1;
import zf.f1;
import zf.g1;
import zf.h1;
import zf.i1;
import zf.j1;
import zf.q1;
import zf.y0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class o {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f12337a = 0;

    static {
        Charset.forName("UTF-8");
    }

    public static j1 a(f1 f1Var) {
        g1 g1VarZ = j1.z();
        int iB = f1Var.B();
        g1VarZ.e();
        j1.w((j1) g1VarZ.f4243b, iB);
        for (e1 e1Var : f1Var.A()) {
            h1 h1VarB = i1.B();
            String strB = e1Var.A().B();
            h1VarB.e();
            i1.w((i1) h1VarB.f4243b, strB);
            y0 y0VarD = e1Var.D();
            h1VarB.e();
            i1.y((i1) h1VarB.f4243b, y0VarD);
            q1 q1VarC = e1Var.C();
            h1VarB.e();
            i1.x((i1) h1VarB.f4243b, q1VarC);
            int iB2 = e1Var.B();
            h1VarB.e();
            i1.z((i1) h1VarB.f4243b, iB2);
            i1 i1Var = (i1) h1VarB.b();
            g1VarZ.e();
            j1.x((j1) g1VarZ.f4243b, i1Var);
        }
        return (j1) g1VarZ.b();
    }
}
