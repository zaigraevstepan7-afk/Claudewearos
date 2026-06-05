package ab;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import c1.h1;
import c1.l1;
import c1.v7;
import c1.z4;
import c1.z5;
import com.anonlab.voidlauncher.feature.home.presentation.HomeActivity;
import com.google.android.gms.internal.ads.zzbch;
import f0.x0;
import f1.a1;
import f1.d2;
import f1.f1;
import f1.g1;
import f1.g2;
import f1.i0;
import f1.n1;
import f1.q2;
import f1.r2;
import f1.t1;
import g3.e0;
import g3.m0;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import lb.q3;
import p2.p0;
import t2.q1;
import v0.k0;
import v0.u0;
import x.s1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f293a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f294b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f295c;

    public /* synthetic */ g(int i10, Object obj, Object obj2) {
        this.f293a = i10;
        this.f294b = obj;
        this.f295c = obj2;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        i0 i0Var;
        m0 m0Var;
        Object obj3;
        int i10 = this.f293a;
        f1.f fVar = f1.m.f6385a;
        int i11 = 2;
        int i12 = 1;
        pi.o oVar = pi.o.f13011a;
        Object obj4 = this.f295c;
        Object obj5 = this.f294b;
        switch (i10) {
            case 0:
                ((Integer) obj2).getClass();
                v.c((x) obj5, (ej.a) obj4, (i0) obj, f1.s.O(1));
                break;
            case 1:
                q1 q1Var = (q1) obj;
                s3.a aVar = (s3.a) obj2;
                break;
            case 2:
                p1.e eVar = (p1.e) obj5;
                b0.y yVar = (b0.y) obj4;
                i0 i0Var2 = (i0) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (i0Var2.T(iIntValue & 1, (iIntValue & 3) != 2)) {
                    eVar.c(yVar, i0Var2, 0);
                    break;
                } else {
                    i0Var2.W();
                    break;
                }
            case 3:
                ((Integer) obj2).getClass();
                ((h1) obj5).a((wh.s) obj4, (i0) obj, f1.s.O(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((l1) obj5).a((z5) obj4, (i0) obj, f1.s.O(1));
                break;
            case 5:
                e0.a aVar2 = (e0.a) obj5;
                b0.g gVar = (b0.g) obj4;
                s3.c cVar = (s3.c) obj;
                s3.a aVar3 = (s3.a) obj2;
                if (s3.a.h(aVar3.f14736a) == Integer.MAX_VALUE) {
                    a0.a.a("LazyVerticalGrid's width should be bound by parent.");
                }
                int iH = s3.a.h(aVar3.f14736a);
                int iI0 = cVar.I0(gVar.a());
                int i13 = aVar2.f5218a;
                int i14 = iH - ((i13 - 1) * iI0);
                int i15 = i14 / i13;
                int i16 = i14 % i13;
                ArrayList arrayList = new ArrayList(i13);
                int i17 = 0;
                while (i17 < i13) {
                    arrayList.add(Integer.valueOf((i17 < i16 ? 1 : 0) + i15));
                    i17++;
                }
                int[] iArrQ0 = qi.l.Q0(arrayList);
                int[] iArr = new int[iArrQ0.length];
                gVar.c(cVar, iH, iArrQ0, s3.m.f14752a, iArr);
                break;
            case 6:
                f0.a0 a0Var = (f0.a0) obj5;
                f0.z zVar = (f0.z) obj4;
                i0 i0Var3 = (i0) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (i0Var3.T(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    f0.b0 b0Var = (f0.b0) a0Var.f6102b.a();
                    int iD = zVar.f6223c;
                    Object obj6 = zVar.f6221a;
                    if ((iD >= b0Var.a() || !b0Var.b(iD).equals(obj6)) && (iD = b0Var.d(obj6)) != -1) {
                        zVar.f6223c = iD;
                    }
                    if (iD != -1) {
                        i0Var3.b0(-1664741271);
                        f0.o.d(b0Var, a0Var.f6101a, iD, zVar.f6221a, i0Var3, 0);
                        i0Var = i0Var3;
                        i0Var.p(false);
                    } else {
                        i0Var = i0Var3;
                        i0Var.b0(-1664505826);
                        i0Var.p(false);
                    }
                    boolean zH = i0Var.h(zVar);
                    Object objQ = i0Var.Q();
                    if (zH || objQ == fVar) {
                        objQ = new k(zVar, 12);
                        i0Var.l0(objQ);
                    }
                    f1.s.c(obj6, (ej.c) objQ, i0Var);
                    break;
                } else {
                    i0Var3.W();
                    break;
                }
            case 7:
                break;
            case 8:
                p1.e eVar2 = (p1.e) obj5;
                x0 x0Var = (x0) obj4;
                i0 i0Var4 = (i0) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (i0Var4.T(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    eVar2.c(x0Var, i0Var4, 0);
                    break;
                } else {
                    i0Var4.W();
                    break;
                }
            case 9:
                p1.k kVar = (p1.k) obj5;
                i1.k kVar2 = (i1.k) obj4;
                int iIntValue4 = ((Integer) obj).intValue();
                if (obj2 instanceof f1.i) {
                    kVar.f12654f.b((f1.i) obj2);
                    break;
                } else if (!(obj2 instanceof g2)) {
                    if (obj2 instanceof d2) {
                        f1.s.L(kVar2, iIntValue4, obj2);
                        kVar.e((d2) obj2);
                        break;
                    } else if (obj2 instanceof t1) {
                        f1.s.L(kVar2, iIntValue4, obj2);
                        ((t1) obj2).d();
                        break;
                    }
                }
                break;
            case 10:
                fj.s sVar = (fj.s) obj5;
                float fFloatValue = ((Float) obj).floatValue();
                ((Float) obj2).floatValue();
                sVar.f6804a += ((s1) ((g0.b0) obj4).f6853b).a(fFloatValue - sVar.f6804a);
                break;
            case 11:
                hb.h hVar = (hb.h) obj5;
                fj.l.f((p2.w) obj, "change");
                hVar.f7802f.c(hVar, new s3.l(((p0) ((p2.a0) obj4)).Q), (b2.b) obj2);
                break;
            case 12:
                f1 f1Var = (f1) obj5;
                float fFloatValue2 = ((Float) obj2).floatValue();
                fj.l.f((p2.w) obj, "<unused var>");
                f1Var.h(cg.b.o(f1Var.g() + fFloatValue2, 0.0f, ((f1) obj4).g()));
                break;
            case 13:
                ((Integer) obj2).getClass();
                q3.a((lb.b) obj5, (ej.c) obj4, (i0) obj, f1.s.O(1));
                break;
            case 14:
                p2.w wVar = (p2.w) obj;
                fj.l.f(wVar, "change");
                wVar.a();
                long j = ((p0) ((p2.a0) obj5)).Q;
                long j4 = wVar.f12762c;
                ((ej.c) obj4).invoke(Float.valueOf((float) ((((float) Math.atan2(Float.intBitsToFloat((int) (j4 & 4294967295L)) - (((int) (j & 4294967295L)) / 2.0f), Float.intBitsToFloat((int) (j4 >> 32)) - (((int) (j >> 32)) / 2.0f))) * 180.0d) / 3.141592653589793d)));
                break;
            case 15:
                ((Integer) obj2).getClass();
                mb.a.a((v1.o) obj5, (ej.a) obj4, (i0) obj, f1.s.O(1));
                break;
            case 16:
                ((Integer) obj2).getClass();
                nb.e.d((nb.q) obj5, (ej.c) obj4, (i0) obj, f1.s.O(1));
                break;
            case 17:
                a1 a1Var = (a1) obj5;
                a1 a1Var2 = (a1) obj4;
                i0 i0Var5 = (i0) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (i0Var5.T(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    Object objQ2 = i0Var5.Q();
                    if (objQ2 == fVar) {
                        objQ2 = new jb.a(a1Var, a1Var2, 5);
                        i0Var5.l0(objQ2);
                    }
                    z4.i((ej.a) objQ2, null, false, null, null, null, nb.a.f11972b, i0Var5, 805306374, 510);
                    break;
                } else {
                    i0Var5.W();
                    break;
                }
            case 18:
                r0.e eVar3 = (r0.e) obj5;
                n0.g gVar2 = (n0.g) obj4;
                i0 i0Var6 = (i0) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (i0Var6.T(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    boolean zF = i0Var6.f(eVar3);
                    Object objQ3 = i0Var6.Q();
                    if (zF || objQ3 == fVar) {
                        objQ3 = f1.s.q(new a2.i(0, eVar3, r0.e.class, "data", "data()Landroidx/compose/foundation/text/contextmenu/data/TextContextMenuData;", 0, 0, 6));
                        i0Var6.l0(objQ3);
                    }
                    p0.l.a(gVar2, (n0.c) ((q2) objQ3).getValue(), i0Var6, 0);
                    break;
                } else {
                    i0Var6.W();
                    break;
                }
            case 19:
                ((Integer) obj2).getClass();
                p0.l.a((n0.g) obj5, (n0.c) obj4, (i0) obj, f1.s.O(1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                ((p0.p) obj5).a((Drawable) obj4, (i0) obj, f1.s.O(49));
                break;
            case zzbch.zzt.zzm /* 21 */:
                a1 a1Var3 = (a1) obj5;
                g1 g1Var = (g1) obj4;
                i0 i0Var7 = (i0) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                int i18 = HomeActivity.N;
                if (i0Var7.T(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    Object objQ4 = i0Var7.Q();
                    if (objQ4 == fVar) {
                        objQ4 = new r0.d(a1Var3, i12);
                        i0Var7.l0(objQ4);
                    }
                    z4.i((ej.a) objQ4, null, g1Var.g() <= 0, null, null, null, p1.j.d(-1303487174, new a0(g1Var, 4), i0Var7), i0Var7, 805306374, 506);
                    break;
                } else {
                    i0Var7.W();
                    break;
                }
            case 22:
                u0 u0Var = (u0) obj5;
                qj.z zVar2 = (qj.z) obj4;
                m0.a aVar4 = (m0.a) obj;
                Context context = (Context) obj2;
                boolean zJ = u0Var.j();
                g3.f fVarM = u0Var.m();
                TextClassification textClassification = null;
                String str = fVarM != null ? fVarM.f7081b : null;
                m0 m0Var2 = u0Var.f17506v;
                if (m0Var2 != null) {
                    long j10 = m0Var2.f7145a;
                    l3.n nVar = u0Var.f17487b;
                    m0Var = new m0(e0.b(nVar.b((int) (j10 >> 32)), nVar.b((int) (j10 & 4294967295L))));
                } else {
                    m0Var = null;
                }
                v0.p pVar = u0Var.f17494i;
                m mVar = new m(u0Var, zVar2, context, 22);
                r2 r2Var = v0.r.f17461a;
                if (Build.VERSION.SDK_INT >= 28 && str != null && m0Var != null && pVar != null && (pVar instanceof v0.p)) {
                    long j11 = m0Var.f7145a;
                    Object obj7 = pVar.f17457h;
                    yj.c cVar2 = pVar.f17454e;
                    if (cVar2.g()) {
                        k0 k0Var = (k0) pVar.f17456g.getValue();
                        obj3 = obj7;
                        TextClassification textClassification2 = (k0Var != null && m0.b(j11, k0Var.f17414b) && fj.l.b(str, k0Var.f17413a)) ? k0Var.f17415c : null;
                        cVar2.e(null);
                        textClassification = textClassification2;
                    } else {
                        obj3 = obj7;
                    }
                    if (textClassification == null) {
                        mVar.invoke(aVar4);
                    } else {
                        if (!textClassification.getActions().isEmpty()) {
                            aVar4.f11218a.a(new n0.h(obj3, textClassification, 0));
                        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
                            aVar4.f11218a.a(new n0.h(obj3, textClassification, -1));
                        }
                        mVar.invoke(aVar4);
                        List actions = textClassification.getActions();
                        int size = actions.size();
                        for (int i19 = 0; i19 < size; i19++) {
                            if (i19 > 0) {
                                aVar4.f11218a.a(new n0.h(obj3, textClassification, i19));
                            }
                        }
                    }
                    l0.b.a(aVar4, context, zJ, str, m0Var.f7145a);
                    break;
                } else {
                    String str2 = str;
                    mVar.invoke(aVar4);
                    if (str2 != null && m0Var != null) {
                        l0.b.a(aVar4, context, zJ, str2, m0Var.f7145a);
                        break;
                    }
                }
                break;
            case 23:
                ej.a aVar5 = (ej.a) obj4;
                a1 a1Var4 = (a1) obj5;
                i0 i0Var8 = (i0) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (i0Var8.T(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    boolean zF2 = i0Var8.f(aVar5);
                    Object objQ5 = i0Var8.Q();
                    if (zF2 || objQ5 == fVar) {
                        objQ5 = new mb.f(aVar5, a1Var4, 2);
                        i0Var8.l0(objQ5);
                    }
                    z4.i((ej.a) objQ5, null, false, null, null, null, va.a.f17900a, i0Var8, 805306368, 510);
                    break;
                } else {
                    i0Var8.W();
                    break;
                }
            case 24:
                String str3 = (String) obj5;
                String str4 = (String) obj4;
                i0 i0Var9 = (i0) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (i0Var9.T(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    b0.b0 b0VarA = b0.z.a(b0.j.f1363e, v1.b.F, i0Var9, 54);
                    int iHashCode = Long.hashCode(i0Var9.T);
                    n1 n1VarL = i0Var9.l();
                    v1.l lVar = v1.l.f17564b;
                    v1.o oVarC = v1.a.c(i0Var9, lVar);
                    v2.h.f17668w.getClass();
                    v2.f fVar2 = v2.g.f17645b;
                    i0Var9.e0();
                    if (i0Var9.S) {
                        i0Var9.k(fVar2);
                    } else {
                        i0Var9.o0();
                    }
                    f1.s.M(v2.g.f17649f, i0Var9, b0VarA);
                    f1.s.M(v2.g.f17648e, i0Var9, n1VarL);
                    f1.s.w(i0Var9, Integer.valueOf(iHashCode), v2.g.f17650g);
                    f1.s.I(v2.g.f17651h, i0Var9);
                    f1.s.M(v2.g.f17647d, i0Var9, oVarC);
                    long j12 = c2.w.f3054d;
                    v7.a(str3, null, j12, hj.a.x(36), k3.s.f9400z, null, 0L, null, 0L, 0, false, 0, 0, null, i0Var9, 1597824, 0, 262058);
                    if (str4 != null) {
                        i0Var9.b0(-1003053784);
                        b0.d.e(i0Var9, b0.t1.e(2, lVar));
                        v7.a(str4, null, c2.w.c(j12, 0.5f), hj.a.x(10), k3.s.f9399f, null, hj.a.x(1), null, 0L, 0, false, 0, 0, null, i0Var9, 102261120, 0, 261802);
                        i0Var9.p(false);
                    } else if (fj.l.b(str3, "0")) {
                        i0Var9.b0(-1002463389);
                        i0Var9.p(false);
                    } else {
                        i0Var9.b0(-1002630603);
                        b0.d.e(i0Var9, b0.t1.e(14, lVar));
                        i0Var9.p(false);
                    }
                    i0Var9.p(true);
                    break;
                } else {
                    i0Var9.W();
                    break;
                }
            case 25:
                ((Integer) obj2).getClass();
                ((w.d) obj5).a((w.c) obj4, (i0) obj, f1.s.O(1));
                break;
            default:
                ((Integer) obj2).getClass();
                za.d.a((LocalDateTime) obj5, (ej.a) obj4, (i0) obj, f1.s.O(1));
                break;
        }
        return oVar;
    }

    public /* synthetic */ g(ej.a aVar, a1 a1Var) {
        this.f293a = 23;
        this.f295c = aVar;
        this.f294b = a1Var;
    }

    public /* synthetic */ g(Object obj, int i10, int i11, Object obj2) {
        this.f293a = i11;
        this.f294b = obj;
        this.f295c = obj2;
    }
}
