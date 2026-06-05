package c1;

import java.util.WeakHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class z0 implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2933a;

    /* renamed from: b, reason: collision with root package name */
    public static final z0 f2927b = new z0(0);

    /* renamed from: c, reason: collision with root package name */
    public static final z0 f2928c = new z0(1);

    /* renamed from: d, reason: collision with root package name */
    public static final z0 f2929d = new z0(2);

    /* renamed from: e, reason: collision with root package name */
    public static final z0 f2930e = new z0(3);

    /* renamed from: f, reason: collision with root package name */
    public static final z0 f2931f = new z0(4);

    /* renamed from: z, reason: collision with root package name */
    public static final z0 f2932z = new z0(5);
    public static final z0 A = new z0(6);
    public static final z0 B = new z0(7);
    public static final z0 C = new z0(8);
    public static final z0 D = new z0(9);
    public static final z0 E = new z0(10);
    public static final z0 F = new z0(11);
    public static final z0 G = new z0(12);

    public /* synthetic */ z0(int i10) {
        this.f2933a = i10;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        int i10 = this.f2933a;
        pi.o oVar = pi.o.f13011a;
        switch (i10) {
            case 0:
                f1.i0 i0Var = (f1.i0) obj;
                int iIntValue = ((Number) obj2).intValue();
                if (!i0Var.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    i0Var.W();
                }
                return oVar;
            case 1:
                f1.i0 i0Var2 = (f1.i0) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                if (!i0Var2.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    i0Var2.W();
                }
                return oVar;
            case 2:
                f1.i0 i0Var3 = (f1.i0) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                if (!i0Var3.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    i0Var3.W();
                }
                return oVar;
            case 3:
                f1.i0 i0Var4 = (f1.i0) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                if (!i0Var4.T(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    i0Var4.W();
                }
                return oVar;
            case 4:
                f1.i0 i0Var5 = (f1.i0) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                if (!i0Var5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    i0Var5.W();
                }
                return oVar;
            case 5:
                f1.i0 i0Var6 = (f1.i0) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                if (i0Var6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    t.f2691a.a(null, 0.0f, 0.0f, null, 0L, i0Var6, 196608, 31);
                } else {
                    i0Var6.W();
                }
                return oVar;
            case 6:
                f1.i0 i0Var7 = (f1.i0) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                if (i0Var7.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    t.f2691a.a(null, 0.0f, 0.0f, null, 0L, i0Var7, 196608, 31);
                } else {
                    i0Var7.W();
                }
                return oVar;
            case 7:
                f1.i0 i0Var8 = (f1.i0) obj;
                int iIntValue8 = ((Number) obj2).intValue();
                if (!i0Var8.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    i0Var8.W();
                }
                return oVar;
            case 8:
                f1.i0 i0Var9 = (f1.i0) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                if (!i0Var9.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    i0Var9.W();
                }
                return oVar;
            case 9:
                f1.i0 i0Var10 = (f1.i0) obj;
                int iIntValue10 = ((Number) obj2).intValue();
                if (!i0Var10.T(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    i0Var10.W();
                }
                return oVar;
            case 10:
                f1.i0 i0Var11 = (f1.i0) obj;
                int iIntValue11 = ((Number) obj2).intValue();
                if (!i0Var11.T(iIntValue11 & 1, (iIntValue11 & 3) != 2)) {
                    i0Var11.W();
                }
                return oVar;
            case 11:
                f1.i0 i0Var12 = (f1.i0) obj;
                int iIntValue12 = ((Number) obj2).intValue();
                if (!i0Var12.T(iIntValue12 & 1, (iIntValue12 & 3) != 2)) {
                    i0Var12.W();
                }
                return oVar;
            default:
                f1.i0 i0Var13 = (f1.i0) obj;
                ((Number) obj2).intValue();
                i0Var13.b0(-511854661);
                t tVar = t.f2691a;
                WeakHashMap weakHashMap = b0.f2.f1311w;
                b0.a1 a1Var = new b0.a1(b0.c.e(i0Var13).f1322l, 48);
                i0Var13.p(false);
                return a1Var;
        }
    }
}
