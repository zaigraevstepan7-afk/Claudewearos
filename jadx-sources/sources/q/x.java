package q;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public long[] f13144a;

    /* renamed from: b, reason: collision with root package name */
    public int f13145b;

    public x(int i10) {
        this.f13144a = i10 == 0 ? o.f13109a : new long[i10];
    }

    public final void a(long j) {
        int i10 = this.f13145b + 1;
        long[] jArr = this.f13144a;
        if (jArr.length < i10) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i10, (jArr.length * 3) / 2));
            fj.l.e(jArrCopyOf, "copyOf(...)");
            this.f13144a = jArrCopyOf;
        }
        long[] jArr2 = this.f13144a;
        int i11 = this.f13145b;
        jArr2[i11] = j;
        this.f13145b = i11 + 1;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof x) {
            x xVar = (x) obj;
            int i10 = xVar.f13145b;
            int i11 = this.f13145b;
            if (i10 == i11) {
                long[] jArr = this.f13144a;
                long[] jArr2 = xVar.f13144a;
                kj.h hVarT = cg.b.T(0, i11);
                int i12 = hVarT.f9665a;
                int i13 = hVarT.f9666b;
                if (i12 > i13) {
                    return true;
                }
                while (jArr[i12] == jArr2[i12]) {
                    if (i12 == i13) {
                        return true;
                    }
                    i12++;
                }
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        long[] jArr = this.f13144a;
        int i10 = this.f13145b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Long.hashCode(jArr[i11]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        long[] jArr = this.f13144a;
        int i10 = this.f13145b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb2.append((CharSequence) "]");
                break;
            }
            long j = jArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(j);
            i11++;
        }
        String string = sb2.toString();
        fj.l.e(string, "toString(...)");
        return string;
    }

    public /* synthetic */ x() {
        this(16);
    }
}
