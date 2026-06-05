package androidx.datastore.preferences.protobuf;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class g implements Iterable, Serializable {

    /* renamed from: c, reason: collision with root package name */
    public static final g f927c = new g(y.f1036b);

    /* renamed from: d, reason: collision with root package name */
    public static final e f928d;

    /* renamed from: a, reason: collision with root package name */
    public int f929a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f930b;

    static {
        f928d = c.a() ? new e(1) : new e(0);
    }

    public g(byte[] bArr) {
        bArr.getClass();
        this.f930b = bArr;
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

    public static g i(int i10, byte[] bArr, int i11) {
        byte[] bArrCopyOfRange;
        e(i10, i10 + i11, bArr.length);
        switch (f928d.f915a) {
            case 0:
                bArrCopyOfRange = Arrays.copyOfRange(bArr, i10, i11 + i10);
                break;
            default:
                bArrCopyOfRange = new byte[i11];
                System.arraycopy(bArr, i10, bArrCopyOfRange, 0, i11);
                break;
        }
        return new g(bArrCopyOfRange);
    }

    public byte b(int i10) {
        return this.f930b[i10];
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g) || size() != ((g) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (!(obj instanceof g)) {
            return obj.equals(this);
        }
        g gVar = (g) obj;
        int i10 = this.f929a;
        int i11 = gVar.f929a;
        if (i10 != 0 && i11 != 0 && i10 != i11) {
            return false;
        }
        int size = size();
        if (size > gVar.size()) {
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        if (size > gVar.size()) {
            StringBuilder sbP = gk.b.p(size, "Ran off end of other: 0, ", ", ");
            sbP.append(gVar.size());
            throw new IllegalArgumentException(sbP.toString());
        }
        byte[] bArr = gVar.f930b;
        int iX = x() + size;
        int iX2 = x();
        int iX3 = gVar.x();
        while (iX2 < iX) {
            if (this.f930b[iX2] != bArr[iX3]) {
                return false;
            }
            iX2++;
            iX3++;
        }
        return true;
    }

    public final int hashCode() {
        int i10 = this.f929a;
        if (i10 != 0) {
            return i10;
        }
        int size = size();
        int iX = x();
        int i11 = size;
        for (int i12 = iX; i12 < iX + size; i12++) {
            i11 = (i11 * 31) + this.f930b[i12];
        }
        if (i11 == 0) {
            i11 = 1;
        }
        this.f929a = i11;
        return i11;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new d(this);
    }

    public int size() {
        return this.f930b.length;
    }

    public final String toString() {
        String string;
        Locale locale = Locale.ROOT;
        String hexString = Integer.toHexString(System.identityHashCode(this));
        int size = size();
        if (size() <= 50) {
            string = x8.a.w(this);
        } else {
            StringBuilder sb2 = new StringBuilder();
            int iE = e(0, 47, size());
            sb2.append(x8.a.w(iE == 0 ? f927c : new f(this.f930b, x(), iE)));
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

    public void w(int i10, byte[] bArr) {
        System.arraycopy(this.f930b, 0, bArr, 0, i10);
    }

    public int x() {
        return 0;
    }

    public byte y(int i10) {
        return this.f930b[i10];
    }
}
