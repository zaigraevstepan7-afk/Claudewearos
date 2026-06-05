package g3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class g0 {

    /* renamed from: a, reason: collision with root package name */
    public static final long f7100a = hj.a.x(14);

    /* renamed from: b, reason: collision with root package name */
    public static final long f7101b = hj.a.x(0);

    /* renamed from: c, reason: collision with root package name */
    public static final long f7102c = c2.w.f3057g;

    /* renamed from: d, reason: collision with root package name */
    public static final r3.o f7103d;

    static {
        long j = c2.w.f3052b;
        f7103d = j != 16 ? new r3.c(j) : r3.n.f13690a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final g3.f0 a(g3.f0 r24, long r25, c2.s r27, float r28, long r29, k3.s r31, k3.o r32, k3.p r33, k3.j r34, java.lang.String r35, long r36, r3.a r38, r3.p r39, n3.b r40, long r41, r3.l r43, c2.v0 r44, g3.w r45, e2.e r46) {
        /*
            Method dump skipped, instructions count: 525
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: g3.g0.a(g3.f0, long, c2.s, float, long, k3.s, k3.o, k3.p, k3.j, java.lang.String, long, r3.a, r3.p, n3.b, long, r3.l, c2.v0, g3.w, e2.e):g3.f0");
    }

    public static final Object b(Object obj, Object obj2, float f10) {
        return ((double) f10) < 0.5d ? obj : obj2;
    }

    public static final long c(long j, long j4, float f10) {
        s3.p[] pVarArr = s3.o.f14756b;
        long j10 = j & 1095216660480L;
        if (j10 != 0) {
            long j11 = 1095216660480L & j4;
            if (j11 != 0) {
                if (j10 == 0 || j11 == 0) {
                    s3.i.a("Cannot perform operation for Unspecified type.");
                }
                if (!s3.p.a(s3.o.b(j), s3.o.b(j4))) {
                    s3.i.a("Cannot perform operation for " + ((Object) s3.p.b(s3.o.b(j))) + " and " + ((Object) s3.p.b(s3.o.b(j4))));
                }
                return hj.a.D(j10, u3.c.l(s3.o.c(j), s3.o.c(j4), f10));
            }
        }
        return ((s3.o) b(new s3.o(j), new s3.o(j4), f10)).f14758a;
    }
}
