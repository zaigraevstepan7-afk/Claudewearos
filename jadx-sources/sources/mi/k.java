package mi;

import android.os.Build;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f11767a = u6.v.P(pi.f.f12998b, new jb.e(16));

    public static float a(i iVar) {
        float fD = d(iVar);
        m mVar = iVar.J;
        if (fj.l.b(mVar, m.f11769a)) {
            return 1.0f;
        }
        if (fj.l.b(mVar, l.f11768a)) {
            return s3.f.b(fD, (float) 7) < 0 ? 1.0f : 0.3334f;
        }
        throw new b3.e();
    }

    public static final long b(i iVar) {
        long j = iVar.U;
        if (j == 16) {
            j = iVar.L.f11774a;
        }
        return j != 16 ? j : iVar.K.f11774a;
    }

    public static final boolean c(i iVar) {
        p pVar = iVar.H;
        if (pVar != null) {
            return ((Boolean) pVar.f11772b.getValue()).booleanValue();
        }
        float f10 = e.f11753a;
        return Build.VERSION.SDK_INT >= 31;
    }

    public static final float d(i iVar) {
        float f10 = iVar.S;
        if (Float.isNaN(f10)) {
            f10 = iVar.L.f11776c;
        }
        return !Float.isNaN(f10) ? f10 : iVar.K.f11776c;
    }

    public static final float e(i iVar) {
        float f10 = iVar.T;
        if (0.0f > f10 || f10 > 1.0f) {
            f10 = iVar.L.f11777d;
        }
        return (0.0f > f10 || f10 > 1.0f) ? iVar.K.f11777d : f10;
    }

    public static final List f(i iVar) {
        iVar.V.getClass();
        List list = iVar.L.f11775b;
        if (list.isEmpty()) {
            list = null;
        }
        if (list != null) {
            return list;
        }
        List list2 = iVar.K.f11775b;
        List list3 = list2.isEmpty() ? null : list2;
        return list3 == null ? qi.s.f13520a : list3;
    }
}
