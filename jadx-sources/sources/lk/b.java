package lk;

import fj.l;
import fj.r;
import fj.u;
import fj.v;
import java.io.IOException;
import kk.a0;
import kk.t;
import kk.x;
import pi.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final char[] f11001a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    public static final int a(char c6) {
        if ('0' <= c6 && c6 < ':') {
            return c6 - '0';
        }
        if ('a' <= c6 && c6 < 'g') {
            return c6 - 'W';
        }
        if ('A' <= c6 && c6 < 'G') {
            return c6 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c6);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.LinkedHashMap b(java.util.ArrayList r25) {
        /*
            Method dump skipped, instructions count: 360
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lk.b.b(java.util.ArrayList):java.util.LinkedHashMap");
    }

    public static final String c(int i10) {
        x8.a.n(16);
        String string = Integer.toString(i10, 16);
        l.e(string, "toString(...)");
        return "0x".concat(string);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01bd, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0054, code lost:
    
        if (r13 != (r10.s() & 65535)) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0056, code lost:
    
        if (r0 != 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        if (r9 != 0) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        r18 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
    
        r10.skip(4);
        r17 = r10.s() & 65535;
        r12 = new lk.d(r13, 4294967295L & r10.l(), r17);
        r10.t(r17);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007e, code lost:
    
        r10.close();
        r4 = r4 - 20;
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0088, code lost:
    
        if (r4 <= r18) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        r4 = u6.v.j(r3.b(r4));
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0099, code lost:
    
        if (r4.l() != 117853008) goto L137;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x009b, code lost:
    
        r5 = r4.l();
        r9 = r4.n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a8, code lost:
    
        if (r4.l() != 1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00aa, code lost:
    
        if (r5 != 0) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ac, code lost:
    
        r5 = u6.v.j(r3.b(r9));
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b4, code lost:
    
        r7 = r5.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bb, code lost:
    
        if (r7 != 101075792) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00bd, code lost:
    
        r5.skip(12);
        r7 = r5.l();
        r9 = r5.l();
        r21 = r5.n();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d4, code lost:
    
        if (r21 != r5.n()) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d6, code lost:
    
        if (r7 != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d8, code lost:
    
        if (r9 != 0) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00da, code lost:
    
        r5.skip(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ed, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ef, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00f8, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0121, code lost:
    
        throw new java.io.IOException("bad zip: expected " + c(101075792) + " but was " + c(r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0122, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0128, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0129, code lost:
    
        mk.b.i(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x012c, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0131, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0139, code lost:
    
        throw new java.io.IOException("unsupported zip: spanned");
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0145, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0146, code lost:
    
        mk.b.i(r0, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0149, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0037, code lost:
    
        r0 = r10.s() & 65535;
        r9 = r10.s() & 65535;
        r13 = r10.s() & 65535;
     */
    /* JADX WARN: Removed duplicated region for block: B:49:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0130 A[Catch: all -> 0x0131, TryCatch #1 {all -> 0x0131, blocks: (B:19:0x0092, B:21:0x009b, B:24:0x00ac, B:50:0x0130, B:46:0x0129, B:53:0x0134, B:54:0x0139, B:25:0x00b4, B:27:0x00bd, B:31:0x00da, B:36:0x00f3, B:37:0x00f8, B:39:0x00fb, B:40:0x0121, B:43:0x0124), top: B:121:0x0092, outer: #10, inners: #2, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x014d A[Catch: all -> 0x014e, TryCatch #10 {all -> 0x014e, blocks: (B:3:0x000f, B:5:0x001d, B:6:0x0026, B:16:0x007e, B:18:0x008a, B:66:0x014d, B:62:0x0146, B:69:0x0152, B:93:0x01a7, B:96:0x01b4, B:90:0x01a1, B:103:0x01c2, B:106:0x01d0, B:107:0x01d7, B:108:0x01d8, B:109:0x01db, B:110:0x01dc, B:111:0x01f1, B:87:0x019c, B:19:0x0092, B:21:0x009b, B:24:0x00ac, B:50:0x0130, B:46:0x0129, B:53:0x0134, B:54:0x0139, B:25:0x00b4, B:27:0x00bd, B:31:0x00da, B:36:0x00f3, B:37:0x00f8, B:39:0x00fb, B:40:0x0121, B:43:0x0124, B:70:0x0161, B:73:0x0167, B:75:0x0173, B:77:0x0181, B:80:0x0188, B:81:0x018d, B:82:0x0194, B:59:0x0141, B:7:0x002e, B:9:0x0037, B:15:0x005e, B:100:0x01b8, B:101:0x01bd), top: B:136:0x000f, inners: #0, #1, #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a7 A[Catch: all -> 0x014e, TRY_LEAVE, TryCatch #10 {all -> 0x014e, blocks: (B:3:0x000f, B:5:0x001d, B:6:0x0026, B:16:0x007e, B:18:0x008a, B:66:0x014d, B:62:0x0146, B:69:0x0152, B:93:0x01a7, B:96:0x01b4, B:90:0x01a1, B:103:0x01c2, B:106:0x01d0, B:107:0x01d7, B:108:0x01d8, B:109:0x01db, B:110:0x01dc, B:111:0x01f1, B:87:0x019c, B:19:0x0092, B:21:0x009b, B:24:0x00ac, B:50:0x0130, B:46:0x0129, B:53:0x0134, B:54:0x0139, B:25:0x00b4, B:27:0x00bd, B:31:0x00da, B:36:0x00f3, B:37:0x00f8, B:39:0x00fb, B:40:0x0121, B:43:0x0124, B:70:0x0161, B:73:0x0167, B:75:0x0173, B:77:0x0181, B:80:0x0188, B:81:0x018d, B:82:0x0194, B:59:0x0141, B:7:0x002e, B:9:0x0037, B:15:0x005e, B:100:0x01b8, B:101:0x01bd), top: B:136:0x000f, inners: #0, #1, #4, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x01b4 A[Catch: all -> 0x014e, TRY_ENTER, TRY_LEAVE, TryCatch #10 {all -> 0x014e, blocks: (B:3:0x000f, B:5:0x001d, B:6:0x0026, B:16:0x007e, B:18:0x008a, B:66:0x014d, B:62:0x0146, B:69:0x0152, B:93:0x01a7, B:96:0x01b4, B:90:0x01a1, B:103:0x01c2, B:106:0x01d0, B:107:0x01d7, B:108:0x01d8, B:109:0x01db, B:110:0x01dc, B:111:0x01f1, B:87:0x019c, B:19:0x0092, B:21:0x009b, B:24:0x00ac, B:50:0x0130, B:46:0x0129, B:53:0x0134, B:54:0x0139, B:25:0x00b4, B:27:0x00bd, B:31:0x00da, B:36:0x00f3, B:37:0x00f8, B:39:0x00fb, B:40:0x0121, B:43:0x0124, B:70:0x0161, B:73:0x0167, B:75:0x0173, B:77:0x0181, B:80:0x0188, B:81:0x018d, B:82:0x0194, B:59:0x0141, B:7:0x002e, B:9:0x0037, B:15:0x005e, B:100:0x01b8, B:101:0x01bd), top: B:136:0x000f, inners: #0, #1, #4, #5, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final kk.f0 d(kk.t r26, kk.k r27, ej.c r28) {
        /*
            Method dump skipped, instructions count: 509
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lk.b.d(kk.t, kk.k, ej.c):kk.f0");
    }

    public static final h e(final x xVar) throws IOException {
        int iL = xVar.l();
        if (iL != 33639248) {
            throw new IOException("bad zip: expected " + c(33639248) + " but was " + c(iL));
        }
        xVar.skip(4L);
        short s10 = xVar.s();
        int i10 = s10 & 65535;
        if ((s10 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i10));
        }
        int iS = xVar.s() & 65535;
        int iS2 = xVar.s() & 65535;
        int iS3 = xVar.s() & 65535;
        long jL = xVar.l() & 4294967295L;
        final u uVar = new u();
        uVar.f6806a = xVar.l() & 4294967295L;
        final u uVar2 = new u();
        uVar2.f6806a = xVar.l() & 4294967295L;
        int iS4 = xVar.s() & 65535;
        int iS5 = xVar.s() & 65535;
        int iS6 = 65535 & xVar.s();
        xVar.skip(8L);
        final u uVar3 = new u();
        uVar3.f6806a = xVar.l() & 4294967295L;
        String strT = xVar.t(iS4);
        if (nj.e.D0(strT, (char) 0)) {
            throw new IOException("bad zip: filename contains 0x00");
        }
        final long j = uVar2.f6806a == 4294967295L ? 8 : 0L;
        if (uVar.f6806a == 4294967295L) {
            j += 8;
        }
        if (uVar3.f6806a == 4294967295L) {
            j += 8;
        }
        final v vVar = new v();
        final v vVar2 = new v();
        final v vVar3 = new v();
        final r rVar = new r();
        f(xVar, iS5, new ej.e() { // from class: lk.i
            @Override // ej.e
            public final Object invoke(Object obj, Object obj2) throws IOException {
                int iIntValue = ((Integer) obj).intValue();
                long jLongValue = ((Long) obj2).longValue();
                x xVar2 = xVar;
                if (iIntValue == 1) {
                    r rVar2 = rVar;
                    if (rVar2.f6803a) {
                        throw new IOException("bad zip: zip64 extra repeated");
                    }
                    rVar2.f6803a = true;
                    if (jLongValue < j) {
                        throw new IOException("bad zip: zip64 extra too short");
                    }
                    u uVar4 = uVar2;
                    long jN = uVar4.f6806a;
                    if (jN == 4294967295L) {
                        jN = xVar2.n();
                    }
                    uVar4.f6806a = jN;
                    u uVar5 = uVar;
                    uVar5.f6806a = uVar5.f6806a == 4294967295L ? xVar2.n() : 0L;
                    u uVar6 = uVar3;
                    uVar6.f6806a = uVar6.f6806a == 4294967295L ? xVar2.n() : 0L;
                } else if (iIntValue == 10) {
                    if (jLongValue < 4) {
                        throw new IOException("bad zip: NTFS extra too short");
                    }
                    xVar2.skip(4L);
                    b.f(xVar2, (int) (jLongValue - 4), new j(vVar, xVar2, vVar2, vVar3));
                }
                return o.f13011a;
            }
        });
        if (j > 0 && !rVar.f6803a) {
            throw new IOException("bad zip: zip64 extra required but absent");
        }
        String strT2 = xVar.t(iS6);
        String str = t.f9726b;
        return new h(lh.e.f("/").f(strT), nj.l.w0(strT, "/", false), strT2, jL, uVar.f6806a, uVar2.f6806a, iS, uVar3.f6806a, iS3, iS2, (Long) vVar.f6807a, (Long) vVar2.f6807a, (Long) vVar3.f6807a, 57344);
    }

    public static final void f(x xVar, int i10, ej.e eVar) throws IOException {
        kk.f fVar = xVar.f9739b;
        long j = i10;
        while (j != 0) {
            if (j < 4) {
                throw new IOException("bad zip: truncated header in extra field");
            }
            int iS = xVar.s() & 65535;
            long jS = xVar.s() & 65535;
            long j4 = j - 4;
            if (j4 < jS) {
                throw new IOException("bad zip: truncated value in extra field");
            }
            xVar.b0(jS);
            long j10 = fVar.f9695b;
            eVar.invoke(Integer.valueOf(iS), Long.valueOf(jS));
            long j11 = (fVar.f9695b + jS) - j10;
            if (j11 < 0) {
                throw new IOException(m6.a.d(iS, "unsupported zip: too many bytes processed for "));
            }
            if (j11 > 0) {
                fVar.skip(j11);
            }
            j = j4 - jS;
        }
    }

    public static final h g(x xVar, h hVar) throws IOException {
        int iL = xVar.l();
        if (iL != 67324752) {
            throw new IOException("bad zip: expected " + c(67324752) + " but was " + c(iL));
        }
        xVar.skip(2L);
        short s10 = xVar.s();
        int i10 = s10 & 65535;
        if ((s10 & 1) != 0) {
            throw new IOException("unsupported zip: general purpose bit flag=" + c(i10));
        }
        xVar.skip(18L);
        int iS = xVar.s() & 65535;
        xVar.skip(xVar.s() & 65535);
        if (hVar == null) {
            xVar.skip(iS);
            return null;
        }
        v vVar = new v();
        v vVar2 = new v();
        v vVar3 = new v();
        f(xVar, iS, new j(xVar, vVar, vVar2, vVar3));
        return new h(hVar.f11017a, hVar.f11018b, hVar.f11019c, hVar.f11020d, hVar.f11021e, hVar.f11022f, hVar.f11023g, hVar.f11024h, hVar.f11025i, hVar.j, hVar.f11026k, hVar.f11027l, hVar.f11028m, (Integer) vVar.f6807a, (Integer) vVar2.f6807a, (Integer) vVar3.f6807a);
    }

    public static final int h(a0 a0Var, int i10) {
        int i11;
        int[] iArr = a0Var.f9675f;
        int i12 = i10 + 1;
        int length = a0Var.f9674e.length;
        l.f(iArr, "<this>");
        int i13 = length - 1;
        int i14 = 0;
        while (true) {
            if (i14 <= i13) {
                i11 = (i14 + i13) >>> 1;
                int i15 = iArr[i11];
                if (i15 >= i12) {
                    if (i15 <= i12) {
                        break;
                    }
                    i13 = i11 - 1;
                } else {
                    i14 = i11 + 1;
                }
            } else {
                i11 = (-i14) - 1;
                break;
            }
        }
        return i11 >= 0 ? i11 : ~i11;
    }
}
