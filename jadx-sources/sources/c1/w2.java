package c1;

import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class w2 extends v1.n implements v2.i, v2.w {
    public LinkedHashMap H;

    @Override // v2.w
    public final t2.r0 r(t2.s0 s0Var, t2.p0 p0Var, long j) {
        float f10 = ((s3.f) v2.n.h(this, g2.f2119c)).f14742a;
        float f11 = 0;
        if (f10 < f11) {
            f10 = f11;
        }
        t2.f1 f1VarY = p0Var.Y(j);
        boolean z2 = this.G && !Float.isNaN(f10) && s3.f.b(f10, f11) > 0;
        int iI0 = !Float.isNaN(f10) ? s0Var.I0(f10) : 0;
        int iMax = z2 ? Math.max(f1VarY.f15550a, iI0) : f1VarY.f15550a;
        int iMax2 = z2 ? Math.max(f1VarY.f15551b, iI0) : f1VarY.f15551b;
        if (z2) {
            LinkedHashMap linkedHashMap = this.H;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.H = linkedHashMap;
            }
            t2.s1 s1Var = g2.f2118b;
            int iRound = Math.round((iI0 - f1VarY.f15550a) / 2.0f);
            if (iRound < 0) {
                iRound = 0;
            }
            linkedHashMap.put(s1Var, Integer.valueOf(iRound));
            t2.m mVar = g2.f2117a;
            int iRound2 = Math.round((iI0 - f1VarY.f15551b) / 2.0f);
            linkedHashMap.put(mVar, Integer.valueOf(iRound2 >= 0 ? iRound2 : 0));
        }
        Map map = this.H;
        if (map == null) {
            map = qi.t.f13521a;
        }
        return s0Var.B(iMax, iMax2, map, new b0.r0(iMax, iMax2, f1VarY));
    }
}
