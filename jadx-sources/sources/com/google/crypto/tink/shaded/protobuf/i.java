package com.google.crypto.tink.shaded.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public abstract class i implements Iterable, Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final h f4171b = new h(a0.f4134b);

    /* renamed from: c, reason: collision with root package name */
    public static final f f4172c;

    /* renamed from: a, reason: collision with root package name */
    public int f4173a;

    static {
        f4172c = c.a() ? new f(1) : new f(0);
    }

    public static int e(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException(m6.a.e(i10, "Beginning index: ", " < 0"));
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException(gk.b.l(i10, i11, "Beginning index larger than ending index: ", ", "));
        }
        throw new IndexOutOfBoundsException(gk.b.l(i11, i12, "End index: ", " >= "));
    }

    public static h i(int i10, byte[] bArr, int i11) {
        byte[] bArrCopyOfRange;
        e(i10, i10 + i11, bArr.length);
        switch (f4172c.f4164a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11 + i10);
                break;
            default:
                bArrCopyOfRange = new byte[i11];
                System.arraycopy(bArr, i10, bArrCopyOfRange, 0, i11);
                break;
        }
        return new h(bArrCopyOfRange);
    }

    public abstract byte b(int i10);

    public final int hashCode() {
        int i10 = this.f4173a;
        if (i10 != 0) {
            return i10;
        }
        int size = size();
        h hVar = (h) this;
        int iY = hVar.y();
        int i11 = size;
        for (int i12 = iY; i12 < iY + size; i12++) {
            i11 = (i11 * 31) + hVar.f4169d[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.f4173a = i11;
        return i11;
    }

    public abstract int size();

    public final String toString() {
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = hj.a.s(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            h hVar = (h) this;
            int iE = e(0, 47, hVar.size());
            sb2.append(hj.a.s(iE == 0 ? f4171b : new g(hVar.f4169d, hVar.y(), iE)));
            sb2.append("...");
            string = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("<ByteString@");
        sb3.append(hexString);
        sb3.append(" size=");
        sb3.append(size);
        sb3.append(" contents=\"");
        return m6.a.j(sb3, string, "\">");
    }

    public abstract void w(int i10, byte[] bArr);

    public final byte[] x() {
        int size = size();
        if (size == 0) {
            return a0.f4134b;
        }
        byte[] bArr = new byte[size];
        w(size, bArr);
        return bArr;
    }
}
