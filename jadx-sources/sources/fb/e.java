package fb;

import c2.v0;
import c2.w;
import com.google.android.gms.internal.ads.zzbch;
import fj.l;
import g3.c0;
import g3.d0;
import g3.e0;
import g3.f0;
import g3.h0;
import g3.j;
import g3.k;
import g3.l0;
import g3.m0;
import g3.o0;
import g3.p0;
import g3.q;
import g3.t;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import k3.s;
import pi.o;
import r3.h;
import r3.i;
import r3.m;
import r3.p;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6668a;

    public /* synthetic */ e(int i10) {
        this.f6668a = i10;
    }

    @Override // ej.c
    public final Object invoke(Object obj) {
        f0 f0Var = null;
        jVar = null;
        j jVar = null;
        kVar = null;
        k kVar = null;
        o0Var = null;
        o0 o0Var = null;
        p0Var = null;
        p0 p0Var = null;
        f0Var = null;
        f0 f0Var2 = null;
        tVar = null;
        t tVar = null;
        l0Var = null;
        l0 l0Var = null;
        l0Var = null;
        l0 l0Var2 = null;
        f0Var = null;
        int i10 = 0;
        switch (this.f6668a) {
            case 0:
                e2.d dVar = (e2.d) obj;
                l.f(dVar, "$this$drawBackdrop");
                e2.d.c1(dVar, w.c(w.f3054d, 0.5f), 0L, 0L, 0.0f, null, 0, 126);
                return o.f13011a;
            case 1:
                List list = (List) obj;
                Object obj2 = list.get(0);
                l.d(obj2, "null cannot be cast to non-null type kotlin.Int");
                int iIntValue = ((Integer) obj2).intValue();
                Object obj3 = list.get(1);
                l.d(obj3, "null cannot be cast to non-null type kotlin.Float");
                return new g0.d(((Float) obj3).floatValue(), iIntValue, new g0.c(0, list));
            case 2:
                return Boolean.valueOf(!(((g3.a) obj) instanceof t));
            case 3:
                q qVar = (q) obj;
                StringBuilder sb2 = new StringBuilder("[");
                sb2.append(qVar.f7167b);
                sb2.append(", ");
                return m6.a.g(sb2, qVar.f7168c, ')');
            case 4:
                l.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list2 = (List) obj;
                Object obj4 = list2.get(0);
                ej.c cVar = (ej.c) d0.f7056h.f13508c;
                Boolean bool = Boolean.FALSE;
                f0 f0Var3 = (l.b(obj4, bool) || obj4 == null) ? null : (f0) cVar.invoke(obj4);
                Object obj5 = list2.get(1);
                f0 f0Var4 = (l.b(obj5, bool) || obj5 == null) ? null : (f0) cVar.invoke(obj5);
                Object obj6 = list2.get(2);
                f0 f0Var5 = (l.b(obj6, bool) || obj6 == null) ? null : (f0) cVar.invoke(obj6);
                Object obj7 = list2.get(3);
                if (!l.b(obj7, bool) && obj7 != null) {
                    f0Var = (f0) cVar.invoke(obj7);
                }
                return new l0(f0Var3, f0Var4, f0Var5, f0Var);
            case 5:
                l.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list3 = (List) obj;
                Object obj8 = list3.get(1);
                List list4 = (l.b(obj8, Boolean.FALSE) || obj8 == null) ? null : (List) ((ej.c) d0.f7049a.f13508c).invoke(obj8);
                Object obj9 = list3.get(0);
                String str = obj9 != null ? (String) obj9 : null;
                l.c(str);
                return new g3.f(list4, str);
            case 6:
                l.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new r3.l(((Integer) obj).intValue());
            case 7:
                l.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Float>");
                List list5 = (List) obj;
                return new p(((Number) list5.get(0)).floatValue(), ((Number) list5.get(1)).floatValue());
            case 8:
                l.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list6 = (List) obj;
                Object obj10 = list6.get(0);
                s3.p[] pVarArr = s3.o.f14756b;
                ej.c cVar2 = d0.f7069v.f7044b;
                Boolean bool2 = Boolean.FALSE;
                l.b(obj10, bool2);
                s3.o oVar = obj10 != null ? (s3.o) cVar2.invoke(obj10) : null;
                l.c(oVar);
                long j = oVar.f14758a;
                Object obj11 = list6.get(1);
                l.b(obj11, bool2);
                s3.o oVar2 = obj11 != null ? (s3.o) cVar2.invoke(obj11) : null;
                l.c(oVar2);
                return new r3.q(j, oVar2.f14758a);
            case 9:
                l.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new s(((Integer) obj).intValue());
            case 10:
                l.d(obj, "null cannot be cast to non-null type kotlin.Float");
                return new r3.a(((Float) obj).floatValue());
            case 11:
                l.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list7 = (List) obj;
                Object obj12 = list7.get(0);
                Integer num = obj12 != null ? (Integer) obj12 : null;
                l.c(num);
                int iIntValue2 = num.intValue();
                Object obj13 = list7.get(1);
                Integer num2 = obj13 != null ? (Integer) obj13 : null;
                l.c(num2);
                return new m0(e0.b(iIntValue2, num2.intValue()));
            case 12:
                l.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list8 = (List) obj;
                Object obj14 = list8.get(0);
                int i11 = w.f3059i;
                Boolean bool3 = Boolean.FALSE;
                l.b(obj14, bool3);
                w wVar = obj14 != null ? l.b(obj14, Boolean.FALSE) ? new w(w.f3058h) : new w(c2.e0.c(((Integer) obj14).intValue())) : null;
                l.c(wVar);
                long j4 = wVar.f3060a;
                Object obj15 = list8.get(1);
                c0 c0Var = d0.f7071x;
                l.b(obj15, bool3);
                b2.b bVar = obj15 != null ? (b2.b) c0Var.f7044b.invoke(obj15) : null;
                l.c(bVar);
                long j10 = bVar.f1500a;
                Object obj16 = list8.get(2);
                Float f10 = obj16 != null ? (Float) obj16 : null;
                l.c(f10);
                return new v0(j4, j10, f10.floatValue());
            case 13:
                l.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new r3.k(((Integer) obj).intValue());
            case 14:
                l.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list9 = (List) obj;
                Object obj17 = list9.get(0);
                String str2 = obj17 != null ? (String) obj17 : null;
                l.c(str2);
                Object obj18 = list9.get(1);
                qh.c cVar3 = d0.f7057i;
                if (!l.b(obj18, Boolean.FALSE) && obj18 != null) {
                    l0Var2 = (l0) ((ej.c) cVar3.f13508c).invoke(obj18);
                }
                return new k(str2, l0Var2);
            case 15:
                l.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new m(((Integer) obj).intValue());
            case 16:
                l.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new r3.d(((Integer) obj).intValue());
            case 17:
                l.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list10 = (List) obj;
                ArrayList arrayList = new ArrayList(list10.size());
                int size = list10.size();
                while (i10 < size) {
                    Object obj19 = list10.get(i10);
                    g3.d dVar2 = (l.b(obj19, Boolean.FALSE) || obj19 == null) ? null : (g3.d) ((ej.c) d0.f7050b.f13508c).invoke(obj19);
                    l.c(dVar2);
                    arrayList.add(dVar2);
                    i10++;
                }
                return arrayList;
            case 18:
                l.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new k3.o(((Integer) obj).intValue());
            case 19:
                l.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new k3.p(((Integer) obj).intValue());
            case 20:
                Boolean bool4 = Boolean.FALSE;
                if (l.b(obj, bool4)) {
                    return new s3.o(s3.o.f14757c);
                }
                l.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list11 = (List) obj;
                Object obj20 = list11.get(0);
                Float f11 = obj20 != null ? (Float) obj20 : null;
                l.c(f11);
                float fFloatValue = f11.floatValue();
                Object obj21 = list11.get(1);
                c0 c0Var2 = d0.f7070w;
                l.b(obj21, bool4);
                s3.p pVar = obj21 != null ? (s3.p) c0Var2.f7044b.invoke(obj21) : null;
                l.c(pVar);
                return new s3.o(hj.a.D(pVar.f14759a, fFloatValue));
            case zzbch.zzt.zzm /* 21 */:
                return l.b(obj, 0) ? new s3.p(8589934592L) : l.b(obj, 1) ? new s3.p(4294967296L) : new s3.p(0L);
            case 22:
                if (l.b(obj, Boolean.FALSE)) {
                    return new b2.b(9205357640488583168L);
                }
                l.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list12 = (List) obj;
                Object obj22 = list12.get(0);
                Float f12 = obj22 != null ? (Float) obj22 : null;
                l.c(f12);
                float fFloatValue2 = f12.floatValue();
                Object obj23 = list12.get(1);
                l.c(obj23 != null ? (Float) obj23 : null);
                return new b2.b((Float.floatToRawIntBits(fFloatValue2) << 32) | (Float.floatToRawIntBits(r9.floatValue()) & 4294967295L));
            case 23:
                l.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list13 = (List) obj;
                ArrayList arrayList2 = new ArrayList(list13.size());
                int size2 = list13.size();
                while (i10 < size2) {
                    Object obj24 = list13.get(i10);
                    n3.a aVar = (l.b(obj24, Boolean.FALSE) || obj24 == null) ? null : (n3.a) ((ej.c) d0.f7073z.f13508c).invoke(obj24);
                    l.c(aVar);
                    arrayList2.add(aVar);
                    i10++;
                }
                return new n3.b(arrayList2);
            case 24:
                l.d(obj, "null cannot be cast to non-null type kotlin.String");
                String str3 = (String) obj;
                Locale localeForLanguageTag = Locale.forLanguageTag(str3);
                if (l.b(localeForLanguageTag.toLanguageTag(), "und")) {
                    System.err.println("The language tag " + str3 + " is not well-formed. Locale is resolved to Undetermined. Note that underscore '_' is not a valid subtag delimiter and must be replaced with '-'.");
                }
                return new n3.a(localeForLanguageTag);
            case 25:
                l.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                List list14 = (List) obj;
                Object obj25 = list14.get(0);
                String str4 = obj25 != null ? (String) obj25 : null;
                l.c(str4);
                Object obj26 = list14.get(1);
                qh.c cVar4 = d0.f7057i;
                if (!l.b(obj26, Boolean.FALSE) && obj26 != null) {
                    l0Var = (l0) ((ej.c) cVar4.f13508c).invoke(obj26);
                }
                return new j(str4, l0Var);
            case 26:
                l.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list15 = (List) obj;
                Object obj27 = list15.get(0);
                float f13 = r3.f.f13671b;
                c0 c0Var3 = d0.B;
                Boolean bool5 = Boolean.FALSE;
                l.b(obj27, bool5);
                r3.f fVar = obj27 != null ? (r3.f) c0Var3.f7044b.invoke(obj27) : null;
                l.c(fVar);
                float f14 = fVar.f13674a;
                Object obj28 = list15.get(1);
                c0 c0Var4 = d0.C;
                l.b(obj28, bool5);
                h hVar = obj28 != null ? (h) c0Var4.f7044b.invoke(obj28) : null;
                l.c(hVar);
                int i12 = hVar.f13676a;
                Object obj29 = list15.get(2);
                c0 c0Var5 = d0.D;
                l.b(obj29, bool5);
                r3.g gVar = obj29 != null ? (r3.g) c0Var5.f7044b.invoke(obj29) : null;
                l.c(gVar);
                return new i(f14, i12, gVar.f13675a);
            case 27:
                l.d(obj, "null cannot be cast to non-null type kotlin.Float");
                float fFloatValue3 = ((Float) obj).floatValue();
                r3.f.a(fFloatValue3);
                return new r3.f(fFloatValue3);
            case 28:
                l.d(obj, "null cannot be cast to non-null type kotlin.Int");
                return new h(((Integer) obj).intValue());
            default:
                l.d(obj, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
                List list16 = (List) obj;
                Object obj30 = list16.get(0);
                g3.h hVar2 = obj30 != null ? (g3.h) obj30 : null;
                l.c(hVar2);
                Object obj31 = list16.get(2);
                Integer num3 = obj31 != null ? (Integer) obj31 : null;
                l.c(num3);
                int iIntValue3 = num3.intValue();
                Object obj32 = list16.get(3);
                Integer num4 = obj32 != null ? (Integer) obj32 : null;
                l.c(num4);
                int iIntValue4 = num4.intValue();
                Object obj33 = list16.get(4);
                String str5 = obj33 != null ? (String) obj33 : null;
                l.c(str5);
                switch (hVar2.ordinal()) {
                    case 0:
                        Object obj34 = list16.get(1);
                        qh.c cVar5 = d0.f7055g;
                        if (!l.b(obj34, Boolean.FALSE) && obj34 != null) {
                            tVar = (t) ((ej.c) cVar5.f13508c).invoke(obj34);
                        }
                        l.c(tVar);
                        return new g3.d(tVar, iIntValue3, iIntValue4, str5);
                    case 1:
                        Object obj35 = list16.get(1);
                        qh.c cVar6 = d0.f7056h;
                        if (!l.b(obj35, Boolean.FALSE) && obj35 != null) {
                            f0Var2 = (f0) ((ej.c) cVar6.f13508c).invoke(obj35);
                        }
                        l.c(f0Var2);
                        return new g3.d(f0Var2, iIntValue3, iIntValue4, str5);
                    case 2:
                        Object obj36 = list16.get(1);
                        qh.c cVar7 = d0.f7051c;
                        if (!l.b(obj36, Boolean.FALSE) && obj36 != null) {
                            p0Var = (p0) ((ej.c) cVar7.f13508c).invoke(obj36);
                        }
                        l.c(p0Var);
                        return new g3.d(p0Var, iIntValue3, iIntValue4, str5);
                    case 3:
                        Object obj37 = list16.get(1);
                        qh.c cVar8 = d0.f7052d;
                        if (!l.b(obj37, Boolean.FALSE) && obj37 != null) {
                            o0Var = (o0) ((ej.c) cVar8.f13508c).invoke(obj37);
                        }
                        l.c(o0Var);
                        return new g3.d(o0Var, iIntValue3, iIntValue4, str5);
                    case 4:
                        Object obj38 = list16.get(1);
                        qh.c cVar9 = d0.f7053e;
                        if (!l.b(obj38, Boolean.FALSE) && obj38 != null) {
                            kVar = (k) ((ej.c) cVar9.f13508c).invoke(obj38);
                        }
                        l.c(kVar);
                        return new g3.d(kVar, iIntValue3, iIntValue4, str5);
                    case 5:
                        Object obj39 = list16.get(1);
                        qh.c cVar10 = d0.f7054f;
                        if (!l.b(obj39, Boolean.FALSE) && obj39 != null) {
                            jVar = (j) ((ej.c) cVar10.f13508c).invoke(obj39);
                        }
                        l.c(jVar);
                        return new g3.d(jVar, iIntValue3, iIntValue4, str5);
                    case 6:
                        Object obj40 = list16.get(1);
                        String str6 = obj40 != null ? (String) obj40 : null;
                        l.c(str6);
                        return new g3.d(new h0(str6), iIntValue3, iIntValue4, str5);
                    default:
                        throw new b3.e();
                }
        }
    }
}
