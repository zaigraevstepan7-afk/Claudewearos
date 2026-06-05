package q;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public int[] f13136a;

    /* renamed from: b, reason: collision with root package name */
    public int f13137b;

    public u(int i10) {
        this.f13136a = i10 == 0 ? m.f13105a : new int[i10];
    }

    public final void a(int i10) {
        b(this.f13137b + 1);
        int[] iArr = this.f13136a;
        int i11 = this.f13137b;
        iArr[i11] = i10;
        this.f13137b = i11 + 1;
    }

    public final void b(int i10) {
        int[] iArr = this.f13136a;
        if (iArr.length < i10) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, Math.max(i10, (iArr.length * 3) / 2));
            fj.l.e(iArrCopyOf, "copyOf(...)");
            this.f13136a = iArrCopyOf;
        }
    }

    public final int c(int i10) {
        if (i10 >= 0 && i10 < this.f13137b) {
            return this.f13136a[i10];
        }
        r.a.d("Index must be between 0 and size");
        throw null;
    }

    public final void d(int i10) {
        int i11;
        if (i10 < 0 || i10 >= (i11 = this.f13137b)) {
            r.a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f13136a;
        int i12 = iArr[i10];
        if (i10 != i11 - 1) {
            qi.k.e0(i10, i10 + 1, i11, iArr, iArr);
        }
        this.f13137b--;
    }

    public final void e(int i10, int i11) {
        if (i10 < 0 || i10 >= this.f13137b) {
            r.a.d("Index must be between 0 and size");
            throw null;
        }
        int[] iArr = this.f13136a;
        int i12 = iArr[i10];
        iArr[i10] = i11;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof u) {
            u uVar = (u) obj;
            int i10 = uVar.f13137b;
            int i11 = this.f13137b;
            if (i10 == i11) {
                int[] iArr = this.f13136a;
                int[] iArr2 = uVar.f13136a;
                kj.h hVarT = cg.b.T(0, i11);
                int i12 = hVarT.f9665a;
                int i13 = hVarT.f9666b;
                if (i12 > i13) {
                    return true;
                }
                while (iArr[i12] == iArr2[i12]) {
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
        int[] iArr = this.f13136a;
        int i10 = this.f13137b;
        int iHashCode = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            iHashCode += Integer.hashCode(iArr[i11]) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f13136a;
        int i10 = this.f13137b;
        int i11 = 0;
        while (true) {
            if (i11 >= i10) {
                sb2.append((CharSequence) "]");
                break;
            }
            int i12 = iArr[i11];
            if (i11 == -1) {
                sb2.append((CharSequence) "...");
                break;
            }
            if (i11 != 0) {
                sb2.append((CharSequence) ", ");
            }
            sb2.append(i12);
            i11++;
        }
        String string = sb2.toString();
        fj.l.e(string, "toString(...)");
        return string;
    }

    public /* synthetic */ u() {
        this(16);
    }
}
