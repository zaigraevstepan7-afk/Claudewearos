package d;

import ab.m;
import android.content.Context;
import android.graphics.Paint;
import c.l;
import c1.z3;
import c2.e0;
import c2.s;
import c2.u;
import f1.a1;
import fj.r;
import g3.m0;
import java.util.List;
import k0.d1;
import k0.s1;
import k0.t0;
import l3.n;
import l3.t;
import pi.o;
import qj.b0;
import qj.z;
import t0.q;
import u6.v;
import v2.h0;
import w2.f1;
import w2.h2;
import x.g1;
import x.k1;
import x.l1;
import x.l2;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4316a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4317b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4318c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f4319d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f4320e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f4321f;

    public /* synthetic */ b(a1 a1Var, a1 a1Var2, a1 a1Var3, a1 a1Var4, a1 a1Var5) {
        this.f4316a = 3;
        this.f4321f = a1Var;
        this.f4317b = a1Var2;
        this.f4318c = a1Var3;
        this.f4319d = a1Var4;
        this.f4320e = a1Var5;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        int i10;
        int i11 = this.f4316a;
        o oVar = o.f13011a;
        Object obj2 = this.f4321f;
        Object obj3 = this.f4320e;
        Object obj4 = this.f4319d;
        Object obj5 = this.f4318c;
        Object obj6 = this.f4317b;
        switch (i11) {
            case 0:
                a aVar = (a) obj6;
                aVar.f4315a = ((l) obj5).c((String) obj4, (v) obj3, new c((a1) obj2));
                return new z3(aVar, 1);
            case 1:
                n nVar = (n) obj5;
                t tVar = (t) obj4;
                t0 t0Var = (t0) obj3;
                s sVar = (s) obj2;
                h0 h0Var = (h0) obj;
                h0Var.f();
                e2.b bVar = h0Var.f17669a;
                float fG = ((t0.g) obj6).f15360c.g();
                if (fG != 0.0f) {
                    long j = tVar.f9938b;
                    int i12 = m0.f7144c;
                    int iB = nVar.b((int) (j >> 32));
                    s1 s1VarD = t0Var.d();
                    b2.c cVarC = s1VarD != null ? s1VarD.f9254a.c(iB) : new b2.c(0.0f, 0.0f, 0.0f, 0.0f);
                    float fFloor = (float) Math.floor(h0Var.w0(d1.f9072a));
                    if (fFloor < 1.0f) {
                        fFloor = 1.0f;
                    }
                    float f10 = fFloor / 2;
                    float f11 = cVarC.f1502a + f10;
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (bVar.a() >> 32)) - f10;
                    if (f11 > fIntBitsToFloat) {
                        f11 = fIntBitsToFloat;
                    }
                    if (f11 >= f10) {
                        f10 = f11;
                    }
                    float fFloor2 = ((int) fFloor) % 2 == 1 ? ((float) Math.floor(f10)) + 0.5f : (float) Math.rint(f10);
                    long jFloatToRawIntBits = (Float.floatToRawIntBits(fFloor2) << 32) | (Float.floatToRawIntBits(cVarC.f1503b) & 4294967295L);
                    long jFloatToRawIntBits2 = (Float.floatToRawIntBits(fFloor2) << 32) | (Float.floatToRawIntBits(cVarC.f1505d) & 4294967295L);
                    u uVar = bVar.f5737a.f5735c;
                    c2.h hVarG = bVar.f5740d;
                    if (hVarG == null) {
                        hVarG = e0.g();
                        hVarG.l(1);
                        bVar.f5740d = hVarG;
                    }
                    Paint paint = hVarG.f2999a;
                    if (sVar != null) {
                        sVar.a(fG, bVar.a(), hVarG);
                    } else if (paint.getAlpha() / 255.0f != fG) {
                        hVarG.c(fG);
                    }
                    if (!fj.l.b(hVarG.f3002d, null)) {
                        hVarG.f(null);
                    }
                    if (hVarG.f3000b != 3) {
                        hVarG.d(3);
                    }
                    if (paint.getStrokeWidth() != fFloor) {
                        hVarG.k(fFloor);
                    }
                    if (paint.getStrokeMiter() != 4.0f) {
                        paint.setStrokeMiter(4.0f);
                    }
                    if (hVarG.a() == 0) {
                        i10 = 0;
                    } else {
                        i10 = 0;
                        hVarG.i(0);
                    }
                    if (hVarG.b() != 0) {
                        hVarG.j(i10);
                    }
                    if (!paint.isFilterBitmap()) {
                        hVarG.g(1);
                    }
                    uVar.n(jFloatToRawIntBits, jFloatToRawIntBits2, hVarG);
                }
                return oVar;
            case 2:
                ja.k kVar = (ja.k) obj6;
                a1 a1Var = (a1) obj2;
                a1 a1Var2 = (a1) obj5;
                a1 a1Var3 = (a1) obj4;
                a1 a1Var4 = (a1) obj3;
                String str = (String) obj;
                fj.l.f(str, "pin");
                int iOrdinal = ((va.u) a1Var.getValue()).ordinal();
                if (iOrdinal == 0) {
                    a1Var2.setValue(str);
                    a1Var.setValue(va.u.f18004b);
                } else if (iOrdinal == 1) {
                    kVar.getClass();
                    kVar.f8788a.edit().putString("universal_passcode", str).apply();
                    a1Var3.setValue(Boolean.TRUE);
                    a1Var4.setValue(Boolean.FALSE);
                } else if (iOrdinal != 2) {
                    throw new b3.e();
                }
                return oVar;
            case 3:
                a1 a1Var5 = (a1) obj2;
                a1 a1Var6 = (a1) obj6;
                a1 a1Var7 = (a1) obj5;
                a1 a1Var8 = (a1) obj4;
                a1 a1Var9 = (a1) obj3;
                String str2 = (String) ((mg.a) obj).c(String.class);
                if (str2 == null || str2.length() == 0 || !fj.l.b((String) a1Var5.getValue(), str2)) {
                    a1Var9.setValue("Incorrect password.");
                } else {
                    a1Var6.setValue("dev");
                    Boolean bool = Boolean.FALSE;
                    a1Var7.setValue(bool);
                    a1Var8.setValue(bool);
                }
                return oVar;
            case 4:
                z zVar = (z) obj6;
                Context context = (Context) obj5;
                List list = (List) obj4;
                g0.h0 h0Var2 = (g0.h0) obj3;
                a1 a1Var10 = (a1) obj2;
                List list2 = (List) obj;
                fj.l.f(list2, "uris");
                if (!list2.isEmpty()) {
                    b0.w(zVar, null, new b6.c(context, list, h0Var2, list2, a1Var10, null, 10), 3);
                }
                return oVar;
            case 5:
                q qVar = (q) obj;
                t0.l lVar = ((t0.a) obj5).f15338a;
                qVar.f15392h = (t) obj6;
                qVar.f15393i = (l3.j) obj4;
                qVar.f15387c = (m) obj3;
                qVar.f15388d = (ej.c) obj2;
                qVar.f15389e = lVar != null ? lVar.I : null;
                qVar.f15390f = lVar != null ? lVar.J : null;
                qVar.f15391g = lVar != null ? (h2) v2.n.h(lVar, f1.f18273t) : null;
                return oVar;
            default:
                k1 k1Var = (k1) obj6;
                fj.v vVar = (fj.v) obj5;
                fj.s sVar2 = (fj.s) obj4;
                l2 l2Var = (l2) obj3;
                r rVar = (r) obj2;
                float fFloatValue = ((Float) obj).floatValue();
                g1 g1VarG = k1.g(k1Var.f19592g);
                if (g1VarG != null) {
                    qh.c cVar = k1Var.f19655e;
                    long j4 = g1VarG.f19532b;
                    long j10 = g1VarG.f19531a;
                    ((q2.d) cVar.f13507b).a(j4, Float.intBitsToFloat((int) (j10 >> 32)));
                    ((q2.d) cVar.f13508c).a(j4, Float.intBitsToFloat((int) (j10 & 4294967295L)));
                    g1 g1VarA = ((g1) vVar.f6807a).a(g1VarG);
                    vVar.f6807a = g1VarA;
                    sVar2.f6804a = l2Var.i(l2Var.e(g1VarA.f19531a));
                    rVar.f6803a = !l1.a(r3 - fFloatValue);
                }
                return Boolean.valueOf(g1VarG != null);
        }
    }

    public /* synthetic */ b(ja.k kVar, a1 a1Var, a1 a1Var2, a1 a1Var3, a1 a1Var4) {
        this.f4316a = 2;
        this.f4317b = kVar;
        this.f4321f = a1Var;
        this.f4318c = a1Var2;
        this.f4319d = a1Var3;
        this.f4320e = a1Var4;
    }

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f4316a = i10;
        this.f4317b = obj;
        this.f4318c = obj2;
        this.f4319d = obj3;
        this.f4320e = obj4;
        this.f4321f = obj5;
    }
}
