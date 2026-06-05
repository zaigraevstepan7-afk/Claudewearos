package gk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d {

    /* renamed from: b, reason: collision with root package name */
    public final kk.x f7449b;

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f7448a = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public c[] f7452e = new c[8];

    /* renamed from: f, reason: collision with root package name */
    public int f7453f = 7;

    /* renamed from: g, reason: collision with root package name */
    public int f7454g = 0;

    /* renamed from: h, reason: collision with root package name */
    public int f7455h = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f7450c = 4096;

    /* renamed from: d, reason: collision with root package name */
    public int f7451d = 4096;

    public d(s sVar) {
        this.f7449b = u6.v.j(sVar);
    }

    public final int a(int i10) {
        int i11;
        int i12 = 0;
        if (i10 > 0) {
            int length = this.f7452e.length;
            while (true) {
                length--;
                i11 = this.f7453f;
                if (length < i11 || i10 <= 0) {
                    break;
                }
                int i13 = this.f7452e[length].f7447c;
                i10 -= i13;
                this.f7455h -= i13;
                this.f7454g--;
                i12++;
            }
            c[] cVarArr = this.f7452e;
            System.arraycopy(cVarArr, i11 + 1, cVarArr, i11 + 1 + i12, this.f7454g);
            this.f7453f += i12;
        }
        return i12;
    }

    public final kk.i b(int i10) throws IOException {
        if (i10 >= 0) {
            c[] cVarArr = f.f7464a;
            if (i10 <= cVarArr.length - 1) {
                return cVarArr[i10].f7445a;
            }
        }
        int length = this.f7453f + 1 + (i10 - f.f7464a.length);
        if (length >= 0) {
            c[] cVarArr2 = this.f7452e;
            if (length < cVarArr2.length) {
                return cVarArr2[length].f7445a;
            }
        }
        throw new IOException("Header index too large " + (i10 + 1));
    }

    public final void c(c cVar) {
        this.f7448a.add(cVar);
        int i10 = cVar.f7447c;
        int i11 = this.f7451d;
        if (i10 > i11) {
            Arrays.fill(this.f7452e, (Object) null);
            this.f7453f = this.f7452e.length - 1;
            this.f7454g = 0;
            this.f7455h = 0;
            return;
        }
        a((this.f7455h + i10) - i11);
        int i12 = this.f7454g + 1;
        c[] cVarArr = this.f7452e;
        if (i12 > cVarArr.length) {
            c[] cVarArr2 = new c[cVarArr.length * 2];
            System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
            this.f7453f = this.f7452e.length - 1;
            this.f7452e = cVarArr2;
        }
        int i13 = this.f7453f;
        this.f7453f = i13 - 1;
        this.f7452e[i13] = cVar;
        this.f7454g++;
        this.f7455h += i10;
    }

    public final kk.i d() {
        kk.x xVar = this.f7449b;
        byte b10 = xVar.readByte();
        int i10 = b10 & 255;
        boolean z2 = (b10 & 128) == 128;
        int iE = e(i10, 127);
        if (!z2) {
            return xVar.h(iE);
        }
        z zVar = z.f7550d;
        long j = iE;
        xVar.b0(j);
        byte[] bArrT = xVar.f9739b.t(j);
        zVar.getClass();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        d4.g gVar = zVar.f7551a;
        d4.g gVar2 = gVar;
        int i11 = 0;
        int i12 = 0;
        for (byte b11 : bArrT) {
            i11 = (i11 << 8) | (b11 & 255);
            i12 += 8;
            while (i12 >= 8) {
                gVar2 = ((d4.g[]) gVar2.f4872c)[(i11 >>> (i12 - 8)) & 255];
                if (((d4.g[]) gVar2.f4872c) == null) {
                    byteArrayOutputStream.write(gVar2.f4870a);
                    i12 -= gVar2.f4871b;
                    gVar2 = gVar;
                } else {
                    i12 -= 8;
                }
            }
        }
        while (i12 > 0) {
            d4.g gVar3 = ((d4.g[]) gVar2.f4872c)[(i11 << (8 - i12)) & 255];
            d4.g[] gVarArr = (d4.g[]) gVar3.f4872c;
            int i13 = gVar3.f4871b;
            if (gVarArr != null || i13 > i12) {
                break;
            }
            byteArrayOutputStream.write(gVar3.f4870a);
            i12 -= i13;
            gVar2 = gVar;
        }
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        kk.i iVar = kk.i.f9700d;
        fj.l.f(byteArray, "data");
        byte[] bArrCopyOf = Arrays.copyOf(byteArray, byteArray.length);
        fj.l.e(bArrCopyOf, "copyOf(...)");
        return new kk.i(bArrCopyOf);
    }

    public final int e(int i10, int i11) {
        int i12 = i10 & i11;
        if (i12 < i11) {
            return i12;
        }
        int i13 = 0;
        while (true) {
            byte b10 = this.f7449b.readByte();
            int i14 = b10 & 255;
            if ((b10 & 128) == 0) {
                return i11 + (i14 << i13);
            }
            i11 += (b10 & Byte.MAX_VALUE) << i13;
            i13 += 7;
        }
    }
}
