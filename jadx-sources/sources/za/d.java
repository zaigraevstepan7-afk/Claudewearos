package za;

import ab.g;
import b0.r;
import b0.z;
import c2.e0;
import c2.w;
import com.anonlab.voidlauncher.R;
import com.google.android.gms.internal.ads.zzbch;
import f1.a1;
import f1.i0;
import f1.m;
import f1.n1;
import f1.s;
import f1.t1;
import fj.l;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;
import lb.d3;
import p1.j;
import ra.d0;
import s.a0;
import s.b0;
import s.n0;
import t.m1;
import t.y;
import t2.q0;
import v.n;
import v1.o;
import v2.h;
import z.k;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final long f20478a = w.c(e0.c(5592405), 0.8f);

    /* renamed from: b, reason: collision with root package name */
    public static final long f20479b = w.c(e0.c(4210238), 0.8f);

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f20480c = 0;

    public static final void a(LocalDateTime localDateTime, ej.a aVar, i0 i0Var, int i10) {
        ej.a aVar2;
        i0 i0Var2;
        l.f(localDateTime, "dateTime");
        l.f(aVar, "onTap");
        i0Var.c0(650599179);
        v1.l lVar = v1.l.f17564b;
        int i11 = (i0Var.f(lVar) ? 4 : 2) | i10 | (i0Var.h(localDateTime) ? 32 : 16) | (i0Var.h(aVar) ? 256 : 128);
        if (i0Var.T(i11 & 1, (i11 & 147) != 146)) {
            int hour = localDateTime.getHour();
            int minute = localDateTime.getMinute();
            LocalDate localDate = localDateTime.toLocalDate();
            l.e(localDate, "toLocalDate(...)");
            int dayOfMonth = localDate.getDayOfMonth();
            String str = "th";
            if (11 > dayOfMonth || dayOfMonth >= 14) {
                int i12 = dayOfMonth % 10;
                if (i12 == 1) {
                    str = "st";
                } else if (i12 == 2) {
                    str = "nd";
                } else if (i12 == 3) {
                    str = "rd";
                }
            }
            String displayName = localDate.getMonth().getDisplayName(TextStyle.SHORT, Locale.ENGLISH);
            int year = localDate.getYear();
            aVar2 = aVar;
            i0Var2 = i0Var;
            b(lVar, hour, minute, dayOfMonth + str + " " + displayName + ", " + year, aVar2, i0Var2, (i11 & 14) | ((i11 << 6) & 57344));
        } else {
            aVar2 = aVar;
            i0Var2 = i0Var;
            i0Var2.W();
        }
        t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new g(localDateTime, i10, 26, aVar2);
        }
    }

    public static final void b(final o oVar, final int i10, final int i11, final String str, final ej.a aVar, i0 i0Var, final int i12) {
        int i13;
        i0 i0Var2;
        l.f(aVar, "onTap");
        i0Var.c0(1644157354);
        if ((i12 & 6) == 0) {
            i13 = (i0Var.f(oVar) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        int i14 = i13 | (i0Var.d(i10) ? 32 : 16) | (i0Var.d(i11) ? 256 : 128) | (i0Var.f(str) ? 2048 : 1024);
        if ((i12 & 24576) == 0) {
            i14 |= i0Var.h(aVar) ? 16384 : 8192;
        }
        if (i0Var.T(i14 & 1, (i14 & 9363) != 9362)) {
            b0.i0 i0Var3 = b0.t1.f1433c;
            o oVarC = oVar.c(i0Var3);
            Object objQ = i0Var.Q();
            f1.f fVar = m.f6385a;
            if (objQ == fVar) {
                objQ = m1.p(i0Var);
            }
            o oVarK = n.k(oVarC, (k) objQ, null, false, null, aVar, 28);
            q0 q0VarD = r.d(v1.b.f17547a, false);
            int iHashCode = Long.hashCode(i0Var.T);
            n1 n1VarL = i0Var.l();
            o oVarC2 = v1.a.c(i0Var, oVarK);
            h.f17668w.getClass();
            v2.f fVar2 = v2.g.f17645b;
            i0Var.e0();
            if (i0Var.S) {
                i0Var.k(fVar2);
            } else {
                i0Var.o0();
            }
            s.M(v2.g.f17649f, i0Var, q0VarD);
            s.M(v2.g.f17648e, i0Var, n1VarL);
            s.w(i0Var, Integer.valueOf(iHashCode), v2.g.f17650g);
            s.I(v2.g.f17651h, i0Var);
            s.M(v2.g.f17647d, i0Var, oVarC2);
            Object objQ2 = i0Var.Q();
            if (objQ2 == fVar) {
                objQ2 = s.A(Boolean.TRUE);
                i0Var.l0(objQ2);
            }
            a1 a1Var = (a1) objQ2;
            Object objQ3 = i0Var.Q();
            if (objQ3 == fVar) {
                objQ3 = new d0(3, a1Var, null);
                i0Var.l0(objQ3);
            }
            s.f((ej.e) objQ3, i0Var, pi.o.f13011a);
            i0Var2 = i0Var;
            n.b(yd.f.V(R.drawable.img_home_background, i0Var), null, i0Var3, null, t2.h.f15568f, 0.0f, i0Var2, 25016, 104);
            a0.b(((Boolean) a1Var.getValue()).booleanValue(), b0.w.f1450a.b(v1.l.f17564b, v1.b.f17551e), n0.b(t.d.t(zzbch.zzq.zzf, 0, y.f15329d, 2)), null, null, j.d(2107029004, new ej.f() { // from class: za.b
                @Override // ej.f
                public final Object c(Object obj, Object obj2, Object obj3) {
                    i0 i0Var4 = (i0) obj2;
                    ((Integer) obj3).getClass();
                    l.f((b0) obj, "$this$AnimatedVisibility");
                    float fFloatValue = ((Number) i0Var4.j(jb.c.f8800a)).floatValue();
                    v1.e eVar = v1.b.F;
                    boolean zC = i0Var4.c(fFloatValue);
                    Object objQ4 = i0Var4.Q();
                    if (zC || objQ4 == m.f6385a) {
                        objQ4 = new d3(fFloatValue, 2);
                        i0Var4.l0(objQ4);
                    }
                    o oVarQ = e0.q(v1.l.f17564b, (ej.c) objQ4);
                    b0.b0 b0VarA = z.a(b0.j.f1361c, eVar, i0Var4, 48);
                    int iHashCode2 = Long.hashCode(i0Var4.T);
                    n1 n1VarL2 = i0Var4.l();
                    o oVarC3 = v1.a.c(i0Var4, oVarQ);
                    h.f17668w.getClass();
                    v2.f fVar3 = v2.g.f17645b;
                    i0Var4.e0();
                    if (i0Var4.S) {
                        i0Var4.k(fVar3);
                    } else {
                        i0Var4.o0();
                    }
                    s.M(v2.g.f17649f, i0Var4, b0VarA);
                    s.M(v2.g.f17648e, i0Var4, n1VarL2);
                    s.w(i0Var4, Integer.valueOf(iHashCode2), v2.g.f17650g);
                    s.I(v2.g.f17651h, i0Var4);
                    s.M(v2.g.f17647d, i0Var4, oVarC3);
                    u3.c.b(str, w.c(e0.c(4210238), 0.8f), i0Var4, 48);
                    long j = d.f20478a;
                    long j4 = d.f20479b;
                    int i15 = i10;
                    if (i15 < 0 || i15 >= 24) {
                        throw new IllegalArgumentException("Hours must be between 0 and 23");
                    }
                    int i16 = i11;
                    if (i16 < 0 || i16 >= 60) {
                        throw new IllegalArgumentException("Minutes must be between 0 and 59");
                    }
                    u0.b.b(null, new e(new pi.h(new a(a.a(i15 / 10, j)), new a(a.a(i15 % 10, j4))), new pi.h(new a(a.a(i16 / 10, j4)), new a(a.a(i16 % 10, j)))), hj.a.x(176), i0Var4, 384);
                    i0Var4.p(true);
                    return pi.o.f13011a;
                }
            }, i0Var2), i0Var2, 196608, 24);
            i0Var2.p(true);
        } else {
            i0Var2 = i0Var;
            i0Var2.W();
        }
        t1 t1VarU = i0Var2.u();
        if (t1VarU != null) {
            t1VarU.f6456d = new ej.e() { // from class: za.c
                @Override // ej.e
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    d.b(oVar, i10, i11, str, aVar, (i0) obj, s.O(i12 | 1));
                    return pi.o.f13011a;
                }
            };
        }
    }
}
