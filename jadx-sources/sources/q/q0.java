package q;

import java.util.Arrays;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q0 implements Cloneable {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ int[] f13121a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object[] f13122b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ int f13123c;

    public q0(int i10) {
        int i11;
        int i12 = 4;
        while (true) {
            i11 = 40;
            if (i12 >= 32) {
                break;
            }
            int i13 = (1 << i12) - 12;
            if (40 <= i13) {
                i11 = i13;
                break;
            }
            i12++;
        }
        int i14 = i11 / 4;
        this.f13121a = new int[i14];
        this.f13122b = new Object[i14];
    }

    public final void a(int i10, Object obj) {
        int i11 = this.f13123c;
        if (i11 != 0 && i10 <= this.f13121a[i11 - 1]) {
            d(i10, obj);
            return;
        }
        if (i11 >= this.f13121a.length) {
            int i12 = (i11 + 1) * 4;
            int i13 = 4;
            while (true) {
                if (i13 >= 32) {
                    break;
                }
                int i14 = (1 << i13) - 12;
                if (i12 <= i14) {
                    i12 = i14;
                    break;
                }
                i13++;
            }
            int i15 = i12 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f13121a, i15);
            fj.l.e(iArrCopyOf, "copyOf(...)");
            this.f13121a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f13122b, i15);
            fj.l.e(objArrCopyOf, "copyOf(...)");
            this.f13122b = objArrCopyOf;
        }
        this.f13121a[i11] = i10;
        this.f13122b[i11] = obj;
        this.f13123c = i11 + 1;
    }

    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final q0 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        fj.l.d(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        q0 q0Var = (q0) objClone;
        q0Var.f13121a = (int[]) this.f13121a.clone();
        q0Var.f13122b = (Object[]) this.f13122b.clone();
        return q0Var;
    }

    public final Object c(int i10) {
        Object obj;
        int iA = r.a.a(this.f13121a, this.f13123c, i10);
        if (iA < 0 || (obj = this.f13122b[iA]) == q.f13120c) {
            return null;
        }
        return obj;
    }

    public final void d(int i10, Object obj) {
        int iA = r.a.a(this.f13121a, this.f13123c, i10);
        if (iA >= 0) {
            this.f13122b[iA] = obj;
            return;
        }
        int i11 = ~iA;
        int i12 = this.f13123c;
        if (i11 < i12) {
            Object[] objArr = this.f13122b;
            if (objArr[i11] == q.f13120c) {
                this.f13121a[i11] = i10;
                objArr[i11] = obj;
                return;
            }
        }
        if (i12 >= this.f13121a.length) {
            int i13 = (i12 + 1) * 4;
            int i14 = 4;
            while (true) {
                if (i14 >= 32) {
                    break;
                }
                int i15 = (1 << i14) - 12;
                if (i13 <= i15) {
                    i13 = i15;
                    break;
                }
                i14++;
            }
            int i16 = i13 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.f13121a, i16);
            fj.l.e(iArrCopyOf, "copyOf(...)");
            this.f13121a = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.f13122b, i16);
            fj.l.e(objArrCopyOf, "copyOf(...)");
            this.f13122b = objArrCopyOf;
        }
        int i17 = this.f13123c;
        if (i17 - i11 != 0) {
            int[] iArr = this.f13121a;
            int i18 = i11 + 1;
            qi.k.e0(i18, i11, i17, iArr, iArr);
            Object[] objArr2 = this.f13122b;
            qi.k.i0(objArr2, i18, objArr2, i11, this.f13123c);
        }
        this.f13121a[i11] = i10;
        this.f13122b[i11] = obj;
        this.f13123c++;
    }

    public final Object e(int i10) {
        Object[] objArr = this.f13122b;
        if (i10 < objArr.length) {
            return objArr[i10];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        int i10 = this.f13123c;
        if (i10 <= 0) {
            return "{}";
        }
        StringBuilder sb2 = new StringBuilder(i10 * 28);
        sb2.append('{');
        int i11 = this.f13123c;
        for (int i12 = 0; i12 < i11; i12++) {
            if (i12 > 0) {
                sb2.append(", ");
            }
            sb2.append(this.f13121a[i12]);
            sb2.append('=');
            Object objE = e(i12);
            if (objE != this) {
                sb2.append(objE);
            } else {
                sb2.append("(this Map)");
            }
        }
        sb2.append('}');
        String string = sb2.toString();
        fj.l.e(string, "toString(...)");
        return string;
    }
}
