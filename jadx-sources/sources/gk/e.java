package gk;

import java.io.EOFException;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final kk.f f7456a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7458c;

    /* renamed from: b, reason: collision with root package name */
    public int f7457b = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;

    /* renamed from: e, reason: collision with root package name */
    public c[] f7460e = new c[8];

    /* renamed from: f, reason: collision with root package name */
    public int f7461f = 7;

    /* renamed from: g, reason: collision with root package name */
    public int f7462g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f7463h = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f7459d = 4096;

    public e(kk.f fVar) {
        this.f7456a = fVar;
    }

    public final void a(int i10) {
        int i11;
        if (i10 > 0) {
            int length = this.f7460e.length - 1;
            int i12 = 0;
            while (true) {
                i11 = this.f7461f;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                int i13 = this.f7460e[length].f7447c;
                i10 -= i13;
                this.f7463h -= i13;
                this.f7462g--;
                i12++;
                length--;
            }
            c[] cVarArr = this.f7460e;
            int i14 = i11 + 1;
            System.arraycopy(cVarArr, i14, cVarArr, i14 + i12, this.f7462g);
            c[] cVarArr2 = this.f7460e;
            int i15 = this.f7461f + 1;
            Arrays.fill(cVarArr2, i15, i15 + i12, (Object) null);
            this.f7461f += i12;
        }
    }

    public final void b(c cVar) {
        int i10 = cVar.f7447c;
        int i11 = this.f7459d;
        if (i10 > i11) {
            Arrays.fill(this.f7460e, (Object) null);
            this.f7461f = this.f7460e.length - 1;
            this.f7462g = 0;
            this.f7463h = 0;
            return;
        }
        a((this.f7463h + i10) - i11);
        int i12 = this.f7462g + 1;
        c[] cVarArr = this.f7460e;
        if (i12 > cVarArr.length) {
            c[] cVarArr2 = new c[cVarArr.length * 2];
            System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
            this.f7461f = this.f7460e.length - 1;
            this.f7460e = cVarArr2;
        }
        int i13 = this.f7461f;
        this.f7461f = i13 - 1;
        this.f7460e[i13] = cVar;
        this.f7462g++;
        this.f7463h += i10;
    }

    public final void c(kk.i iVar) throws EOFException {
        z.f7550d.getClass();
        long j = 0;
        long j4 = 0;
        for (int i10 = 0; i10 < iVar.e(); i10++) {
            j4 += z.f7549c[iVar.r(i10) & 255];
        }
        int i11 = (int) ((j4 + 7) >> 3);
        int iE = iVar.e();
        kk.f fVar = this.f7456a;
        if (i11 >= iE) {
            e(iVar.e(), 127, 0);
            fVar.T(iVar);
            return;
        }
        kk.f fVar2 = new kk.f();
        z.f7550d.getClass();
        int i12 = 0;
        for (int i13 = 0; i13 < iVar.e(); i13++) {
            int iR = iVar.r(i13) & 255;
            int i14 = z.f7548b[iR];
            byte b10 = z.f7549c[iR];
            j = (j << b10) | i14;
            i12 += b10;
            while (i12 >= 8) {
                i12 -= 8;
                fVar2.W((int) (j >> i12));
            }
        }
        if (i12 > 0) {
            fVar2.W((int) ((j << (8 - i12)) | (255 >>> i12)));
        }
        kk.i iVarH = fVar2.h(fVar2.f9695b);
        e(iVarH.e(), 127, 128);
        fVar.T(iVarH);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(java.util.ArrayList r14) throws java.io.EOFException {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: gk.e.d(java.util.ArrayList):void");
    }

    public final void e(int i10, int i11, int i12) {
        kk.f fVar = this.f7456a;
        if (i10 < i11) {
            fVar.W(i10 | i12);
            return;
        }
        fVar.W(i12 | i11);
        int i13 = i10 - i11;
        while (i13 >= 128) {
            fVar.W(128 | (i13 & 127));
            i13 >>>= 7;
        }
        fVar.W(i13);
    }
}
