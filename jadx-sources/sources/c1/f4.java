package c1;

import android.app.RemoteAction;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class f4 implements ej.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2091a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2092b;

    public /* synthetic */ f4(Object obj, int i10) {
        this.f2091a = i10;
        this.f2092b = obj;
    }

    @Override // ej.f
    public final Object c(Object obj, Object obj2, Object obj3) throws XmlPullParserException, Resources.NotFoundException, IOException {
        switch (this.f2091a) {
            case 0:
                f1.i0 i0Var = (f1.i0) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if (i0Var.T(iIntValue & 1, (iIntValue & 17) != 16)) {
                    ((ej.e) this.f2092b).invoke(i0Var, 0);
                } else {
                    i0Var.W();
                }
                break;
            case 1:
                g8 g8Var = (g8) obj;
                f1.i0 i0Var2 = (f1.i0) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? i0Var2.f(g8Var) : i0Var2.h(g8Var) ? 4 : 2;
                }
                if (i0Var2.T(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    e8.a(g8Var, null, 0.0f, null, 0L, 0L, 0.0f, 0.0f, p1.j.d(-999924215, new g0((String) this.f2092b, 4), i0Var2), i0Var2, (iIntValue2 & 14) | 805306368);
                } else {
                    i0Var2.W();
                }
                break;
            case 2:
                v1.o oVar = (v1.o) obj;
                f1.i0 i0Var3 = (f1.i0) obj2;
                ((Number) obj3).intValue();
                i0Var3.b0(-1498516085);
                t.u0 u0VarL = z4.l(e1.u.f5670b, i0Var3);
                t.u0 u0VarL2 = z4.l(e1.u.f5672d, i0Var3);
                t.j1 j1Var = (t.j1) this.f2092b;
                t.p1 p1Var = t.d.j;
                Object objC = j1Var.c();
                f1.j1 j1Var2 = j1Var.f15203d;
                boolean zBooleanValue = ((Boolean) objC).booleanValue();
                i0Var3.b0(-1553362193);
                float f10 = zBooleanValue ? 1.0f : 0.8f;
                i0Var3.p(false);
                Float fValueOf = Float.valueOf(f10);
                boolean zBooleanValue2 = ((Boolean) j1Var2.getValue()).booleanValue();
                i0Var3.b0(-1553362193);
                float f11 = zBooleanValue2 ? 1.0f : 0.8f;
                i0Var3.p(false);
                Float fValueOf2 = Float.valueOf(f11);
                j1Var.f();
                i0Var3.b0(386845748);
                i0Var3.p(false);
                t.i1 i1VarM = t.d.m(j1Var, fValueOf, fValueOf2, u0VarL, p1Var, i0Var3, 196608);
                boolean zBooleanValue3 = ((Boolean) j1Var.c()).booleanValue();
                i0Var3.b0(2073045083);
                float f12 = zBooleanValue3 ? 1.0f : 0.0f;
                i0Var3.p(false);
                Float fValueOf3 = Float.valueOf(f12);
                boolean zBooleanValue4 = ((Boolean) j1Var2.getValue()).booleanValue();
                i0Var3.b0(2073045083);
                float f13 = zBooleanValue4 ? 1.0f : 0.0f;
                i0Var3.p(false);
                Float fValueOf4 = Float.valueOf(f13);
                j1Var.f();
                i0Var3.b0(-281714272);
                i0Var3.p(false);
                v1.o oVarR = c2.e0.r(oVar, ((Number) i1VarM.A.getValue()).floatValue(), ((Number) i1VarM.A.getValue()).floatValue(), ((Number) t.d.m(j1Var, fValueOf3, fValueOf4, u0VarL2, p1Var, i0Var3, 196608).A.getValue()).floatValue(), 0.0f, null, 131064);
                i0Var3.p(false);
                break;
            case 3:
                long j = ((c2.w) obj).f3060a;
                f1.i0 i0Var4 = (f1.i0) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= i0Var4.e(j) ? 4 : 2;
                }
                if (i0Var4.T(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    p0.l.b(((n0.d) this.f2092b).f11844c, j, i0Var4, (iIntValue3 << 3) & 112);
                } else {
                    i0Var4.W();
                }
                break;
            case 4:
                long j4 = ((c2.w) obj).f3060a;
                f1.i0 i0Var5 = (f1.i0) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                if (i0Var5.T(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    p0.p.f12635a.a((Drawable) this.f2092b, i0Var5, 48);
                } else {
                    i0Var5.W();
                }
                break;
            default:
                long j10 = ((c2.w) obj).f3060a;
                f1.i0 i0Var6 = (f1.i0) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                if (i0Var6.T(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    p0.p.f12635a.b(((RemoteAction) this.f2092b).getIcon(), i0Var6, 48);
                } else {
                    i0Var6.W();
                }
                break;
        }
        return pi.o.f13011a;
    }
}
