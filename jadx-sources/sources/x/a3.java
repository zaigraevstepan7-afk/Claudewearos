package x;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a3 extends n1 {

    /* renamed from: f, reason: collision with root package name */
    public final sj.c f19445f;

    /* renamed from: g, reason: collision with root package name */
    public qj.s1 f19446g;

    public a3(l2 l2Var, p1.d dVar, s3.c cVar) {
        super(l2Var, dVar, cVar);
        this.f19445f = u6.v.a(com.google.android.gms.common.api.f.API_PRIORITY_OTHER, 6, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x00e0, code lost:
    
        if (r0.invoke(r3, r7) == r8) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Type inference failed for: r0v10, types: [ej.e, fj.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(x.a3 r16, x.l2 r17, x.y2 r18, vi.c r19) {
        /*
            Method dump skipped, instructions count: 230
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: x.a3.c(x.a3, x.l2, x.y2, vi.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static y2 e(sj.c cVar) {
        y2 y2Var = null;
        mj.g gVarY = mk.b.y(new k0.x0((Object) new f1(cVar, 1), (ti.c) (0 == true ? 1 : 0), 2));
        while (gVarY.hasNext()) {
            y2 y2VarA = (y2) gVarY.next();
            if (y2Var != null) {
                y2VarA = y2Var.a(y2VarA);
            }
            y2Var = y2VarA;
        }
        return y2Var;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.util.List] */
    public final boolean d(p2.n nVar) {
        boolean z2;
        boolean z10;
        boolean z11;
        sj.c cVar;
        l2 l2Var;
        p2.w wVar = (p2.w) qi.l.A0(nVar.f12734a);
        if (wVar != null) {
            List list = wVar.f12771m;
            if (list == null) {
                list = qi.s.f13520a;
            }
            int size = list.size();
            int i10 = 0;
            z11 = false;
            while (true) {
                cVar = this.f19445f;
                l2Var = this.f19651a;
                if (i10 >= size) {
                    break;
                }
                p2.c cVar2 = (p2.c) list.get(i10);
                long j = cVar2.f12676d ^ (-9223372034707292160L);
                if (!(l2Var.i(l2Var.e(j)) == 0.0f)) {
                    z11 = !(cVar.h(new y2(j, cVar2.f12673a, false)) instanceof sj.i) || z11;
                }
                i10++;
            }
            z2 = true;
            z10 = false;
            long j4 = wVar.f12770l ^ (-9223372034707292160L);
            boolean z12 = nVar.f12739f == 12;
            if (!(l2Var.i(l2Var.e(j4)) == 0.0f) || z12) {
                if (!(cVar.h(new y2(j4, wVar.f12761b, z12)) instanceof sj.i) || z11) {
                    z11 = true;
                }
            }
            return (!z11 || this.f19654d) ? z2 : z10;
        }
        z2 = true;
        z10 = false;
        z11 = z10;
        if (z11) {
        }
    }
}
