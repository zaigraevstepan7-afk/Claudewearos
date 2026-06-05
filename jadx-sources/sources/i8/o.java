package i8;

import java.util.ArrayList;
import qi.t;
import t2.b0;
import t2.f1;
import t2.p0;
import t2.r0;
import t2.s0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class o implements s8.i, b0 {

    /* renamed from: b, reason: collision with root package name */
    public long f8395b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f8396c;

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // s8.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object d(ti.c r8) throws java.lang.Throwable {
        /*
            r7 = this;
            boolean r0 = r8 instanceof i8.n
            if (r0 == 0) goto L13
            r0 = r8
            i8.n r0 = (i8.n) r0
            int r1 = r0.f8394d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8394d = r1
            goto L1a
        L13:
            i8.n r0 = new i8.n
            vi.c r8 = (vi.c) r8
            r0.<init>(r7, r8)
        L1a:
            java.lang.Object r8 = r0.f8392b
            ui.a r1 = ui.a.f17085a
            int r2 = r0.f8394d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            fj.v r0 = r0.f8391a
            uk.c.R(r8)     // Catch: java.lang.Throwable -> L2b
            goto L64
        L2b:
            r8 = move-exception
            goto L74
        L2d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L35:
            uk.c.R(r8)
            long r4 = r7.f8395b
            boolean r8 = s3.a.k(r4)
            if (r8 == 0) goto L80
            fj.v r8 = new fj.v
            r8.<init>()
            r0.f8391a = r8     // Catch: java.lang.Throwable -> L70
            r0.f8394d = r3     // Catch: java.lang.Throwable -> L70
            qj.l r2 = new qj.l     // Catch: java.lang.Throwable -> L70
            ti.c r0 = u3.a.g(r0)     // Catch: java.lang.Throwable -> L70
            r2.<init>(r3, r0)     // Catch: java.lang.Throwable -> L70
            r2.p()     // Catch: java.lang.Throwable -> L70
            r8.f6807a = r2     // Catch: java.lang.Throwable -> L70
            java.util.ArrayList r0 = r7.f8396c     // Catch: java.lang.Throwable -> L70
            r0.add(r2)     // Catch: java.lang.Throwable -> L70
            java.lang.Object r0 = r2.o()     // Catch: java.lang.Throwable -> L70
            if (r0 != r1) goto L63
            return r1
        L63:
            r0 = r8
        L64:
            java.util.ArrayList r8 = r7.f8396c
            java.lang.Object r0 = r0.f6807a
            java.util.Collection r8 = fj.y.a(r8)
            r8.remove(r0)
            goto L80
        L70:
            r0 = move-exception
            r6 = r0
            r0 = r8
            r8 = r6
        L74:
            java.util.ArrayList r1 = r7.f8396c
            java.lang.Object r0 = r0.f6807a
            java.util.Collection r1 = fj.y.a(r1)
            r1.remove(r0)
            throw r8
        L80:
            long r0 = r7.f8395b
            s8.h r8 = new s8.h
            int r2 = s3.a.h(r0)
            s8.b r3 = s8.b.f14779a
            r4 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r4) goto L98
            wd.a.d(r2)
            s8.a r5 = new s8.a
            r5.<init>(r2)
            goto L99
        L98:
            r5 = r3
        L99:
            int r0 = s3.a.g(r0)
            if (r0 == r4) goto La7
            wd.a.d(r0)
            s8.a r3 = new s8.a
            r3.<init>(r0)
        La7:
            r8.<init>(r5, r3)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: i8.o.d(ti.c):java.lang.Object");
    }

    public final void g(long j) {
        this.f8395b = j;
        if (s3.a.k(j)) {
            return;
        }
        ArrayList arrayList = this.f8396c;
        if (arrayList.isEmpty()) {
            return;
        }
        this.f8396c = new ArrayList();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((ti.c) obj).resumeWith(pi.o.f13011a);
        }
    }

    @Override // t2.b0
    public final r0 r(s0 s0Var, p0 p0Var, long j) {
        g(j);
        f1 f1VarY = p0Var.Y(j);
        return s0Var.B(f1VarY.f15550a, f1VarY.f15551b, t.f13521a, new b0.l(f1VarY, 9));
    }
}
