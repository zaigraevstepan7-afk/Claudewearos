package lk;

import fj.l;
import java.io.EOFException;
import kk.y;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final byte[] f11000a;

    static {
        byte[] bytes = "0123456789abcdef".getBytes(nj.a.f12342a);
        l.e(bytes, "getBytes(...)");
        f11000a = bytes;
    }

    public static final boolean a(y yVar, int i10, byte[] bArr, int i11, int i12) {
        int i13 = yVar.f9743c;
        byte[] bArr2 = yVar.f9741a;
        while (i11 < i12) {
            if (i10 == i13) {
                yVar = yVar.f9746f;
                l.c(yVar);
                byte[] bArr3 = yVar.f9741a;
                bArr2 = bArr3;
                i10 = yVar.f9742b;
                i13 = yVar.f9743c;
            }
            if (bArr2[i10] != bArr[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public static final String b(long j, kk.f fVar) throws EOFException {
        if (j > 0) {
            long j4 = j - 1;
            if (fVar.g(j4) == 13) {
                String strF = fVar.F(j4, nj.a.f12342a);
                fVar.skip(2L);
                return strF;
            }
        }
        String strF2 = fVar.F(j, nj.a.f12342a);
        fVar.skip(1L);
        return strF2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        if (r18 == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
    
        return -2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x007e, code lost:
    
        return r9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final int c(kk.f r16, kk.s r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 173
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: lk.a.c(kk.f, kk.s, boolean):int");
    }
}
