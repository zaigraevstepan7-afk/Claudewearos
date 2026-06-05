package kk;

import java.io.EOFException;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class f implements h, g, Cloneable, ByteChannel {

    /* renamed from: a, reason: collision with root package name */
    public y f9694a;

    /* renamed from: b, reason: collision with root package name */
    public long f9695b;

    @Override // kk.c0
    public final long A(long j, f fVar) {
        fj.l.f(fVar, "sink");
        if (j < 0) {
            throw new IllegalArgumentException(m1.g(j, "byteCount < 0: ").toString());
        }
        long j4 = this.f9695b;
        if (j4 == 0) {
            return -1L;
        }
        if (j > j4) {
            j = j4;
        }
        fVar.Y(j, this);
        return j;
    }

    public final void C(byte[] bArr) throws EOFException {
        int i10 = 0;
        while (i10 < bArr.length) {
            int i11 = read(bArr, i10, bArr.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    public final short D() throws EOFException {
        short s10 = readShort();
        return (short) (((s10 & 255) << 8) | ((65280 & s10) >>> 8));
    }

    public final String F(long j, Charset charset) throws EOFException {
        fj.l.f(charset, "charset");
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(m1.g(j, "byteCount: ").toString());
        }
        if (this.f9695b < j) {
            throw new EOFException();
        }
        if (j == 0) {
            return "";
        }
        y yVar = this.f9694a;
        fj.l.c(yVar);
        int i10 = yVar.f9742b;
        if (i10 + j > yVar.f9743c) {
            return new String(t(j), charset);
        }
        int i11 = (int) j;
        String str = new String(yVar.f9741a, i10, i11, charset);
        int i12 = yVar.f9742b + i11;
        yVar.f9742b = i12;
        this.f9695b -= j;
        if (i12 == yVar.f9743c) {
            this.f9694a = yVar.a();
            z.a(yVar);
        }
        return str;
    }

    @Override // kk.g
    public final /* bridge */ /* synthetic */ g G(String str) {
        h0(str);
        return this;
    }

    @Override // kk.h
    public final String I(Charset charset) {
        fj.l.f(charset, "charset");
        return F(this.f9695b, charset);
    }

    @Override // kk.g
    public final /* bridge */ /* synthetic */ g L(long j) {
        Z(j);
        return this;
    }

    @Override // kk.h
    public final boolean N(long j) {
        return this.f9695b >= j;
    }

    public final i O(int i10) {
        if (i10 == 0) {
            return i.f9700d;
        }
        hj.a.n(this.f9695b, 0L, i10);
        y yVar = this.f9694a;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            fj.l.c(yVar);
            int i14 = yVar.f9743c;
            int i15 = yVar.f9742b;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            yVar = yVar.f9746f;
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        y yVar2 = this.f9694a;
        int i16 = 0;
        while (i11 < i10) {
            fj.l.c(yVar2);
            bArr[i16] = yVar2.f9741a;
            i11 += yVar2.f9743c - yVar2.f9742b;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = yVar2.f9742b;
            yVar2.f9744d = true;
            i16++;
            yVar2 = yVar2.f9746f;
        }
        return new a0(bArr, iArr);
    }

    public final y P(int i10) {
        if (i10 < 1 || i10 > 8192) {
            throw new IllegalArgumentException("unexpected capacity");
        }
        y yVar = this.f9694a;
        if (yVar == null) {
            y yVarB = z.b();
            this.f9694a = yVarB;
            yVarB.f9747g = yVarB;
            yVarB.f9746f = yVarB;
            return yVarB;
        }
        y yVar2 = yVar.f9747g;
        fj.l.c(yVar2);
        if (yVar2.f9743c + i10 <= 8192 && yVar2.f9745e) {
            return yVar2;
        }
        y yVarB2 = z.b();
        yVar2.b(yVarB2);
        return yVarB2;
    }

    public final void Q(int i10, byte[] bArr) {
        fj.l.f(bArr, "source");
        int i11 = 0;
        long j = i10;
        hj.a.n(bArr.length, 0, j);
        while (i11 < i10) {
            y yVarP = P(1);
            int iMin = Math.min(i10 - i11, 8192 - yVarP.f9743c);
            int i12 = i11 + iMin;
            qi.k.f0(bArr, yVarP.f9743c, yVarP.f9741a, i11, i12);
            yVarP.f9743c += iMin;
            i11 = i12;
        }
        this.f9695b += j;
    }

    @Override // kk.h
    public final String S() {
        return u(Long.MAX_VALUE);
    }

    public final void T(i iVar) {
        fj.l.f(iVar, "byteString");
        iVar.E(this, iVar.e());
    }

    @Override // kk.h
    public final int U(s sVar) throws EOFException {
        fj.l.f(sVar, "options");
        int iC = lk.a.c(this, sVar, false);
        if (iC == -1) {
            return -1;
        }
        skip(sVar.f9724a[iC].e());
        return iC;
    }

    public final void V(c0 c0Var) {
        fj.l.f(c0Var, "source");
        while (c0Var.A(8192L, this) != -1) {
        }
    }

    public final void W(int i10) {
        y yVarP = P(1);
        byte[] bArr = yVarP.f9741a;
        int i11 = yVarP.f9743c;
        yVarP.f9743c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f9695b++;
    }

    @Override // kk.b0
    public final void Y(long j, f fVar) {
        y yVarB;
        fj.l.f(fVar, "source");
        if (fVar == this) {
            throw new IllegalArgumentException("source == this");
        }
        hj.a.n(fVar.f9695b, 0L, j);
        while (j > 0) {
            y yVar = fVar.f9694a;
            fj.l.c(yVar);
            int i10 = yVar.f9743c;
            y yVar2 = fVar.f9694a;
            fj.l.c(yVar2);
            long j4 = i10 - yVar2.f9742b;
            int i11 = 0;
            if (j < j4) {
                y yVar3 = this.f9694a;
                y yVar4 = yVar3 != null ? yVar3.f9747g : null;
                if (yVar4 != null && yVar4.f9745e) {
                    if ((yVar4.f9743c + j) - (yVar4.f9744d ? 0 : yVar4.f9742b) <= 8192) {
                        y yVar5 = fVar.f9694a;
                        fj.l.c(yVar5);
                        yVar5.d(yVar4, (int) j);
                        fVar.f9695b -= j;
                        this.f9695b += j;
                        return;
                    }
                }
                y yVar6 = fVar.f9694a;
                fj.l.c(yVar6);
                int i12 = (int) j;
                if (i12 <= 0 || i12 > yVar6.f9743c - yVar6.f9742b) {
                    throw new IllegalArgumentException("byteCount out of range");
                }
                if (i12 >= 1024) {
                    yVarB = yVar6.c();
                } else {
                    yVarB = z.b();
                    byte[] bArr = yVar6.f9741a;
                    byte[] bArr2 = yVarB.f9741a;
                    int i13 = yVar6.f9742b;
                    qi.k.f0(bArr, 0, bArr2, i13, i13 + i12);
                }
                yVarB.f9743c = yVarB.f9742b + i12;
                yVar6.f9742b += i12;
                y yVar7 = yVar6.f9747g;
                fj.l.c(yVar7);
                yVar7.b(yVarB);
                fVar.f9694a = yVarB;
            }
            y yVar8 = fVar.f9694a;
            fj.l.c(yVar8);
            long j10 = yVar8.f9743c - yVar8.f9742b;
            fVar.f9694a = yVar8.a();
            y yVar9 = this.f9694a;
            if (yVar9 == null) {
                this.f9694a = yVar8;
                yVar8.f9747g = yVar8;
                yVar8.f9746f = yVar8;
            } else {
                y yVar10 = yVar9.f9747g;
                fj.l.c(yVar10);
                yVar10.b(yVar8);
                y yVar11 = yVar8.f9747g;
                if (yVar11 == yVar8) {
                    throw new IllegalStateException("cannot compact");
                }
                fj.l.c(yVar11);
                if (yVar11.f9745e) {
                    int i14 = yVar8.f9743c - yVar8.f9742b;
                    y yVar12 = yVar8.f9747g;
                    fj.l.c(yVar12);
                    int i15 = 8192 - yVar12.f9743c;
                    y yVar13 = yVar8.f9747g;
                    fj.l.c(yVar13);
                    if (!yVar13.f9744d) {
                        y yVar14 = yVar8.f9747g;
                        fj.l.c(yVar14);
                        i11 = yVar14.f9742b;
                    }
                    if (i14 <= i15 + i11) {
                        y yVar15 = yVar8.f9747g;
                        fj.l.c(yVar15);
                        yVar8.d(yVar15, i14);
                        yVar8.a();
                        z.a(yVar8);
                    }
                }
            }
            fVar.f9695b -= j10;
            this.f9695b += j10;
            j -= j10;
        }
    }

    public final void Z(long j) {
        if (j == 0) {
            W(48);
            return;
        }
        long j4 = (j >>> 1) | j;
        long j10 = j4 | (j4 >>> 2);
        long j11 = j10 | (j10 >>> 4);
        long j12 = j11 | (j11 >>> 8);
        long j13 = j12 | (j12 >>> 16);
        long j14 = j13 | (j13 >>> 32);
        long j15 = j14 - ((j14 >>> 1) & 6148914691236517205L);
        long j16 = ((j15 >>> 2) & 3689348814741910323L) + (j15 & 3689348814741910323L);
        long j17 = ((j16 >>> 4) + j16) & 1085102592571150095L;
        long j18 = j17 + (j17 >>> 8);
        long j19 = j18 + (j18 >>> 16);
        int i10 = (int) ((((j19 & 63) + ((j19 >>> 32) & 63)) + 3) / 4);
        y yVarP = P(i10);
        byte[] bArr = yVarP.f9741a;
        int i11 = yVarP.f9743c;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = lk.a.f11000a[(int) (15 & j)];
            j >>>= 4;
        }
        yVarP.f9743c += i10;
        this.f9695b += i10;
    }

    @Override // kk.c0
    public final e0 a() {
        return e0.f9690d;
    }

    public final void b(f fVar, long j, long j4) {
        fj.l.f(fVar, "out");
        long j10 = j;
        hj.a.n(this.f9695b, j10, j4);
        if (j4 == 0) {
            return;
        }
        fVar.f9695b += j4;
        y yVar = this.f9694a;
        while (true) {
            fj.l.c(yVar);
            long j11 = yVar.f9743c - yVar.f9742b;
            if (j10 < j11) {
                break;
            }
            j10 -= j11;
            yVar = yVar.f9746f;
        }
        y yVar2 = yVar;
        long j12 = j4;
        while (j12 > 0) {
            fj.l.c(yVar2);
            y yVarC = yVar2.c();
            int i10 = yVarC.f9742b + ((int) j10);
            yVarC.f9742b = i10;
            yVarC.f9743c = Math.min(i10 + ((int) j12), yVarC.f9743c);
            y yVar3 = fVar.f9694a;
            if (yVar3 == null) {
                yVarC.f9747g = yVarC;
                yVarC.f9746f = yVarC;
                fVar.f9694a = yVarC;
            } else {
                y yVar4 = yVar3.f9747g;
                fj.l.c(yVar4);
                yVar4.b(yVarC);
            }
            j12 -= yVarC.f9743c - yVarC.f9742b;
            yVar2 = yVar2.f9746f;
            j10 = 0;
        }
    }

    @Override // kk.h
    public final void b0(long j) throws EOFException {
        if (this.f9695b < j) {
            throw new EOFException();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a6 A[EDGE_INSN: B:44:0x00a6->B:38:0x00a6 BREAK  A[LOOP:0: B:5:0x000c->B:46:?], SYNTHETIC] */
    @Override // kk.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c0() throws java.io.EOFException {
        /*
            r15 = this;
            long r0 = r15.f9695b
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto Lad
            r0 = 0
            r1 = r0
            r6 = r1
            r4 = r2
        Lc:
            kk.y r7 = r15.f9694a
            fj.l.c(r7)
            byte[] r8 = r7.f9741a
            int r9 = r7.f9742b
            int r10 = r7.f9743c
        L17:
            if (r9 >= r10) goto L92
            r11 = r8[r9]
            r12 = 48
            if (r11 < r12) goto L26
            r12 = 57
            if (r11 > r12) goto L26
            int r12 = r11 + (-48)
            goto L3b
        L26:
            r12 = 97
            if (r11 < r12) goto L31
            r12 = 102(0x66, float:1.43E-43)
            if (r11 > r12) goto L31
            int r12 = r11 + (-87)
            goto L3b
        L31:
            r12 = 65
            if (r11 < r12) goto L6a
            r12 = 70
            if (r11 > r12) goto L6a
            int r12 = r11 + (-55)
        L3b:
            r13 = -1152921504606846976(0xf000000000000000, double:-3.105036184601418E231)
            long r13 = r13 & r4
            int r13 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r13 != 0) goto L4b
            r11 = 4
            long r4 = r4 << r11
            long r11 = (long) r12
            long r4 = r4 | r11
            int r9 = r9 + 1
            int r1 = r1 + 1
            goto L17
        L4b:
            kk.f r0 = new kk.f
            r0.<init>()
            r0.Z(r4)
            r0.W(r11)
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            long r2 = r0.f9695b
            java.nio.charset.Charset r4 = nj.a.f12342a
            java.lang.String r0 = r0.F(r2, r4)
            java.lang.String r2 = "Number too large: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L6a:
            r6 = 1
            if (r1 == 0) goto L6e
            goto L92
        L6e:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            int r2 = r11 >> 4
            r2 = r2 & 15
            char[] r3 = lk.b.f11001a
            char r2 = r3[r2]
            r4 = r11 & 15
            char r3 = r3[r4]
            r4 = 2
            char[] r4 = new char[r4]
            r4[r0] = r2
            r4[r6] = r3
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
            java.lang.String r2 = "Expected leading [0-9a-fA-F] character but was 0x"
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r0)
            throw r1
        L92:
            if (r9 != r10) goto L9e
            kk.y r8 = r7.a()
            r15.f9694a = r8
            kk.z.a(r7)
            goto La0
        L9e:
            r7.f9742b = r9
        La0:
            if (r6 != 0) goto La6
            kk.y r7 = r15.f9694a
            if (r7 != 0) goto Lc
        La6:
            long r2 = r15.f9695b
            long r0 = (long) r1
            long r2 = r2 - r0
            r15.f9695b = r2
            return r4
        Lad:
            java.io.EOFException r0 = new java.io.EOFException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.f.c0():long");
    }

    public final Object clone() {
        f fVar = new f();
        if (this.f9695b == 0) {
            return fVar;
        }
        y yVar = this.f9694a;
        fj.l.c(yVar);
        y yVarC = yVar.c();
        fVar.f9694a = yVarC;
        yVarC.f9747g = yVarC;
        yVarC.f9746f = yVarC;
        for (y yVar2 = yVar.f9746f; yVar2 != yVar; yVar2 = yVar2.f9746f) {
            y yVar3 = yVarC.f9747g;
            fj.l.c(yVar3);
            fj.l.c(yVar2);
            yVar3.b(yVar2.c());
        }
        fVar.f9695b = this.f9695b;
        return fVar;
    }

    public final boolean e() {
        return this.f9695b == 0;
    }

    public final void e0(int i10) {
        y yVarP = P(4);
        byte[] bArr = yVarP.f9741a;
        int i11 = yVarP.f9743c;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        bArr[i11 + 1] = (byte) ((i10 >>> 16) & 255);
        bArr[i11 + 2] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 3] = (byte) (i10 & 255);
        yVarP.f9743c = i11 + 4;
        this.f9695b += 4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        long j = this.f9695b;
        f fVar = (f) obj;
        if (j != fVar.f9695b) {
            return false;
        }
        if (j == 0) {
            return true;
        }
        y yVar = this.f9694a;
        fj.l.c(yVar);
        y yVar2 = fVar.f9694a;
        fj.l.c(yVar2);
        int i10 = yVar.f9742b;
        int i11 = yVar2.f9742b;
        long j4 = 0;
        while (j4 < this.f9695b) {
            long jMin = Math.min(yVar.f9743c - i10, yVar2.f9743c - i11);
            long j10 = 0;
            while (j10 < jMin) {
                int i12 = i10 + 1;
                int i13 = i11 + 1;
                if (yVar.f9741a[i10] != yVar2.f9741a[i11]) {
                    return false;
                }
                j10++;
                i10 = i12;
                i11 = i13;
            }
            if (i10 == yVar.f9743c) {
                yVar = yVar.f9746f;
                fj.l.c(yVar);
                i10 = yVar.f9742b;
            }
            if (i11 == yVar2.f9743c) {
                yVar2 = yVar2.f9746f;
                fj.l.c(yVar2);
                i11 = yVar2.f9742b;
            }
            j4 += jMin;
        }
        return true;
    }

    public final void f0(int i10) {
        y yVarP = P(2);
        byte[] bArr = yVarP.f9741a;
        int i11 = yVarP.f9743c;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i11 + 1] = (byte) (i10 & 255);
        yVarP.f9743c = i11 + 2;
        this.f9695b += 2;
    }

    public final byte g(long j) {
        hj.a.n(this.f9695b, j, 1L);
        y yVar = this.f9694a;
        if (yVar == null) {
            fj.l.c(null);
            throw null;
        }
        long j4 = this.f9695b;
        if (j4 - j < j) {
            while (j4 > j) {
                yVar = yVar.f9747g;
                fj.l.c(yVar);
                j4 -= yVar.f9743c - yVar.f9742b;
            }
            return yVar.f9741a[(int) ((yVar.f9742b + j) - j4)];
        }
        long j10 = 0;
        while (true) {
            int i10 = yVar.f9743c;
            int i11 = yVar.f9742b;
            long j11 = (i10 - i11) + j10;
            if (j11 > j) {
                return yVar.f9741a[(int) ((i11 + j) - j10)];
            }
            yVar = yVar.f9746f;
            fj.l.c(yVar);
            j10 = j11;
        }
    }

    public final void g0(int i10, int i11, String str) {
        char cCharAt;
        fj.l.f(str, "string");
        if (i10 < 0) {
            throw new IllegalArgumentException(m6.a.d(i10, "beginIndex < 0: ").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(gk.b.l(i11, i10, "endIndex < beginIndex: ", " < ").toString());
        }
        if (i11 > str.length()) {
            StringBuilder sbP = gk.b.p(i11, "endIndex > string.length: ", " > ");
            sbP.append(str.length());
            throw new IllegalArgumentException(sbP.toString().toString());
        }
        while (i10 < i11) {
            char cCharAt2 = str.charAt(i10);
            if (cCharAt2 < '\u0080') {
                y yVarP = P(1);
                byte[] bArr = yVarP.f9741a;
                int i12 = yVarP.f9743c - i10;
                int iMin = Math.min(i11, 8192 - i12);
                int i13 = i10 + 1;
                bArr[i10 + i12] = (byte) cCharAt2;
                while (true) {
                    i10 = i13;
                    if (i10 >= iMin || (cCharAt = str.charAt(i10)) >= '\u0080') {
                        break;
                    }
                    i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt;
                }
                int i14 = yVarP.f9743c;
                int i15 = (i12 + i10) - i14;
                yVarP.f9743c = i14 + i15;
                this.f9695b += i15;
            } else {
                if (cCharAt2 < '\u0800') {
                    y yVarP2 = P(2);
                    byte[] bArr2 = yVarP2.f9741a;
                    int i16 = yVarP2.f9743c;
                    bArr2[i16] = (byte) ((cCharAt2 >> 6) | 192);
                    bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                    yVarP2.f9743c = i16 + 2;
                    this.f9695b += 2;
                } else if (cCharAt2 < '\ud800' || cCharAt2 > '\udfff') {
                    y yVarP3 = P(3);
                    byte[] bArr3 = yVarP3.f9741a;
                    int i17 = yVarP3.f9743c;
                    bArr3[i17] = (byte) ((cCharAt2 >> '\f') | 224);
                    bArr3[i17 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                    bArr3[i17 + 2] = (byte) ((cCharAt2 & '?') | 128);
                    yVarP3.f9743c = i17 + 3;
                    this.f9695b += 3;
                } else {
                    int i18 = i10 + 1;
                    char cCharAt3 = i18 < i11 ? str.charAt(i18) : (char) 0;
                    if (cCharAt2 > '\udbff' || '\udc00' > cCharAt3 || cCharAt3 >= '\ue000') {
                        W(63);
                        i10 = i18;
                    } else {
                        int i19 = (((cCharAt2 & '\u03ff') << 10) | (cCharAt3 & '\u03ff')) + 65536;
                        y yVarP4 = P(4);
                        byte[] bArr4 = yVarP4.f9741a;
                        int i20 = yVarP4.f9743c;
                        bArr4[i20] = (byte) ((i19 >> 18) | 240);
                        bArr4[i20 + 1] = (byte) (((i19 >> 12) & 63) | 128);
                        bArr4[i20 + 2] = (byte) (((i19 >> 6) & 63) | 128);
                        bArr4[i20 + 3] = (byte) ((i19 & 63) | 128);
                        yVarP4.f9743c = i20 + 4;
                        this.f9695b += 4;
                        i10 += 2;
                    }
                }
                i10++;
            }
        }
    }

    @Override // kk.h
    public final i h(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(m1.g(j, "byteCount: ").toString());
        }
        if (this.f9695b < j) {
            throw new EOFException();
        }
        if (j < 4096) {
            return new i(t(j));
        }
        i iVarO = O((int) j);
        skip(j);
        return iVarO;
    }

    public final void h0(String str) {
        fj.l.f(str, "string");
        g0(0, str.length(), str);
    }

    public final int hashCode() {
        y yVar = this.f9694a;
        if (yVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = yVar.f9743c;
            for (int i12 = yVar.f9742b; i12 < i11; i12++) {
                i10 = (i10 * 31) + yVar.f9741a[i12];
            }
            yVar = yVar.f9746f;
            fj.l.c(yVar);
        } while (yVar != this.f9694a);
        return i10;
    }

    public final void i0(int i10) {
        if (i10 < 128) {
            W(i10);
            return;
        }
        if (i10 < 2048) {
            y yVarP = P(2);
            byte[] bArr = yVarP.f9741a;
            int i11 = yVarP.f9743c;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            yVarP.f9743c = i11 + 2;
            this.f9695b += 2;
            return;
        }
        if (55296 <= i10 && i10 < 57344) {
            W(63);
            return;
        }
        if (i10 < 65536) {
            y yVarP2 = P(3);
            byte[] bArr2 = yVarP2.f9741a;
            int i12 = yVarP2.f9743c;
            bArr2[i12] = (byte) ((i10 >> 12) | 224);
            bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
            bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
            yVarP2.f9743c = i12 + 3;
            this.f9695b += 3;
            return;
        }
        if (i10 > 1114111) {
            throw new IllegalArgumentException("Unexpected code point: 0x".concat(hj.a.R(i10)));
        }
        y yVarP3 = P(4);
        byte[] bArr3 = yVarP3.f9741a;
        int i13 = yVarP3.f9743c;
        bArr3[i13] = (byte) ((i10 >> 18) | 240);
        bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
        bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
        bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
        yVarP3.f9743c = i13 + 4;
        this.f9695b += 4;
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return true;
    }

    public final long l(byte b10, long j, long j4) {
        y yVar;
        long j10 = 0;
        if (0 > j || j > j4) {
            throw new IllegalArgumentException(("size=" + this.f9695b + " fromIndex=" + j + " toIndex=" + j4).toString());
        }
        long j11 = this.f9695b;
        if (j4 > j11) {
            j4 = j11;
        }
        if (j == j4 || (yVar = this.f9694a) == null) {
            return -1L;
        }
        if (j11 - j < j) {
            while (j11 > j) {
                yVar = yVar.f9747g;
                fj.l.c(yVar);
                j11 -= yVar.f9743c - yVar.f9742b;
            }
            while (j11 < j4) {
                byte[] bArr = yVar.f9741a;
                int iMin = (int) Math.min(yVar.f9743c, (yVar.f9742b + j4) - j11);
                for (int i10 = (int) ((yVar.f9742b + j) - j11); i10 < iMin; i10++) {
                    if (bArr[i10] == b10) {
                        return (i10 - yVar.f9742b) + j11;
                    }
                }
                j11 += yVar.f9743c - yVar.f9742b;
                yVar = yVar.f9746f;
                fj.l.c(yVar);
                j = j11;
            }
            return -1L;
        }
        while (true) {
            long j12 = (yVar.f9743c - yVar.f9742b) + j10;
            if (j12 > j) {
                break;
            }
            yVar = yVar.f9746f;
            fj.l.c(yVar);
            j10 = j12;
        }
        while (j10 < j4) {
            byte[] bArr2 = yVar.f9741a;
            int iMin2 = (int) Math.min(yVar.f9743c, (yVar.f9742b + j4) - j10);
            for (int i11 = (int) ((yVar.f9742b + j) - j10); i11 < iMin2; i11++) {
                if (bArr2[i11] == b10) {
                    return (i11 - yVar.f9742b) + j10;
                }
            }
            j10 += yVar.f9743c - yVar.f9742b;
            yVar = yVar.f9746f;
            fj.l.c(yVar);
            j = j10;
        }
        return -1L;
    }

    public final long n(i iVar) {
        int i10;
        int i11;
        fj.l.f(iVar, "targetBytes");
        y yVar = this.f9694a;
        if (yVar == null) {
            return -1L;
        }
        long j = this.f9695b;
        long j4 = 0;
        if (j < 0) {
            while (j > 0) {
                yVar = yVar.f9747g;
                fj.l.c(yVar);
                j -= yVar.f9743c - yVar.f9742b;
            }
            if (iVar.e() == 2) {
                byte bR = iVar.r(0);
                byte bR2 = iVar.r(1);
                while (j < this.f9695b) {
                    byte[] bArr = yVar.f9741a;
                    i10 = (int) ((yVar.f9742b + j4) - j);
                    int i12 = yVar.f9743c;
                    while (i10 < i12) {
                        byte b10 = bArr[i10];
                        if (b10 == bR || b10 == bR2) {
                            i11 = yVar.f9742b;
                        } else {
                            i10++;
                        }
                    }
                    j4 = (yVar.f9743c - yVar.f9742b) + j;
                    yVar = yVar.f9746f;
                    fj.l.c(yVar);
                    j = j4;
                }
                return -1L;
            }
            byte[] bArrP = iVar.p();
            while (j < this.f9695b) {
                byte[] bArr2 = yVar.f9741a;
                i10 = (int) ((yVar.f9742b + j4) - j);
                int i13 = yVar.f9743c;
                while (i10 < i13) {
                    byte b11 = bArr2[i10];
                    for (byte b12 : bArrP) {
                        if (b11 == b12) {
                            i11 = yVar.f9742b;
                        }
                    }
                    i10++;
                }
                j4 = (yVar.f9743c - yVar.f9742b) + j;
                yVar = yVar.f9746f;
                fj.l.c(yVar);
                j = j4;
            }
            return -1L;
        }
        j = 0;
        while (true) {
            long j10 = (yVar.f9743c - yVar.f9742b) + j;
            if (j10 > 0) {
                break;
            }
            yVar = yVar.f9746f;
            fj.l.c(yVar);
            j = j10;
        }
        if (iVar.e() == 2) {
            byte bR3 = iVar.r(0);
            byte bR4 = iVar.r(1);
            while (j < this.f9695b) {
                byte[] bArr3 = yVar.f9741a;
                i10 = (int) ((yVar.f9742b + j4) - j);
                int i14 = yVar.f9743c;
                while (i10 < i14) {
                    byte b13 = bArr3[i10];
                    if (b13 == bR3 || b13 == bR4) {
                        i11 = yVar.f9742b;
                    } else {
                        i10++;
                    }
                }
                j4 = (yVar.f9743c - yVar.f9742b) + j;
                yVar = yVar.f9746f;
                fj.l.c(yVar);
                j = j4;
            }
            return -1L;
        }
        byte[] bArrP2 = iVar.p();
        while (j < this.f9695b) {
            byte[] bArr4 = yVar.f9741a;
            i10 = (int) ((yVar.f9742b + j4) - j);
            int i15 = yVar.f9743c;
            while (i10 < i15) {
                byte b14 = bArr4[i10];
                for (byte b15 : bArrP2) {
                    if (b14 == b15) {
                        i11 = yVar.f9742b;
                    }
                }
                i10++;
            }
            j4 = (yVar.f9743c - yVar.f9742b) + j;
            yVar = yVar.f9746f;
            fj.l.c(yVar);
            j = j4;
        }
        return -1L;
        return (i10 - i11) + j;
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) {
        fj.l.f(byteBuffer, "sink");
        y yVar = this.f9694a;
        if (yVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), yVar.f9743c - yVar.f9742b);
        byteBuffer.put(yVar.f9741a, yVar.f9742b, iMin);
        int i10 = yVar.f9742b + iMin;
        yVar.f9742b = i10;
        this.f9695b -= iMin;
        if (i10 == yVar.f9743c) {
            this.f9694a = yVar.a();
            z.a(yVar);
        }
        return iMin;
    }

    @Override // kk.h
    public final byte readByte() throws EOFException {
        if (this.f9695b == 0) {
            throw new EOFException();
        }
        y yVar = this.f9694a;
        fj.l.c(yVar);
        int i10 = yVar.f9742b;
        int i11 = yVar.f9743c;
        int i12 = i10 + 1;
        byte b10 = yVar.f9741a[i10];
        this.f9695b--;
        if (i12 != i11) {
            yVar.f9742b = i12;
            return b10;
        }
        this.f9694a = yVar.a();
        z.a(yVar);
        return b10;
    }

    @Override // kk.h
    public final int readInt() throws EOFException {
        if (this.f9695b < 4) {
            throw new EOFException();
        }
        y yVar = this.f9694a;
        fj.l.c(yVar);
        int i10 = yVar.f9742b;
        int i11 = yVar.f9743c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = yVar.f9741a;
        int i12 = i10 + 3;
        int i13 = ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 2] & 255) << 8);
        int i14 = i10 + 4;
        int i15 = (bArr[i12] & 255) | i13;
        this.f9695b -= 4;
        if (i14 != i11) {
            yVar.f9742b = i14;
            return i15;
        }
        this.f9694a = yVar.a();
        z.a(yVar);
        return i15;
    }

    @Override // kk.h
    public final short readShort() throws EOFException {
        if (this.f9695b < 2) {
            throw new EOFException();
        }
        y yVar = this.f9694a;
        fj.l.c(yVar);
        int i10 = yVar.f9742b;
        int i11 = yVar.f9743c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = yVar.f9741a;
        int i12 = i10 + 1;
        int i13 = (bArr[i10] & 255) << 8;
        int i14 = i10 + 2;
        int i15 = (bArr[i12] & 255) | i13;
        this.f9695b -= 2;
        if (i14 == i11) {
            this.f9694a = yVar.a();
            z.a(yVar);
        } else {
            yVar.f9742b = i14;
        }
        return (short) i15;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean s(kk.i r22) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: kk.f.s(kk.i):boolean");
    }

    @Override // kk.h
    public final void skip(long j) throws EOFException {
        while (j > 0) {
            y yVar = this.f9694a;
            if (yVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j, yVar.f9743c - yVar.f9742b);
            long j4 = iMin;
            this.f9695b -= j4;
            j -= j4;
            int i10 = yVar.f9742b + iMin;
            yVar.f9742b = i10;
            if (i10 == yVar.f9743c) {
                this.f9694a = yVar.a();
                z.a(yVar);
            }
        }
    }

    public final byte[] t(long j) throws EOFException {
        if (j < 0 || j > 2147483647L) {
            throw new IllegalArgumentException(m1.g(j, "byteCount: ").toString());
        }
        if (this.f9695b < j) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j];
        C(bArr);
        return bArr;
    }

    public final String toString() {
        long j = this.f9695b;
        if (j <= 2147483647L) {
            return O((int) j).toString();
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + this.f9695b).toString());
    }

    @Override // kk.h
    public final String u(long j) throws EOFException {
        if (j < 0) {
            throw new IllegalArgumentException(m1.g(j, "limit < 0: ").toString());
        }
        long j4 = j != Long.MAX_VALUE ? j + 1 : Long.MAX_VALUE;
        long jL = l((byte) 10, 0L, j4);
        if (jL != -1) {
            return lk.a.b(jL, this);
        }
        if (j4 < this.f9695b && g(j4 - 1) == 13 && g(j4) == 10) {
            return lk.a.b(j4, this);
        }
        f fVar = new f();
        b(fVar, 0L, Math.min(32, this.f9695b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f9695b, j) + " content=" + fVar.h(fVar.f9695b).f() + '\u2026');
    }

    @Override // kk.g
    public final /* bridge */ /* synthetic */ g write(byte[] bArr) {
        m6write(bArr);
        return this;
    }

    @Override // kk.g
    public final /* bridge */ /* synthetic */ g writeByte(int i10) {
        W(i10);
        return this;
    }

    @Override // kk.g
    public final /* bridge */ /* synthetic */ g writeInt(int i10) {
        e0(i10);
        return this;
    }

    @Override // kk.g
    public final /* bridge */ /* synthetic */ g writeShort(int i10) {
        f0(i10);
        return this;
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) {
        fj.l.f(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            y yVarP = P(1);
            int iMin = Math.min(i10, 8192 - yVarP.f9743c);
            byteBuffer.get(yVarP.f9741a, yVarP.f9743c, iMin);
            i10 -= iMin;
            yVarP.f9743c += iMin;
        }
        this.f9695b += iRemaining;
        return iRemaining;
    }

    /* renamed from: write, reason: collision with other method in class */
    public final void m6write(byte[] bArr) {
        fj.l.f(bArr, "source");
        Q(bArr.length, bArr);
    }

    public final int read(byte[] bArr, int i10, int i11) {
        hj.a.n(bArr.length, i10, i11);
        y yVar = this.f9694a;
        if (yVar == null) {
            return -1;
        }
        int iMin = Math.min(i11, yVar.f9743c - yVar.f9742b);
        byte[] bArr2 = yVar.f9741a;
        int i12 = yVar.f9742b;
        qi.k.f0(bArr2, i10, bArr, i12, i12 + iMin);
        int i13 = yVar.f9742b + iMin;
        yVar.f9742b = i13;
        this.f9695b -= iMin;
        if (i13 == yVar.f9743c) {
            this.f9694a = yVar.a();
            z.a(yVar);
        }
        return iMin;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, java.nio.channels.Channel, kk.b0
    public final void close() {
    }

    @Override // kk.g, kk.b0, java.io.Flushable
    public final void flush() {
    }

    @Override // kk.h
    public final f q() {
        return this;
    }
}
