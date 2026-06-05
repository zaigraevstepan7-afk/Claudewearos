package c1;

import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class n8 implements t2.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final d1.j0 f2491a;

    /* renamed from: b, reason: collision with root package name */
    public final b0.i f2492b;

    /* renamed from: c, reason: collision with root package name */
    public final float f2493c;

    public n8(d1.j0 j0Var, b0.i iVar, float f10) {
        this.f2491a = j0Var;
        this.f2492b = iVar;
        this.f2493c = f10;
    }

    @Override // t2.q0
    public final t2.r0 a(final t2.s0 s0Var, List list, final long j) {
        int iH;
        final n8 n8Var = this;
        int size = list.size();
        final int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            t2.p0 p0Var = (t2.p0) list.get(i11);
            if (fj.l.b(t2.z.i(p0Var), "navigationIcon")) {
                final t2.f1 f1VarY = p0Var.Y(s3.a.a(j, 0, 0, 0, 0, 14));
                int size2 = list.size();
                int i12 = 0;
                while (i12 < size2) {
                    t2.p0 p0Var2 = (t2.p0) list.get(i12);
                    if (fj.l.b(t2.z.i(p0Var2), "actionIcons")) {
                        final t2.f1 f1VarY2 = p0Var2.Y(s3.a.a(j, 0, 0, 0, 0, 14));
                        if (s3.a.h(j) == Integer.MAX_VALUE) {
                            iH = s3.a.h(j);
                        } else {
                            iH = (s3.a.h(j) - f1VarY.f15550a) - f1VarY2.f15550a;
                            if (iH < 0) {
                                iH = 0;
                            }
                        }
                        int i13 = iH;
                        int size3 = list.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            t2.p0 p0Var3 = (t2.p0) list.get(i14);
                            if (fj.l.b(t2.z.i(p0Var3), "title")) {
                                final t2.f1 f1VarY3 = p0Var3.Y(s3.a.a(j, 0, i13, 0, 0, 12));
                                t2.m mVar = t2.d.f15529b;
                                final int iX0 = f1VarY3.x0(mVar) != Integer.MIN_VALUE ? f1VarY3.x0(mVar) : 0;
                                float fA = n8Var.f2491a.a();
                                int iH2 = Float.isNaN(fA) ? 0 : hj.a.H(fA);
                                final int iMax = Math.max(s0Var.I0(n8Var.f2493c), f1VarY3.f15551b);
                                if (s3.a.g(j) == Integer.MAX_VALUE) {
                                    i10 = iMax;
                                } else {
                                    int i15 = iH2 + iMax;
                                    if (i15 >= 0) {
                                        i10 = i15;
                                    }
                                }
                                return s0Var.B(s3.a.h(j), i10, qi.t.f13521a, new ej.c(i10, f1VarY3, f1VarY2, j, s0Var, n8Var, iX0, iMax) { // from class: c1.m8

                                    /* renamed from: b, reason: collision with root package name */
                                    public final /* synthetic */ int f2447b;

                                    /* renamed from: c, reason: collision with root package name */
                                    public final /* synthetic */ t2.f1 f2448c;

                                    /* renamed from: d, reason: collision with root package name */
                                    public final /* synthetic */ t2.f1 f2449d;

                                    /* renamed from: e, reason: collision with root package name */
                                    public final /* synthetic */ long f2450e;

                                    /* renamed from: f, reason: collision with root package name */
                                    public final /* synthetic */ t2.s0 f2451f;

                                    /* renamed from: z, reason: collision with root package name */
                                    public final /* synthetic */ n8 f2452z;

                                    /* JADX WARN: Removed duplicated region for block: B:11:0x0062  */
                                    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
                                    @Override // ej.c
                                    /*
                                        Code decompiled incorrectly, please refer to instructions dump.
                                        To view partially-correct add '--show-bad-code' argument
                                    */
                                    public final java.lang.Object invoke(java.lang.Object r12) {
                                        /*
                                            r11 = this;
                                            t2.e1 r12 = (t2.e1) r12
                                            t2.f1 r0 = r11.f2446a
                                            int r1 = r0.f15551b
                                            int r2 = r11.f2447b
                                            int r1 = r2 - r1
                                            int r1 = r1 / 2
                                            r3 = 0
                                            t2.e1.D(r12, r0, r3, r1)
                                            float r1 = c1.p.f2569c
                                            t2.s0 r4 = r11.f2451f
                                            int r1 = r4.I0(r1)
                                            int r0 = r0.f15550a
                                            int r0 = java.lang.Math.max(r1, r0)
                                            t2.f1 r1 = r11.f2449d
                                            int r4 = r1.f15550a
                                            t2.f1 r5 = r11.f2448c
                                            int r6 = r5.f15550a
                                            long r7 = r11.f2450e
                                            int r9 = s3.a.h(r7)
                                            s3.m r10 = s3.m.f14752a
                                            int r9 = r9 - r6
                                            float r6 = (float) r9
                                            r9 = 1073741824(0x40000000, float:2.0)
                                            float r6 = r6 / r9
                                            s3.m r9 = s3.m.f14752a
                                            r9 = 1
                                            float r9 = (float) r9
                                            r10 = -1082130432(0xffffffffbf800000, float:-1.0)
                                            int r6 = m6.a.a(r9, r10, r6)
                                            if (r6 >= r0) goto L42
                                            int r0 = r0 - r6
                                        L40:
                                            int r6 = r6 + r0
                                            goto L56
                                        L42:
                                            int r0 = r5.f15550a
                                            int r0 = r0 + r6
                                            int r9 = s3.a.h(r7)
                                            int r9 = r9 - r4
                                            if (r0 <= r9) goto L56
                                            int r0 = s3.a.h(r7)
                                            int r0 = r0 - r4
                                            int r4 = r5.f15550a
                                            int r4 = r4 + r6
                                            int r0 = r0 - r4
                                            goto L40
                                        L56:
                                            c1.n8 r0 = r11.f2452z
                                            b0.i r0 = r0.f2492b
                                            b0.f r4 = b0.j.f1363e
                                            boolean r4 = fj.l.b(r0, r4)
                                            if (r4 == 0) goto L69
                                            int r0 = r5.f15551b
                                            int r0 = r2 - r0
                                            int r3 = r0 / 2
                                            goto L75
                                        L69:
                                            b0.e r4 = b0.j.f1362d
                                            boolean r0 = fj.l.b(r0, r4)
                                            if (r0 == 0) goto L75
                                            int r0 = r5.f15551b
                                            int r3 = r2 - r0
                                        L75:
                                            t2.e1.D(r12, r5, r6, r3)
                                            int r0 = s3.a.h(r7)
                                            int r3 = r1.f15550a
                                            int r0 = r0 - r3
                                            int r3 = r1.f15551b
                                            int r2 = r2 - r3
                                            int r2 = r2 / 2
                                            t2.e1.D(r12, r1, r0, r2)
                                            pi.o r12 = pi.o.f13011a
                                            return r12
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: c1.m8.invoke(java.lang.Object):java.lang.Object");
                                    }
                                });
                            }
                            i14++;
                            n8Var = this;
                        }
                        u3.b.b("Collection contains no element matching the predicate.");
                        throw new b3.e();
                    }
                    i12++;
                    n8Var = this;
                }
                u3.b.b("Collection contains no element matching the predicate.");
                throw new b3.e();
            }
            i11++;
            n8Var = this;
        }
        u3.b.b("Collection contains no element matching the predicate.");
        throw new b3.e();
    }

    @Override // t2.q0
    public final int f(t2.r rVar, List list, int i10) {
        Integer num;
        int iI0 = rVar.I0(this.f2493c);
        if (list.isEmpty()) {
            num = null;
        } else {
            Integer numValueOf = Integer.valueOf(((t2.p0) list.get(0)).v0(i10));
            int iB = yd.f.B(list);
            int i11 = 1;
            if (1 <= iB) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((t2.p0) list.get(i11)).v0(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iB) {
                        break;
                    }
                    i11++;
                }
            }
            num = numValueOf;
        }
        return Math.max(iI0, num != null ? num.intValue() : 0);
    }

    @Override // t2.q0
    public final int g(t2.r rVar, List list, int i10) {
        int size = list.size();
        int iO = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iO += ((t2.p0) list.get(i11)).O(i10);
        }
        return iO;
    }

    @Override // t2.q0
    public final int h(t2.r rVar, List list, int i10) {
        int size = list.size();
        int iV = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iV += ((t2.p0) list.get(i11)).V(i10);
        }
        return iV;
    }

    @Override // t2.q0
    public final int i(t2.r rVar, List list, int i10) {
        Integer num;
        int iI0 = rVar.I0(this.f2493c);
        if (list.isEmpty()) {
            num = null;
        } else {
            Integer numValueOf = Integer.valueOf(((t2.p0) list.get(0)).l(i10));
            int iB = yd.f.B(list);
            int i11 = 1;
            if (1 <= iB) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((t2.p0) list.get(i11)).l(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == iB) {
                        break;
                    }
                    i11++;
                }
            }
            num = numValueOf;
        }
        return Math.max(iI0, num != null ? num.intValue() : 0);
    }
}
