package mi;

import android.content.Context;
import android.renderscript.RenderScript;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import f1.r2;
import qj.m0;
import qj.s1;
import v2.h0;
import w2.f1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b0 implements a {

    /* renamed from: h, reason: collision with root package name */
    public static boolean f11729h = true;

    /* renamed from: a, reason: collision with root package name */
    public final i f11730a;

    /* renamed from: b, reason: collision with root package name */
    public final RenderScript f11731b;

    /* renamed from: c, reason: collision with root package name */
    public d0 f11732c;

    /* renamed from: d, reason: collision with root package name */
    public final e2.b f11733d = new e2.b();

    /* renamed from: e, reason: collision with root package name */
    public s1 f11734e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11735f;

    /* renamed from: g, reason: collision with root package name */
    public final f2.b f11736g;

    public b0(i iVar) {
        this.f11730a = iVar;
        this.f11731b = RenderScript.create((Context) v2.n.h(iVar, AndroidCompositionLocals_androidKt.f838b));
        this.f11736g = ((c2.b0) v2.n.h(iVar, f1.f18261g)).b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001b  */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v2, types: [int] */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r4v9, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v9 */
    /* JADX WARN: Type inference failed for: r9v10, types: [int] */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v7, types: [int] */
    /* JADX WARN: Type inference failed for: r9v8, types: [int] */
    /* JADX WARN: Type inference failed for: r9v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(mi.b0 r18, f2.b r19, float r20, vi.c r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 459
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mi.b0.c(mi.b0, f2.b, float, vi.c):java.lang.Object");
    }

    @Override // mi.a
    public final void a(final h0 h0Var) throws Throwable {
        i iVar;
        s1 s1Var;
        final b0 b0Var = this;
        r2 r2Var = AndroidCompositionLocals_androidKt.f838b;
        i iVar2 = b0Var.f11730a;
        final Context context = (Context) v2.n.h(iVar2, r2Var);
        final long j = iVar2.R;
        final fj.s sVar = new fj.s();
        float fA = k.a(iVar2);
        sVar.f6804a = fA;
        fj.s sVar2 = new fj.s();
        h0Var.e();
        float fW0 = h0Var.w0(k.d(iVar2)) * fA;
        sVar2.f6804a = fW0;
        if (fW0 > 25.0f) {
            sVar.f6804a = (25.0f / fW0) * sVar.f6804a;
            sVar2.f6804a = 25.0f;
        }
        f2.b bVar = b0Var.f11736g;
        if (s3.l.b(bVar.f6533u, 0L) || (s1Var = b0Var.f11734e) == null || !s1Var.b()) {
            b0Var.f11735f = false;
            f2.b bVarB = d.b(h0Var, iVar2, sVar.f6804a, iVar2.Q, j);
            iVar = iVar2;
            if (bVarB != null) {
                bVarB.g(iVar.f11763c0 != null);
                ti.c cVar = null;
                if (s3.l.b(bVar.f6533u, 0L)) {
                    qj.b0.A(ti.i.f16336a, new z(b0Var, bVarB, sVar2, cVar, 0));
                    b0Var = this;
                } else {
                    qj.z zVarE1 = iVar.e1();
                    xj.e eVar = m0.f13601a;
                    b0Var = this;
                    b0Var.f11734e = qj.b0.w(zVarE1, vj.n.f18117a.f14555f, new z(b0Var, bVarB, sVar2, cVar, 1), 2);
                }
            }
        } else {
            b0Var.f11735f = true;
            iVar = iVar2;
        }
        ej.c cVar2 = new ej.c() { // from class: mi.y
            @Override // ej.c
            public final Object invoke(Object obj) {
                f2.b bVar2 = (f2.b) obj;
                fj.l.f(bVar2, "layer");
                b0 b0Var2 = this.f11801a;
                i iVar3 = b0Var2.f11730a;
                bVar2.f(iVar3.X);
                Object obj2 = k.f11767a;
                bVar2.g(iVar3.f11763c0 != null);
                h0 h0Var2 = h0Var;
                h0Var2.n0(bVar2, cg.b.R(h0Var2.f17669a.a()), new g3.m(j, sVar, b0Var2, context));
                u6.v.C(h0Var2, bVar2);
                return pi.o.f13011a;
            }
        };
        c2.b0 b0Var2 = (c2.b0) v2.n.h(iVar, f1.f18261g);
        f2.b bVarB2 = b0Var2.b();
        try {
            cVar2.invoke(bVarB2);
        } finally {
            b0Var2.a(bVarB2);
        }
    }

    @Override // mi.a
    public final void b() {
        s1 s1Var = this.f11734e;
        if (s1Var != null) {
            s1Var.e(null);
        }
        ((c2.b0) v2.n.h(this.f11730a, f1.f18261g)).a(this.f11736g);
        d0 d0Var = this.f11732c;
        if (d0Var != null) {
            d0Var.f11752h = true;
            d0Var.f11747c.destroy();
            d0Var.f11748d.destroy();
            d0Var.f11749e.destroy();
            d0Var.f11745a.destroy();
        }
    }
}
