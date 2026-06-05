package v2;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final t2.f1 f17652a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f17654c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f17655d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f17656e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f17657f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f17658g;

    /* renamed from: h, reason: collision with root package name */
    public a f17659h;
    public final /* synthetic */ int j;

    /* renamed from: b, reason: collision with root package name */
    public boolean f17653b = true;

    /* renamed from: i, reason: collision with root package name */
    public final HashMap f17660i = new HashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public g0(a aVar, int i10) {
        this.j = i10;
        this.f17652a = (t2.f1) aVar;
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [ej.e, fj.j] */
    /* JADX WARN: Type inference failed for: r3v7, types: [t2.f1, v2.a] */
    public static final void a(g0 g0Var, t2.a aVar, int i10, i1 i1Var) {
        HashMap map = g0Var.f17660i;
        float f10 = i10;
        long jFloatToRawIntBits = Float.floatToRawIntBits(f10) << 32;
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f10) & 4294967295L;
        while (true) {
            long jX = jFloatToRawIntBits | jFloatToRawIntBits2;
            do {
                switch (g0Var.j) {
                    case 0:
                        q1 q1Var = i1Var.f17688e0;
                        if (q1Var != null) {
                            jX = ((w2.l1) q1Var).c(jX, false);
                        }
                        jX = yd.f.X(jX, i1Var.S);
                        break;
                    default:
                        o0 o0VarU1 = i1Var.u1();
                        fj.l.c(o0VarU1);
                        long j = o0VarU1.I;
                        jX = b2.b.f((Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32), jX);
                        break;
                }
                i1Var = i1Var.J;
                fj.l.c(i1Var);
                if (i1Var.equals(g0Var.f17652a.A())) {
                    int iRound = Math.round(aVar instanceof t2.m ? Float.intBitsToFloat((int) (jX & 4294967295L)) : Float.intBitsToFloat((int) (jX >> 32)));
                    if (map.containsKey(aVar)) {
                        int iIntValue = ((Number) qi.v.f0(map, aVar)).intValue();
                        t2.m mVar = t2.d.f15528a;
                        iRound = ((Number) aVar.f15526a.invoke(Integer.valueOf(iIntValue), Integer.valueOf(iRound))).intValue();
                    }
                    map.put(aVar, Integer.valueOf(iRound));
                    return;
                }
            } while (!g0Var.b(i1Var).containsKey(aVar));
            float fC = g0Var.c(i1Var, aVar);
            long jFloatToRawIntBits3 = Float.floatToRawIntBits(fC);
            long jFloatToRawIntBits4 = Float.floatToRawIntBits(fC);
            jFloatToRawIntBits = jFloatToRawIntBits3 << 32;
            jFloatToRawIntBits2 = jFloatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(i1 i1Var) {
        switch (this.j) {
            case 0:
                return i1Var.e1().f();
            default:
                o0 o0VarU1 = i1Var.u1();
                fj.l.c(o0VarU1);
                return o0VarU1.e1().f();
        }
    }

    public final int c(i1 i1Var, t2.a aVar) {
        switch (this.j) {
            case 0:
                return i1Var.x0(aVar);
            default:
                o0 o0VarU1 = i1Var.u1();
                fj.l.c(o0VarU1);
                return o0VarU1.x0(aVar);
        }
    }

    public final boolean d() {
        return this.f17654c || this.f17656e || this.f17657f || this.f17658g;
    }

    public final boolean e() {
        h();
        return this.f17659h != null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [t2.f1, v2.a] */
    public final void f() {
        this.f17653b = true;
        ?? r02 = this.f17652a;
        a aVarD = r02.D();
        if (aVarD == null) {
            return;
        }
        if (this.f17654c) {
            aVarD.u0();
        } else if (this.f17656e || this.f17655d) {
            aVarD.requestLayout();
        }
        if (this.f17657f) {
            r02.u0();
        }
        if (this.f17658g) {
            r02.requestLayout();
        }
        aVarD.f().f();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [t2.f1, v2.a] */
    public final void g() {
        HashMap map = this.f17660i;
        map.clear();
        c2.x0 x0Var = new c2.x0(this, 15);
        ?? r2 = this.f17652a;
        r2.r(x0Var);
        map.putAll(b(r2.A()));
        this.f17653b = false;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0023  */
    /* JADX WARN: Type inference failed for: r1v0, types: [t2.f1, v2.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            r2 = this;
            boolean r0 = r2.d()
            t2.f1 r1 = r2.f17652a
            if (r0 == 0) goto L9
            goto L51
        L9:
            v2.a r0 = r1.D()
            if (r0 != 0) goto L10
            goto L53
        L10:
            v2.g0 r0 = r0.f()
            v2.a r1 = r0.f17659h
            if (r1 == 0) goto L23
            v2.g0 r0 = r1.f()
            boolean r0 = r0.d()
            if (r0 == 0) goto L23
            goto L51
        L23:
            v2.a r0 = r2.f17659h
            if (r0 == 0) goto L53
            v2.g0 r1 = r0.f()
            boolean r1 = r1.d()
            if (r1 == 0) goto L32
            goto L53
        L32:
            v2.a r1 = r0.D()
            if (r1 == 0) goto L41
            v2.g0 r1 = r1.f()
            if (r1 == 0) goto L41
            r1.h()
        L41:
            v2.a r0 = r0.D()
            if (r0 == 0) goto L50
            v2.g0 r0 = r0.f()
            if (r0 == 0) goto L50
            v2.a r1 = r0.f17659h
            goto L51
        L50:
            r1 = 0
        L51:
            r2.f17659h = r1
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v2.g0.h():void");
    }
}
